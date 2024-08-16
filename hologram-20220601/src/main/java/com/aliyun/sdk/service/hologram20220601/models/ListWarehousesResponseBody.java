// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWarehousesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarehousesResponseBody</p>
 */
public class ListWarehousesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("WarehouseList")
    private java.util.List < WarehouseList> warehouseList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListWarehousesResponseBody(Builder builder) {
        this.warehouseList = builder.warehouseList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarehousesResponseBody create() {
        return builder().build();
    }

    /**
     * @return warehouseList
     */
    public java.util.List < WarehouseList> getWarehouseList() {
        return this.warehouseList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < WarehouseList> warehouseList; 
        private String requestId; 

        /**
         * The list of virtual warehouse instances.
         */
        public Builder warehouseList(java.util.List < WarehouseList> warehouseList) {
            this.warehouseList = warehouseList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWarehousesResponseBody build() {
            return new ListWarehousesResponseBody(this);
        } 

    } 

    public static class WarehouseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Long mem;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The number of CPU cores.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The memory capacity.
             */
            public Builder mem(Long mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The name of the virtual warehouse instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of compute nodes.
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * The status.
             * <p>
             * 
             * Valid values:
             * 
             * *   kRunning
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   kSuspended
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   kInit
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   kFailed
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   kAllocating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
}
