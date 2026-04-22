// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DescribeEapDeviceResourceAllocationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEapDeviceResourceAllocationResponseBody</p>
 */
public class DescribeEapDeviceResourceAllocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEapDeviceResourceAllocationResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEapDeviceResourceAllocationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEapDeviceResourceAllocationResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>19E994DC-A816-56DB-9F90-5F8E403DD19D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEapDeviceResourceAllocationResponseBody build() {
            return new DescribeEapDeviceResourceAllocationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEapDeviceResourceAllocationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEapDeviceResourceAllocationResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceCount")
        private Integer deviceCount;

        @com.aliyun.core.annotation.NameInMap("HeadAcu")
        private Double headAcu;

        @com.aliyun.core.annotation.NameInMap("HeadCpu")
        private Integer headCpu;

        @com.aliyun.core.annotation.NameInMap("HeadSpecName")
        private String headSpecName;

        @com.aliyun.core.annotation.NameInMap("TotalAcu")
        private Double totalAcu;

        @com.aliyun.core.annotation.NameInMap("TotalDeployedCpu")
        private Integer totalDeployedCpu;

        @com.aliyun.core.annotation.NameInMap("TotalTargetCpu")
        private Integer totalTargetCpu;

        @com.aliyun.core.annotation.NameInMap("WebserverAcu")
        private Double webserverAcu;

        @com.aliyun.core.annotation.NameInMap("WebserverCpu")
        private Integer webserverCpu;

        @com.aliyun.core.annotation.NameInMap("WebserverSpecName")
        private String webserverSpecName;

        @com.aliyun.core.annotation.NameInMap("WorkerAcu")
        private Double workerAcu;

        @com.aliyun.core.annotation.NameInMap("WorkerCount")
        private Integer workerCount;

        @com.aliyun.core.annotation.NameInMap("WorkerCpu")
        private Integer workerCpu;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecName")
        private String workerSpecName;

        private Items(Builder builder) {
            this.deviceCount = builder.deviceCount;
            this.headAcu = builder.headAcu;
            this.headCpu = builder.headCpu;
            this.headSpecName = builder.headSpecName;
            this.totalAcu = builder.totalAcu;
            this.totalDeployedCpu = builder.totalDeployedCpu;
            this.totalTargetCpu = builder.totalTargetCpu;
            this.webserverAcu = builder.webserverAcu;
            this.webserverCpu = builder.webserverCpu;
            this.webserverSpecName = builder.webserverSpecName;
            this.workerAcu = builder.workerAcu;
            this.workerCount = builder.workerCount;
            this.workerCpu = builder.workerCpu;
            this.workerSpecName = builder.workerSpecName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceCount
         */
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return headAcu
         */
        public Double getHeadAcu() {
            return this.headAcu;
        }

        /**
         * @return headCpu
         */
        public Integer getHeadCpu() {
            return this.headCpu;
        }

        /**
         * @return headSpecName
         */
        public String getHeadSpecName() {
            return this.headSpecName;
        }

        /**
         * @return totalAcu
         */
        public Double getTotalAcu() {
            return this.totalAcu;
        }

        /**
         * @return totalDeployedCpu
         */
        public Integer getTotalDeployedCpu() {
            return this.totalDeployedCpu;
        }

        /**
         * @return totalTargetCpu
         */
        public Integer getTotalTargetCpu() {
            return this.totalTargetCpu;
        }

        /**
         * @return webserverAcu
         */
        public Double getWebserverAcu() {
            return this.webserverAcu;
        }

        /**
         * @return webserverCpu
         */
        public Integer getWebserverCpu() {
            return this.webserverCpu;
        }

        /**
         * @return webserverSpecName
         */
        public String getWebserverSpecName() {
            return this.webserverSpecName;
        }

        /**
         * @return workerAcu
         */
        public Double getWorkerAcu() {
            return this.workerAcu;
        }

        /**
         * @return workerCount
         */
        public Integer getWorkerCount() {
            return this.workerCount;
        }

        /**
         * @return workerCpu
         */
        public Integer getWorkerCpu() {
            return this.workerCpu;
        }

        /**
         * @return workerSpecName
         */
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public static final class Builder {
            private Integer deviceCount; 
            private Double headAcu; 
            private Integer headCpu; 
            private String headSpecName; 
            private Double totalAcu; 
            private Integer totalDeployedCpu; 
            private Integer totalTargetCpu; 
            private Double webserverAcu; 
            private Integer webserverCpu; 
            private String webserverSpecName; 
            private Double workerAcu; 
            private Integer workerCount; 
            private Integer workerCpu; 
            private String workerSpecName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.deviceCount = model.deviceCount;
                this.headAcu = model.headAcu;
                this.headCpu = model.headCpu;
                this.headSpecName = model.headSpecName;
                this.totalAcu = model.totalAcu;
                this.totalDeployedCpu = model.totalDeployedCpu;
                this.totalTargetCpu = model.totalTargetCpu;
                this.webserverAcu = model.webserverAcu;
                this.webserverCpu = model.webserverCpu;
                this.webserverSpecName = model.webserverSpecName;
                this.workerAcu = model.workerAcu;
                this.workerCount = model.workerCount;
                this.workerCpu = model.workerCpu;
                this.workerSpecName = model.workerSpecName;
            } 

            /**
             * DeviceCount.
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * HeadAcu.
             */
            public Builder headAcu(Double headAcu) {
                this.headAcu = headAcu;
                return this;
            }

            /**
             * HeadCpu.
             */
            public Builder headCpu(Integer headCpu) {
                this.headCpu = headCpu;
                return this;
            }

            /**
             * HeadSpecName.
             */
            public Builder headSpecName(String headSpecName) {
                this.headSpecName = headSpecName;
                return this;
            }

            /**
             * TotalAcu.
             */
            public Builder totalAcu(Double totalAcu) {
                this.totalAcu = totalAcu;
                return this;
            }

            /**
             * TotalDeployedCpu.
             */
            public Builder totalDeployedCpu(Integer totalDeployedCpu) {
                this.totalDeployedCpu = totalDeployedCpu;
                return this;
            }

            /**
             * TotalTargetCpu.
             */
            public Builder totalTargetCpu(Integer totalTargetCpu) {
                this.totalTargetCpu = totalTargetCpu;
                return this;
            }

            /**
             * WebserverAcu.
             */
            public Builder webserverAcu(Double webserverAcu) {
                this.webserverAcu = webserverAcu;
                return this;
            }

            /**
             * WebserverCpu.
             */
            public Builder webserverCpu(Integer webserverCpu) {
                this.webserverCpu = webserverCpu;
                return this;
            }

            /**
             * WebserverSpecName.
             */
            public Builder webserverSpecName(String webserverSpecName) {
                this.webserverSpecName = webserverSpecName;
                return this;
            }

            /**
             * WorkerAcu.
             */
            public Builder workerAcu(Double workerAcu) {
                this.workerAcu = workerAcu;
                return this;
            }

            /**
             * WorkerCount.
             */
            public Builder workerCount(Integer workerCount) {
                this.workerCount = workerCount;
                return this;
            }

            /**
             * WorkerCpu.
             */
            public Builder workerCpu(Integer workerCpu) {
                this.workerCpu = workerCpu;
                return this;
            }

            /**
             * WorkerSpecName.
             */
            public Builder workerSpecName(String workerSpecName) {
                this.workerSpecName = workerSpecName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
