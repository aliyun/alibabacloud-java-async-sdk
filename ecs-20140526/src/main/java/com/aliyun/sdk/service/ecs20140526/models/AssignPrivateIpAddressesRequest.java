// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignPrivateIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>AssignPrivateIpAddressesRequest</p>
 */
public class AssignPrivateIpAddressesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    @Query
    @NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    private AssignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.clientToken = builder.clientToken;
        this.privateIpAddress = builder.privateIpAddress;
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignPrivateIpAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    public static final class Builder extends Request.Builder<AssignPrivateIpAddressesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String networkInterfaceId; 
        private String clientToken; 
        private java.util.List < String > privateIpAddress; 
        private Integer secondaryPrivateIpAddressCount; 

        private Builder() {
            super();
        } 

        private Builder(AssignPrivateIpAddressesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.clientToken = request.clientToken;
            this.privateIpAddress = request.privateIpAddress;
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * The region to which the Eni belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Eni.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Select one or more secondary private IP addresses from the idle IP addresses of the vSwitch to which the Eni belongs. Valid values of N:
         * <p>
         * 
         * -The ENI is in the available ("Available") Status: 1 to 10.
         * -The ENI is in the "InUse" state: the instance type is limited. For more information, see [instance type family](~~ 25378 ~~).
         * 
         * When assigning a secondary private IP address, you cannot specify both "PrivateIpAddress. "and "SecondaryPrivateIpAddressCount".
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * Specifies the number of private ip addresses and automatically allocates ip addresses from the idle ip addresses of the vswitch.
         * <p>
         * 
         * When assigning a secondary private ip address, you cannot specify both "PrivateIpAddress. "and "SecondaryPrivateIpAddressCount".
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        @Override
        public AssignPrivateIpAddressesRequest build() {
            return new AssignPrivateIpAddressesRequest(this);
        } 

    } 

}
