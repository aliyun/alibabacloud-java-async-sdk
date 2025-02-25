// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InfraStackSpec} extends {@link TeaModel}
 *
 * <p>InfraStackSpec</p>
 */
public class InfraStackSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("regionID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionID;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("templateSpec")
    private TemplateSpec templateSpec;

    @com.aliyun.core.annotation.NameInMap("templateVariables")
    private java.util.Map < String, ? > templateVariables;

    private InfraStackSpec(Builder builder) {
        this.regionID = builder.regionID;
        this.roleArn = builder.roleArn;
        this.templateName = builder.templateName;
        this.templateSpec = builder.templateSpec;
        this.templateVariables = builder.templateVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InfraStackSpec create() {
        return builder().build();
    }

    /**
     * @return regionID
     */
    public String getRegionID() {
        return this.regionID;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSpec
     */
    public TemplateSpec getTemplateSpec() {
        return this.templateSpec;
    }

    /**
     * @return templateVariables
     */
    public java.util.Map < String, ? > getTemplateVariables() {
        return this.templateVariables;
    }

    public static final class Builder {
        private String regionID; 
        private String roleArn; 
        private String templateName; 
        private TemplateSpec templateSpec; 
        private java.util.Map < String, ? > templateVariables; 

        /**
         * regionID.
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
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
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * templateSpec.
         */
        public Builder templateSpec(TemplateSpec templateSpec) {
            this.templateSpec = templateSpec;
            return this;
        }

        /**
         * templateVariables.
         */
        public Builder templateVariables(java.util.Map < String, ? > templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }

        public InfraStackSpec build() {
            return new InfraStackSpec(this);
        } 

    } 

    public static class TemplateSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("engine")
        private String engine;

        private TemplateSpec(Builder builder) {
            this.content = builder.content;
            this.engine = builder.engine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateSpec create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        public static final class Builder {
            private String content; 
            private String engine; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            public TemplateSpec build() {
                return new TemplateSpec(this);
            } 

        } 

    }
}
