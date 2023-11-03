// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMarketingActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMarketingActivityResponseBody</p>
 */
public class DescribeMarketingActivityResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private Long aliUid;

    @NameInMap("Bid")
    private String bid;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    @Validation(required = true)
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
         * The unique ID (UID) of the Alibaba Cloud account.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * The BID of the account to which the Anycast EIP belongs.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * The details of the instance.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMarketingActivityResponseBody build() {
            return new DescribeMarketingActivityResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClassCode")
        private String classCode;

        @NameInMap("ClassGroup")
        private String classGroup;

        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MaxIombps")
        private Integer maxIombps;

        @NameInMap("MaxIops")
        private Integer maxIops;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("UpgradeCategory")
        private String upgradeCategory;

        @NameInMap("UpgradeClassCode")
        private String upgradeClassCode;

        @NameInMap("UpgradeClassGroup")
        private String upgradeClassGroup;

        @NameInMap("UpgradeCpu")
        private String upgradeCpu;

        @NameInMap("UpgradeDescContent")
        private String upgradeDescContent;

        @NameInMap("UpgradeDiskSize")
        private Integer upgradeDiskSize;

        @NameInMap("UpgradeMaxConnections")
        private Integer upgradeMaxConnections;

        @NameInMap("UpgradeMaxIombps")
        private Integer upgradeMaxIombps;

        @NameInMap("UpgradeMaxIops")
        private Integer upgradeMaxIops;

        @NameInMap("UpgradeMemory")
        private Long upgradeMemory;

        @NameInMap("UpgradeReferencePrice")
        private String upgradeReferencePrice;

        @NameInMap("UpgradeStorageType")
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
             * The RDS edition of the instance. Valid values:
             * <p>
             * 
             * *   **Basic**: RDS Basic Edition
             * *   **HighAvailability**: High-availability Edition
             * *   **Finance**: RDS Enterprise Edition
             * 
             * > This parameter is returned only when **InstanceLevel** is set to **1**.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PostPaid** (default): pay-as-you-go
             * *   **PrePaid**: subscription
             * 
             * > **Period** is required if you set the value of this parameter to **PrePaid**.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The code of the instance type. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~) and [Read-only ApsaraDB RDS instance types](~~145759~~).
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The instance family. For more information, see [Overview of instance families](~~57184~~).
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * The number of vCPU cores. Unit: cores.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The disk size. Unit: GB.
             * <p>
             * 
             * *   The disk size that you specify must be greater than or equal to the current disk size of the instance.
             * *   For more information about the valid values, see [Billing](~~84737~~).
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The database engine of the instance. Valid values:
             * <p>
             * 
             * *   **MySQL**
             * *   **PostgreSQL**
             * *   **SQLServer**
             * *   **MariaDB**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIombps
             */
            public Builder maxIombps(Integer maxIombps) {
                this.maxIombps = maxIombps;
                return this;
            }

            /**
             * MaxIops
             */
            public Builder maxIops(Integer maxIops) {
                this.maxIops = maxIops;
                return this;
            }

            /**
             * The memory size that you applied for each instance. Unit: MB.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The storage type of the instance. Valid values:
             * <p>
             * 
             * *   **local_ssd**: local SSD
             * *   **cloud_ssd**: standard SSD
             * *   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1)
             * *   **cloud_essd2**: ESSD of PL2
             * *   **cloud_essd3**: ESSD of PL3
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * UpgradeCategory
             */
            public Builder upgradeCategory(String upgradeCategory) {
                this.upgradeCategory = upgradeCategory;
                return this;
            }

            /**
             * UpgradeClassCode
             */
            public Builder upgradeClassCode(String upgradeClassCode) {
                this.upgradeClassCode = upgradeClassCode;
                return this;
            }

            /**
             * UpgradeClassGroup
             */
            public Builder upgradeClassGroup(String upgradeClassGroup) {
                this.upgradeClassGroup = upgradeClassGroup;
                return this;
            }

            /**
             * UpgradeCpu
             */
            public Builder upgradeCpu(String upgradeCpu) {
                this.upgradeCpu = upgradeCpu;
                return this;
            }

            /**
             * UpgradeDescContent
             */
            public Builder upgradeDescContent(String upgradeDescContent) {
                this.upgradeDescContent = upgradeDescContent;
                return this;
            }

            /**
             * UpgradeDiskSize
             */
            public Builder upgradeDiskSize(Integer upgradeDiskSize) {
                this.upgradeDiskSize = upgradeDiskSize;
                return this;
            }

            /**
             * UpgradeMaxConnections
             */
            public Builder upgradeMaxConnections(Integer upgradeMaxConnections) {
                this.upgradeMaxConnections = upgradeMaxConnections;
                return this;
            }

            /**
             * UpgradeMaxIombps
             */
            public Builder upgradeMaxIombps(Integer upgradeMaxIombps) {
                this.upgradeMaxIombps = upgradeMaxIombps;
                return this;
            }

            /**
             * UpgradeMaxIops
             */
            public Builder upgradeMaxIops(Integer upgradeMaxIops) {
                this.upgradeMaxIops = upgradeMaxIops;
                return this;
            }

            /**
             * UpgradeMemory
             */
            public Builder upgradeMemory(Long upgradeMemory) {
                this.upgradeMemory = upgradeMemory;
                return this;
            }

            /**
             * UpgradeReferencePrice
             */
            public Builder upgradeReferencePrice(String upgradeReferencePrice) {
                this.upgradeReferencePrice = upgradeReferencePrice;
                return this;
            }

            /**
             * UpgradeStorageType
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
