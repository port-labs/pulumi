"""A Python Pulumi program"""

import pulumi
from ediri_port import Entity

entity = Entity("ediri_port", title="monolith", blueprint="microservice_blueprint",
                properties=[{"name": "microservice_name", "value": "golang_monolith"}])
