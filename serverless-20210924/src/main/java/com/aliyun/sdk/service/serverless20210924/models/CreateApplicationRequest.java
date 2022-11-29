// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @Body
    @NameInMap("autoDeploy")
    private Boolean autoDeploy;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("envVars")
    private java.util.Map < String, String > envVars;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("parameters")
    private java.util.Map < String, String > parameters;

    @Body
    @NameInMap("repoSource")
    private RepoSource repoSource;

    @Body
    @NameInMap("roleArn")
    private String roleArn;

    @Body
    @NameInMap("template")
    private String template;

    @Body
    @NameInMap("trigger")
    private TriggerConfig trigger;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.autoDeploy = builder.autoDeploy;
        this.description = builder.description;
        this.envVars = builder.envVars;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.repoSource = builder.repoSource;
        this.roleArn = builder.roleArn;
        this.template = builder.template;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeploy
     */
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envVars
     */
    public java.util.Map < String, String > getEnvVars() {
        return this.envVars;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return repoSource
     */
    public RepoSource getRepoSource() {
        return this.repoSource;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return trigger
     */
    public TriggerConfig getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private Boolean autoDeploy; 
        private String description; 
        private java.util.Map < String, String > envVars; 
        private String name; 
        private java.util.Map < String, String > parameters; 
        private RepoSource repoSource; 
        private String roleArn; 
        private String template; 
        private TriggerConfig trigger; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.autoDeploy = request.autoDeploy;
            this.description = request.description;
            this.envVars = request.envVars;
            this.name = request.name;
            this.parameters = request.parameters;
            this.repoSource = request.repoSource;
            this.roleArn = request.roleArn;
            this.template = request.template;
            this.trigger = request.trigger;
        } 

        /**
         * autoDeploy.
         */
        public Builder autoDeploy(Boolean autoDeploy) {
            this.putBodyParameter("autoDeploy", autoDeploy);
            this.autoDeploy = autoDeploy;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * envVars.
         */
        public Builder envVars(java.util.Map < String, String > envVars) {
            this.putBodyParameter("envVars", envVars);
            this.envVars = envVars;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * repoSource.
         */
        public Builder repoSource(RepoSource repoSource) {
            this.putBodyParameter("repoSource", repoSource);
            this.repoSource = repoSource;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("roleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * template.
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * trigger.
         */
        public Builder trigger(TriggerConfig trigger) {
            this.putBodyParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
