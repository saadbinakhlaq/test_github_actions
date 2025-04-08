FROM ubuntu:20.04

# Install dependencies
RUN apt-get update && \
    apt-get install -y software-properties-common && \
    apt-get install -y lld
CMD ["python -m http.server 8000"]
