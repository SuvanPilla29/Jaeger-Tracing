

Launch Jaegar UI using docker

docker run -d --name jaeger-ui -p 16686:16686 -p 6831:6831/udp jaegertracing/all-in-one:1.9

http://localhost:16686/search


Call client 

http://localhost:8091/client/12

