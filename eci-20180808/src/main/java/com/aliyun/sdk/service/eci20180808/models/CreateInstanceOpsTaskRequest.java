// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceOpsTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceOpsTaskRequest</p>
 */
public class CreateInstanceOpsTaskRequest extends Request {
    @Query
    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    private String containerGroupId;

    @Query
    @NameInMap("OpsType")
    @Validation(required = true)
    private String opsType;

    @Query
    @NameInMap("OpsValue")
    @Validation(required = true)
    private String opsValue;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateInstanceOpsTaskRequest(Builder builder) {
        super(builder);
        this.containerGroupId = builder.containerGroupId;
        this.opsType = builder.opsType;
        this.opsValue = builder.opsValue;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceOpsTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return opsType
     */
    public String getOpsType() {
        return this.opsType;
    }

    /**
     * @return opsValue
     */
    public String getOpsValue() {
        return this.opsValue;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceOpsTaskRequest, Builder> {
        private String containerGroupId; 
        private String opsType; 
        private String opsValue; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceOpsTaskRequest request) {
            super(request);
            this.containerGroupId = request.containerGroupId;
            this.opsType = request.opsType;
            this.opsValue = request.opsValue;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the container group.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The type of the O&M task. Valid values:
         * <p>
         * 
         * *   coredump
         * *   tcpdump
         */
        public Builder opsType(String opsType) {
            this.putQueryParameter("OpsType", opsType);
            this.opsType = opsType;
            return this;
        }

        /**
         * The value of the O\&M task. You can set this parameter based on the value of OpsType.
         * <p>
         * 
         * *   If OpsType is set to coredump, the valid values of OpsValue are:
         * 
         *     *   enable: enables coredump.
         *     *   disable: disables coredump.
         * 
         * *   If OpsType is set to tcpdump, the value of OpsValue is a JSON-formatted parameter string. Example: `{"Enable":true, "IfDeviceName":"eth0"}`. The value may contain the following parameters:
         * 
         *     *   Enable: specifies whether to enable tcpdump. You must specify this parameter. Valid values: true and false.
         *     *   Protocol: the network protocol. Valid values: tcp, udp, and icmpv4.
         *     *   SourceIp: the source IP address.
         *     *   SourceCidr: the source CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.
         *     *   SourcePort: the source port. Valid values: 1 to 65535.
         *     *   DestIp: the destination IP address.
         *     *   DestCidr: the destination CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.
         *     *   DestPort: the destination port. Valid values: 1 to 65535.
         *     *   IfDeviceName: the destination network interface controller. Default value: eth0.
         *     *   Snaplen: the length to be captured. Default value: 65535. Unit: bytes.
         *     *   Duration: the captured period. Unit: seconds.
         *     *   PacketNum: the number of packets to be captured.
         *     *   FileSize: the size of the destination files on packets. Unit: bytes. Maximum value: 1073741824. 1073741824 bytes is equal to 1 GB.
         */
        public Builder opsValue(String opsValue) {
            this.putQueryParameter("OpsValue", opsValue);
            this.opsValue = opsValue;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID of the O&M task.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
        public CreateInstanceOpsTaskRequest build() {
            return new CreateInstanceOpsTaskRequest(this);
        } 

    } 

}
