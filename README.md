# PGR301 Flow recap 

* I denne øvingen skal dere jobbe selvstendig med det vi har lært i PGR301 så langt. 
* Hensikten er at dere uten instruksjoner skal være i stand til å lage komplett oppsett som tilfredstiller gode DevOps prinsipper for flyt uten detaljerte instruksjoner.
* Dere står fritt til å improvisere denne øvingen og gjøre ting i den rekkefølgen dere vil men her er et forslag ; 

## Spring Boot eksempel app

* Lag et nytt GitHub repository
* Lag en ny Spring Boot applikasjon https://start.spring.io/ - og lag en spring boot applikasjon som eksponerer et REST grensesnitt.
* For inspirasjon se gjerne her https://github.com/glennbechdevops/spring-docker-dockerhub

## Branch protection

* Sett opp _main_ branch som en beskyttet branch, slik at ingen kan comitte direkte men kun via pull request. 
* Legg til en medstudent som collaborator på ditt repository og lag en regel som sier at en pull request trenger minst en godkjenning før den kan merges. 
* For å enklere kunne jobbe, kan dere godt fjerne denne reglen før dere går videre. 


## Github actions
 
* Lag en GitHub Actions workflow som kompilerer, tester og bygger Spring boot applikasjonen din på hver commit til main
* Lag en ny regel på den beskyttede main branchen som gjør at vi ikke kan merge en pull request før vi har minst et vellykket bygg. 
* For inspirasjon se gjerne https://github.com/glennbechdevops/01-CI-Github-actions

## Cloud 9

* Logg inn på Cloud 9 miljøet ditt 
* Lag en klone av ditt nye repository i cloud 9  

## Docker

* Lag en Dockerfile slik at du kan pakke spring boot applikasjonen din som et Docker image. Lag en multi stage docker build
* https://docs.docker.com/build/building/multi-stage/
* Kjør applikasjonen din i Cloud 9, både som Docker container og ved hjelp av Maven

## Docker ECR og 

* Sjekk at du har konto på dockerhub, og at du vet hvordan du pusher docker images dit fra Cloud 9 
* Et ECR repository i AWS kontoen vi bruker er laget for dere som heter <studentnavn>-private.
* Se at du kan pushe et docker image til dette ECR repoet . 

## Docker i GitHub actions 

* Se at du kan lage en GitHub actions workflow som bygger og pusher container image til ECR

## Annen info 

Et Cloud9 miljø er laget for dere
Et ECR repository er laget for dere som heter <studentnavn>-private

Resten må klare selv, lykke til!






