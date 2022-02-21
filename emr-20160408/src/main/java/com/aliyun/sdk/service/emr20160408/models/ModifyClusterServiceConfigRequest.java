// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterServiceConfigRequest</p>
 */
public class ModifyClusterServiceConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("ConfigParams")
    @Validation(required = true)
    private String configParams;

    @Query
    @NameInMap("ConfigType")
    private String configType;

    @Query
    @NameInMap("CustomConfigParams")
    private String customConfigParams;

    @Query
    @NameInMap("GatewayClusterIdList")
    private java.util.List < String > gatewayClusterIdList;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("HostInstanceId")
    private String hostInstanceId;

    @Query
    @NameInMap("RefreshHostConfig")
    private Boolean refreshHostConfig;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private ModifyClusterServiceConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.configParams = builder.configParams;
        this.configType = builder.configType;
        this.customConfigParams = builder.customConfigParams;
        this.gatewayClusterIdList = builder.gatewayClusterIdList;
        this.groupId = builder.groupId;
        this.hostInstanceId = builder.hostInstanceId;
        this.refreshHostConfig = builder.refreshHostConfig;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterServiceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return configParams
     */
    public String getConfigParams() {
        return this.configParams;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return customConfigParams
     */
    public String getCustomConfigParams() {
        return this.customConfigParams;
    }

    /**
     * @return gatewayClusterIdList
     */
    public java.util.List < String > getGatewayClusterIdList() {
        return this.gatewayClusterIdList;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hostInstanceId
     */
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    /**
     * @return refreshHostConfig
     */
    public Boolean getRefreshHostConfig() {
        return this.refreshHostConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ModifyClusterServiceConfigRequest, Builder> {
        private String clusterId; 
        private String comment; 
        private String configParams; 
        private String configType; 
        private String customConfigParams; 
        private java.util.List < String > gatewayClusterIdList; 
        private String groupId; 
        private String hostInstanceId; 
        private Boolean refreshHostConfig; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterServiceConfigRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.comment = response.comment;
            this.configParams = response.configParams;
            this.configType = response.configType;
            this.customConfigParams = response.customConfigParams;
            this.gatewayClusterIdList = response.gatewayClusterIdList;
            this.groupId = response.groupId;
            this.hostInstanceId = response.hostInstanceId;
            this.refreshHostConfig = response.refreshHostConfig;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceName = response.serviceName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * ConfigParams.
         */
        public Builder configParams(String configParams) {
            this.putQueryParameter("ConfigParams", configParams);
            this.configParams = configParams;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * CustomConfigParams.
         */
        public Builder customConfigParams(String customConfigParams) {
            this.putQueryParameter("CustomConfigParams", customConfigParams);
            this.customConfigParams = customConfigParams;
            return this;
        }

        /**
         * GatewayClusterIdList.
         */
        public Builder gatewayClusterIdList(java.util.List < String > gatewayClusterIdList) {
            this.putQueryParameter("GatewayClusterIdList", gatewayClusterIdList);
            this.gatewayClusterIdList = gatewayClusterIdList;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * HostInstanceId.
         */
        public Builder hostInstanceId(String hostInstanceId) {
            this.putQueryParameter("HostInstanceId", hostInstanceId);
            this.hostInstanceId = hostInstanceId;
            return this;
        }

        /**
         * RefreshHostConfig.
         */
        public Builder refreshHostConfig(Boolean refreshHostConfig) {
            this.putQueryParameter("RefreshHostConfig", refreshHostConfig);
            this.refreshHostConfig = refreshHostConfig;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ModifyClusterServiceConfigRequest build() {
            return new ModifyClusterServiceConfigRequest(this);
        } 

    } 

}
