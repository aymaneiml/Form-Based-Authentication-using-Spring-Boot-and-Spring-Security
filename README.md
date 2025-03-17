# Form-Based-Authentication-using-Spring-Boot-and-Spring-Security

# Form-Based Authentication Overview
Form-based authentication uses standard HTML form (Login Form) fields to pass the username and password values to the server via a POST request.

In Form-based authentication, the server validates the credentials provided and creates a “session” tied to a unique token stored in a cookie and passed between the client and the server on each HTTP request. If the cookie is invalid or the user is logged out, the server then usually redirects to a login page.
