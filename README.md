# Change Google Sheets Capture

## Update AWS protocols

Clone [AWS SDK for JavaScript in the browser and Node.js](https://github.com/aws/aws-sdk-js) repository and copy the latest version of the `s3.json` file in directory `apis` to `src/smithy` in this project.

## Deploy

```shell
sbt clean npmPackage
```

```shell
serverless package
```