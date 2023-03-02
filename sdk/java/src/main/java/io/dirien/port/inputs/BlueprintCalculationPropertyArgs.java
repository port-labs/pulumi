// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlueprintCalculationPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlueprintCalculationPropertyArgs Empty = new BlueprintCalculationPropertyArgs();

    @Import(name="calculation", required=true)
    private Output<String> calculation;

    public Output<String> calculation() {
        return this.calculation;
    }

    @Import(name="colorized")
    private @Nullable Output<Boolean> colorized;

    public Optional<Output<Boolean>> colorized() {
        return Optional.ofNullable(this.colorized);
    }

    @Import(name="colors")
    private @Nullable Output<Map<String,String>> colors;

    public Optional<Output<Map<String,String>>> colors() {
        return Optional.ofNullable(this.colors);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    @Import(name="icon")
    private @Nullable Output<String> icon;

    public Optional<Output<String>> icon() {
        return Optional.ofNullable(this.icon);
    }

    @Import(name="identifier", required=true)
    private Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private BlueprintCalculationPropertyArgs() {}

    private BlueprintCalculationPropertyArgs(BlueprintCalculationPropertyArgs $) {
        this.calculation = $.calculation;
        this.colorized = $.colorized;
        this.colors = $.colors;
        this.description = $.description;
        this.format = $.format;
        this.icon = $.icon;
        this.identifier = $.identifier;
        this.title = $.title;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlueprintCalculationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueprintCalculationPropertyArgs $;

        public Builder() {
            $ = new BlueprintCalculationPropertyArgs();
        }

        public Builder(BlueprintCalculationPropertyArgs defaults) {
            $ = new BlueprintCalculationPropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder calculation(Output<String> calculation) {
            $.calculation = calculation;
            return this;
        }

        public Builder calculation(String calculation) {
            return calculation(Output.of(calculation));
        }

        public Builder colorized(@Nullable Output<Boolean> colorized) {
            $.colorized = colorized;
            return this;
        }

        public Builder colorized(Boolean colorized) {
            return colorized(Output.of(colorized));
        }

        public Builder colors(@Nullable Output<Map<String,String>> colors) {
            $.colors = colors;
            return this;
        }

        public Builder colors(Map<String,String> colors) {
            return colors(Output.of(colors));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder icon(@Nullable Output<String> icon) {
            $.icon = icon;
            return this;
        }

        public Builder icon(String icon) {
            return icon(Output.of(icon));
        }

        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BlueprintCalculationPropertyArgs build() {
            $.calculation = Objects.requireNonNull($.calculation, "expected parameter 'calculation' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
