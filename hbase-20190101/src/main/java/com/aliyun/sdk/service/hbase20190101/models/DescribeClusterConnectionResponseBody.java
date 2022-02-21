// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterConnectionResponseBody</p>
 */
public class DescribeClusterConnectionResponseBody extends TeaModel {
    @NameInMap("DbType")
    private String dbType;

    @NameInMap("IsMultimod")
    private String isMultimod;

    @NameInMap("NetType")
    private String netType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceConnAddrs")
    private ServiceConnAddrs serviceConnAddrs;

    @NameInMap("SlbConnAddrs")
    private SlbConnAddrs slbConnAddrs;

    @NameInMap("ThriftConn")
    private ThriftConn thriftConn;

    @NameInMap("UiProxyConnAddrInfo")
    private UiProxyConnAddrInfo uiProxyConnAddrInfo;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZkConnAddrs")
    private ZkConnAddrs zkConnAddrs;

    private DescribeClusterConnectionResponseBody(Builder builder) {
        this.dbType = builder.dbType;
        this.isMultimod = builder.isMultimod;
        this.netType = builder.netType;
        this.requestId = builder.requestId;
        this.serviceConnAddrs = builder.serviceConnAddrs;
        this.slbConnAddrs = builder.slbConnAddrs;
        this.thriftConn = builder.thriftConn;
        this.uiProxyConnAddrInfo = builder.uiProxyConnAddrInfo;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zkConnAddrs = builder.zkConnAddrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return isMultimod
     */
    public String getIsMultimod() {
        return this.isMultimod;
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
     * @return serviceConnAddrs
     */
    public ServiceConnAddrs getServiceConnAddrs() {
        return this.serviceConnAddrs;
    }

    /**
     * @return slbConnAddrs
     */
    public SlbConnAddrs getSlbConnAddrs() {
        return this.slbConnAddrs;
    }

    /**
     * @return thriftConn
     */
    public ThriftConn getThriftConn() {
        return this.thriftConn;
    }

    /**
     * @return uiProxyConnAddrInfo
     */
    public UiProxyConnAddrInfo getUiProxyConnAddrInfo() {
        return this.uiProxyConnAddrInfo;
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

    /**
     * @return zkConnAddrs
     */
    public ZkConnAddrs getZkConnAddrs() {
        return this.zkConnAddrs;
    }

    public static final class Builder {
        private String dbType; 
        private String isMultimod; 
        private String netType; 
        private String requestId; 
        private ServiceConnAddrs serviceConnAddrs; 
        private SlbConnAddrs slbConnAddrs; 
        private ThriftConn thriftConn; 
        private UiProxyConnAddrInfo uiProxyConnAddrInfo; 
        private String vSwitchId; 
        private String vpcId; 
        private ZkConnAddrs zkConnAddrs; 

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * IsMultimod.
         */
        public Builder isMultimod(String isMultimod) {
            this.isMultimod = isMultimod;
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
         * ServiceConnAddrs.
         */
        public Builder serviceConnAddrs(ServiceConnAddrs serviceConnAddrs) {
            this.serviceConnAddrs = serviceConnAddrs;
            return this;
        }

        /**
         * SlbConnAddrs.
         */
        public Builder slbConnAddrs(SlbConnAddrs slbConnAddrs) {
            this.slbConnAddrs = slbConnAddrs;
            return this;
        }

        /**
         * ThriftConn.
         */
        public Builder thriftConn(ThriftConn thriftConn) {
            this.thriftConn = thriftConn;
            return this;
        }

        /**
         * UiProxyConnAddrInfo.
         */
        public Builder uiProxyConnAddrInfo(UiProxyConnAddrInfo uiProxyConnAddrInfo) {
            this.uiProxyConnAddrInfo = uiProxyConnAddrInfo;
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

        /**
         * ZkConnAddrs.
         */
        public Builder zkConnAddrs(ZkConnAddrs zkConnAddrs) {
            this.zkConnAddrs = zkConnAddrs;
            return this;
        }

        public DescribeClusterConnectionResponseBody build() {
            return new DescribeClusterConnectionResponseBody(this);
        } 

    } 

    public static class ConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("NetType")
        private String netType;

        private ConnAddrInfo(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
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
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
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
    public static class ServiceConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        private ConnAddrInfo connAddrInfo;

        @NameInMap("ConnType")
        private String connType;

        private ServiceConnAddr(Builder builder) {
            this.connAddrInfo = builder.connAddrInfo;
            this.connType = builder.connType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConnAddr create() {
            return builder().build();
        }

        /**
         * @return connAddrInfo
         */
        public ConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        /**
         * @return connType
         */
        public String getConnType() {
            return this.connType;
        }

        public static final class Builder {
            private ConnAddrInfo connAddrInfo; 
            private String connType; 

            /**
             * ConnAddrInfo.
             */
            public Builder connAddrInfo(ConnAddrInfo connAddrInfo) {
                this.connAddrInfo = connAddrInfo;
                return this;
            }

            /**
             * ConnType.
             */
            public Builder connType(String connType) {
                this.connType = connType;
                return this;
            }

            public ServiceConnAddr build() {
                return new ServiceConnAddr(this);
            } 

        } 

    }
    public static class ServiceConnAddrs extends TeaModel {
        @NameInMap("ServiceConnAddr")
        private java.util.List < ServiceConnAddr> serviceConnAddr;

        private ServiceConnAddrs(Builder builder) {
            this.serviceConnAddr = builder.serviceConnAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConnAddrs create() {
            return builder().build();
        }

        /**
         * @return serviceConnAddr
         */
        public java.util.List < ServiceConnAddr> getServiceConnAddr() {
            return this.serviceConnAddr;
        }

        public static final class Builder {
            private java.util.List < ServiceConnAddr> serviceConnAddr; 

            /**
             * ServiceConnAddr.
             */
            public Builder serviceConnAddr(java.util.List < ServiceConnAddr> serviceConnAddr) {
                this.serviceConnAddr = serviceConnAddr;
                return this;
            }

            public ServiceConnAddrs build() {
                return new ServiceConnAddrs(this);
            } 

        } 

    }
    public static class SlbConnAddrConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("NetType")
        private String netType;

        private SlbConnAddrConnAddrInfo(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
            this.netType = builder.netType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbConnAddrConnAddrInfo create() {
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
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            public SlbConnAddrConnAddrInfo build() {
                return new SlbConnAddrConnAddrInfo(this);
            } 

        } 

    }
    public static class SlbConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        private SlbConnAddrConnAddrInfo connAddrInfo;

        @NameInMap("SlbType")
        private String slbType;

        private SlbConnAddr(Builder builder) {
            this.connAddrInfo = builder.connAddrInfo;
            this.slbType = builder.slbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbConnAddr create() {
            return builder().build();
        }

        /**
         * @return connAddrInfo
         */
        public SlbConnAddrConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        /**
         * @return slbType
         */
        public String getSlbType() {
            return this.slbType;
        }

        public static final class Builder {
            private SlbConnAddrConnAddrInfo connAddrInfo; 
            private String slbType; 

            /**
             * ConnAddrInfo.
             */
            public Builder connAddrInfo(SlbConnAddrConnAddrInfo connAddrInfo) {
                this.connAddrInfo = connAddrInfo;
                return this;
            }

            /**
             * SlbType.
             */
            public Builder slbType(String slbType) {
                this.slbType = slbType;
                return this;
            }

            public SlbConnAddr build() {
                return new SlbConnAddr(this);
            } 

        } 

    }
    public static class SlbConnAddrs extends TeaModel {
        @NameInMap("SlbConnAddr")
        private java.util.List < SlbConnAddr> slbConnAddr;

        private SlbConnAddrs(Builder builder) {
            this.slbConnAddr = builder.slbConnAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbConnAddrs create() {
            return builder().build();
        }

        /**
         * @return slbConnAddr
         */
        public java.util.List < SlbConnAddr> getSlbConnAddr() {
            return this.slbConnAddr;
        }

        public static final class Builder {
            private java.util.List < SlbConnAddr> slbConnAddr; 

            /**
             * SlbConnAddr.
             */
            public Builder slbConnAddr(java.util.List < SlbConnAddr> slbConnAddr) {
                this.slbConnAddr = slbConnAddr;
                return this;
            }

            public SlbConnAddrs build() {
                return new SlbConnAddrs(this);
            } 

        } 

    }
    public static class ThriftConn extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("NetType")
        private String netType;

        private ThriftConn(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
            this.netType = builder.netType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThriftConn create() {
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
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            public ThriftConn build() {
                return new ThriftConn(this);
            } 

        } 

    }
    public static class UiProxyConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("NetType")
        private String netType;

        private UiProxyConnAddrInfo(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
            this.netType = builder.netType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UiProxyConnAddrInfo create() {
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
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            public UiProxyConnAddrInfo build() {
                return new UiProxyConnAddrInfo(this);
            } 

        } 

    }
    public static class ZkConnAddr extends TeaModel {
        @NameInMap("ConnAddr")
        private String connAddr;

        @NameInMap("ConnAddrPort")
        private String connAddrPort;

        @NameInMap("NetType")
        private String netType;

        private ZkConnAddr(Builder builder) {
            this.connAddr = builder.connAddr;
            this.connAddrPort = builder.connAddrPort;
            this.netType = builder.netType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZkConnAddr create() {
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
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        public static final class Builder {
            private String connAddr; 
            private String connAddrPort; 
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            public ZkConnAddr build() {
                return new ZkConnAddr(this);
            } 

        } 

    }
    public static class ZkConnAddrs extends TeaModel {
        @NameInMap("ZkConnAddr")
        private java.util.List < ZkConnAddr> zkConnAddr;

        private ZkConnAddrs(Builder builder) {
            this.zkConnAddr = builder.zkConnAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZkConnAddrs create() {
            return builder().build();
        }

        /**
         * @return zkConnAddr
         */
        public java.util.List < ZkConnAddr> getZkConnAddr() {
            return this.zkConnAddr;
        }

        public static final class Builder {
            private java.util.List < ZkConnAddr> zkConnAddr; 

            /**
             * ZkConnAddr.
             */
            public Builder zkConnAddr(java.util.List < ZkConnAddr> zkConnAddr) {
                this.zkConnAddr = zkConnAddr;
                return this;
            }

            public ZkConnAddrs build() {
                return new ZkConnAddrs(this);
            } 

        } 

    }
}
