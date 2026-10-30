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
 * {@link UpdateClusterAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterAgentConfigRequest</p>
 */
public class UpdateClusterAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    private UpdateClusterAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.clusterId = builder.clusterId;
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterAgentConfigRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterAgentConfigRequest, Builder> {
        private String agentId; 
        private String clusterId; 
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.clusterId = request.clusterId;
            this.configId = request.configId;
        } 

        /**
         * <p>The ID of the component whose configuration you want to update.</p>
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
         * <p>The ID of the cluster. You can call the ListClusters operation to obtain the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c8b90bc1b2ef0436f81213c032b75c5f3</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the component configuration to be installed on the cluster.</p>
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

        @Override
        public UpdateClusterAgentConfigRequest build() {
            return new UpdateClusterAgentConfigRequest(this);
        } 

    } 

}
