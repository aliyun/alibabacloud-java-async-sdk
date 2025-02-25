// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloneSourceRegionId")
    private String cloneSourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private String computeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
    private String DBClusterNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskEncryption")
    private Boolean diskEncryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDefaultResourcePool")
    private Boolean enableDefaultResourcePool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsId")
    private String kmsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductForm")
    private String productForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
    private Integer reservedNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
    private String reservedNodeSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreToTime")
    private String restoreToTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDbClusterId")
    private String sourceDbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageResource")
    private String storageResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.cloneSourceRegionId = builder.cloneSourceRegionId;
        this.computeResource = builder.computeResource;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.diskEncryption = builder.diskEncryption;
        this.enableDefaultResourcePool = builder.enableDefaultResourcePool;
        this.kmsId = builder.kmsId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.productForm = builder.productForm;
        this.regionId = builder.regionId;
        this.reservedNodeCount = builder.reservedNodeCount;
        this.reservedNodeSize = builder.reservedNodeSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.restoreToTime = builder.restoreToTime;
        this.restoreType = builder.restoreType;
        this.sourceDbClusterId = builder.sourceDbClusterId;
        this.storageResource = builder.storageResource;
        this.tag = builder.tag;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return cloneSourceRegionId
     */
    public String getCloneSourceRegionId() {
        return this.cloneSourceRegionId;
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return diskEncryption
     */
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    /**
     * @return enableDefaultResourcePool
     */
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    /**
     * @return kmsId
     */
    public String getKmsId() {
        return this.kmsId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return productForm
     */
    public String getProductForm() {
        return this.productForm;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reservedNodeCount
     */
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    /**
     * @return reservedNodeSize
     */
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return restoreToTime
     */
    public String getRestoreToTime() {
        return this.restoreToTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDbClusterId
     */
    public String getSourceDbClusterId() {
        return this.sourceDbClusterId;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterRequest, Builder> {
        private String backupSetId; 
        private String cloneSourceRegionId; 
        private String computeResource; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private Boolean diskEncryption; 
        private Boolean enableDefaultResourcePool; 
        private String kmsId; 
        private String payType; 
        private String period; 
        private String productForm; 
        private String regionId; 
        private Integer reservedNodeCount; 
        private String reservedNodeSize; 
        private String resourceGroupId; 
        private String restoreToTime; 
        private String restoreType; 
        private String sourceDbClusterId; 
        private String storageResource; 
        private java.util.List<Tag> tag; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.cloneSourceRegionId = request.cloneSourceRegionId;
            this.computeResource = request.computeResource;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterNetworkType = request.DBClusterNetworkType;
            this.DBClusterVersion = request.DBClusterVersion;
            this.diskEncryption = request.diskEncryption;
            this.enableDefaultResourcePool = request.enableDefaultResourcePool;
            this.kmsId = request.kmsId;
            this.payType = request.payType;
            this.period = request.period;
            this.productForm = request.productForm;
            this.regionId = request.regionId;
            this.reservedNodeCount = request.reservedNodeCount;
            this.reservedNodeSize = request.reservedNodeSize;
            this.resourceGroupId = request.resourceGroupId;
            this.restoreToTime = request.restoreToTime;
            this.restoreType = request.restoreType;
            this.sourceDbClusterId = request.sourceDbClusterId;
            this.storageResource = request.storageResource;
            this.tag = request.tag;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The default resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1880808684</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * CloneSourceRegionId.
         */
        public Builder cloneSourceRegionId(String cloneSourceRegionId) {
            this.putQueryParameter("CloneSourceRegionId", cloneSourceRegionId);
            this.cloneSourceRegionId = cloneSourceRegionId;
            return this;
        }

        /**
         * <p>The key of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p> The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The subscription duration of the subscription cluster.</p>
         * <ul>
         * <li>Valid values when <strong>Period</strong> is set to Year: 1 to 3 (integer).</li>
         * <li>Valid values when <strong>Period</strong> is set to Month: 1 to 9 (integer).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter must be specified when PayType is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * <p>The subscription type of the subscription cluster. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: subscription on a yearly basis.</li>
         * <li><strong>Month</strong>: subscription on a monthly basis.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter must be specified when PayType is set to Prepaid.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * DiskEncryption.
         */
        public Builder diskEncryption(Boolean diskEncryption) {
            this.putQueryParameter("DiskEncryption", diskEncryption);
            this.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * <p>The value of tag N to add to the cluster. You can use tags to filter clusters. Valid values of N: 1 to 20. The values that you specify for N must be unique and consecutive integers that start from 1. Each value of <code>Tag.N.Key</code> is paired with a value of <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p> The tag value can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDefaultResourcePool(Boolean enableDefaultResourcePool) {
            this.putQueryParameter("EnableDefaultResourcePool", enableDefaultResourcePool);
            this.enableDefaultResourcePool = enableDefaultResourcePool;
            return this;
        }

        /**
         * KmsId.
         */
        public Builder kmsId(String kmsId) {
            this.putQueryParameter("KmsId", kmsId);
            this.kmsId = kmsId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The amount of reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of 24ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * <blockquote>
         * <p> This parameter must be specified with a unit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * ProductForm.
         */
        public Builder productForm(String productForm) {
            this.putQueryParameter("ProductForm", productForm);
            this.productForm = productForm;
            return this;
        }

        /**
         * <p>The description of the cluster.</p>
         * <ul>
         * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description must be 2 to 256 characters in length</li>
         * </ul>
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
         * ReservedNodeCount.
         */
        public Builder reservedNodeCount(Integer reservedNodeCount) {
            this.putQueryParameter("ReservedNodeCount", reservedNodeCount);
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }

        /**
         * ReservedNodeSize.
         */
        public Builder reservedNodeSize(String reservedNodeSize) {
            this.putQueryParameter("ReservedNodeSize", reservedNodeSize);
            this.reservedNodeSize = reservedNodeSize;
            return this;
        }

        /**
         * <p>The ID of the backup set that you want to use to restore data.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612318.html">DescribeBackups</a> operation to query the backup sets of the cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-4690g37929****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-20T03:13:56Z</p>
         */
        public Builder restoreToTime(String restoreToTime) {
            this.putQueryParameter("RestoreToTime", restoreToTime);
            this.restoreToTime = restoreToTime;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1r053byu48p****</p>
         */
        public Builder sourceDbClusterId(String sourceDbClusterId) {
            this.putQueryParameter("SourceDbClusterId", sourceDbClusterId);
            this.sourceDbClusterId = sourceDbClusterId;
            return this;
        }

        /**
         * <p>The tags to add to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore data from the backup set.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The amount of reserved computing resources. Valid values: 0ACU to 4096ACU. The value must be in increments of 16ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
         * <blockquote>
         * <p> This parameter must be specified with a unit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>Specifies whether to allocate all reserved computing resources to the user_default resource group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1at5ze0t5u3xtqn****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1aadw9k19x6cis9****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBClusterRequest build() {
            return new CreateDBClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateDBClusterRequest</p>
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

            /**
             * <p>The method that you want to use to restore data. Valid values:</p>
             * <ul>
             * <li><strong>backup</strong>: restores data from a backup set. You must also specify the <strong>BackupSetId</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
             * <li><strong>timepoint</strong>: restores data to a point in time. You must also specify the <strong>RestoreToTime</strong> and <strong>SourceDBClusterId</strong> parameters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The region ID of the source cluster.</p>
             * <blockquote>
             * <p> This parameter must be specified for cloning clusters across regions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
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
