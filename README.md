# ip6-ddnssupdater
## How to use
The updater takes an update URL as input. Use cronjobs for regular updates.

## example cronjob for hourly updates:
00 * * * * java -jar path/ddnsupdater.jar "http://ddnss.de/upd.php?key=KEY&host=HOST"
