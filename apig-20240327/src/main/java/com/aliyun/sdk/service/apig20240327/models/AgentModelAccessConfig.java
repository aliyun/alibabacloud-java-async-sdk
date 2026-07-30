// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AgentModelAccessConfig} extends {@link TeaModel}
 *
 * <p>AgentModelAccessConfig</p>
 */
public class AgentModelAccessConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> consumerIds;

    @com.aliyun.core.annotation.NameInMap("modelApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelApiId;

    private AgentModelAccessConfig(Builder builder) {
        this.consumerIds = builder.consumerIds;
        this.modelApiId = builder.modelApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentModelAccessConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerIds
     */
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    public static final class Builder {
        private java.util.List<String> consumerIds; 
        private String modelApiId; 

        private Builder() {
        } 

        private Builder(AgentModelAccessConfig model) {
            this.consumerIds = model.consumerIds;
            this.modelApiId = model.modelApiId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder consumerIds(java.util.List<String> consumerIds) {
            this.consumerIds = consumerIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }

        public AgentModelAccessConfig build() {
            return new AgentModelAccessConfig(this);
        } 

    } 

}
