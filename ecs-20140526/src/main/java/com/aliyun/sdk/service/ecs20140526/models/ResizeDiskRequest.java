// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the order.</p>
         * <blockquote>
         * <p>This parameter is returned only when you resize subscription disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the disk. You can call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query available disk IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The new disk capacity. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>System disk:</p>
         * <ul>
         * <li><p>Basic disk (cloud): 20 to 500.</p>
         * </li>
         * <li><p>ESSD (cloud_essd): The valid values vary based on the performance level of the ESSD. To query the performance level of an ESSD, call the DescribeDisks operation to query disk information and check the PerformanceLevel value in the response.</p>
         * <ul>
         * <li>PL0 ESSD: 1 to 2048.</li>
         * <li>PL1 ESSD: 20 to 2048.</li>
         * <li>PL2 ESSD: 461 to 2048.</li>
         * <li>PL3 ESSD: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Data disk:</p>
         * <ul>
         * <li><p>Ultra disk (cloud_efficiency): 20 to 32768.</p>
         * </li>
         * <li><p>Standard SSD (cloud_ssd): 20 to 32768.</p>
         * </li>
         * <li><p>ESSD (cloud_essd): The valid values vary based on the performance level of the ESSD.`` To query the performance level of an ESSD, call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query disk information and check the <code>PerformanceLevel</code> value in the response.</p>
         * <ul>
         * <li>PL0 ESSD: 1 to 65536.</li>
         * <li>PL1 ESSD: 20 to 65536.</li>
         * <li>PL2 ESSD: 461 to 65536.</li>
         * <li>PL3 ESSD: 1261 to 65536.</li>
         * </ul>
         * </li>
         * <li><p>Basic disk (cloud): 5 to 2000.</p>
         * </li>
         * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 65536.</p>
         * </li>
         * <li><p>Standard elastic ephemeral disk (elastic_ephemeral_disk_standard): 64 to 8192.</p>
         * </li>
         * <li><p>Premium elastic ephemeral disk (elastic_ephemeral_disk_premium): 64 to 8192.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The new disk capacity must be larger than the original disk capacity. Otherwise, an error is reported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1900</p>
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
         * <p>The method that you want to use to resize the disk. Valid values:</p>
         * <ul>
         * <li>offline (default): resizes the disk offline. After you resize a disk offline, you must restart the ECS instance to which the disk is attached in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation to allow the resizing operation to take effect. For information about how to restart an ECS instance in the ECS console, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an ECS instance</a>.</li>
         * <li>online: resizes the disk online. After you resize a disk online, the resizing operation immediately takes effect. You do not need to restart the ECS instance to which the disk is attached. You can resize ultra disks, standard SSDs, Enterprise SSDs (ESSDs), and elastic ephemeral disks online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
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
