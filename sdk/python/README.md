# Port Resource Provider

![Port](./img/port.svg)

The Port Resource Provider lets you manage [Port](https://www.getport.io) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)


To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @ediri/port
```

or `yarn`:

```bash
yarn add @ediri/port
```

### Python

To use from Python, install using `pip`:

```bash
pip install ediri-port
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/dirien/pulumi-port/sdk
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package ediri.Port
```

## Configuration

The following configuration points are available for the `port` provider:

- `port:baseUrl` (environment: `PORT_BASE_URL`) - This is the Port base URL. 
- `port:clientId` (environment: `PORT_CLIENT_ID`) - This is the Port client ID.
- `port:secret` (environment: `PORT_CLIENT_SECRET`) - This is the Port secret.
- `port:token` - This is the Port token.
## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/pulumi-port-labs/api-docs/).

