
drop TABLE qlthuvien 
CREATE TABLE qlthuvien(
  IDtailieu int identity(1,1) primary key,
  Tennxs    varchar(50),
  Loai      varchar(50),
  Sobanphathanh int,
  Tentacgia varchar(50),
  Sotrang   int,
  idPH        varchar(50),
  Thangphathanh int,
  Ngayphathanh date
)


insert into qlthuvien
 values ('kim dong','sach',10,'nghia',4,'ph1','2','2022/2/10'),
        ('tuoitre','Tapchi',20,'',7,'ph2','3','2022/3/10'),
		('quandoi','bao',20,'',7,'','3','2022/3/10')