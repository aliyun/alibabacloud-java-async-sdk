// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateUserDevicesStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserDevicesStatusResponseBody</p>
 */
public class UpdateUserDevicesStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List<Devices> devices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateUserDevicesStatusResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDevicesStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devices
     */
    public java.util.List<Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Devices> devices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateUserDevicesStatusResponseBody model) {
            this.devices = model.devices;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of endpoint devices.</p>
         */
        public Builder devices(java.util.List<Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUserDevicesStatusResponseBody build() {
            return new UpdateUserDevicesStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserDevicesStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateUserDevicesStatusResponseBody</p>
     */
    public static class NetInterfaceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private NetInterfaceInfo(Builder builder) {
            this.mac = builder.mac;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInterfaceInfo create() {
            return builder().build();
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mac; 
            private String name; 

            private Builder() {
            } 

            private Builder(NetInterfaceInfo model) {
                this.mac = model.mac;
                this.name = model.name;
            } 

            /**
             * <p>The MAC address of the NIC.</p>
             * 
             * <strong>example:</strong>
             * <p>00:16:XX:XX:7c:46</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The NIC name.</p>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NetInterfaceInfo build() {
                return new NetInterfaceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateUserDevicesStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateUserDevicesStatusResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppStatus")
        private String appStatus;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DeviceBelong")
        private String deviceBelong;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("DeviceTag")
        private String deviceTag;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DeviceVersion")
        private String deviceVersion;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private String disk;

        @com.aliyun.core.annotation.NameInMap("DlpStatus")
        private String dlpStatus;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("IaStatus")
        private String iaStatus;

        @com.aliyun.core.annotation.NameInMap("InnerIP")
        private String innerIP;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("NacStatus")
        private String nacStatus;

        @com.aliyun.core.annotation.NameInMap("NetInterfaceInfo")
        private java.util.List<NetInterfaceInfo> netInterfaceInfo;

        @com.aliyun.core.annotation.NameInMap("PaStatus")
        private String paStatus;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("SharingStatus")
        private Boolean sharingStatus;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Devices(Builder builder) {
            this.appStatus = builder.appStatus;
            this.appVersion = builder.appVersion;
            this.CPU = builder.CPU;
            this.createTime = builder.createTime;
            this.department = builder.department;
            this.deviceBelong = builder.deviceBelong;
            this.deviceModel = builder.deviceModel;
            this.deviceStatus = builder.deviceStatus;
            this.deviceTag = builder.deviceTag;
            this.deviceType = builder.deviceType;
            this.deviceVersion = builder.deviceVersion;
            this.disk = builder.disk;
            this.dlpStatus = builder.dlpStatus;
            this.hostname = builder.hostname;
            this.iaStatus = builder.iaStatus;
            this.innerIP = builder.innerIP;
            this.mac = builder.mac;
            this.memory = builder.memory;
            this.nacStatus = builder.nacStatus;
            this.netInterfaceInfo = builder.netInterfaceInfo;
            this.paStatus = builder.paStatus;
            this.saseUserId = builder.saseUserId;
            this.sharingStatus = builder.sharingStatus;
            this.srcIP = builder.srcIP;
            this.updateTime = builder.updateTime;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return appStatus
         */
        public String getAppStatus() {
            return this.appStatus;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return deviceBelong
         */
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return deviceTag
         */
        public String getDeviceTag() {
            return this.deviceTag;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return deviceVersion
         */
        public String getDeviceVersion() {
            return this.deviceVersion;
        }

        /**
         * @return disk
         */
        public String getDisk() {
            return this.disk;
        }

        /**
         * @return dlpStatus
         */
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return iaStatus
         */
        public String getIaStatus() {
            return this.iaStatus;
        }

        /**
         * @return innerIP
         */
        public String getInnerIP() {
            return this.innerIP;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return nacStatus
         */
        public String getNacStatus() {
            return this.nacStatus;
        }

        /**
         * @return netInterfaceInfo
         */
        public java.util.List<NetInterfaceInfo> getNetInterfaceInfo() {
            return this.netInterfaceInfo;
        }

        /**
         * @return paStatus
         */
        public String getPaStatus() {
            return this.paStatus;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return sharingStatus
         */
        public Boolean getSharingStatus() {
            return this.sharingStatus;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String appStatus; 
            private String appVersion; 
            private String CPU; 
            private String createTime; 
            private String department; 
            private String deviceBelong; 
            private String deviceModel; 
            private String deviceStatus; 
            private String deviceTag; 
            private String deviceType; 
            private String deviceVersion; 
            private String disk; 
            private String dlpStatus; 
            private String hostname; 
            private String iaStatus; 
            private String innerIP; 
            private String mac; 
            private String memory; 
            private String nacStatus; 
            private java.util.List<NetInterfaceInfo> netInterfaceInfo; 
            private String paStatus; 
            private String saseUserId; 
            private Boolean sharingStatus; 
            private String srcIP; 
            private String updateTime; 
            private String username; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.appStatus = model.appStatus;
                this.appVersion = model.appVersion;
                this.CPU = model.CPU;
                this.createTime = model.createTime;
                this.department = model.department;
                this.deviceBelong = model.deviceBelong;
                this.deviceModel = model.deviceModel;
                this.deviceStatus = model.deviceStatus;
                this.deviceTag = model.deviceTag;
                this.deviceType = model.deviceType;
                this.deviceVersion = model.deviceVersion;
                this.disk = model.disk;
                this.dlpStatus = model.dlpStatus;
                this.hostname = model.hostname;
                this.iaStatus = model.iaStatus;
                this.innerIP = model.innerIP;
                this.mac = model.mac;
                this.memory = model.memory;
                this.nacStatus = model.nacStatus;
                this.netInterfaceInfo = model.netInterfaceInfo;
                this.paStatus = model.paStatus;
                this.saseUserId = model.saseUserId;
                this.sharingStatus = model.sharingStatus;
                this.srcIP = model.srcIP;
                this.updateTime = model.updateTime;
                this.username = model.username;
            } 

            /**
             * <p>The client status. Valid values:</p>
             * <ul>
             * <li><p><strong>Online</strong>: Online.</p>
             * </li>
             * <li><p><strong>Offline</strong>: Offline.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * <p>The client version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The CPU model of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>Apple M1</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The time when the endpoint device was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-17 18:46:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The department to which the user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>测试部</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The ownership of the endpoint device. Valid values:</p>
             * <ul>
             * <li><p><strong>Personal</strong>: Personal device.</p>
             * </li>
             * <li><p><strong>Company</strong>: Company device.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Company</p>
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * <p>The model of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>MacBookPro17,1</p>
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * <p>The status of the endpoint device. Valid values:</p>
             * <ul>
             * <li><p><strong>Online</strong>: Online.</p>
             * </li>
             * <li><p><strong>Offline</strong>: Offline.</p>
             * </li>
             * <li><p><strong>LongTermOffline</strong>: Long-term offline.</p>
             * </li>
             * <li><p><strong>Locked</strong>: Locked.</p>
             * </li>
             * <li><p><strong>Lost</strong>: Reported as lost.</p>
             * </li>
             * <li><p><strong>Unbound</strong>: Detached.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * <p>The endpoint device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder deviceTag(String deviceTag) {
                this.deviceTag = deviceTag;
                return this;
            }

            /**
             * <p>The operating system type of the endpoint device. Valid values:</p>
             * <ul>
             * <li><p><strong>Windows</strong>: Windows.</p>
             * </li>
             * <li><p><strong>macOS</strong>: macOS.</p>
             * </li>
             * <li><p><strong>Linux</strong>: Linux.</p>
             * </li>
             * <li><p><strong>Android</strong>: Android.</p>
             * </li>
             * <li><p><strong>iOS</strong>: iOS.</p>
             * </li>
             * <li><p><strong>Windows_Wuying</strong>: Alibaba Cloud Cloud Desktop.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The operating system version of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.1</p>
             */
            public Builder deviceVersion(String deviceVersion) {
                this.deviceVersion = deviceVersion;
                return this;
            }

            /**
             * <p>The disk model of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>APPLE SSD AP0512Q Media</p>
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The data protection status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
             * </li>
             * <li><p><strong>Unauthorized</strong>: Unauthorized.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder dlpStatus(String dlpStatus) {
                this.dlpStatus = dlpStatus;
                return this;
            }

            /**
             * <p>The device name.</p>
             * 
             * <strong>example:</strong>
             * <p>win10-64bit</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Internet access status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Internet access is enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Internet access is disabled.</p>
             * </li>
             * <li><p><strong>Unprovisioned</strong>: The device is unconfigured.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder iaStatus(String iaStatus) {
                this.iaStatus = iaStatus;
                return this;
            }

            /**
             * <p>The private network IP address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder innerIP(String innerIP) {
                this.innerIP = innerIP;
                return this;
            }

            /**
             * <p>The MAC address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>00:16:XX:XX:7c:46</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The memory capacity of the endpoint device, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The network admission control status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder nacStatus(String nacStatus) {
                this.nacStatus = nacStatus;
                return this;
            }

            /**
             * <p>A list of network interface controllers (NICs) on the endpoint device.</p>
             */
            public Builder netInterfaceInfo(java.util.List<NetInterfaceInfo> netInterfaceInfo) {
                this.netInterfaceInfo = netInterfaceInfo;
                return this;
            }

            /**
             * <p>The private network access status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder paStatus(String paStatus) {
                this.paStatus = paStatus;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>Whether sharing is enabled for the device. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Sharing is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Sharing is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sharingStatus(Boolean sharingStatus) {
                this.sharingStatus = sharingStatus;
                return this;
            }

            /**
             * <p>The IP address used to log on to the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>11.49.XX.XX</p>
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * <p>The last time the endpoint device was online.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-24 19:04:42</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>王先生</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
