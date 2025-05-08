// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateDiskRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.diskName = builder.diskName;
        this.encrypted = builder.encrypted;
        this.ensRegionId = builder.ensRegionId;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceChargeType = builder.instanceChargeType;
        this.KMSKeyId = builder.KMSKeyId;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
        this.tag = builder.tag;
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
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDiskRequest, Builder> {
        private String category; 
        private String diskName; 
        private Boolean encrypted; 
        private String ensRegionId; 
        private String instanceBillingCycle; 
        private String instanceChargeType; 
        private String KMSKeyId; 
        private String size; 
        private String snapshotId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskRequest request) {
            super(request);
            this.category = request.category;
            this.diskName = request.diskName;
            this.encrypted = request.encrypted;
            this.ensRegionId = request.ensRegionId;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceChargeType = request.instanceChargeType;
            this.KMSKeyId = request.KMSKeyId;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
            this.tag = request.tag;
        } 

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: all-flash disk.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>yourDiskName</p>
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the new system disk. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The ID of the edge node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceBillingCycle.
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The billing method of the instance. Set the value to <strong>PostPaid</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used by the cloud disk.</p>
         * <blockquote>
         * <p> If you set the <strong>Encrypted</strong> parameter to <strong>true</strong>, the default service key is used when the <strong>KMSKeyId</strong> parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fxxxxx</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the snapshot that you want to use to create the disk.</p>
         * <p>The following limits apply to the <strong>SnapshotId</strong> and <strong>Size</strong> parameters:</p>
         * <ul>
         * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is greater than the specified <strong>Size</strong> value, the size of the created disk is equal to the specified snapshot size.</li>
         * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is smaller than the specified <strong>Size</strong> value, the size of the created disk is equal to the specified <strong>Size</strong> value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s-897654321****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The tags of the instance. You can specify at most 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDiskRequest build() {
            return new CreateDiskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDiskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiskRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
             * <ul>
             * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
             * <li>The key must be up to 64 characters in length.</li>
             * <li>The tag key cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pro</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of a tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the <strong>Key</strong> parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tags. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
             * <ul>
             * <li>Valid values: 1 to 20.</li>
             * <li>The value of this parameter can be an empty string.</li>
             * <li>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
