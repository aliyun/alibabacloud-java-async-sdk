// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceSpec} extends {@link TeaModel}
 *
 * <p>ServiceSpec</p>
 */
public class ServiceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("environment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environment;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    @com.aliyun.core.annotation.NameInMap("templateVariables")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > templateVariables;

    @com.aliyun.core.annotation.NameInMap("templateVersion")
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
         * environment.
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * template.
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        /**
         * templateVariables.
         */
        public Builder templateVariables(java.util.Map < String, ? > templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }

        /**
         * templateVersion.
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
