# URL Shortener Project

This project consists of two Lambda functions for shortening and redirecting URLs:

1. **CreateUrlLambda**: Accepts a long URL and generates a shortened URL with an expiration time. It stores the mapping in an S3 bucket.
2. **RedirectUrlShortener**: Redirects users to the original URL, checking if the link has expired.

The project is built using AWS Lambda and S3 services.
