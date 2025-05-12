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
 * {@link ListAgentInstallRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentInstallRecordsRequest</p>
 */
public class ListAgentInstallRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_id")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_id")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_version")
    private String pluginVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListAgentInstallRecordsRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.pluginVersion = builder.pluginVersion;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstallRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAgentInstallRecordsRequest, Builder> {
        private Long current; 
        private String instanceId; 
        private Long pageSize; 
        private String pluginId; 
        private String pluginVersion; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentInstallRecordsRequest request) {
            super(request);
            this.current = request.current;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.pluginVersion = request.pluginVersion;
            this.status = request.status;
        } 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * instance_id.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * plugin_id.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("plugin_id", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * plugin_version.
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("plugin_version", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAgentInstallRecordsRequest build() {
            return new ListAgentInstallRecordsRequest(this);
        } 

    } 

}
