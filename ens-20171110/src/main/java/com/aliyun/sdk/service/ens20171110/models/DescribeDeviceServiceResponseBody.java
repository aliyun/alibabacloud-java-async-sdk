// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceServiceResponseBody</p>
 */
public class DescribeDeviceServiceResponseBody extends TeaModel {
    @NameInMap("AppMetaData")
    private AppMetaData appMetaData;

    @NameInMap("AppStatus")
    private AppStatus appStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDetailInfos")
    private java.util.List < ResourceDetailInfos> resourceDetailInfos;

    @NameInMap("ResourceInfos")
    private java.util.List < ResourceInfos> resourceInfos;

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
    public java.util.List < ResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    /**
     * @return resourceInfos
     */
    public java.util.List < ResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public static final class Builder {
        private AppMetaData appMetaData; 
        private AppStatus appStatus; 
        private String requestId; 
        private java.util.List < ResourceDetailInfos> resourceDetailInfos; 
        private java.util.List < ResourceInfos> resourceInfos; 

        /**
         * The basic properties of the application.
         */
        public Builder appMetaData(AppMetaData appMetaData) {
            this.appMetaData = appMetaData;
            return this;
        }

        /**
         * The status information of the application.
         */
        public Builder appStatus(AppStatus appStatus) {
            this.appStatus = appStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the devices.
         */
        public Builder resourceDetailInfos(java.util.List < ResourceDetailInfos> resourceDetailInfos) {
            this.resourceDetailInfos = resourceDetailInfos;
            return this;
        }

        /**
         * The information about the instances.
         */
        public Builder resourceInfos(java.util.List < ResourceInfos> resourceInfos) {
            this.resourceInfos = resourceInfos;
            return this;
        }

        public DescribeDeviceServiceResponseBody build() {
            return new DescribeDeviceServiceResponseBody(this);
        } 

    } 

    public static class AppMetaData extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppStableVersion")
        private String appStableVersion;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
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
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The stable version number of the application.
             */
            public Builder appStableVersion(String appStableVersion) {
                this.appStableVersion = appStableVersion;
                return this;
            }

            /**
             * The type of the application. The value is of the enumeration type. Valid values:
             * <p>
             * 
             * *   Common
             * *   Scheduler
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * The name of the application cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the application.
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
    public static class AppStatus extends TeaModel {
        @NameInMap("Phase")
        private String phase;

        @NameInMap("StatusDescrip")
        private String statusDescrip;

        @NameInMap("UpdateTime")
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
             * The status of the application. The value is of the enumeration type. Valid values:
             * <p>
             * 
             * Three intermediate states:
             * 
             * *   CREATING
             * *   UPDATING
             * *   DELETING
             * 
             * Four final states:
             * 
             * *   CREATE_FAILED
             * *   UPDATE_FAILED
             * *   DELETE_FAILED
             * *   RUNNING
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The description of the application status.
             */
            public Builder statusDescrip(String statusDescrip) {
                this.statusDescrip = statusDescrip;
                return this;
            }

            /**
             * The time when the status was last updated.
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
    public static class ResourceDetailInfos extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ID")
        private String id;

        @NameInMap("IP")
        private String ip;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("ImageID")
        private String imageID;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("RegionID")
        private String regionID;

        @NameInMap("Server")
        private String server;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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
             * The name of the device.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * The ID of the cloud device.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The Internet service provider (ISP).
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageID(String imageID) {
                this.imageID = imageID;
                return this;
            }

            /**
             * The media access control (MAC) address of the device.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * The ID of the ENS node.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * The server name of the ENS node.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The status of the device.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the device.
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
    public static class Network extends TeaModel {
        @NameInMap("ContainerPorts")
        private String containerPorts;

        @NameInMap("ExternalIp")
        private String externalIp;

        @NameInMap("HostPorts")
        private String hostPorts;

        @NameInMap("Protocol")
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
             * The port of the container.
             */
            public Builder containerPorts(String containerPorts) {
                this.containerPorts = containerPorts;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * The port range.
             */
            public Builder hostPorts(String hostPorts) {
                this.hostPorts = hostPorts;
                return this;
            }

            /**
             * The protocol of the gateway. The value is of the enumeration type. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
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
    public static class DeviceInfos extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Network")
        private java.util.List < Network> network;

        @NameInMap("Status")
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
        public java.util.List < Network> getNetwork() {
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
            private java.util.List < Network> network; 
            private String status; 

            /**
             * The name of the device.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network information.
             */
            public Builder network(java.util.List < Network> network) {
                this.network = network;
                return this;
            }

            /**
             * The status.
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
    public static class InternalIps extends TeaModel {
        @NameInMap("Ip")
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
             * The internal IP address.
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
    public static class PublicIps extends TeaModel {
        @NameInMap("Ip")
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
             * The public IP address.
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
    public static class ResourceInfos extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("AreaCode")
        private String areaCode;

        @NameInMap("AreaName")
        private String areaName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeviceInfos")
        private java.util.List < DeviceInfos> deviceInfos;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InternalIps")
        private java.util.List < InternalIps> internalIps;

        @NameInMap("PublicIps")
        private java.util.List < PublicIps> publicIps;

        @NameInMap("RegionCode")
        private String regionCode;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
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
        public java.util.List < DeviceInfos> getDeviceInfos() {
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
        public java.util.List < InternalIps> getInternalIps() {
            return this.internalIps;
        }

        /**
         * @return publicIps
         */
        public java.util.List < PublicIps> getPublicIps() {
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
            private java.util.List < DeviceInfos> deviceInfos; 
            private String instanceId; 
            private String instanceStatus; 
            private java.util.List < InternalIps> internalIps; 
            private java.util.List < PublicIps> publicIps; 
            private String regionCode; 
            private String regionId; 
            private String regionName; 

            /**
             * The version of the application.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * The area code.
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * The region name.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The information about the devices.
             */
            public Builder deviceInfos(java.util.List < DeviceInfos> deviceInfos) {
                this.deviceInfos = deviceInfos;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the instance.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The internal IP addresses.
             */
            public Builder internalIps(java.util.List < InternalIps> internalIps) {
                this.internalIps = internalIps;
                return this;
            }

            /**
             * The public IP addresses.
             */
            public Builder publicIps(java.util.List < PublicIps> publicIps) {
                this.publicIps = publicIps;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * The ID of the ENS node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region.
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
