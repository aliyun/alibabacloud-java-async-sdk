// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceModificationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceModificationPriceRequest</p>
 */
public class DescribeInstanceModificationPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

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

    private DescribeInstanceModificationPriceRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.dataDisk = builder.dataDisk;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceModificationPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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

    public static final class Builder extends Request.Builder<DescribeInstanceModificationPriceRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private java.util.List < DataDisk> dataDisk; 
        private String instanceId; 
        private String instanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceModificationPriceRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.dataDisk = request.dataDisk;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
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
         * <p>The information about data disks.</p>
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The ID of the instance for which you want to query pricing information for a configuration upgrade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f2o4ldh8l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new instance type. We recommend that you call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types available for configuration upgrades in a specified zone.</p>
         * <blockquote>
         * <p>When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: <code>InstanceType</code> and <code>DataDisk.N.*</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6e.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public DescribeInstanceModificationPriceRequest build() {
            return new DescribeInstanceModificationPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceModificationPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * <p>The category of the system disk. You must specify this parameter only when you upgrade a non-I/O optimized instance of a retired instance type to an I/O optimized instance of an available instance type. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> and <a href="https://help.aliyun.com/document_detail/55263.html">Retired instance types</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * </ul>
             * <p>This parameter is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceModificationPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Integer size; 

            /**
             * <p>The category of data disk N. You can specify this parameter if you want to query the pricing information about newly attached subscription data disks. Valid values of N: 1 to 16. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: utra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * <p>This parameter is empty by default.</p>
             * <blockquote>
             * <p> When you call the DescribeInstanceModificationPrice operation, you must specify at least one of the following parameters: <code>InstanceType</code> and <code>DataDisk.N.*</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level of data disk N that is an enhanced SSD (ESSD). The value of N must be the same as that in <code>DataDisk.N.Category</code> when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>Default value: PL1.</p>
             * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The capacity of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
             * <ul>
             * <li><p>Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values when DataDisk.N.Category is set to cloud_essd: vary based on the <code>DataDisk.N.PerformanceLevel</code> value.</p>
             * <ul>
             * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL0: 1 to 32768.</li>
             * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</li>
             * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</li>
             * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li><p>Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.</p>
             * </li>
             * </ul>
             * <p>The default value is the minimum capacity allowed for the specified data disk category.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
}
