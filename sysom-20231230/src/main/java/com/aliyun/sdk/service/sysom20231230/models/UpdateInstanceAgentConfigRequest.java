// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link UpdateInstanceAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAgentConfigRequest</p>
 */
public class UpdateInstanceAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<Instances> instances;

    private UpdateInstanceAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.configId = builder.configId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAgentConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceAgentConfigRequest, Builder> {
        private String agentId; 
        private String configId; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.configId = request.configId;
            this.instances = request.instances;
        } 

        /**
         * <p>The ID of the component whose configuration is to be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The ID of the component configuration to be applied to the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
         */
        public Builder configId(String configId) {
            this.putBodyParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The instance information.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public UpdateInstanceAgentConfigRequest build() {
            return new UpdateInstanceAgentConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceAgentConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceAgentConfigRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        private Instances(Builder builder) {
            this.instance = builder.instance;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instance; 
            private String region; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
                this.region = model.region;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9b9vucz1iubsz8sjqo</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
