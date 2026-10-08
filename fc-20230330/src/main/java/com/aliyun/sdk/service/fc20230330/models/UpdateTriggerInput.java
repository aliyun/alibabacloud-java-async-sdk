// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateTriggerInput model) {
            this.description = model.description;
            this.invocationRole = model.invocationRole;
            this.qualifier = model.qualifier;
            this.triggerConfig = model.triggerConfig;
        } 

        /**
         * <p>The description of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger for test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The role that is used by the event source such as object Storage Service (OSS) to invoke the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:role/fc-test</p>
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * <p>The version or alias of the service to which the function belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The configuration of the trigger. The configuration vary based on the trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;events&quot;:[&quot;oss:ObjectCreated:*&quot;],&quot;filter&quot;:{&quot;key&quot;:{&quot;prefix&quot;:&quot;/prefix&quot;,&quot;suffix&quot;:&quot;.zip&quot;}}}</p>
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
