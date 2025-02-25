// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualWareHouseEndpointInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualWareHouseEndpointInfoResponseBody</p>
 */
public class DescribeVirtualWareHouseEndpointInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVirtualWareHouseEndpointInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualWareHouseEndpointInfoResponseBody create() {
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

        public DescribeVirtualWareHouseEndpointInfoResponseBody build() {
            return new DescribeVirtualWareHouseEndpointInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualWareHouseEndpointInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualWareHouseEndpointInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private String ports;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.endpointType = builder.endpointType;
            this.ip = builder.ip;
            this.netType = builder.netType;
            this.ports = builder.ports;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String endpointType; 
            private String ip; 
            private String netType; 
            private String ports; 
            private String status; 
            private String url; 

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
