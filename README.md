🏛️ Türkiyə Muzeyləri və Şəhərləri Tətbiqi
Kotlin dilində yazılmış bu Android tətbiqi istifadəçilərə Türkiyənin şəhərlərini kəşf etməyə və NosyAPI vasitəsilə hər bir şəhərdəki muzeylər haqqında ətraflı məlumat əldə etməyə imkan verir.

🛠️ Xüsusiyyətlər və Arxitektura
MVVM Arxitekturası (Model-View-ViewModel) – kodun səliqəli, oxunaqlı və rahat idarə olunması üçün.

Dependency Injection – Hilt / Dagger istifadə edərək asılılıqların idarə edilməsi.

Asinxron Şəbəkə Sorğuları – Retrofit 2 və Coroutines texnologiyaları ilə məlumatların sürətli çəkilməsi.

Dinamik UI – Şəhərlərin və muzeylərin siyahılanması üçün rahat istifadəçi interfeysi.

🚀 Tətbiqi Necə İşlətməli?
Repozitoriyanı kompüterinizə klonlayın:

Bash
git clone https://github.com/aliyev717/MuseumsApp-Android.git
NosyAPI saytından pulsuz API Key əldə edin.

Layihəni Android Studio-da açın.

util/Constants.kt faylına keçid edib API açarınızı əlavə edin:

Kotlin
const val API_KEY = "YOUR_NOSY_API_KEY"
Tətbiqi emulyatorda və ya fiziki Android cihazınızda işə salın.

💻 İstifadə Olunan Texnologiyalar
Dil: Kotlin

Şəbəkə (Networking): Retrofit 2, Gson, OkHttp Logging Interceptor

Arxitektura: MVVM, Clean Architecture

UI Komponentləri: XML Layouts, RecyclerView, Fragments
