"use strict";
const pulumi = require("@pulumi/pulumi");
const port = require("@ediri/port");

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

exports.title = entity.title;
