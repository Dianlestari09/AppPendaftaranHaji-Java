
# 📌 Sistem Koneksi Database - Pendaftaran Haji (Java + MySQL)

Proyek ini merupakan bagian dari sistem **Pendaftaran Haji** yang dibangun menggunakan **Java** dan **MySQL**. File utama `Conn.java` menyediakan mekanisme koneksi antara aplikasi desktop Java dengan basis data MySQL lokal.

## 🧩 Deskripsi Proyek

Sistem ini ditujukan untuk mengelola konektivitas ke database bernama `pendaftaran_haji` sebagai bagian dari aplikasi pendaftaran calon jamaah haji. Komponen utama dalam proyek ini adalah class `Conn`, yang bertanggung jawab untuk membuka koneksi ke database dan memberi feedback kepada pengguna terkait status koneksi.

## 🚀 Fitur

- ✅ Koneksi ke database MySQL lokal.
- ✅ Feedback visual menggunakan `JOptionPane` (Swing GUI).
- ✅ Struktur kode modular dan reusable.
- ✅ Penanganan error sederhana untuk mendeteksi masalah koneksi.

## 🛠️ Teknologi yang Digunakan

- **Java SE** (Java Standard Edition)
- **MySQL** sebagai sistem basis data
- **JDBC (Java Database Connectivity)** driver
- **Swing (JOptionPane)** untuk pop-up notifikasi

## 📂 Struktur Proyek

pendaftaran-haji-java/
├── src/                        # Kode sumber Java
│   └── uas/
│       ├── Conn.java           # Kelas koneksi ke database
│       │
│       ├── model/              # Paket untuk representasi data
│       │   └── Jamaah.java     # Model data untuk entitas Jamaah
│       │
│       ├── controller/         # Paket untuk logika aplikasi
│       │   ├── JamaahController.java  # Kelas logika CRUD untuk Jamaah
│       │
│       ├── view/               # Paket untuk GUI (Java Swing)
│       │   ├── MainFrame.java  # Tampilan utama aplikasi
│       │   └── FormJamaah.java # Form input/update data Jamaah
│       │
│       └── App.java            # Entry point / main class aplikasi
│
└── db/
    └── pendaftaran_haji.sql    # Dump database untuk keperluan setup awal

| Folder / File                      | Deskripsi                                                              |
| ---------------------------------- | ---------------------------------------------------------------------- |
| `Conn.java`                        | Mengatur koneksi JDBC ke database MySQL                                |
| `model/Jamaah.java`                | Kelas yang merepresentasikan data jamaah haji                          |
| `controller/JamaahController.java` | Menyimpan logika CRUD (Create, Read, Update, Delete) untuk data Jamaah |
| `view/MainFrame.java`              | Tampilan utama aplikasi desktop (berbasis JFrame)                      |
| `view/FormJamaah.java`             | Form input untuk menambah/mengedit data jamaah                         |
| `App.java`                         | Main class untuk menjalankan seluruh aplikasi                          |
| `pendaftaran_haji.sql`             | File SQL untuk membuat dan mengisi database dengan data awal           |
| `mysql-connector-java.jar`         | Library JDBC driver (diperlukan saat kompilasi & runtime)              |

⚙️ Instalasi dan Konfigurasi
1. Persiapan Database
Pastikan Anda memiliki server MySQL yang berjalan secara lokal, dan buat database dengan nama berikut:
CREATE DATABASE pendaftaran_haji;
Anda bisa menambahkan tabel dan data sesuai kebutuhan aplikasi.

2. Konfigurasi JDBC Driver
Unduh dan tambahkan MySQL JDBC Driver (mysql-connector-java) ke classpath Anda. Bisa diunduh dari:
🔗 https://dev.mysql.com/downloads/connector/j/
Jika Anda menggunakan IDE seperti IntelliJ IDEA atau Eclipse, pastikan library telah ditambahkan ke build path / project libraries.

3. Kompilasi dan Jalankan
# Kompilasi
javac -cp .:mysql-connector-java-8.x.x.jar uas/Conn.java

# Jalankan
java -cp .:mysql-connector-java-8.x.x.jar uas.Conn
Gantilah mysql-connector-java-8.x.x.jar dengan nama file JDBC Anda.

💡 Contoh Output
Tampilan
[](https://github.com/user-attachments/assets/6e3473a3-c6ca-4eb6-9111-aa1d5abe8826)
[Login](https://github.com/user-attachments/assets/37e151fb-228b-47ae-8d55-d37fb50f9814)
[](https://github.com/user-attachments/assets/7e6ae265-a8f7-49a3-acca-16f20d836a89)

Jika koneksi sukses:
🟢 Pop-up: "Koneksi Database Sukses"

Jika koneksi gagal:
🔴 Pop-up: "Koneksi Database Gagal"

📌 Catatan Tambahan:
Konfigurasi koneksi default menggunakan:
Host: localhost
Database: pendaftaran_haji
User: root
Password: (kosong)

Dibuat dengan oleh [Dian Lestari Kurniawati]
