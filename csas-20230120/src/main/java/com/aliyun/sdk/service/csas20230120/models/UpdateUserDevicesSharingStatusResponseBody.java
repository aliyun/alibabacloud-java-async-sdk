// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserDevicesSharingStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserDevicesSharingStatusResponseBody</p>
 */
public class UpdateUserDevicesSharingStatusResponseBody extends TeaModel {
    @NameInMap("Devices")
    private java.util.List < Devices> devices;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateUserDevicesSharingStatusResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDevicesSharingStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private String requestId; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUserDevicesSharingStatusResponseBody build() {
            return new UpdateUserDevicesSharingStatusResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("AppStatus")
        private String appStatus;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("CPU")
        private String CPU;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Department")
        private String department;

        @NameInMap("DeviceBelong")
        private String deviceBelong;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("DeviceTag")
        private String deviceTag;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("DeviceVersion")
        private String deviceVersion;

        @NameInMap("Disk")
        private String disk;

        @NameInMap("DlpStatus")
        private String dlpStatus;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("IaStatus")
        private String iaStatus;

        @NameInMap("InnerIP")
        private String innerIP;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("NacStatus")
        private String nacStatus;

        @NameInMap("PaStatus")
        private String paStatus;

        @NameInMap("SaseUserId")
        private String saseUserId;

        @NameInMap("SharingStatus")
        private Boolean sharingStatus;

        @NameInMap("SrcIP")
        private String srcIP;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Username")
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
            private String paStatus; 
            private String saseUserId; 
            private Boolean sharingStatus; 
            private String srcIP; 
            private String updateTime; 
            private String username; 

            /**
             * AppStatus.
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
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
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DeviceBelong.
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * DeviceTag.
             */
            public Builder deviceTag(String deviceTag) {
                this.deviceTag = deviceTag;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * DeviceVersion.
             */
            public Builder deviceVersion(String deviceVersion) {
                this.deviceVersion = deviceVersion;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * DlpStatus.
             */
            public Builder dlpStatus(String dlpStatus) {
                this.dlpStatus = dlpStatus;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * IaStatus.
             */
            public Builder iaStatus(String iaStatus) {
                this.iaStatus = iaStatus;
                return this;
            }

            /**
             * InnerIP.
             */
            public Builder innerIP(String innerIP) {
                this.innerIP = innerIP;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NacStatus.
             */
            public Builder nacStatus(String nacStatus) {
                this.nacStatus = nacStatus;
                return this;
            }

            /**
             * PaStatus.
             */
            public Builder paStatus(String paStatus) {
                this.paStatus = paStatus;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * SharingStatus.
             */
            public Builder sharingStatus(Boolean sharingStatus) {
                this.sharingStatus = sharingStatus;
                return this;
            }

            /**
             * SrcIP.
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Username.
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
