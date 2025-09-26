// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateAgentRuntimeVersionInput} extends {@link TeaModel}
 *
 * <p>CreateAgentRuntimeVersionInput</p>
 */
public class CreateAgentRuntimeVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private CreateAgentRuntimeVersionInput(Builder builder) {
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRuntimeVersionInput create() {
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

    public static final class Builder {
        private String description; 

        private Builder() {
        } 

        private Builder(CreateAgentRuntimeVersionInput model) {
            this.description = model.description;
        } 

        /**
         * <p>版本描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public CreateAgentRuntimeVersionInput build() {
            return new CreateAgentRuntimeVersionInput(this);
        } 

    } 

}
