// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAttributeResponseBody</p>
 */
public class DescribeClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("ColdStorageStatus")
    private String coldStorageStatus;

    @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
    private ConnectionInfo connectionInfo;

    @com.aliyun.core.annotation.NameInMap("CoreDiskQuantity")
    private Integer coreDiskQuantity;

    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    private String coreDiskSize;

    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    private String coreDiskType;

    @com.aliyun.core.annotation.NameInMap("CoreInstanceQuantity")
    private Integer coreInstanceQuantity;

    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("HaType")
    private String haType;

    @com.aliyun.core.annotation.NameInMap("HasUser")
    private String hasUser;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MainVersion")
    private String mainVersion;

    @com.aliyun.core.annotation.NameInMap("MasterDiskSize")
    private Integer masterDiskSize;

    @com.aliyun.core.annotation.NameInMap("MasterDiskType")
    private String masterDiskType;

    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.NameInMap("NetInfo")
    private NetInfo netInfo;

    @com.aliyun.core.annotation.NameInMap("NodeList")
    private NodeList nodeList;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateStatus")
    private String updateStatus;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeClusterAttributeResponseBody(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.coldStorageStatus = builder.coldStorageStatus;
        this.connectionInfo = builder.connectionInfo;
        this.coreDiskQuantity = builder.coreDiskQuantity;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceQuantity = builder.coreInstanceQuantity;
        this.coreInstanceType = builder.coreInstanceType;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.haType = builder.haType;
        this.hasUser = builder.hasUser;
        this.lockMode = builder.lockMode;
        this.mainVersion = builder.mainVersion;
        this.masterDiskSize = builder.masterDiskSize;
        this.masterDiskType = builder.masterDiskType;
        this.masterInstanceType = builder.masterInstanceType;
        this.minorVersion = builder.minorVersion;
        this.netInfo = builder.netInfo;
        this.nodeList = builder.nodeList;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateStatus = builder.updateStatus;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return coldStorageStatus
     */
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    /**
     * @return connectionInfo
     */
    public ConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * @return coreDiskQuantity
     */
    public Integer getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    /**
     * @return coreDiskSize
     */
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceQuantity
     */
    public Integer getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return haType
     */
    public String getHaType() {
        return this.haType;
    }

    /**
     * @return hasUser
     */
    public String getHasUser() {
        return this.hasUser;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return mainVersion
     */
    public String getMainVersion() {
        return this.mainVersion;
    }

    /**
     * @return masterDiskSize
     */
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    /**
     * @return masterDiskType
     */
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return netInfo
     */
    public NetInfo getNetInfo() {
        return this.netInfo;
    }

    /**
     * @return nodeList
     */
    public NodeList getNodeList() {
        return this.nodeList;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateStatus
     */
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String autoRenew; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private String coldStorageStatus; 
        private ConnectionInfo connectionInfo; 
        private Integer coreDiskQuantity; 
        private String coreDiskSize; 
        private String coreDiskType; 
        private Integer coreInstanceQuantity; 
        private String coreInstanceType; 
        private String createTime; 
        private String expireTime; 
        private String haType; 
        private String hasUser; 
        private String lockMode; 
        private String mainVersion; 
        private Integer masterDiskSize; 
        private String masterDiskType; 
        private String masterInstanceType; 
        private String minorVersion; 
        private NetInfo netInfo; 
        private NodeList nodeList; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String updateStatus; 
        private String zoneId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * ColdStorageStatus.
         */
        public Builder coldStorageStatus(String coldStorageStatus) {
            this.coldStorageStatus = coldStorageStatus;
            return this;
        }

        /**
         * ConnectionInfo.
         */
        public Builder connectionInfo(ConnectionInfo connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * CoreDiskQuantity.
         */
        public Builder coreDiskQuantity(Integer coreDiskQuantity) {
            this.coreDiskQuantity = coreDiskQuantity;
            return this;
        }

        /**
         * CoreDiskSize.
         */
        public Builder coreDiskSize(String coreDiskSize) {
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * CoreDiskType.
         */
        public Builder coreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * CoreInstanceQuantity.
         */
        public Builder coreInstanceQuantity(Integer coreInstanceQuantity) {
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * HaType.
         */
        public Builder haType(String haType) {
            this.haType = haType;
            return this;
        }

        /**
         * HasUser.
         */
        public Builder hasUser(String hasUser) {
            this.hasUser = hasUser;
            return this;
        }

        /**
         * LockMode.
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * MainVersion.
         */
        public Builder mainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }

        /**
         * MasterDiskSize.
         */
        public Builder masterDiskSize(Integer masterDiskSize) {
            this.masterDiskSize = masterDiskSize;
            return this;
        }

        /**
         * MasterDiskType.
         */
        public Builder masterDiskType(String masterDiskType) {
            this.masterDiskType = masterDiskType;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * MinorVersion.
         */
        public Builder minorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * NetInfo.
         */
        public Builder netInfo(NetInfo netInfo) {
            this.netInfo = netInfo;
            return this;
        }

        /**
         * NodeList.
         */
        public Builder nodeList(NodeList nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateStatus.
         */
        public Builder updateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeClusterAttributeResponseBody build() {
            return new DescribeClusterAttributeResponseBody(this);
        } 

    } 

    public static class ZKClassicConnectionStringList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private ZKClassicConnectionStringList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKClassicConnectionStringList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public ZKClassicConnectionStringList build() {
                return new ZKClassicConnectionStringList(this);
            } 

        } 

    }
    public static class ZKConnectionStringList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private ZKConnectionStringList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKConnectionStringList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public ZKConnectionStringList build() {
                return new ZKConnectionStringList(this);
            } 

        } 

    }
    public static class ZKInnerConnectionStringList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private ZKInnerConnectionStringList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKInnerConnectionStringList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public ZKInnerConnectionStringList build() {
                return new ZKInnerConnectionStringList(this);
            } 

        } 

    }
    public static class ZKPublicConnectionStringList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private ZKPublicConnectionStringList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZKPublicConnectionStringList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public ZKPublicConnectionStringList build() {
                return new ZKPublicConnectionStringList(this);
            } 

        } 

    }
    public static class ConnectionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HaRestConnectionString")
        private String haRestConnectionString;

        @com.aliyun.core.annotation.NameInMap("HaRestPort")
        private String haRestPort;

        @com.aliyun.core.annotation.NameInMap("HaThriftConnectionString")
        private String haThriftConnectionString;

        @com.aliyun.core.annotation.NameInMap("HaThriftPort")
        private String haThriftPort;

        @com.aliyun.core.annotation.NameInMap("ThriftConnectionString")
        private String thriftConnectionString;

        @com.aliyun.core.annotation.NameInMap("ThriftPort")
        private String thriftPort;

        @com.aliyun.core.annotation.NameInMap("UIProxyConnectionString")
        private String UIProxyConnectionString;

        @com.aliyun.core.annotation.NameInMap("ZKClassicConnectionStringList")
        private ZKClassicConnectionStringList ZKClassicConnectionStringList;

        @com.aliyun.core.annotation.NameInMap("ZKConnectionStringList")
        private ZKConnectionStringList ZKConnectionStringList;

        @com.aliyun.core.annotation.NameInMap("ZKInnerConnectionStringList")
        private ZKInnerConnectionStringList ZKInnerConnectionStringList;

        @com.aliyun.core.annotation.NameInMap("ZKPort")
        private Integer ZKPort;

        @com.aliyun.core.annotation.NameInMap("ZKPublicConnectionStringList")
        private ZKPublicConnectionStringList ZKPublicConnectionStringList;

        private ConnectionInfo(Builder builder) {
            this.haRestConnectionString = builder.haRestConnectionString;
            this.haRestPort = builder.haRestPort;
            this.haThriftConnectionString = builder.haThriftConnectionString;
            this.haThriftPort = builder.haThriftPort;
            this.thriftConnectionString = builder.thriftConnectionString;
            this.thriftPort = builder.thriftPort;
            this.UIProxyConnectionString = builder.UIProxyConnectionString;
            this.ZKClassicConnectionStringList = builder.ZKClassicConnectionStringList;
            this.ZKConnectionStringList = builder.ZKConnectionStringList;
            this.ZKInnerConnectionStringList = builder.ZKInnerConnectionStringList;
            this.ZKPort = builder.ZKPort;
            this.ZKPublicConnectionStringList = builder.ZKPublicConnectionStringList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionInfo create() {
            return builder().build();
        }

        /**
         * @return haRestConnectionString
         */
        public String getHaRestConnectionString() {
            return this.haRestConnectionString;
        }

        /**
         * @return haRestPort
         */
        public String getHaRestPort() {
            return this.haRestPort;
        }

        /**
         * @return haThriftConnectionString
         */
        public String getHaThriftConnectionString() {
            return this.haThriftConnectionString;
        }

        /**
         * @return haThriftPort
         */
        public String getHaThriftPort() {
            return this.haThriftPort;
        }

        /**
         * @return thriftConnectionString
         */
        public String getThriftConnectionString() {
            return this.thriftConnectionString;
        }

        /**
         * @return thriftPort
         */
        public String getThriftPort() {
            return this.thriftPort;
        }

        /**
         * @return UIProxyConnectionString
         */
        public String getUIProxyConnectionString() {
            return this.UIProxyConnectionString;
        }

        /**
         * @return ZKClassicConnectionStringList
         */
        public ZKClassicConnectionStringList getZKClassicConnectionStringList() {
            return this.ZKClassicConnectionStringList;
        }

        /**
         * @return ZKConnectionStringList
         */
        public ZKConnectionStringList getZKConnectionStringList() {
            return this.ZKConnectionStringList;
        }

        /**
         * @return ZKInnerConnectionStringList
         */
        public ZKInnerConnectionStringList getZKInnerConnectionStringList() {
            return this.ZKInnerConnectionStringList;
        }

        /**
         * @return ZKPort
         */
        public Integer getZKPort() {
            return this.ZKPort;
        }

        /**
         * @return ZKPublicConnectionStringList
         */
        public ZKPublicConnectionStringList getZKPublicConnectionStringList() {
            return this.ZKPublicConnectionStringList;
        }

        public static final class Builder {
            private String haRestConnectionString; 
            private String haRestPort; 
            private String haThriftConnectionString; 
            private String haThriftPort; 
            private String thriftConnectionString; 
            private String thriftPort; 
            private String UIProxyConnectionString; 
            private ZKClassicConnectionStringList ZKClassicConnectionStringList; 
            private ZKConnectionStringList ZKConnectionStringList; 
            private ZKInnerConnectionStringList ZKInnerConnectionStringList; 
            private Integer ZKPort; 
            private ZKPublicConnectionStringList ZKPublicConnectionStringList; 

            /**
             * HaRestConnectionString.
             */
            public Builder haRestConnectionString(String haRestConnectionString) {
                this.haRestConnectionString = haRestConnectionString;
                return this;
            }

            /**
             * HaRestPort.
             */
            public Builder haRestPort(String haRestPort) {
                this.haRestPort = haRestPort;
                return this;
            }

            /**
             * HaThriftConnectionString.
             */
            public Builder haThriftConnectionString(String haThriftConnectionString) {
                this.haThriftConnectionString = haThriftConnectionString;
                return this;
            }

            /**
             * HaThriftPort.
             */
            public Builder haThriftPort(String haThriftPort) {
                this.haThriftPort = haThriftPort;
                return this;
            }

            /**
             * ThriftConnectionString.
             */
            public Builder thriftConnectionString(String thriftConnectionString) {
                this.thriftConnectionString = thriftConnectionString;
                return this;
            }

            /**
             * ThriftPort.
             */
            public Builder thriftPort(String thriftPort) {
                this.thriftPort = thriftPort;
                return this;
            }

            /**
             * UIProxyConnectionString.
             */
            public Builder UIProxyConnectionString(String UIProxyConnectionString) {
                this.UIProxyConnectionString = UIProxyConnectionString;
                return this;
            }

            /**
             * ZKClassicConnectionStringList.
             */
            public Builder ZKClassicConnectionStringList(ZKClassicConnectionStringList ZKClassicConnectionStringList) {
                this.ZKClassicConnectionStringList = ZKClassicConnectionStringList;
                return this;
            }

            /**
             * ZKConnectionStringList.
             */
            public Builder ZKConnectionStringList(ZKConnectionStringList ZKConnectionStringList) {
                this.ZKConnectionStringList = ZKConnectionStringList;
                return this;
            }

            /**
             * ZKInnerConnectionStringList.
             */
            public Builder ZKInnerConnectionStringList(ZKInnerConnectionStringList ZKInnerConnectionStringList) {
                this.ZKInnerConnectionStringList = ZKInnerConnectionStringList;
                return this;
            }

            /**
             * ZKPort.
             */
            public Builder ZKPort(Integer ZKPort) {
                this.ZKPort = ZKPort;
                return this;
            }

            /**
             * ZKPublicConnectionStringList.
             */
            public Builder ZKPublicConnectionStringList(ZKPublicConnectionStringList ZKPublicConnectionStringList) {
                this.ZKPublicConnectionStringList = ZKPublicConnectionStringList;
                return this;
            }

            public ConnectionInfo build() {
                return new ConnectionInfo(this);
            } 

        } 

    }
    public static class NetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InnerIpAddress")
        private String innerIpAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("SecurityIpList")
        private String securityIpList;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetInfo(Builder builder) {
            this.innerIpAddress = builder.innerIpAddress;
            this.netType = builder.netType;
            this.publicIpAddress = builder.publicIpAddress;
            this.securityIpList = builder.securityIpList;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfo create() {
            return builder().build();
        }

        /**
         * @return innerIpAddress
         */
        public String getInnerIpAddress() {
            return this.innerIpAddress;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return securityIpList
         */
        public String getSecurityIpList() {
            return this.securityIpList;
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
            private String innerIpAddress; 
            private String netType; 
            private String publicIpAddress; 
            private String securityIpList; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * InnerIpAddress.
             */
            public Builder innerIpAddress(String innerIpAddress) {
                this.innerIpAddress = innerIpAddress;
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
             * PublicIpAddress.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * SecurityIpList.
             */
            public Builder securityIpList(String securityIpList) {
                this.securityIpList = securityIpList;
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

            public NetInfo build() {
                return new NetInfo(this);
            } 

        } 

    }
    public static class Daemon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaemonName")
        private String daemonName;

        @com.aliyun.core.annotation.NameInMap("DaemonStatus")
        private String daemonStatus;

        private Daemon(Builder builder) {
            this.daemonName = builder.daemonName;
            this.daemonStatus = builder.daemonStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Daemon create() {
            return builder().build();
        }

        /**
         * @return daemonName
         */
        public String getDaemonName() {
            return this.daemonName;
        }

        /**
         * @return daemonStatus
         */
        public String getDaemonStatus() {
            return this.daemonStatus;
        }

        public static final class Builder {
            private String daemonName; 
            private String daemonStatus; 

            /**
             * DaemonName.
             */
            public Builder daemonName(String daemonName) {
                this.daemonName = daemonName;
                return this;
            }

            /**
             * DaemonStatus.
             */
            public Builder daemonStatus(String daemonStatus) {
                this.daemonStatus = daemonStatus;
                return this;
            }

            public Daemon build() {
                return new Daemon(this);
            } 

        } 

    }
    public static class DaemonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Daemon")
        private java.util.List < Daemon> daemon;

        private DaemonList(Builder builder) {
            this.daemon = builder.daemon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DaemonList create() {
            return builder().build();
        }

        /**
         * @return daemon
         */
        public java.util.List < Daemon> getDaemon() {
            return this.daemon;
        }

        public static final class Builder {
            private java.util.List < Daemon> daemon; 

            /**
             * Daemon.
             */
            public Builder daemon(java.util.List < Daemon> daemon) {
                this.daemon = daemon;
                return this;
            }

            public DaemonList build() {
                return new DaemonList(this);
            } 

        } 

    }
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaemonList")
        private DaemonList daemonList;

        @com.aliyun.core.annotation.NameInMap("MemStore")
        private String memStore;

        @com.aliyun.core.annotation.NameInMap("NodeDiskQuantity")
        private String nodeDiskQuantity;

        @com.aliyun.core.annotation.NameInMap("NodeDiskSize")
        private String nodeDiskSize;

        @com.aliyun.core.annotation.NameInMap("NodeDiskType")
        private String nodeDiskType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("RegionQuantity")
        private String regionQuantity;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("StoreFile")
        private String storeFile;

        private Node(Builder builder) {
            this.daemonList = builder.daemonList;
            this.memStore = builder.memStore;
            this.nodeDiskQuantity = builder.nodeDiskQuantity;
            this.nodeDiskSize = builder.nodeDiskSize;
            this.nodeDiskType = builder.nodeDiskType;
            this.nodeId = builder.nodeId;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.nodeStatus = builder.nodeStatus;
            this.nodeType = builder.nodeType;
            this.regionQuantity = builder.regionQuantity;
            this.serviceType = builder.serviceType;
            this.storeFile = builder.storeFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return daemonList
         */
        public DaemonList getDaemonList() {
            return this.daemonList;
        }

        /**
         * @return memStore
         */
        public String getMemStore() {
            return this.memStore;
        }

        /**
         * @return nodeDiskQuantity
         */
        public String getNodeDiskQuantity() {
            return this.nodeDiskQuantity;
        }

        /**
         * @return nodeDiskSize
         */
        public String getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        /**
         * @return nodeDiskType
         */
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return regionQuantity
         */
        public String getRegionQuantity() {
            return this.regionQuantity;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return storeFile
         */
        public String getStoreFile() {
            return this.storeFile;
        }

        public static final class Builder {
            private DaemonList daemonList; 
            private String memStore; 
            private String nodeDiskQuantity; 
            private String nodeDiskSize; 
            private String nodeDiskType; 
            private String nodeId; 
            private String nodeInstanceType; 
            private String nodeStatus; 
            private String nodeType; 
            private String regionQuantity; 
            private String serviceType; 
            private String storeFile; 

            /**
             * DaemonList.
             */
            public Builder daemonList(DaemonList daemonList) {
                this.daemonList = daemonList;
                return this;
            }

            /**
             * MemStore.
             */
            public Builder memStore(String memStore) {
                this.memStore = memStore;
                return this;
            }

            /**
             * NodeDiskQuantity.
             */
            public Builder nodeDiskQuantity(String nodeDiskQuantity) {
                this.nodeDiskQuantity = nodeDiskQuantity;
                return this;
            }

            /**
             * NodeDiskSize.
             */
            public Builder nodeDiskSize(String nodeDiskSize) {
                this.nodeDiskSize = nodeDiskSize;
                return this;
            }

            /**
             * NodeDiskType.
             */
            public Builder nodeDiskType(String nodeDiskType) {
                this.nodeDiskType = nodeDiskType;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeInstanceType.
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * RegionQuantity.
             */
            public Builder regionQuantity(String regionQuantity) {
                this.regionQuantity = regionQuantity;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * StoreFile.
             */
            public Builder storeFile(String storeFile) {
                this.storeFile = storeFile;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List < Node> node;

        private NodeList(Builder builder) {
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Node> node; 

            /**
             * Node.
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
}
