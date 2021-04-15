create database yts;
create table torrent (url varchar(255) not null, date_uploaded varchar(255), date_uploaded_unix integer, 
hash varchar(255), peers integer, quality varchar(255), seeds integer, size varchar(255), size_bytes bigint, 
type varchar(255), movie_id integer, primary key (url));


-- some of this worked some of it didnt i think i set it to create to get it to make tables for me in application.properties

select m.slug, t.url from torrent t inner join movie m on t.movie_id = m.id where quality = '720p' and type = 'bluray'
union
select m.slug, t.url from torrent t inner join movie m on t.movie_id = m.id where quality = '720p' and type = 'web' and m.id not in 
       (select m.id from torrent t inner join movie m on t.movie_id = m.id where quality = '720p' and type = 'bluray');