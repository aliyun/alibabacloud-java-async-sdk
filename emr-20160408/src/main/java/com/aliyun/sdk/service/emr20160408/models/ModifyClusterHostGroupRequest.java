// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterHostGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterHostGroupRequest</p>
 */
public class ModifyClusterHostGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("HostGroupName")
    private String hostGroupName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    private ModifyClusterHostGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.hostGroupId = builder.hostGroupId;
        this.hostGroupName = builder.hostGroupName;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterHostGroupRequest create() {
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
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<ModifyClusterHostGroupRequest, Builder> {
        private String clusterId; 
        private String comment; 
        private String hostGroupId; 
        private String hostGroupName; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterHostGroupRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.comment = response.comment;
            this.hostGroupId = response.hostGroupId;
            this.hostGroupName = response.hostGroupName;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupId = response.securityGroupId;
            this.vswitchId = response.vswitchId;
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
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * HostGroupName.
         */
        public Builder hostGroupName(String hostGroupName) {
            this.putQueryParameter("HostGroupName", hostGroupName);
            this.hostGroupName = hostGroupName;
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public ModifyClusterHostGroupRequest build() {
            return new ModifyClusterHostGroupRequest(this);
        } 

    } 

}
