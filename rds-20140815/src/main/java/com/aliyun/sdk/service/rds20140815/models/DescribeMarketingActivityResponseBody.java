// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMarketingActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMarketingActivityResponseBody</p>
 */
public class DescribeMarketingActivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private DescribeMarketingActivityResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.bid = builder.bid;
        this.items = builder.items;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMarketingActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long aliUid; 
        private String bid; 
        private java.util.List < Items> items; 
        private String regionId; 
        private String requestId; 

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1979008652307170</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <ul>
         * <li>China site: 26842</li>
         * <li>International site: 26888</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * <p>The activity parameters</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7D8F09DB-1124-5D78-A520-FF88FAF4351B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMarketingActivityResponseBody build() {
            return new DescribeMarketingActivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMarketingActivityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMarketingActivityResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassGroup")
        private String classGroup;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIombps")
        private Integer maxIombps;

        @com.aliyun.core.annotation.NameInMap("MaxIops")
        private Integer maxIops;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("UpgradeCategory")
        private String upgradeCategory;

        @com.aliyun.core.annotation.NameInMap("UpgradeClassCode")
        private String upgradeClassCode;

        @com.aliyun.core.annotation.NameInMap("UpgradeClassGroup")
        private String upgradeClassGroup;

        @com.aliyun.core.annotation.NameInMap("UpgradeCpu")
        private String upgradeCpu;

        @com.aliyun.core.annotation.NameInMap("UpgradeDescContent")
        private String upgradeDescContent;

        @com.aliyun.core.annotation.NameInMap("UpgradeDiskSize")
        private Integer upgradeDiskSize;

        @com.aliyun.core.annotation.NameInMap("UpgradeMaxConnections")
        private Integer upgradeMaxConnections;

        @com.aliyun.core.annotation.NameInMap("UpgradeMaxIombps")
        private Integer upgradeMaxIombps;

        @com.aliyun.core.annotation.NameInMap("UpgradeMaxIops")
        private Integer upgradeMaxIops;

        @com.aliyun.core.annotation.NameInMap("UpgradeMemory")
        private Long upgradeMemory;

        @com.aliyun.core.annotation.NameInMap("UpgradeReferencePrice")
        private String upgradeReferencePrice;

        @com.aliyun.core.annotation.NameInMap("UpgradeStorageType")
        private String upgradeStorageType;

        private Items(Builder builder) {
            this.category = builder.category;
            this.chargeType = builder.chargeType;
            this.classCode = builder.classCode;
            this.classGroup = builder.classGroup;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.maxConnections = builder.maxConnections;
            this.maxIombps = builder.maxIombps;
            this.maxIops = builder.maxIops;
            this.memory = builder.memory;
            this.storageType = builder.storageType;
            this.upgradeCategory = builder.upgradeCategory;
            this.upgradeClassCode = builder.upgradeClassCode;
            this.upgradeClassGroup = builder.upgradeClassGroup;
            this.upgradeCpu = builder.upgradeCpu;
            this.upgradeDescContent = builder.upgradeDescContent;
            this.upgradeDiskSize = builder.upgradeDiskSize;
            this.upgradeMaxConnections = builder.upgradeMaxConnections;
            this.upgradeMaxIombps = builder.upgradeMaxIombps;
            this.upgradeMaxIops = builder.upgradeMaxIops;
            this.upgradeMemory = builder.upgradeMemory;
            this.upgradeReferencePrice = builder.upgradeReferencePrice;
            this.upgradeStorageType = builder.upgradeStorageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return classGroup
         */
        public String getClassGroup() {
            return this.classGroup;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIombps
         */
        public Integer getMaxIombps() {
            return this.maxIombps;
        }

        /**
         * @return maxIops
         */
        public Integer getMaxIops() {
            return this.maxIops;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return upgradeCategory
         */
        public String getUpgradeCategory() {
            return this.upgradeCategory;
        }

        /**
         * @return upgradeClassCode
         */
        public String getUpgradeClassCode() {
            return this.upgradeClassCode;
        }

        /**
         * @return upgradeClassGroup
         */
        public String getUpgradeClassGroup() {
            return this.upgradeClassGroup;
        }

        /**
         * @return upgradeCpu
         */
        public String getUpgradeCpu() {
            return this.upgradeCpu;
        }

        /**
         * @return upgradeDescContent
         */
        public String getUpgradeDescContent() {
            return this.upgradeDescContent;
        }

        /**
         * @return upgradeDiskSize
         */
        public Integer getUpgradeDiskSize() {
            return this.upgradeDiskSize;
        }

        /**
         * @return upgradeMaxConnections
         */
        public Integer getUpgradeMaxConnections() {
            return this.upgradeMaxConnections;
        }

        /**
         * @return upgradeMaxIombps
         */
        public Integer getUpgradeMaxIombps() {
            return this.upgradeMaxIombps;
        }

        /**
         * @return upgradeMaxIops
         */
        public Integer getUpgradeMaxIops() {
            return this.upgradeMaxIops;
        }

        /**
         * @return upgradeMemory
         */
        public Long getUpgradeMemory() {
            return this.upgradeMemory;
        }

        /**
         * @return upgradeReferencePrice
         */
        public String getUpgradeReferencePrice() {
            return this.upgradeReferencePrice;
        }

        /**
         * @return upgradeStorageType
         */
        public String getUpgradeStorageType() {
            return this.upgradeStorageType;
        }

        public static final class Builder {
            private String category; 
            private String chargeType; 
            private String classCode; 
            private String classGroup; 
            private String cpu; 
            private Integer diskSize; 
            private String engine; 
            private String engineVersion; 
            private String instanceId; 
            private String instanceName; 
            private Integer maxConnections; 
            private Integer maxIombps; 
            private Integer maxIops; 
            private Long memory; 
            private String storageType; 
            private String upgradeCategory; 
            private String upgradeClassCode; 
            private String upgradeClassGroup; 
            private String upgradeCpu; 
            private String upgradeDescContent; 
            private Integer upgradeDiskSize; 
            private Integer upgradeMaxConnections; 
            private Integer upgradeMaxIombps; 
            private Integer upgradeMaxIops; 
            private Long upgradeMemory; 
            private String upgradeReferencePrice; 
            private String upgradeStorageType; 

            /**
             * <p>The RDS edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>AlwaysOn</strong>: RDS Cluster Edition</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The payment type. Valid values:</p>
             * <ul>
             * <li>POSTPAY: pay-as-you-go</li>
             * <li>PREPAY: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a> and <a href="https://help.aliyun.com/document_detail/145759.html">Read-only ApsaraDB RDS instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s3.large</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/57184.html">Overview of instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>x</p>
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The disk capacity per node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The database engine of the instance. Valid values:</p>
             * <ul>
             * <li>MySQL</li>
             * <li>SQLServer</li>
             * <li>PostgreSQL</li>
             * <li>PPAS</li>
             * <li>MariaDB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf62br2491p5l****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf62br2491p5l****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O throughput. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxIombps(Integer maxIombps) {
                this.maxIombps = maxIombps;
                return this;
            }

            /**
             * <p>The maximum IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder maxIops(Integer maxIops) {
                this.maxIops = maxIops;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd</strong>: local SSD</li>
             * <li><strong>cloud_ssd</strong>: standard SSD</li>
             * <li><strong>cloud_essd</strong>: performance level 1 (PL1) enhanced SSD (ESSD)</li>
             * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
             * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The RDS edition after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder upgradeCategory(String upgradeCategory) {
                this.upgradeCategory = upgradeCategory;
                return this;
            }

            /**
             * <p>The instance type after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s3.large</p>
             */
            public Builder upgradeClassCode(String upgradeClassCode) {
                this.upgradeClassCode = upgradeClassCode;
                return this;
            }

            /**
             * <p>The instance family after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>d</p>
             */
            public Builder upgradeClassGroup(String upgradeClassGroup) {
                this.upgradeClassGroup = upgradeClassGroup;
                return this;
            }

            /**
             * <p>The number of CPU cores after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder upgradeCpu(String upgradeCpu) {
                this.upgradeCpu = upgradeCpu;
                return this;
            }

            /**
             * <p>The description of the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder upgradeDescContent(String upgradeDescContent) {
                this.upgradeDescContent = upgradeDescContent;
                return this;
            }

            /**
             * <p>The disk capacity after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder upgradeDiskSize(Integer upgradeDiskSize) {
                this.upgradeDiskSize = upgradeDiskSize;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder upgradeMaxConnections(Integer upgradeMaxConnections) {
                this.upgradeMaxConnections = upgradeMaxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O throughput after the upgrade. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder upgradeMaxIombps(Integer upgradeMaxIombps) {
                this.upgradeMaxIombps = upgradeMaxIombps;
                return this;
            }

            /**
             * <p>The maximum IOPS after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder upgradeMaxIops(Integer upgradeMaxIops) {
                this.upgradeMaxIops = upgradeMaxIops;
                return this;
            }

            /**
             * <p>The memory size after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder upgradeMemory(Long upgradeMemory) {
                this.upgradeMemory = upgradeMemory;
                return this;
            }

            /**
             * <p>The reference price of the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>23333.1</p>
             */
            public Builder upgradeReferencePrice(String upgradeReferencePrice) {
                this.upgradeReferencePrice = upgradeReferencePrice;
                return this;
            }

            /**
             * <p>The storage type after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder upgradeStorageType(String upgradeStorageType) {
                this.upgradeStorageType = upgradeStorageType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
