// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link AttachNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>AttachNetworkInterfaceRequest</p>
 */
public class AttachNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
    private Integer networkCardIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrunkNetworkInstanceId")
    private String trunkNetworkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitForNetworkConfigurationReady")
    private Boolean waitForNetworkConfigurationReady;

    private AttachNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.instanceId = builder.instanceId;
        this.networkCardIndex = builder.networkCardIndex;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trunkNetworkInstanceId = builder.trunkNetworkInstanceId;
        this.waitForNetworkConfigurationReady = builder.waitForNetworkConfigurationReady;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachNetworkInterfaceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkCardIndex
     */
    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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

    /**
     * @return trunkNetworkInstanceId
     */
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

    /**
     * @return waitForNetworkConfigurationReady
     */
    public Boolean getWaitForNetworkConfigurationReady() {
        return this.waitForNetworkConfigurationReady;
    }

    public static final class Builder extends Request.Builder<AttachNetworkInterfaceRequest, Builder> {
        private String sourceRegionId; 
        private String instanceId; 
        private Integer networkCardIndex; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trunkNetworkInstanceId; 
        private Boolean waitForNetworkConfigurationReady; 

        private Builder() {
            super();
        } 

        private Builder(AttachNetworkInterfaceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.instanceId = request.instanceId;
            this.networkCardIndex = request.networkCardIndex;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trunkNetworkInstanceId = request.trunkNetworkInstanceId;
            this.waitForNetworkConfigurationReady = request.waitForNetworkConfigurationReady;
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp16qstyvxj9gpqw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The index of the network interface controller (NIC).</p>
         * <blockquote>
         * <p>The value of this parameter varies based on the instance family of the specified instance. If the instance type of the specified instance does not support NICs, leave this parameter empty. If the instance type of the specified instance supports NICs, set this parameter to a valid value. For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder networkCardIndex(Integer networkCardIndex) {
            this.putQueryParameter("NetworkCardIndex", networkCardIndex);
            this.networkCardIndex = networkCardIndex;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp17pdijfczax1huji****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The ID of the trunk ENI.</p>
         * <blockquote>
         * <p>This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eni-f8zapqwj1v1j4ia3****</p>
         */
        public Builder trunkNetworkInstanceId(String trunkNetworkInstanceId) {
            this.putQueryParameter("TrunkNetworkInstanceId", trunkNetworkInstanceId);
            this.trunkNetworkInstanceId = trunkNetworkInstanceId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is no longer supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder waitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
            this.putQueryParameter("WaitForNetworkConfigurationReady", waitForNetworkConfigurationReady);
            this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
            return this;
        }

        @Override
        public AttachNetworkInterfaceRequest build() {
            return new AttachNetworkInterfaceRequest(this);
        } 

    } 

}
