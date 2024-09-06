// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskRequest} extends {@link RequestModel}
 *
 * <p>ResizeDiskRequest</p>
 */
public class ResizeDiskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65536, minimum = 1)
    private Integer newSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ResizeDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.diskId = builder.diskId;
        this.newSize = builder.newSize;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return newSize
     */
    public Integer getNewSize() {
        return this.newSize;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ResizeDiskRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String diskId; 
        private Integer newSize; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ResizeDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.diskId = request.diskId;
            this.newSize = request.newSize;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
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
         * The ID of the order.
         * <p>
         * 
         * > This parameter is returned only when you resize subscription disks.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the disk. You can call the [DescribeDisks](~~25514~~) operation to query available disk IDs.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The new disk capacity. Unit: GiB. Valid values:
         * <p>
         * 
         * *   System disk:
         * 
         *     *   Basic disk (cloud): 20 to 500.
         * 
         *     *   ESSD (cloud_essd): Valid values vary based on the performance level of the ESSD. To query the performance level of an ESSD, call the DescribeDisks operation to query disk information and check the PerformanceLevel value in the response.
         * 
         *         *   PL0 ESSD: 1 to 2048.
         *         *   PL1 ESSD: 20 to 2048.
         *         *   PL2 ESSD: 461 to 2048.
         *         *   PL3 ESSD: 1261 to 2048.
         * 
         *     *   ESSD AutoPL disk (cloud_auto): 1 to 2048.
         * 
         *     *   Other disk categories: 20 to 2048.
         * 
         * *   Data disk:
         * 
         *     *   Ultra disk (cloud_efficiency): 20 to 32768.
         * 
         *     *   Standard SSD (cloud_ssd): 20 to 32768.
         * 
         *     *   ESSD (cloud_essd): Valid values vary based on the performance level of the ESSD.`` To query the performance level of an ESSD, call the [DescribeDisks](~~25514~~) operation to query disk information and check the `PerformanceLevel` value in the response.
         * 
         *         *   PL0 ESSD: 1 to 32768.
         *         *   PL1 ESSD: 20 to 32768.
         *         *   PL2 ESSD: 461 to 32768.
         *         *   PL3 ESSD: 1261 to 32768.
         * 
         *     *   Basic disk (cloud): 5 to 2000.
         * 
         *     *   ESSD AutoPL disk (cloud_auto): 1 to 32768.
         * 
         *     *   Standard elastic ephemeral disk (elastic_ephemeral_disk_standard): 64 to 8192.
         * 
         *     *   Premium elastic ephemeral disk (elastic_ephemeral_disk_premium): 64 to 8192.
         * 
         * >  The new disk capacity must be larger than the original disk capacity.
         */
        public Builder newSize(Integer newSize) {
            this.putQueryParameter("NewSize", newSize);
            this.newSize = newSize;
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
         * The method that you want to use to resize the disk. Valid values:
         * <p>
         * 
         * *   offline (default): resizes the disk offline. After you resize a disk offline, you must restart the associated instance in the ECS console or by calling the [RebootInstance](~~25502~~) operation for the resizing operation to take effect. For information about how to restart an ECS instance in the ECS console, see [Restart an instance](~~25440~~).
         * *   online: resizes the disk online. After you resize a disk online, the resizing operation immediately takes effect. You do not need to restart the associated instance. You can resize ultra disks, standard SSDs, Enterprise SSDs (ESSDs), and elastic ephemeral disks online.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ResizeDiskRequest build() {
            return new ResizeDiskRequest(this);
        } 

    } 

}
