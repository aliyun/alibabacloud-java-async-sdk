// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListVirtualWareHousesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualWareHousesResponseBody</p>
 */
public class ListVirtualWareHousesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirtualWareHousesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualWareHousesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirtualWareHousesResponseBody build() {
            return new ListVirtualWareHousesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualWareHousesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualWareHousesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ports")
        private String ports;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseCacheStorage")
        private Integer virtualWareHouseCacheStorage;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseClass")
        private String virtualWareHouseClass;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseDescription")
        private String virtualWareHouseDescription;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
        private String virtualWareHouseId;

        @com.aliyun.core.annotation.NameInMap("VirtualWareHouseStatus")
        private String virtualWareHouseStatus;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.ports = builder.ports;
            this.virtualWareHouseCacheStorage = builder.virtualWareHouseCacheStorage;
            this.virtualWareHouseClass = builder.virtualWareHouseClass;
            this.virtualWareHouseDescription = builder.virtualWareHouseDescription;
            this.virtualWareHouseId = builder.virtualWareHouseId;
            this.virtualWareHouseStatus = builder.virtualWareHouseStatus;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return virtualWareHouseCacheStorage
         */
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        /**
         * @return virtualWareHouseClass
         */
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        /**
         * @return virtualWareHouseDescription
         */
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        /**
         * @return virtualWareHouseId
         */
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        /**
         * @return virtualWareHouseStatus
         */
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String ports; 
            private Integer virtualWareHouseCacheStorage; 
            private String virtualWareHouseClass; 
            private String virtualWareHouseDescription; 
            private String virtualWareHouseId; 
            private String virtualWareHouseStatus; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * VirtualWareHouseCacheStorage.
             */
            public Builder virtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
                this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
                return this;
            }

            /**
             * VirtualWareHouseClass.
             */
            public Builder virtualWareHouseClass(String virtualWareHouseClass) {
                this.virtualWareHouseClass = virtualWareHouseClass;
                return this;
            }

            /**
             * VirtualWareHouseDescription.
             */
            public Builder virtualWareHouseDescription(String virtualWareHouseDescription) {
                this.virtualWareHouseDescription = virtualWareHouseDescription;
                return this;
            }

            /**
             * VirtualWareHouseId.
             */
            public Builder virtualWareHouseId(String virtualWareHouseId) {
                this.virtualWareHouseId = virtualWareHouseId;
                return this;
            }

            /**
             * VirtualWareHouseStatus.
             */
            public Builder virtualWareHouseStatus(String virtualWareHouseStatus) {
                this.virtualWareHouseStatus = virtualWareHouseStatus;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
