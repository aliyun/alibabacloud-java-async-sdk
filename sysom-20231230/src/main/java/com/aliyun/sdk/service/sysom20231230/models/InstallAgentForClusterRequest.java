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
 * {@link InstallAgentForClusterRequest} extends {@link RequestModel}
 *
 * <p>InstallAgentForClusterRequest</p>
 */
public class InstallAgentForClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_version")
    private String agentVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grayscale_config")
    private String grayscaleConfig;

    private InstallAgentForClusterRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.clusterId = builder.clusterId;
        this.grayscaleConfig = builder.grayscaleConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAgentForClusterRequest create() {
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

    /**
     * @return grayscaleConfig
     */
    public String getGrayscaleConfig() {
        return this.grayscaleConfig;
    }

    public static final class Builder extends Request.Builder<InstallAgentForClusterRequest, Builder> {
        private String agentId; 
        private String agentVersion; 
        private String clusterId; 
        private String grayscaleConfig; 

        private Builder() {
            super();
        } 

        private Builder(InstallAgentForClusterRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.clusterId = request.clusterId;
            this.grayscaleConfig = request.grayscaleConfig;
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

        /**
         * grayscale_config.
         */
        public Builder grayscaleConfig(String grayscaleConfig) {
            this.putBodyParameter("grayscale_config", grayscaleConfig);
            this.grayscaleConfig = grayscaleConfig;
            return this;
        }

        @Override
        public InstallAgentForClusterRequest build() {
            return new InstallAgentForClusterRequest(this);
        } 

    } 

}
