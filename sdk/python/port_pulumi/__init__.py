# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .action import *
from .blueprint import *
from .entity import *
from .provider import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import port_pulumi.config as __config
    config = __config
else:
    config = _utilities.lazy_import('port_pulumi.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "port",
  "mod": "index/action",
  "fqn": "port_pulumi",
  "classes": {
   "port:index/action:Action": "Action"
  }
 },
 {
  "pkg": "port",
  "mod": "index/blueprint",
  "fqn": "port_pulumi",
  "classes": {
   "port:index/blueprint:Blueprint": "Blueprint"
  }
 },
 {
  "pkg": "port",
  "mod": "index/entity",
  "fqn": "port_pulumi",
  "classes": {
   "port:index/entity:Entity": "Entity"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "port",
  "token": "pulumi:providers:port",
  "fqn": "port_pulumi",
  "class": "Provider"
 }
]
"""
)
