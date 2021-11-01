# Oblig3Software

Det vi gjorde var at vi trykket på new repository og dro alle filene fra oblig 2 inn til vårt nye repository. Så når vi hadde opprettet dette repositoryet,
trykket vi på actions og testet via Github Actions når vi pushet en ny commit.
Vi la til dette: testLogging {
    events "passed", "skipped", "failed", "standardOut", "standardError"
} i test i build.gradle.

Vi så da etter testen var utført at testene var "PASSED". Altså at testene ble utført og at de stemte.
