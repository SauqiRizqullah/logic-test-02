--SOAL QUERY

--4a

SELECT * FROM barang WHERE harga > 10000 ORDER BY harga ASC;

--4b

SELECT * 
	FROM pelanggan 
	WHERE (nama LIKE '%g%' OR nama LIKE '%G%')
	AND alamat = 'BANDUNG';

--4c
SELECT a.kode,
a.tanggal,
b.nama AS nama_pelanggan,
c.nama AS nama_barang,
a.jumlah_barang AS jumlah,
c.harga AS harga_satuan,
(c.harga * a.jumlah_barang) AS total
FROM pelanggan b
JOIN transaksi a
ON b.kode = a.kode_pelanggan
JOIN barang c
ON a.kode_barang = c.kode
ORDER BY b.nama, a.kode ASC;

--4d
SELECT b.nama AS nama_pelanggan,
SUM(a.jumlah_barang) AS jumlah,
SUM(a.jumlah_barang * c.harga) AS total_harga
FROM pelanggan b
JOIN transaksi a
ON b.kode = a.kode_pelanggan
JOIN barang c
ON a.kode_barang = c.kode
GROUP BY b.nama
ORDER BY b.nama
ASC;