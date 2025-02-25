// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstanceOpsTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceOpsTaskRequest</p>
 */
public class CreateInstanceOpsTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opsValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>The ID of the container group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp1dvysdafbh00t7****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The type of the O&amp;M task. Valid values:</p>
         * <ul>
         * <li>coredump</li>
         * <li>tcpdump</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coredump</p>
         */
        public Builder opsType(String opsType) {
            this.putQueryParameter("OpsType", opsType);
            this.opsType = opsType;
            return this;
        }

        /**
         * <p>The value of the O&amp;M task. You can set this parameter based on the value of OpsType.</p>
         * <ul>
         * <li><p>If OpsType is set to coredump, the valid values of OpsValue are:</p>
         * <ul>
         * <li>enable: enables coredump.</li>
         * <li>disable: disables coredump.</li>
         * </ul>
         * </li>
         * <li><p>If OpsType is set to tcpdump, the value of OpsValue is a JSON-formatted parameter string. Example: <code>{&quot;Enable&quot;:true, &quot;IfDeviceName&quot;:&quot;eth0&quot;}</code>. The value may contain the following parameters:</p>
         * <ul>
         * <li>Enable: specifies whether to enable tcpdump. You must specify this parameter. Valid values: true and false.</li>
         * <li>Protocol: the network protocol. Valid values: tcp, udp, and icmpv4.</li>
         * <li>SourceIp: the source IP address.</li>
         * <li>SourceCidr: the source CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.</li>
         * <li>SourcePort: the source port. Valid values: 1 to 65535.</li>
         * <li>DestIp: the destination IP address.</li>
         * <li>DestCidr: the destination CIDR block. If you specify both an IP address and a CIDR block, the IP address is ignored if the CIDR block is valid.</li>
         * <li>DestPort: the destination port. Valid values: 1 to 65535.</li>
         * <li>IfDeviceName: the destination network interface controller. Default value: eth0.</li>
         * <li>Snaplen: the length to be captured. Default value: 65535. Unit: bytes.</li>
         * <li>Duration: the captured period. Unit: seconds.</li>
         * <li>PacketNum: the number of packets to be captured.</li>
         * <li>FileSize: the size of the destination files on packets. Unit: bytes. Maximum value: 1073741824. 1073741824 bytes is equal to 1 GB.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
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
         * <p>The region ID of the O&amp;M task.</p>
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
