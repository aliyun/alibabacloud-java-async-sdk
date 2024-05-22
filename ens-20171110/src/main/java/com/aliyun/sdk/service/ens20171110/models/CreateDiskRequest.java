// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskRequest</p>
 */
public class CreateDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    private CreateDiskRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.diskName = builder.diskName;
        this.encrypted = builder.encrypted;
        this.ensRegionId = builder.ensRegionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.KMSKeyId = builder.KMSKeyId;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<CreateDiskRequest, Builder> {
        private String category; 
        private String diskName; 
        private Boolean encrypted; 
        private String ensRegionId; 
        private String instanceChargeType; 
        private String KMSKeyId; 
        private String size; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskRequest request) {
            super(request);
            this.category = request.category;
            this.diskName = request.diskName;
            this.encrypted = request.encrypted;
            this.ensRegionId = request.ensRegionId;
            this.instanceChargeType = request.instanceChargeType;
            this.KMSKeyId = request.KMSKeyId;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The category of the disk. Valid values:
         * <p>
         * 
         * *   cloud_efficiency: ultra disk.
         * *   cloud_ssd: all-flash disk.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The name of the disk.
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * Specifies whether to encrypt the new system disk. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default): no
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The billing method of the instance. Set the value to **PostPaid**.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The ID of the Key Management Service (KMS) key that is used by the cloud disk.
         * <p>
         * 
         * >  If you set the **Encrypted** parameter to **true**, the default service key is used when the **KMSKeyId** parameter is empty.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * The size of the disk. Unit: GiB.
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The ID of the snapshot that you want to use to create the disk.
         * <p>
         * 
         * The following limits apply to the **SnapshotId** and **Size** parameters:
         * 
         * *   If the size of the snapshot specified by **SnapshotId** is greater than the specified **Size** value, the size of the created disk is equal to the specified snapshot size.
         * *   If the size of the snapshot specified by **SnapshotId** is smaller than the specified **Size** value, the size of the created disk is equal to the specified **Size** value.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public CreateDiskRequest build() {
            return new CreateDiskRequest(this);
        } 

    } 

}
