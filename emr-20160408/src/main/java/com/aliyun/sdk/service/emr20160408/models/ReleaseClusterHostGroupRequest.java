// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseClusterHostGroupRequest} extends {@link RequestModel}
 *
 * <p>ReleaseClusterHostGroupRequest</p>
 */
public class ReleaseClusterHostGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DecommissionTimeout")
    private Integer decommissionTimeout;

    @Query
    @NameInMap("EnableGracefulDecommission")
    private Boolean enableGracefulDecommission;

    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("InstanceIdList")
    private String instanceIdList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseNumber")
    private Integer releaseNumber;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ReleaseClusterHostGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.decommissionTimeout = builder.decommissionTimeout;
        this.enableGracefulDecommission = builder.enableGracefulDecommission;
        this.hostGroupId = builder.hostGroupId;
        this.instanceIdList = builder.instanceIdList;
        this.regionId = builder.regionId;
        this.releaseNumber = builder.releaseNumber;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseClusterHostGroupRequest create() {
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
     * @return decommissionTimeout
     */
    public Integer getDecommissionTimeout() {
        return this.decommissionTimeout;
    }

    /**
     * @return enableGracefulDecommission
     */
    public Boolean getEnableGracefulDecommission() {
        return this.enableGracefulDecommission;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseNumber
     */
    public Integer getReleaseNumber() {
        return this.releaseNumber;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ReleaseClusterHostGroupRequest, Builder> {
        private String clusterId; 
        private Integer decommissionTimeout; 
        private Boolean enableGracefulDecommission; 
        private String hostGroupId; 
        private String instanceIdList; 
        private String regionId; 
        private Integer releaseNumber; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseClusterHostGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.decommissionTimeout = request.decommissionTimeout;
            this.enableGracefulDecommission = request.enableGracefulDecommission;
            this.hostGroupId = request.hostGroupId;
            this.instanceIdList = request.instanceIdList;
            this.regionId = request.regionId;
            this.releaseNumber = request.releaseNumber;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * DecommissionTimeout.
         */
        public Builder decommissionTimeout(Integer decommissionTimeout) {
            this.putQueryParameter("DecommissionTimeout", decommissionTimeout);
            this.decommissionTimeout = decommissionTimeout;
            return this;
        }

        /**
         * EnableGracefulDecommission.
         */
        public Builder enableGracefulDecommission(Boolean enableGracefulDecommission) {
            this.putQueryParameter("EnableGracefulDecommission", enableGracefulDecommission);
            this.enableGracefulDecommission = enableGracefulDecommission;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
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
         * ReleaseNumber.
         */
        public Builder releaseNumber(Integer releaseNumber) {
            this.putQueryParameter("ReleaseNumber", releaseNumber);
            this.releaseNumber = releaseNumber;
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

        @Override
        public ReleaseClusterHostGroupRequest build() {
            return new ReleaseClusterHostGroupRequest(this);
        } 

    } 

}
