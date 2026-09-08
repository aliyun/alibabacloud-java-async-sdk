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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 262144, minimum = 1)
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The disk ID. You can call <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> to query disk IDs.</p>
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
         * <p>The new disk capacity that you want after expansion. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>System disk:</p>
         * <ul>
         * <li>Basic disk: 20 to 500.</li>
         * <li>Enterprise SSD:<ul>
         * <li>PL0: 1 to 2048.</li>
         * <li>PL1: 20 to 2048.</li>
         * <li>PL2: 461 to 2048.</li>
         * <li>PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL disk: 1 to 2048.</li>
         * <li>Other disk types: 20 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>Data disk:</p>
         * <ul>
         * <li><p>Ultra disk (cloud_efficiency): 20 to 32768.</p>
         * </li>
         * <li><p>Standard SSD (cloud_ssd): 20 to 32768.</p>
         * </li>
         * <li><p>Enterprise SSD (cloud_essd): The valid values depend on the value of <code>PerformanceLevel</code>. You can call <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> to query disk information and check the <code>PerformanceLevel</code> parameter in the response.</p>
         * <ul>
         * <li>PL0: 1 to 65536.</li>
         * <li>PL1: 20 to 65536.</li>
         * <li>PL2: 461 to 65536.</li>
         * <li>PL3: 1261 to 65536.</li>
         * </ul>
         * </li>
         * <li><p>Basic disk (cloud): 5 to 2000.</p>
         * </li>
         * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 65536.
         * &lt;props=&quot;china&quot;&gt;</p>
         * </li>
         * <li><p>ESSD Entry disk (cloud_essd_entry): 10 to 32768.</p>
         * </li>
         * <li><p>Elastic ephemeral disk - Standard (elastic_ephemeral_disk_standard): 64 to 8,192.</p>
         * </li>
         * <li><p>Elastic ephemeral disk - Premium (elastic_ephemeral_disk_premium): 64 to 8,192.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The new disk capacity must be greater than the original disk capacity. Otherwise, an error is returned.</p>
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
         * <p>The method used to expand the disk. Valid values:</p>
         * <ul>
         * <li><p>offline (default): offline expansion. After the expansion, you must restart the instance in the console by following the instructions in <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a> or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the changes to take effect.</p>
         * </li>
         * <li><p>online: online expansion. The expansion takes effect without the need to restart the instance. Supported disk types include ultra disks, standard SSDs, enterprise SSDs, and elastic ephemeral disks.</p>
         * </li>
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
