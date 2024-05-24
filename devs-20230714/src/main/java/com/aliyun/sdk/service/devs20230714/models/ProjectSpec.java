// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectSpec} extends {@link TeaModel}
 *
 * <p>ProjectSpec</p>
 */
public class ProjectSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("templateConfig")
    private TemplateConfig templateConfig;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private ProjectSpec(Builder builder) {
        this.roleArn = builder.roleArn;
        this.templateConfig = builder.templateConfig;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectSpec create() {
        return builder().build();
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String roleArn; 
        private TemplateConfig templateConfig; 
        private String token; 

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * templateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ProjectSpec build() {
            return new ProjectSpec(this);
        } 

    } 

}
