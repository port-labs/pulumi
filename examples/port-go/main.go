package main

import (
	port "github.com/port-labs/pulumi-port-labs/go/port"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		entity, err := port.NewEntity(ctx, "entity", &port.EntityArgs{
			Title:     pulumi.String("monolith"),
			Blueprint: pulumi.String("microservice_blueprint"),
			Properties: port.EntityPropertyArray{
				&port.EntityPropertyArgs{
					Name:  pulumi.String("microservice_name"),
					Value: pulumi.String("golang_monolith"),
				},
			},
		})
		ctx.Export("entity", entity.Title)
		if err != nil {
			return err
		}
		return nil
	})
}
