// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterServiceConfigRequest</p>
 */
public class DescribeClusterServiceConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ConfigVersion")
    private String configVersion;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("HostInstanceId")
    private String hostInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("TagValue")
    private String tagValue;

    private DescribeClusterServiceConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configVersion = builder.configVersion;
        this.groupId = builder.groupId;
        this.hostInstanceId = builder.hostInstanceId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceConfigRequest create() {
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
     * @return configVersion
     */
    public String getConfigVersion() {
        return this.configVersion;
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

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<DescribeClusterServiceConfigRequest, Builder> {
        private String clusterId; 
        private String configVersion; 
        private String groupId; 
        private String hostInstanceId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterServiceConfigRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.configVersion = response.configVersion;
            this.groupId = response.groupId;
            this.hostInstanceId = response.hostInstanceId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serviceName = response.serviceName;
            this.tagValue = response.tagValue;
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
         * ConfigVersion.
         */
        public Builder configVersion(String configVersion) {
            this.putQueryParameter("ConfigVersion", configVersion);
            this.configVersion = configVersion;
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

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public DescribeClusterServiceConfigRequest build() {
            return new DescribeClusterServiceConfigRequest(this);
        } 

    } 

}
