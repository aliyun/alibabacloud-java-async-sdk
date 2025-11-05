// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetWarehouseDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetWarehouseDetailResponseBody</p>
 */
public class GetWarehouseDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarehouseDetail")
    private WarehouseDetail warehouseDetail;

    private GetWarehouseDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.warehouseDetail = builder.warehouseDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWarehouseDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return warehouseDetail
     */
    public WarehouseDetail getWarehouseDetail() {
        return this.warehouseDetail;
    }

    public static final class Builder {
        private String requestId; 
        private WarehouseDetail warehouseDetail; 

        private Builder() {
        } 

        private Builder(GetWarehouseDetailResponseBody model) {
            this.requestId = model.requestId;
            this.warehouseDetail = model.warehouseDetail;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned values.</p>
         */
        public Builder warehouseDetail(WarehouseDetail warehouseDetail) {
            this.warehouseDetail = warehouseDetail;
            return this;
        }

        public GetWarehouseDetailResponseBody build() {
            return new GetWarehouseDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWarehouseDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetWarehouseDetailResponseBody</p>
     */
    public static class WarehouseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScaleType")
        private String autoScaleType;

        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private String clusterCount;

        @com.aliyun.core.annotation.NameInMap("ClusterCpu")
        private String clusterCpu;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("DefaultWarehouse")
        private Boolean defaultWarehouse;

        @com.aliyun.core.annotation.NameInMap("ElasticCpu")
        private Long elasticCpu;

        @com.aliyun.core.annotation.NameInMap("ElasticType")
        private String elasticType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InitClusterCount")
        private String initClusterCount;

        @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
        private String maxClusterCount;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Long mem;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("RebalanceStatus")
        private String rebalanceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private WarehouseList(Builder builder) {
            this.autoScaleType = builder.autoScaleType;
            this.clusterCount = builder.clusterCount;
            this.clusterCpu = builder.clusterCpu;
            this.cpu = builder.cpu;
            this.defaultWarehouse = builder.defaultWarehouse;
            this.elasticCpu = builder.elasticCpu;
            this.elasticType = builder.elasticType;
            this.id = builder.id;
            this.initClusterCount = builder.initClusterCount;
            this.maxClusterCount = builder.maxClusterCount;
            this.mem = builder.mem;
            this.name = builder.name;
            this.nodeCount = builder.nodeCount;
            this.rebalanceStatus = builder.rebalanceStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarehouseList create() {
            return builder().build();
        }

        /**
         * @return autoScaleType
         */
        public String getAutoScaleType() {
            return this.autoScaleType;
        }

        /**
         * @return clusterCount
         */
        public String getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return clusterCpu
         */
        public String getClusterCpu() {
            return this.clusterCpu;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return defaultWarehouse
         */
        public Boolean getDefaultWarehouse() {
            return this.defaultWarehouse;
        }

        /**
         * @return elasticCpu
         */
        public Long getElasticCpu() {
            return this.elasticCpu;
        }

        /**
         * @return elasticType
         */
        public String getElasticType() {
            return this.elasticType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return initClusterCount
         */
        public String getInitClusterCount() {
            return this.initClusterCount;
        }

        /**
         * @return maxClusterCount
         */
        public String getMaxClusterCount() {
            return this.maxClusterCount;
        }

        /**
         * @return mem
         */
        public Long getMem() {
            return this.mem;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return rebalanceStatus
         */
        public String getRebalanceStatus() {
            return this.rebalanceStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String autoScaleType; 
            private String clusterCount; 
            private String clusterCpu; 
            private Long cpu; 
            private Boolean defaultWarehouse; 
            private Long elasticCpu; 
            private String elasticType; 
            private Long id; 
            private String initClusterCount; 
            private String maxClusterCount; 
            private Long mem; 
            private String name; 
            private Long nodeCount; 
            private String rebalanceStatus; 
            private String status; 

            private Builder() {
            } 

            private Builder(WarehouseList model) {
                this.autoScaleType = model.autoScaleType;
                this.clusterCount = model.clusterCount;
                this.clusterCpu = model.clusterCpu;
                this.cpu = model.cpu;
                this.defaultWarehouse = model.defaultWarehouse;
                this.elasticCpu = model.elasticCpu;
                this.elasticType = model.elasticType;
                this.id = model.id;
                this.initClusterCount = model.initClusterCount;
                this.maxClusterCount = model.maxClusterCount;
                this.mem = model.mem;
                this.name = model.name;
                this.nodeCount = model.nodeCount;
                this.rebalanceStatus = model.rebalanceStatus;
                this.status = model.status;
            } 

            /**
             * AutoScaleType.
             */
            public Builder autoScaleType(String autoScaleType) {
                this.autoScaleType = autoScaleType;
                return this;
            }

            /**
             * ClusterCount.
             */
            public Builder clusterCount(String clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * ClusterCpu.
             */
            public Builder clusterCpu(String clusterCpu) {
                this.clusterCpu = clusterCpu;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DefaultWarehouse.
             */
            public Builder defaultWarehouse(Boolean defaultWarehouse) {
                this.defaultWarehouse = defaultWarehouse;
                return this;
            }

            /**
             * ElasticCpu.
             */
            public Builder elasticCpu(Long elasticCpu) {
                this.elasticCpu = elasticCpu;
                return this;
            }

            /**
             * ElasticType.
             */
            public Builder elasticType(String elasticType) {
                this.elasticType = elasticType;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InitClusterCount.
             */
            public Builder initClusterCount(String initClusterCount) {
                this.initClusterCount = initClusterCount;
                return this;
            }

            /**
             * MaxClusterCount.
             */
            public Builder maxClusterCount(String maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * <p>The memory capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The name of the virtual warehouse instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MyWarehouse</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * RebalanceStatus.
             */
            public Builder rebalanceStatus(String rebalanceStatus) {
                this.rebalanceStatus = rebalanceStatus;
                return this;
            }

            /**
             * <p>The status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>kRunning</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>kSuspended</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>kInit</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>kFailed</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>kAllocating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kRunning</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public WarehouseList build() {
                return new WarehouseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWarehouseDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetWarehouseDetailResponseBody</p>
     */
    public static class WarehouseDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoElasticCpu")
        private String autoElasticCpu;

        @com.aliyun.core.annotation.NameInMap("RemainingCpu")
        private String remainingCpu;

        @com.aliyun.core.annotation.NameInMap("ReservedCpu")
        private String reservedCpu;

        @com.aliyun.core.annotation.NameInMap("TimedElasticCpu")
        private String timedElasticCpu;

        @com.aliyun.core.annotation.NameInMap("WarehouseList")
        private java.util.List<WarehouseList> warehouseList;

        private WarehouseDetail(Builder builder) {
            this.autoElasticCpu = builder.autoElasticCpu;
            this.remainingCpu = builder.remainingCpu;
            this.reservedCpu = builder.reservedCpu;
            this.timedElasticCpu = builder.timedElasticCpu;
            this.warehouseList = builder.warehouseList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarehouseDetail create() {
            return builder().build();
        }

        /**
         * @return autoElasticCpu
         */
        public String getAutoElasticCpu() {
            return this.autoElasticCpu;
        }

        /**
         * @return remainingCpu
         */
        public String getRemainingCpu() {
            return this.remainingCpu;
        }

        /**
         * @return reservedCpu
         */
        public String getReservedCpu() {
            return this.reservedCpu;
        }

        /**
         * @return timedElasticCpu
         */
        public String getTimedElasticCpu() {
            return this.timedElasticCpu;
        }

        /**
         * @return warehouseList
         */
        public java.util.List<WarehouseList> getWarehouseList() {
            return this.warehouseList;
        }

        public static final class Builder {
            private String autoElasticCpu; 
            private String remainingCpu; 
            private String reservedCpu; 
            private String timedElasticCpu; 
            private java.util.List<WarehouseList> warehouseList; 

            private Builder() {
            } 

            private Builder(WarehouseDetail model) {
                this.autoElasticCpu = model.autoElasticCpu;
                this.remainingCpu = model.remainingCpu;
                this.reservedCpu = model.reservedCpu;
                this.timedElasticCpu = model.timedElasticCpu;
                this.warehouseList = model.warehouseList;
            } 

            /**
             * AutoElasticCpu.
             */
            public Builder autoElasticCpu(String autoElasticCpu) {
                this.autoElasticCpu = autoElasticCpu;
                return this;
            }

            /**
             * <p>The remaining unallocated computing resources of the virtual warehouse instance.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder remainingCpu(String remainingCpu) {
                this.remainingCpu = remainingCpu;
                return this;
            }

            /**
             * <p>The reserved computing resources. The amount of computing resources in all running virtual warehouses in an instance cannot exceed the amount of reserved computing resources in the virtual warehouses.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder reservedCpu(String reservedCpu) {
                this.reservedCpu = reservedCpu;
                return this;
            }

            /**
             * TimedElasticCpu.
             */
            public Builder timedElasticCpu(String timedElasticCpu) {
                this.timedElasticCpu = timedElasticCpu;
                return this;
            }

            /**
             * <p>The list of virtual warehouses.</p>
             */
            public Builder warehouseList(java.util.List<WarehouseList> warehouseList) {
                this.warehouseList = warehouseList;
                return this;
            }

            public WarehouseDetail build() {
                return new WarehouseDetail(this);
            } 

        } 

    }
}
