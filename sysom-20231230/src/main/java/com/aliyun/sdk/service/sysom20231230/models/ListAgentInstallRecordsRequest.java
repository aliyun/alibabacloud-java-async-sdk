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
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

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
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListAgentInstallRecordsRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.current = builder.current;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.pluginVersion = builder.pluginVersion;
        this.region = builder.region;
        this.status = builder.status;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListAgentInstallRecordsRequest, Builder> {
        private String xDebugId; 
        private Long current; 
        private String instanceId; 
        private Long pageSize; 
        private String pluginId; 
        private String pluginVersion; 
        private String region; 
        private String status; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentInstallRecordsRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.current = request.current;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.pluginVersion = request.pluginVersion;
            this.region = request.region;
            this.status = request.status;
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
         * <p>The current page number. Pages start from page 1.</p>
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
         * <p>Specifies the instance ID. If this parameter is specified, only the Agent installation records for the specified instance are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp118piqcio9tiwgh84b</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies the Agent ID. If this parameter is specified, only the installation records for the specified Agent are returned. You can use this parameter together with the plugin_version parameter.</p>
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
         * <p>Specifies the Agent version. This parameter cannot be used alone and must be used together with the plugin_id parameter to filter the installation records for a specific version of the specified Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("plugin_version", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Filters component installation records by status.</p>
         * 
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
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
        public ListAgentInstallRecordsRequest build() {
            return new ListAgentInstallRecordsRequest(this);
        } 

    } 

}
