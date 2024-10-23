// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTriggerInput} extends {@link TeaModel}
 *
 * <p>CreateTriggerInput</p>
 */
public class CreateTriggerInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("invocationRole")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String invocationRole;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sourceArn")
    @com.aliyun.core.annotation.Validation(maxLength = 300, minLength = 1)
    private String sourceArn;

    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerConfig;

    @com.aliyun.core.annotation.NameInMap("triggerName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String triggerName;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private CreateTriggerInput(Builder builder) {
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerInput create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder {
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerName; 
        private String triggerType; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * invocationRole.
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sourceArn.
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;events&quot;:[&quot;oss:ObjectCreated:*&quot;],&quot;filter&quot;:{&quot;key&quot;:{&quot;prefix&quot;:&quot;/prefix&quot;,&quot;suffix&quot;:&quot;.zip&quot;}}}</p>
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss_create_object_demo</p>
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public CreateTriggerInput build() {
            return new CreateTriggerInput(this);
        } 

    } 

}
