# Logic Test

## Soal 1
### Membuat sebuah algoritma angka dari 1 s/d n. Berikut contoh bila nilai n = 15.
### Output:
```
1 2 OK YES 5 OK 7 YES OK 10 11 OKYES 13 14 OK
```

### Pada Main.java kita memanggil sebuah method static OkYes.okYes() untuk menjalankan algoritma soal nomor 1. 

## Soal 2
### Membuat sebuah algoritma dimana dengan contoh n = 5. Berikut cara menjalankan method dan contoh output untuk tiap-tiap soal.

## 2A
### Jalankan method static JalurAngka.jalurA() untuk menjalankan algoritma tersebut.
### Output:
```
1
22
333
4444
55555
```

## 2B
### Jalankan method static JalurAngka.jalurB() untuk menjalankan algoritma tersebut
### Output:
``` 
1
21
321
4321
54321
```

## 2C
### Jalankan method static JalurAngka.jalurC() untuk menjalankan algoritma tersebut
### Output:
``` 
1
23
454
3212
34543
```

## 2D
### Jalankan method static JalurAngka.jalurD() untuk menjalankan algoritma tersebut
## Output:
```
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25
```

## Soal 3
### Membuat algoritma untuk membuang angka 3 pada suatu array. Berikut contoh dengan nilai array [12,9,13,6,10,4,7,2].
### Output:
```
[2, 4, 7, 10, 13]
```

### Pada Main.java, jalankan method static SelainAngkaTiga.selainAngkaTiga() untuk menjalankan algoritma soal tersebut.

## Soal 4

## 4A
### Tampilkan data barang dengan harga lebih dari 10000 diurutkan berdasarkan harga ASC
### Query:
```
SELECT * FROM barang WHERE harga > 10000 ORDER BY harga ASC;
```

## 4B
### Tampilkan data pelanggan yang mengandung "g" pada nama dan alamat 'BANDUNG'
### Query:
``` 
SELECT * 
	FROM pelanggan 
	WHERE (nama LIKE '%g%' OR nama LIKE '%G%')
	AND alamat = 'BANDUNG';
```

## 4C
### Tampilkan data seluruh transaksi beserta total harganya
### Query:
``` 
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
```

## 4D
### Tampilkan data pelanggan beserta total barang yang dibeli dan total harga per pelanggan
### Query:
``` 
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
```
