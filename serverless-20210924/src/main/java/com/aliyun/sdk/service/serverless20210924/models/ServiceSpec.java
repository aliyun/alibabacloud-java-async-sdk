// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceSpec} extends {@link TeaModel}
 *
 * <p>ServiceSpec</p>
 */
public class ServiceSpec extends TeaModel {
    @NameInMap("environment")
    @Validation(required = true)
    private String environment;

    @NameInMap("roleArn")
    private String roleArn;

    @NameInMap("template")
    @Validation(required = true)
    private String template;

    @NameInMap("templateVariables")
    @Validation(required = true)
    private java.util.Map < String, ? > templateVariables;

    @NameInMap("templateVersion")
    private Integer templateVersion;

    private ServiceSpec(Builder builder) {
        this.environment = builder.environment;
        this.roleArn = builder.roleArn;
        this.template = builder.template;
        this.templateVariables = builder.templateVariables;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceSpec create() {
        return builder().build();
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
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
     * @return templateVariables
     */
    public java.util.Map < String, ? > getTemplateVariables() {
        return this.templateVariables;
    }

    /**
     * @return templateVersion
     */
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder {
        private String environment; 
        private String roleArn; 
        private String template; 
        private java.util.Map < String, ? > templateVariables; 
        private Integer templateVersion; 

        /**
         * The name of the associated Environment for the Service
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The ARN (Aliyun Resource Name) of the role designated by a user to allow the system to manage his Aliyun resources. If null, use roleArn of role AliyunFCDefaultRole.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The name of the template for the Service
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        /**
         * Variables for specified template
         */
        public Builder templateVariables(java.util.Map < String, ? > templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }

        /**
         * The major version of the template. "1" by default.
         */
        public Builder templateVersion(Integer templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        public ServiceSpec build() {
            return new ServiceSpec(this);
        } 

    } 

}
