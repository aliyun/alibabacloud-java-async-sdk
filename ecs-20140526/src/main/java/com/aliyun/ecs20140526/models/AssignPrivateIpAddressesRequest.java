// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @Query
    @NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    private AssignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.privateIpAddress = builder.privateIpAddress;
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
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<AssignPrivateIpAddressesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String networkInterfaceId; 
        private Integer secondaryPrivateIpAddressCount; 
        private String clientToken; 
        private String regionId; 
        private java.util.List < String > privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(AssignPrivateIpAddressesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.networkInterfaceId = response.networkInterfaceId;
            this.secondaryPrivateIpAddressCount = response.secondaryPrivateIpAddressCount;
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
            this.privateIpAddress = response.privateIpAddress;
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
         * The ID of the Eni.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * Specifies the number of private IP addresses and automatically allocates IP addresses from the idle IP addresses of the vSwitch.
         * <p>
         * 
         * When assigning a secondary private IP address, you cannot specify both "PrivateIpAddress. "and "SecondaryPrivateIpAddressCount".
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
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
         * The region to which the Eni belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public AssignPrivateIpAddressesRequest build() {
            return new AssignPrivateIpAddressesRequest(this);
        } 

    } 

}
