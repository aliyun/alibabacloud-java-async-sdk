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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

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
    @com.aliyun.core.annotation.NameInMap("config_id")
    private String configId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grayscale_config")
    private String grayscaleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private InstallAgentForClusterRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.clusterId = builder.clusterId;
        this.configId = builder.configId;
        this.grayscaleConfig = builder.grayscaleConfig;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return grayscaleConfig
     */
    public String getGrayscaleConfig() {
        return this.grayscaleConfig;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<InstallAgentForClusterRequest, Builder> {
        private String xDebugId; 
        private String agentId; 
        private String agentVersion; 
        private String clusterId; 
        private String configId; 
        private String grayscaleConfig; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(InstallAgentForClusterRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.clusterId = request.clusterId;
            this.configId = request.configId;
            this.grayscaleConfig = request.grayscaleConfig;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
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
         * <p>Pass the ID of the ACK cluster for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c9d7f3fc3d42942afbcb65c1100ffb19d</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8gj86wrt7-3170-412c-8e67-da3389ecg6a9</p>
         */
        public Builder configId(String configId) {
            this.putBodyParameter("config_id", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The canary release environment.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;numeric&quot;,&quot;config&quot;:{&quot;value&quot;:2}}</p>
         */
        public Builder grayscaleConfig(String grayscaleConfig) {
            this.putBodyParameter("grayscale_config", grayscaleConfig);
            this.grayscaleConfig = grayscaleConfig;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public InstallAgentForClusterRequest build() {
            return new InstallAgentForClusterRequest(this);
        } 

    } 

}
