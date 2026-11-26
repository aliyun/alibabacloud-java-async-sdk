// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobAgentServiceEnvVar} extends {@link TeaModel}
 *
 * <p>RLJobAgentServiceEnvVar</p>
 */
public class RLJobAgentServiceEnvVar extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private RLJobAgentServiceEnvVar(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobAgentServiceEnvVar create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String name; 
        private String value; 

        private Builder() {
        } 

        private Builder(RLJobAgentServiceEnvVar model) {
            this.name = model.name;
            this.value = model.value;
        } 

        /**
         * <p>The name of the environment variable, which must be non-empty and unique within the list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>E2B_DOMAIN</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public RLJobAgentServiceEnvVar build() {
            return new RLJobAgentServiceEnvVar(this);
        } 

    } 

}
