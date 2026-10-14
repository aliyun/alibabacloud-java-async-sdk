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
 * {@link ListClusterAgentInstallRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListClusterAgentInstallRecordsRequest</p>
 */
public class ListClusterAgentInstallRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agent_config_id")
    private String agentConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_id")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_version")
    private String pluginVersion;

    private ListClusterAgentInstallRecordsRequest(Builder builder) {
        super(builder);
        this.agentConfigId = builder.agentConfigId;
        this.clusterId = builder.clusterId;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.pluginVersion = builder.pluginVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAgentInstallRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentConfigId
     */
    public String getAgentConfigId() {
        return this.agentConfigId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public static final class Builder extends Request.Builder<ListClusterAgentInstallRecordsRequest, Builder> {
        private String agentConfigId; 
        private String clusterId; 
        private Long current; 
        private Long pageSize; 
        private String pluginId; 
        private String pluginVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterAgentInstallRecordsRequest request) {
            super(request);
            this.agentConfigId = request.agentConfigId;
            this.clusterId = request.clusterId;
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.pluginVersion = request.pluginVersion;
        } 

        /**
         * agent_config_id.
         */
        public Builder agentConfigId(String agentConfigId) {
            this.putQueryParameter("agent_config_id", agentConfigId);
            this.agentConfigId = agentConfigId;
            return this;
        }

        /**
         * <p>Filters results by cluster ID.</p>
         * <blockquote>
         * <p>This cluster ID is not the ACK cluster ID. It is the <code>cluster_id</code> field returned by this operation or the <code>id</code> field returned by the ListCluster operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cbd80af02b9d6454ebdc579c5e022d0c8</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The current page number (starting from 1).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies the agent ID to filter the installation list. You can use this parameter together with the plugin_version parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("plugin_id", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Cannot be used alone. Use this parameter together with plugin_id to filter the installation list by a specific agent version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("plugin_version", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        @Override
        public ListClusterAgentInstallRecordsRequest build() {
            return new ListClusterAgentInstallRecordsRequest(this);
        } 

    } 

}
