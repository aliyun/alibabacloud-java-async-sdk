// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The cluster specifications.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClassListResponseBody build() {
            return new DescribeClassListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClassListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClassListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassGroup")
        private String classGroup;

        @com.aliyun.core.annotation.NameInMap("ClassTypeLevel")
        private String classTypeLevel;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("EssdMaxStorageCapacity")
        private String essdMaxStorageCapacity;

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

        @com.aliyun.core.annotation.NameInMap("PolarStoreMaxStorageCapacity")
        private String polarStoreMaxStorageCapacity;

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
            this.essdMaxStorageCapacity = builder.essdMaxStorageCapacity;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.maxStorageCapacity = builder.maxStorageCapacity;
            this.memoryClass = builder.memoryClass;
            this.pl1MaxIOPS = builder.pl1MaxIOPS;
            this.pl2MaxIOPS = builder.pl2MaxIOPS;
            this.pl3MaxIOPS = builder.pl3MaxIOPS;
            this.polarStoreMaxStorageCapacity = builder.polarStoreMaxStorageCapacity;
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
         * @return essdMaxStorageCapacity
         */
        public String getEssdMaxStorageCapacity() {
            return this.essdMaxStorageCapacity;
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
         * @return polarStoreMaxStorageCapacity
         */
        public String getPolarStoreMaxStorageCapacity() {
            return this.polarStoreMaxStorageCapacity;
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
            private String essdMaxStorageCapacity; 
            private String maxConnections; 
            private String maxIOPS; 
            private String maxStorageCapacity; 
            private String memoryClass; 
            private String pl1MaxIOPS; 
            private String pl2MaxIOPS; 
            private String pl3MaxIOPS; 
            private String polarStoreMaxStorageCapacity; 
            private String psl4MaxIOPS; 
            private String psl5MaxIOPS; 
            private String referenceExtPrice; 
            private String referencePrice; 

            /**
             * <p>The specifications of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.medium</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The instance family of the cluster. Valid values:</p>
             * <ul>
             * <li>Exclusive package: dedicated</li>
             * <li>Exclusive physical machine: dedicated host</li>
             * <li>Beginner: starter</li>
             * <li>Historical specifications: historical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exclusive package</p>
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * <p>The specification type of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>enterprise</p>
             */
            public Builder classTypeLevel(String classTypeLevel) {
                this.classTypeLevel = classTypeLevel;
                return this;
            }

            /**
             * <p>The number of vCPU cores. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * EssdMaxStorageCapacity.
             */
            public Builder essdMaxStorageCapacity(String essdMaxStorageCapacity) {
                this.essdMaxStorageCapacity = essdMaxStorageCapacity;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum IOPS. Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The maximum storage capacity. Unit: TB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxStorageCapacity(String maxStorageCapacity) {
                this.maxStorageCapacity = maxStorageCapacity;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * <p>The maximum IOPS of an enhanced SSD (ESSD) of performance level 1 (PL1). Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder pl1MaxIOPS(String pl1MaxIOPS) {
                this.pl1MaxIOPS = pl1MaxIOPS;
                return this;
            }

            /**
             * <p>The maximum IOPS of an ESSD of performance level 2 (PL2). Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder pl2MaxIOPS(String pl2MaxIOPS) {
                this.pl2MaxIOPS = pl2MaxIOPS;
                return this;
            }

            /**
             * <p>The maximum IOPS of an ESSD of performance level 3 (PL3). Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder pl3MaxIOPS(String pl3MaxIOPS) {
                this.pl3MaxIOPS = pl3MaxIOPS;
                return this;
            }

            /**
             * PolarStoreMaxStorageCapacity.
             */
            public Builder polarStoreMaxStorageCapacity(String polarStoreMaxStorageCapacity) {
                this.polarStoreMaxStorageCapacity = polarStoreMaxStorageCapacity;
                return this;
            }

            /**
             * <p>The maximum Input/output operations per second (IOPS) for PolarStore Level 4 (PSL4). Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>48000</p>
             */
            public Builder psl4MaxIOPS(String psl4MaxIOPS) {
                this.psl4MaxIOPS = psl4MaxIOPS;
                return this;
            }

            /**
             * <p>The maximum IOPS for PolarStore Level 5 (PSL5). Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>96000</p>
             */
            public Builder psl5MaxIOPS(String psl5MaxIOPS) {
                this.psl5MaxIOPS = psl5MaxIOPS;
                return this;
            }

            /**
             * <p>The additional price.</p>
             * <p>Unit: cents (USD).</p>
             * <blockquote>
             * <ul>
             * <li>If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the same as the value of ReferencePrice.</li>
             * <li>If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the price of the single-node cluster.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200000</p>
             */
            public Builder referenceExtPrice(String referenceExtPrice) {
                this.referenceExtPrice = referenceExtPrice;
                return this;
            }

            /**
             * <p>The price.</p>
             * <p>Unit: cents (USD).</p>
             * <blockquote>
             * <ul>
             * <li>If you set CommodityCode to a commodity that uses the pay-as-you-go billing method, ReferencePrice indicates the hourly fee that you need to pay.</li>
             * <li>If you set CommodityCode to a commodity that uses the subscription billing method, ReferencePrice indicates the monthly fee that you need to pay.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200000</p>
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
