// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace ediri.Port.Inputs
{

    public sealed class BlueprintPropertyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("defaultItems")]
        private InputList<string>? _defaultItems;
        public InputList<string> DefaultItems
        {
            get => _defaultItems ?? (_defaultItems = new InputList<string>());
            set => _defaultItems = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enumColors")]
        private InputMap<string>? _enumColors;
        public InputMap<string> EnumColors
        {
            get => _enumColors ?? (_enumColors = new InputMap<string>());
            set => _enumColors = value;
        }

        [Input("enums")]
        private InputList<string>? _enums;
        public InputList<string> Enums
        {
            get => _enums ?? (_enums = new InputList<string>());
            set => _enums = value;
        }

        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("icon")]
        public Input<string>? Icon { get; set; }

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("spec")]
        public Input<string>? Spec { get; set; }

        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public BlueprintPropertyGetArgs()
        {
        }
        public static new BlueprintPropertyGetArgs Empty => new BlueprintPropertyGetArgs();
    }
}
