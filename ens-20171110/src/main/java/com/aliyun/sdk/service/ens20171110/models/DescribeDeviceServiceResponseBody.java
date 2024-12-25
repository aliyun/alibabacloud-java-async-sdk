// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceServiceResponseBody</p>
 */
public class DescribeDeviceServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppMetaData")
    private AppMetaData appMetaData;

    @com.aliyun.core.annotation.NameInMap("AppStatus")
    private AppStatus appStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDetailInfos")
    private java.util.List<ResourceDetailInfos> resourceDetailInfos;

    @com.aliyun.core.annotation.NameInMap("ResourceInfos")
    private java.util.List<ResourceInfos> resourceInfos;

    private DescribeDeviceServiceResponseBody(Builder builder) {
        this.appMetaData = builder.appMetaData;
        this.appStatus = builder.appStatus;
        this.requestId = builder.requestId;
        this.resourceDetailInfos = builder.resourceDetailInfos;
        this.resourceInfos = builder.resourceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return appMetaData
     */
    public AppMetaData getAppMetaData() {
        return this.appMetaData;
    }

    /**
     * @return appStatus
     */
    public AppStatus getAppStatus() {
        return this.appStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDetailInfos
     */
    public java.util.List<ResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    /**
     * @return resourceInfos
     */
    public java.util.List<ResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public static final class Builder {
        private AppMetaData appMetaData; 
        private AppStatus appStatus; 
        private String requestId; 
        private java.util.List<ResourceDetailInfos> resourceDetailInfos; 
        private java.util.List<ResourceInfos> resourceInfos; 

        /**
         * <p>The basic properties of the application.</p>
         */
        public Builder appMetaData(AppMetaData appMetaData) {
            this.appMetaData = appMetaData;
            return this;
        }

        /**
         * <p>The status information of the application.</p>
         */
        public Builder appStatus(AppStatus appStatus) {
            this.appStatus = appStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3A535110-3EE3-5EC5-B1ED-10B7067A1FC8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the devices.</p>
         */
        public Builder resourceDetailInfos(java.util.List<ResourceDetailInfos> resourceDetailInfos) {
            this.resourceDetailInfos = resourceDetailInfos;
            return this;
        }

        /**
         * <p>The information about the instances.</p>
         */
        public Builder resourceInfos(java.util.List<ResourceInfos> resourceInfos) {
            this.resourceInfos = resourceInfos;
            return this;
        }

        public DescribeDeviceServiceResponseBody build() {
            return new DescribeDeviceServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class AppMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppStableVersion")
        private String appStableVersion;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AppMetaData(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appStableVersion = builder.appStableVersion;
            this.appType = builder.appType;
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppMetaData create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appStableVersion
         */
        public String getAppStableVersion() {
            return this.appStableVersion;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appStableVersion; 
            private String appType; 
            private String clusterName; 
            private String createTime; 
            private String description; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>97a32f2a-aa2c-436a-b19c-05b20d258618</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>iotx-api-admin</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The stable version number of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder appStableVersion(String appStableVersion) {
                this.appStableVersion = appStableVersion;
                return this;
            }

            /**
             * <p>The type of the application. The value is of the enumeration type. Valid values:</p>
             * <ul>
             * <li>Common</li>
             * <li>Scheduler</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The name of the application cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>poc</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-03T03:42:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AppMetaData build() {
                return new AppMetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class AppStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("StatusDescrip")
        private String statusDescrip;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private AppStatus(Builder builder) {
            this.phase = builder.phase;
            this.statusDescrip = builder.statusDescrip;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppStatus create() {
            return builder().build();
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return statusDescrip
         */
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String phase; 
            private String statusDescrip; 
            private String updateTime; 

            /**
             * <p>The status of the application. The value is of the enumeration type. Valid values:</p>
             * <p>Three intermediate states:</p>
             * <ul>
             * <li>CREATING</li>
             * <li>UPDATING</li>
             * <li>DELETING</li>
             * </ul>
             * <p>Four final states:</p>
             * <ul>
             * <li>CREATE_FAILED</li>
             * <li>UPDATE_FAILED</li>
             * <li>DELETE_FAILED</li>
             * <li>RUNNING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The description of the application status.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating in progress</p>
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * <p>The time when the status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-26T05:04Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AppStatus build() {
                return new AppStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class ResourceDetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ID")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("ImageID")
        private String imageID;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("RegionID")
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResourceDetailInfos(Builder builder) {
            this.deviceName = builder.deviceName;
            this.id = builder.id;
            this.ip = builder.ip;
            this.ISP = builder.ISP;
            this.imageID = builder.imageID;
            this.mac = builder.mac;
            this.regionID = builder.regionID;
            this.server = builder.server;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDetailInfos create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return imageID
         */
        public String getImageID() {
            return this.imageID;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String deviceName; 
            private String id; 
            private String ip; 
            private String ISP; 
            private String imageID; 
            private String mac; 
            private String regionID; 
            private String server; 
            private String status; 
            private String type; 

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>5JhF100NEgdBcpNren32</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID of the cloud device.</p>
             * 
             * <strong>example:</strong>
             * <p>h-uf6009zoaexs5pefypbo</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>120.27.219.219</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP).</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-2ze40oyhjorpyw61k7be</p>
             */
            public Builder imageID(String imageID) {
                this.imageID = imageID;
                return this;
            }

            /**
             * <p>The media access control (MAC) address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>AA:BB:77:88:99:03</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-jiaozuo-2</p>
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * <p>The server name of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>ens-nc2</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The status of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.ac6.large</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResourceDetailInfos build() {
                return new ResourceDetailInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerPorts")
        private String containerPorts;

        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("HostPorts")
        private String hostPorts;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Network(Builder builder) {
            this.containerPorts = builder.containerPorts;
            this.externalIp = builder.externalIp;
            this.hostPorts = builder.hostPorts;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return containerPorts
         */
        public String getContainerPorts() {
            return this.containerPorts;
        }

        /**
         * @return externalIp
         */
        public String getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return hostPorts
         */
        public String getHostPorts() {
            return this.hostPorts;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String containerPorts; 
            private String externalIp; 
            private String hostPorts; 
            private String protocol; 

            /**
             * <p>The port of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>10000-10010</p>
             */
            public Builder containerPorts(String containerPorts) {
                this.containerPorts = containerPorts;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>39.105.62.120</p>
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80-8080</p>
             */
            public Builder hostPorts(String hostPorts) {
                this.hostPorts = hostPorts;
                return this;
            }

            /**
             * <p>The protocol of the gateway. The value is of the enumeration type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class DeviceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Network")
        private java.util.List<Network> network;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DeviceInfos(Builder builder) {
            this.name = builder.name;
            this.network = builder.network;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfos create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public java.util.List<Network> getNetwork() {
            return this.network;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Network> network; 
            private String status; 

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>test-api</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network information.</p>
             */
            public Builder network(java.util.List<Network> network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DeviceInfos build() {
                return new DeviceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class InternalIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private InternalIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternalIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * <p>The internal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.2.3</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public InternalIps build() {
                return new InternalIps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class PublicIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private PublicIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>122.13.173.137</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public PublicIps build() {
                return new PublicIps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceServiceResponseBody</p>
     */
    public static class ResourceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceInfos")
        private java.util.List<DeviceInfos> deviceInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InternalIps")
        private java.util.List<InternalIps> internalIps;

        @com.aliyun.core.annotation.NameInMap("PublicIps")
        private java.util.List<PublicIps> publicIps;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private ResourceInfos(Builder builder) {
            this.appVersion = builder.appVersion;
            this.areaCode = builder.areaCode;
            this.areaName = builder.areaName;
            this.createTime = builder.createTime;
            this.deviceInfos = builder.deviceInfos;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.internalIps = builder.internalIps;
            this.publicIps = builder.publicIps;
            this.regionCode = builder.regionCode;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfos create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceInfos
         */
        public java.util.List<DeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return internalIps
         */
        public java.util.List<InternalIps> getInternalIps() {
            return this.internalIps;
        }

        /**
         * @return publicIps
         */
        public java.util.List<PublicIps> getPublicIps() {
            return this.publicIps;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String appVersion; 
            private String areaCode; 
            private String areaName; 
            private String createTime; 
            private java.util.List<DeviceInfos> deviceInfos; 
            private String instanceId; 
            private String instanceStatus; 
            private java.util.List<InternalIps> internalIps; 
            private java.util.List<PublicIps> publicIps; 
            private String regionCode; 
            private String regionId; 
            private String regionName; 

            /**
             * <p>The version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The area code.</p>
             * 
             * <strong>example:</strong>
             * <p>410800</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>The region name.</p>
             * 
             * <strong>example:</strong>
             * <p>Jiaozuo City, Henan Province, Central China</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-02T08:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information about the devices.</p>
             */
            public Builder deviceInfos(java.util.List<DeviceInfos> deviceInfos) {
                this.deviceInfos = deviceInfos;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5s9boobrmh5000kv4jmi0oeai</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The internal IP addresses.</p>
             */
            public Builder internalIps(java.util.List<InternalIps> internalIps) {
                this.internalIps = internalIps;
                return this;
            }

            /**
             * <p>The public IP addresses.</p>
             */
            public Builder publicIps(java.util.List<PublicIps> publicIps) {
                this.publicIps = publicIps;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-jiaozuo-2</p>
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-jiaozuo-2</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China Jiaozuo-2</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public ResourceInfos build() {
                return new ResourceInfos(this);
            } 

        } 

    }
}
