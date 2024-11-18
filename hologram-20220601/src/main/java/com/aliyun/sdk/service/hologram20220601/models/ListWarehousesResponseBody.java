// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of virtual warehouse instances.</p>
         */
        public Builder warehouseList(java.util.List < WarehouseList> warehouseList) {
            this.warehouseList = warehouseList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWarehousesResponseBody build() {
            return new ListWarehousesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWarehousesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWarehousesResponseBody</p>
     */
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
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
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
}
