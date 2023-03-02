import * as pulumi from "@pulumi/pulumi";
import * as port from "@ediri/port";

const entity = new port.Entity("entity", {
    title: "monolith",
    blueprint: "microservice_blueprint",
    properties: [
        {
            name: "microservice_name",
            value: "golang_monolith",
        }
    ]
});

export const title = entity.title;
