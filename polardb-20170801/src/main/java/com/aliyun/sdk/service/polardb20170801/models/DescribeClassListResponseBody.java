// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClassListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClassListResponseBody</p>
 */
public class DescribeClassListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClassListResponseBody(Builder builder) {
        this.items = builder.items;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClassListResponseBody create() {
        return builder().build();
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
        private java.util.List < Items> items; 
        private String regionId; 
        private String requestId; 

        /**
         * The specifications of the cluster.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClassListResponseBody build() {
            return new DescribeClassListResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassGroup")
        private String classGroup;

        @com.aliyun.core.annotation.NameInMap("ClassTypeLevel")
        private String classTypeLevel;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private String maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private String maxIOPS;

        @com.aliyun.core.annotation.NameInMap("MaxStorageCapacity")
        private String maxStorageCapacity;

        @com.aliyun.core.annotation.NameInMap("MemoryClass")
        private String memoryClass;

        @com.aliyun.core.annotation.NameInMap("Pl1MaxIOPS")
        private String pl1MaxIOPS;

        @com.aliyun.core.annotation.NameInMap("Pl2MaxIOPS")
        private String pl2MaxIOPS;

        @com.aliyun.core.annotation.NameInMap("Pl3MaxIOPS")
        private String pl3MaxIOPS;

        @com.aliyun.core.annotation.NameInMap("Psl4MaxIOPS")
        private String psl4MaxIOPS;

        @com.aliyun.core.annotation.NameInMap("Psl5MaxIOPS")
        private String psl5MaxIOPS;

        @com.aliyun.core.annotation.NameInMap("ReferenceExtPrice")
        private String referenceExtPrice;

        @com.aliyun.core.annotation.NameInMap("ReferencePrice")
        private String referencePrice;

        private Items(Builder builder) {
            this.classCode = builder.classCode;
            this.classGroup = builder.classGroup;
            this.classTypeLevel = builder.classTypeLevel;
            this.cpu = builder.cpu;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.maxStorageCapacity = builder.maxStorageCapacity;
            this.memoryClass = builder.memoryClass;
            this.pl1MaxIOPS = builder.pl1MaxIOPS;
            this.pl2MaxIOPS = builder.pl2MaxIOPS;
            this.pl3MaxIOPS = builder.pl3MaxIOPS;
            this.psl4MaxIOPS = builder.psl4MaxIOPS;
            this.psl5MaxIOPS = builder.psl5MaxIOPS;
            this.referenceExtPrice = builder.referenceExtPrice;
            this.referencePrice = builder.referencePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return classTypeLevel
         */
        public String getClassTypeLevel() {
            return this.classTypeLevel;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return maxConnections
         */
        public String getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public String getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return maxStorageCapacity
         */
        public String getMaxStorageCapacity() {
            return this.maxStorageCapacity;
        }

        /**
         * @return memoryClass
         */
        public String getMemoryClass() {
            return this.memoryClass;
        }

        /**
         * @return pl1MaxIOPS
         */
        public String getPl1MaxIOPS() {
            return this.pl1MaxIOPS;
        }

        /**
         * @return pl2MaxIOPS
         */
        public String getPl2MaxIOPS() {
            return this.pl2MaxIOPS;
        }

        /**
         * @return pl3MaxIOPS
         */
        public String getPl3MaxIOPS() {
            return this.pl3MaxIOPS;
        }

        /**
         * @return psl4MaxIOPS
         */
        public String getPsl4MaxIOPS() {
            return this.psl4MaxIOPS;
        }

        /**
         * @return psl5MaxIOPS
         */
        public String getPsl5MaxIOPS() {
            return this.psl5MaxIOPS;
        }

        /**
         * @return referenceExtPrice
         */
        public String getReferenceExtPrice() {
            return this.referenceExtPrice;
        }

        /**
         * @return referencePrice
         */
        public String getReferencePrice() {
            return this.referencePrice;
        }

        public static final class Builder {
            private String classCode; 
            private String classGroup; 
            private String classTypeLevel; 
            private String cpu; 
            private String maxConnections; 
            private String maxIOPS; 
            private String maxStorageCapacity; 
            private String memoryClass; 
            private String pl1MaxIOPS; 
            private String pl2MaxIOPS; 
            private String pl3MaxIOPS; 
            private String psl4MaxIOPS; 
            private String psl5MaxIOPS; 
            private String referenceExtPrice; 
            private String referencePrice; 

            /**
             * The specifications of the cluster.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The instance family of the cluster. Valid values:
             * <p>
             * 
             * *   Exclusive package: dedicated
             * *   Exclusive physical machine: dedicated host
             * *   Beginner: starter
             * *   Historical specifications: historical
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * The specification type of the cluster.
             */
            public Builder classTypeLevel(String classTypeLevel) {
                this.classTypeLevel = classTypeLevel;
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
             * The maximum number of concurrent connections in the cluster.
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * The maximum IOPS. Unit: operations per second.
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * The maximum storage capacity. Unit: TB.
             */
            public Builder maxStorageCapacity(String maxStorageCapacity) {
                this.maxStorageCapacity = maxStorageCapacity;
                return this;
            }

            /**
             * The memory size. Unit: GB.
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * The maximum IOPS of an enhanced SSD (ESSD) of performance level 1 (PL1). Unit: operations per second.
             */
            public Builder pl1MaxIOPS(String pl1MaxIOPS) {
                this.pl1MaxIOPS = pl1MaxIOPS;
                return this;
            }

            /**
             * The maximum IOPS of an ESSD of performance level 2 (PL2). Unit: operations per second.
             */
            public Builder pl2MaxIOPS(String pl2MaxIOPS) {
                this.pl2MaxIOPS = pl2MaxIOPS;
                return this;
            }

            /**
             * The maximum IOPS of an ESSD of performance level 3 (PL3). Unit: operations per second.
             */
            public Builder pl3MaxIOPS(String pl3MaxIOPS) {
                this.pl3MaxIOPS = pl3MaxIOPS;
                return this;
            }

            /**
             * The maximum Input/output operations per second (IOPS) for PolarStore Level 4 (PSL4). Unit: operations per second.
             */
            public Builder psl4MaxIOPS(String psl4MaxIOPS) {
                this.psl4MaxIOPS = psl4MaxIOPS;
                return this;
            }

            /**
             * The maximum IOPS for PolarStore Level 5 (PSL5). Unit: operations per second.
             */
            public Builder psl5MaxIOPS(String psl5MaxIOPS) {
                this.psl5MaxIOPS = psl5MaxIOPS;
                return this;
            }

            /**
             * The additional price.
             * <p>
             * 
             * Unit: cents (USD).
             * 
             * >- If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the same as the value of ReferencePrice.
             * >- If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the price of the single-node cluster.
             */
            public Builder referenceExtPrice(String referenceExtPrice) {
                this.referenceExtPrice = referenceExtPrice;
                return this;
            }

            /**
             * The price.
             * <p>
             * 
             * Unit: cents (USD).
             * 
             * >- If you set CommodityCode to a commodity that uses the pay-as-you-go billing method, ReferencePrice indicates the hourly fee that you need to pay.
             * >- If you set CommodityCode to a commodity that uses the subscription billing method, ReferencePrice indicates the monthly fee that you need to pay.
             */
            public Builder referencePrice(String referencePrice) {
                this.referencePrice = referencePrice;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
