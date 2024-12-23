// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link UpdateApplicationConfigsRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationConfigsRequest</p>
 */
public class UpdateApplicationConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UpdateApplicationConfig> applicationConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigAction")
    private String configAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigScope")
    private String configScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshConfig")
    private Boolean refreshConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateApplicationConfigsRequest(Builder builder) {
        super(builder);
        this.applicationConfigs = builder.applicationConfigs;
        this.applicationName = builder.applicationName;
        this.clusterId = builder.clusterId;
        this.configAction = builder.configAction;
        this.configScope = builder.configScope;
        this.description = builder.description;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeId = builder.nodeId;
        this.refreshConfig = builder.refreshConfig;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List<UpdateApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configAction
     */
    public String getConfigAction() {
        return this.configAction;
    }

    /**
     * @return configScope
     */
    public String getConfigScope() {
        return this.configScope;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return refreshConfig
     */
    public Boolean getRefreshConfig() {
        return this.refreshConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationConfigsRequest, Builder> {
        private java.util.List<UpdateApplicationConfig> applicationConfigs; 
        private String applicationName; 
        private String clusterId; 
        private String configAction; 
        private String configScope; 
        private String description; 
        private String nodeGroupId; 
        private String nodeId; 
        private Boolean refreshConfig; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationConfigsRequest request) {
            super(request);
            this.applicationConfigs = request.applicationConfigs;
            this.applicationName = request.applicationName;
            this.clusterId = request.clusterId;
            this.configAction = request.configAction;
            this.configScope = request.configScope;
            this.description = request.description;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeId = request.nodeId;
            this.refreshConfig = request.refreshConfig;
            this.regionId = request.regionId;
        } 

        /**
         * <p>应用配置列表。</p>
         * <p>This parameter is required.</p>
         */
        public Builder applicationConfigs(java.util.List<UpdateApplicationConfig> applicationConfigs) {
            this.putBodyParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-e6a9d46e9267****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The operation performed on configuration items. Valid values:</p>
         * <ul>
         * <li>ADD</li>
         * <li>UPDATE</li>
         * <li>DELETE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        public Builder configAction(String configAction) {
            this.putQueryParameter("ConfigAction", configAction);
            this.configAction = configAction;
            return this;
        }

        /**
         * <p>The operation scope. Valid values:</p>
         * <ul>
         * <li>CLUSTER</li>
         * <li>NODE_GROUP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        public Builder configScope(String configScope) {
            this.putQueryParameter("ConfigScope", configScope);
            this.configScope = configScope;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>更新YARN内存配置。</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Specifies whether to refresh the configurations. Default value: True.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder refreshConfig(Boolean refreshConfig) {
            this.putQueryParameter("RefreshConfig", refreshConfig);
            this.refreshConfig = refreshConfig;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateApplicationConfigsRequest build() {
            return new UpdateApplicationConfigsRequest(this);
        } 

    } 

}
