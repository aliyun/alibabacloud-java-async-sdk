// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWarehouseDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetWarehouseDetailResponseBody</p>
 */
public class GetWarehouseDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WarehouseDetail")
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

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WarehouseDetail.
         */
        public Builder warehouseDetail(WarehouseDetail warehouseDetail) {
            this.warehouseDetail = warehouseDetail;
            return this;
        }

        public GetWarehouseDetailResponseBody build() {
            return new GetWarehouseDetailResponseBody(this);
        } 

    } 

    public static class WarehouseList extends TeaModel {
        @NameInMap("Cpu")
        private Long cpu;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Mem")
        private Long mem;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodeCount")
        private Long nodeCount;

        @NameInMap("Status")
        private String status;

        private WarehouseList(Builder builder) {
            this.cpu = builder.cpu;
            this.id = builder.id;
            this.mem = builder.mem;
            this.name = builder.name;
            this.nodeCount = builder.nodeCount;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarehouseList create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long cpu; 
            private Long id; 
            private Long mem; 
            private String name; 
            private Long nodeCount; 
            private String status; 

            /**
             * cpu
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * Status.
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
    public static class WarehouseDetail extends TeaModel {
        @NameInMap("RemainingCpu")
        private String remainingCpu;

        @NameInMap("ReservedCpu")
        private String reservedCpu;

        @NameInMap("WarehouseList")
        private java.util.List < WarehouseList> warehouseList;

        private WarehouseDetail(Builder builder) {
            this.remainingCpu = builder.remainingCpu;
            this.reservedCpu = builder.reservedCpu;
            this.warehouseList = builder.warehouseList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarehouseDetail create() {
            return builder().build();
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
         * @return warehouseList
         */
        public java.util.List < WarehouseList> getWarehouseList() {
            return this.warehouseList;
        }

        public static final class Builder {
            private String remainingCpu; 
            private String reservedCpu; 
            private java.util.List < WarehouseList> warehouseList; 

            /**
             * RemainingCpu.
             */
            public Builder remainingCpu(String remainingCpu) {
                this.remainingCpu = remainingCpu;
                return this;
            }

            /**
             * ReservedCpu.
             */
            public Builder reservedCpu(String reservedCpu) {
                this.reservedCpu = reservedCpu;
                return this;
            }

            /**
             * WarehouseList.
             */
            public Builder warehouseList(java.util.List < WarehouseList> warehouseList) {
                this.warehouseList = warehouseList;
                return this;
            }

            public WarehouseDetail build() {
                return new WarehouseDetail(this);
            } 

        } 

    }
}
