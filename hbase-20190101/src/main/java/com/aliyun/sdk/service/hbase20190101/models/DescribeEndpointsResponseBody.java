// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndpointsResponseBody</p>
 */
public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("ConnAddrs")
    private ConnAddrs connAddrs;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("NetType")
    private String netType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeEndpointsResponseBody(Builder builder) {
        this.connAddrs = builder.connAddrs;
        this.engine = builder.engine;
        this.netType = builder.netType;
        this.requestId = builder.requestId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connAddrs
     */
    public ConnAddrs getConnAddrs() {
        return this.connAddrs;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private ConnAddrs connAddrs; 
        private String engine; 
        private String netType; 
        private String requestId; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * ConnAddrs.
         */
        public Builder connAddrs(ConnAddrs connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeEndpointsResponseBody build() {
            return new DescribeEndpointsResponseBody(this);
        } 

    } 

    public static class ConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("ConnType")
        private String connType;

        @NameInMap("NetType")
        private String netType;

        private ConnAddrInfo(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
            this.connType = builder.connType;
            this.netType = builder.netType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnAddrInfo create() {
            return builder().build();
        }

        /**
         * @return connAddr
         */
        public String getConnAddr() {
            return this.connAddr;
        }

        /**
         * @return connAddrPort
         */
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        /**
         * @return connType
         */
        public String getConnType() {
            return this.connType;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
            private String connType; 
            private String netType; 

            /**
             * ConnAddr.
             */
            public Builder connAddr(String connAddr) {
                this.connAddr = connAddr;
                return this;
            }

            /**
             * ConnAddrPort.
             */
            public Builder connAddrPort(String connAddrPort) {
                this.connAddrPort = connAddrPort;
                return this;
            }

            /**
             * ConnType.
             */
            public Builder connType(String connType) {
                this.connType = connType;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            public ConnAddrInfo build() {
                return new ConnAddrInfo(this);
            } 

        } 

    }
    public static class ConnAddrs extends TeaModel {
        @NameInMap("ConnAddrInfo")
        private java.util.List < ConnAddrInfo> connAddrInfo;

        private ConnAddrs(Builder builder) {
            this.connAddrInfo = builder.connAddrInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnAddrs create() {
            return builder().build();
        }

        /**
         * @return connAddrInfo
         */
        public java.util.List < ConnAddrInfo> getConnAddrInfo() {
            return this.connAddrInfo;
        }

        public static final class Builder {
            private java.util.List < ConnAddrInfo> connAddrInfo; 

            /**
             * ConnAddrInfo.
             */
            public Builder connAddrInfo(java.util.List < ConnAddrInfo> connAddrInfo) {
                this.connAddrInfo = connAddrInfo;
                return this;
            }

            public ConnAddrs build() {
                return new ConnAddrs(this);
            } 

        } 

    }
}
