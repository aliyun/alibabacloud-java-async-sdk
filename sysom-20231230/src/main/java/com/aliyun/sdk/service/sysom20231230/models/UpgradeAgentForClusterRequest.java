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
 * {@link UpgradeAgentForClusterRequest} extends {@link RequestModel}
 *
 * <p>UpgradeAgentForClusterRequest</p>
 */
public class UpgradeAgentForClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_version")
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    private UpgradeAgentForClusterRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAgentForClusterRequest create() {
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
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UpgradeAgentForClusterRequest, Builder> {
        private String agentId; 
        private String agentVersion; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeAgentForClusterRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.clusterId = request.clusterId;
        } 

        /**
         * agent_id.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * agent_version.
         */
        public Builder agentVersion(String agentVersion) {
            this.putBodyParameter("agent_version", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpgradeAgentForClusterRequest build() {
            return new UpgradeAgentForClusterRequest(this);
        } 

    } 

}
