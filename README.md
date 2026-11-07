# Responsi Akhir Praktikum PBO - Sistem Otomotif

## Identitas
| | |
|---|---|
| Nama | Fildza Nazhifa |
| NIM | (H1D025148) |
| Tema | **Otomotif** |
| Mata kuliah | Praktikum Pemrograman Berorientasi Objek |
| Jurusan | Informatika, Fakultas Teknik, Universitas Jenderal Soedirman |

## Deskripsi Singkat
Program Java sederhana untuk mengelola kendaraan (mobil dan motor): menghidupkan mesin,
menjalankan, menghentikan, dan menyalakan AC.

## Struktur Class
| File | Keterangan |
|---|---|
| `Kendaraan.java` | Superclass **abstract** (atribut umum, 2 abstract method) |
| `Mobil.java` | Subclass, `implements Berkendara, KontrolAC` |
| `Motor.java` | Subclass, `implements Berkendara` |
| `Berkendara.java` | Interface (`jalan`, `berhenti`) |
| `KontrolAC.java` | Interface (`nyalakanAC`) |
| `Main.java` | Pengujian 10 persyaratan |

## Pemetaan 10 Persyaratan
| No | Konsep | Lokasi |
|---|---|---|
| 1 | State & behavior (void + return) | `Kendaraan`: `tampilkanInfo()` (void), `hitungSisaJarak()` (return) |
| 2 | Immutability | `BBM_MAKSIMAL` (`public static final`), `nomorRangka` (`private final`) |
| 3 | Enkapsulasi & overloading | Semua atribut `private` + getter/setter, `this`, 2 konstruktor per class |
| 4 | Inheritance | `Mobil` dan `Motor` `extends Kendaraan`; `Main` file terpisah |
| 5 | Super chaining | `super(...)` di konstruktor subclass, `super.tampilkanInfo()` |
| 6 | Method overriding | `@Override` di `Mobil` dan `Motor` |
| 7 | Abstract class | `Kendaraan` abstract, punya `hidupkanMesin()` & `matikanMesin()` abstract |
| 8 | Logika if/else state | `hidupkanMesin()` / `matikanMesin()` membaca & mengubah `mesinHidup` |
| 9 | Polimorfisme interface | `Berkendara kendaraan1 = new Mobil(...)` di `Main` |
| 10 | Multiple interface | `Mobil implements Berkendara, KontrolAC` |

## Cara Compile dan Run (Terminal)
Pastikan JDK sudah terpasang (`javac -version`).

```bash
git clone <URL-REPOSITORI-KAMU>
cd <NAMA-FOLDER-REPOSITORI>
javac *.java
java Main
```

## Screenshot Luaran Program
[Output program]
<img width="468" height="842" alt="Screen Shot 2026-11-08 at 01 07 04" src="https://github.com/user-attachments/assets/4875a56f-8b65-42a2-b76a-7a884a4276bf" />



