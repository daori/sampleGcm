# sampleGcm
Sampe Broadcast Notification


#untuk broadcast 

POST /gcm/send HTTP/1.1
Host: gcm-http.googleapis.com
Authorization: key=AIzaSyDvMnf5MqIV-NPUf_qu1s3sgySNRfL4cfs
Content-Type: application/json
Cache-Control: no-cache

{ "to": "/topics/global", "data": { "message": "Test Doang, knock kalo sampe", } }
