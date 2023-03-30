import * as pulumi from "@pulumi/pulumi";
import * as port from "@port-labs/pulumi";

const entity = new port.Entity("monolith", {
    identifier: "monolith",
    title: "monolith",
    blueprint: "microservice",
    properties: [
        {
            name: "language",
            value: "Node",
        }
    ]
});

export const title = entity.title;
