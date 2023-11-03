# Proiect Cinema

Acest proiect de cinema este o aplicație simplă scrisă în Java care permite gestionarea unui cinematograf. Proiectul conține următoarele componente principale:

## Pachetul `Cinema`

### Interfața `Vizualizabil`

- Interfață utilizată pentru a afișa informații despre filme.

### Clasa abstractă `Film`

- Clasa de bază pentru toate filmele, implementează interfața `Vizualizabil`.
- Conține informații despre titlu și durata filmului.
- Metode abstracte pentru a obține bilete și pentru a afișa informații.

### Clasa `FilmActiune`

- O subclasă a clasei `Film` care reprezintă filmele de acțiune.
- Adaugă informații despre regizor, preț, rating și bilete.
- Implementează metodele abstracte pentru a obține bilete și pentru a afișa informații.

### Clasa `FilmComedie`

- O subclasă a clasei `Film` care reprezintă filmele de comedie.
- Are proprietăți similare cu `FilmActiune`, inclusiv regizor, preț, rating și bilete.
- Implementează, de asemenea, metodele abstracte pentru a obține bilete și pentru a afișa informații.

### Clasa `Bilet`

- Reprezintă biletele cumpărate de spectatori.
- Verifică dacă numărul de bilete cumpărate este sub limita maximă.

### Clasa `Regizor`

- Reprezintă regizorii filmelor și conține informații despre ei.

### Clasa `Spectator`

- Singleton care reprezintă un spectator.
- Este o clasă care implementează interfața `Vizualizabil`.

## Pachetul `Cinema`

- Clasa `Main` reprezintă interfața grafică a aplicației de gestionare a cinematografului.
- Oferă opțiuni pentru adăugarea de filme, cumpărarea de bilete și afișarea informațiilor.

## Utilizare

- Aplicația poate fi rulată prin intermediul clasei `Main`.
- Urmați instrucțiunile din interfața grafică pentru a adăuga filme, cumpăra bilete și afișa informații despre filme.

Proiectul este împărțit în clase și pachete pentru a organiza și separa responsabilitățile. Aplicația oferă o interfață grafică pentru interacțiunea cu utilizatorii și gestionează datele despre filme și bilete.

