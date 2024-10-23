// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTriggerInput} extends {@link TeaModel}
 *
 * <p>UpdateTriggerInput</p>
 */
public class UpdateTriggerInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("invocationRole")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String invocationRole;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    private String triggerConfig;

    private UpdateTriggerInput(Builder builder) {
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.triggerConfig = builder.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTriggerInput create() {
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
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public static final class Builder {
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String triggerConfig; 

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
         * triggerConfig.
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        public UpdateTriggerInput build() {
            return new UpdateTriggerInput(this);
        } 

    } 

}
