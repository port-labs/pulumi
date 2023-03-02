// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.dirien.port.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionInvocationMethod {
    private @Nullable Boolean agent;
    private @Nullable Boolean omitPayload;
    private @Nullable Boolean omitUserInputs;
    private @Nullable String org;
    private @Nullable String repo;
    private @Nullable Boolean reportWorkflowStatus;
    private String type;
    private @Nullable String url;
    private @Nullable String workflow;

    private ActionInvocationMethod() {}
    public Optional<Boolean> agent() {
        return Optional.ofNullable(this.agent);
    }
    public Optional<Boolean> omitPayload() {
        return Optional.ofNullable(this.omitPayload);
    }
    public Optional<Boolean> omitUserInputs() {
        return Optional.ofNullable(this.omitUserInputs);
    }
    public Optional<String> org() {
        return Optional.ofNullable(this.org);
    }
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }
    public Optional<Boolean> reportWorkflowStatus() {
        return Optional.ofNullable(this.reportWorkflowStatus);
    }
    public String type() {
        return this.type;
    }
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    public Optional<String> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionInvocationMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean agent;
        private @Nullable Boolean omitPayload;
        private @Nullable Boolean omitUserInputs;
        private @Nullable String org;
        private @Nullable String repo;
        private @Nullable Boolean reportWorkflowStatus;
        private String type;
        private @Nullable String url;
        private @Nullable String workflow;
        public Builder() {}
        public Builder(ActionInvocationMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agent = defaults.agent;
    	      this.omitPayload = defaults.omitPayload;
    	      this.omitUserInputs = defaults.omitUserInputs;
    	      this.org = defaults.org;
    	      this.repo = defaults.repo;
    	      this.reportWorkflowStatus = defaults.reportWorkflowStatus;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.workflow = defaults.workflow;
        }

        @CustomType.Setter
        public Builder agent(@Nullable Boolean agent) {
            this.agent = agent;
            return this;
        }
        @CustomType.Setter
        public Builder omitPayload(@Nullable Boolean omitPayload) {
            this.omitPayload = omitPayload;
            return this;
        }
        @CustomType.Setter
        public Builder omitUserInputs(@Nullable Boolean omitUserInputs) {
            this.omitUserInputs = omitUserInputs;
            return this;
        }
        @CustomType.Setter
        public Builder org(@Nullable String org) {
            this.org = org;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }
        @CustomType.Setter
        public Builder reportWorkflowStatus(@Nullable Boolean reportWorkflowStatus) {
            this.reportWorkflowStatus = reportWorkflowStatus;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder workflow(@Nullable String workflow) {
            this.workflow = workflow;
            return this;
        }
        public ActionInvocationMethod build() {
            final var o = new ActionInvocationMethod();
            o.agent = agent;
            o.omitPayload = omitPayload;
            o.omitUserInputs = omitUserInputs;
            o.org = org;
            o.repo = repo;
            o.reportWorkflowStatus = reportWorkflowStatus;
            o.type = type;
            o.url = url;
            o.workflow = workflow;
            return o;
        }
    }
}
