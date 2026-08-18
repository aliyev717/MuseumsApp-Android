# MuzeApp

Türkiyə Muzeləri — şəhər siyahısı → seçilən şəhərin muzeyləri.
API: [NosyAPI Türkiyə Müzeler API](https://www.nosyapi.com/api/turkiye-muze-api)

## Necə açmaq olar

1. Android Studio-da **Open** → bu qovluğu seç (`MuzeApp`).
2. Gradle sync bitənə qədər gözlə (ilk dəfə wrapper/JDK yükləyə bilər).
3. NosyAPI-dən öz `apiKey`-ini al (saytda qeydiyyatdan keçib).
4. `di/NetworkModule.kt` faylındakı TODO-ya bax — apiKey-i haradan oxuyacağını
   qərarlaşdır (tövsiyə: `local.properties` → `BuildConfig`, repo-ya push etmə).

## Hazır olan hissə (skeleton)

- Gradle dependency-ləri: Retrofit, OkHttp logging, Coroutines, Hilt, Navigation, ViewBinding
- Hilt DI quraşdırılıb (`MuzeApp.kt`, `NetworkModule.kt`)
- Navigation Graph: `CitiesFragment` → `MuseumsFragment` (Safe Args ilə `citySlug`/`cityName` ötürülür)
- Fragment/ViewModel skeletonları

## Tam işlək

Bütün TODO-lar dolduruldu: data class-lar, `ApiService`, hər iki `ViewModel` (API çağırışı,
loading/error state), hər iki `Fragment` (adapter, observe, naviqasiya), `CitiesAdapter`/
`MuseumsAdapter` (DiffUtil ilə), `item_city.xml`/`item_museum.xml`.

## Sənin etməli olduğun tək şey

**`util/Constants.kt`** faylında `API_KEY` sahəsinə öz NosyAPI açarını yaz — bundan sonra
proyekt işə düşəcək (şəhər siyahısı görünəcək, üstünə basanda o şəhərin muzeyləri açılacaq).

Kodun içinə diqqətlə bax — hər fayl əvvəlki roadmap-dakı addımların canlı nümunəsidi.
İstəsən istənilən hissəni sənə izah edə bilərəm (məs: niyə `DiffUtil` işlədilib, `viewModelScope`
nə edir, Safe Args necə işləyir və s.) — sual ver.
