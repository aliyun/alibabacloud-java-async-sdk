// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterHostGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterHostGroupRequest</p>
 */
public class CreateClusterHostGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("HostGroupName")
    @Validation(required = true)
    private String hostGroupName;

    @Query
    @NameInMap("HostGroupParams")
    private String hostGroupParams;

    @Query
    @NameInMap("HostGroupType")
    @Validation(required = true)
    private String hostGroupType;

    @Query
    @NameInMap("PayType")
    private String payType;

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

    private CreateClusterHostGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.hostGroupName = builder.hostGroupName;
        this.hostGroupParams = builder.hostGroupParams;
        this.hostGroupType = builder.hostGroupType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterHostGroupRequest create() {
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
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * @return hostGroupParams
     */
    public String getHostGroupParams() {
        return this.hostGroupParams;
    }

    /**
     * @return hostGroupType
     */
    public String getHostGroupType() {
        return this.hostGroupType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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

    public static final class Builder extends Request.Builder<CreateClusterHostGroupRequest, Builder> {
        private String clusterId; 
        private String comment; 
        private String hostGroupName; 
        private String hostGroupParams; 
        private String hostGroupType; 
        private String payType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterHostGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.comment = request.comment;
            this.hostGroupName = request.hostGroupName;
            this.hostGroupParams = request.hostGroupParams;
            this.hostGroupType = request.hostGroupType;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.vswitchId = request.vswitchId;
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
         * HostGroupName.
         */
        public Builder hostGroupName(String hostGroupName) {
            this.putQueryParameter("HostGroupName", hostGroupName);
            this.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * HostGroupParams.
         */
        public Builder hostGroupParams(String hostGroupParams) {
            this.putQueryParameter("HostGroupParams", hostGroupParams);
            this.hostGroupParams = hostGroupParams;
            return this;
        }

        /**
         * HostGroupType.
         */
        public Builder hostGroupType(String hostGroupType) {
            this.putQueryParameter("HostGroupType", hostGroupType);
            this.hostGroupType = hostGroupType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
        public CreateClusterHostGroupRequest build() {
            return new CreateClusterHostGroupRequest(this);
        } 

    } 

}
