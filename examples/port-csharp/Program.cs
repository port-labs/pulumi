using System.Collections.Generic;
using Pulumi;
using Port = ediri.Port;

return await Deployment.RunAsync(() =>
{
   var entity = new Port.Entity("entity", new Port.EntityArgs
   {
      Title = "monolith",
      Blueprint = "microservice_blueprint",
      Properties = new List<Port.Inputs.EntityPropertyArgs>
      {
         new Port.Inputs.EntityPropertyArgs
         {
            Name = "microservice_name",
            Value = "golang_monolith"
         }
      }
   });
   return new Dictionary<string, object?>
   {
      ["title"] = entity.Title
   };
});
