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
 * {@link UninstallAgentForClusterRequest} extends {@link RequestModel}
 *
 * <p>UninstallAgentForClusterRequest</p>
 */
public class UninstallAgentForClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_version")
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    private UninstallAgentForClusterRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallAgentForClusterRequest create() {
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

    public static final class Builder extends Request.Builder<UninstallAgentForClusterRequest, Builder> {
        private String agentId; 
        private String agentVersion; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallAgentForClusterRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putBodyParameter("agent_version", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>This parameter must be set to the ID of an ACK cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c822f83bb45994ddbac9326b4c2f04f35</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UninstallAgentForClusterRequest build() {
            return new UninstallAgentForClusterRequest(this);
        } 

    } 

}
