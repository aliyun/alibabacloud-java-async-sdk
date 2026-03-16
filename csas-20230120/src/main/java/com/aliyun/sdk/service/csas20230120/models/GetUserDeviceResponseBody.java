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
 * {@link GetUserDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserDeviceResponseBody</p>
 */
public class GetUserDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Device")
    private Device device;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserDeviceResponseBody(Builder builder) {
        this.device = builder.device;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return device
     */
    public Device getDevice() {
        return this.device;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Device device; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserDeviceResponseBody model) {
            this.device = model.device;
            this.requestId = model.requestId;
        } 

        /**
         * Device.
         */
        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserDeviceResponseBody build() {
            return new GetUserDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserDeviceResponseBody</p>
     */
    public static class HistoryUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private HistoryUsers(Builder builder) {
            this.saseUserId = builder.saseUserId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryUsers create() {
            return builder().build();
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String saseUserId; 
            private String username; 

            private Builder() {
            } 

            private Builder(HistoryUsers model) {
                this.saseUserId = model.saseUserId;
                this.username = model.username;
            } 

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public HistoryUsers build() {
                return new HistoryUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserDeviceResponseBody</p>
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
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Name.
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
     * {@link GetUserDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserDeviceResponseBody</p>
     */
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Double cpu;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Processes(Builder builder) {
            this.cpu = builder.cpu;
            this.description = builder.description;
            this.memory = builder.memory;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Double getCpu() {
            return this.cpu;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Double cpu; 
            private String description; 
            private Integer memory; 
            private String name; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.cpu = model.cpu;
                this.description = model.description;
                this.memory = model.memory;
                this.name = model.name;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Double cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserDeviceResponseBody</p>
     */
    public static class Device extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppStatus")
        private String appStatus;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AutoLoginStatus")
        private String autoLoginStatus;

        @com.aliyun.core.annotation.NameInMap("BatteryHealthPercentage")
        private Integer batteryHealthPercentage;

        @com.aliyun.core.annotation.NameInMap("BatteryRemainingPercentage")
        private Integer batteryRemainingPercentage;

        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Continent")
        private String continent;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

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

        @com.aliyun.core.annotation.NameInMap("DiskAvailable")
        private Integer diskAvailable;

        @com.aliyun.core.annotation.NameInMap("DiskUsed")
        private Integer diskUsed;

        @com.aliyun.core.annotation.NameInMap("DlpStatus")
        private String dlpStatus;

        @com.aliyun.core.annotation.NameInMap("EdrStatus")
        private String edrStatus;

        @com.aliyun.core.annotation.NameInMap("HistoryUsers")
        private java.util.List<HistoryUsers> historyUsers;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("IaStatus")
        private String iaStatus;

        @com.aliyun.core.annotation.NameInMap("InnerIP")
        private String innerIP;

        @com.aliyun.core.annotation.NameInMap("JoinAdDomain")
        private Boolean joinAdDomain;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("MatchDeviceGroupIds")
        private java.util.List<String> matchDeviceGroupIds;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("NacStatus")
        private String nacStatus;

        @com.aliyun.core.annotation.NameInMap("NetInterfaceInfo")
        private java.util.List<NetInterfaceInfo> netInterfaceInfo;

        @com.aliyun.core.annotation.NameInMap("PaStatus")
        private String paStatus;

        @com.aliyun.core.annotation.NameInMap("Processes")
        private java.util.List<Processes> processes;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("SharingStatus")
        private Boolean sharingStatus;

        @com.aliyun.core.annotation.NameInMap("SnBaseBoard")
        private String snBaseBoard;

        @com.aliyun.core.annotation.NameInMap("SnBios")
        private String snBios;

        @com.aliyun.core.annotation.NameInMap("SnDiskDrive")
        private String snDiskDrive;

        @com.aliyun.core.annotation.NameInMap("SnProcessor")
        private String snProcessor;

        @com.aliyun.core.annotation.NameInMap("SnSystem")
        private String snSystem;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("TerminalInfoCollectTime")
        private Long terminalInfoCollectTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Workshop")
        private String workshop;

        private Device(Builder builder) {
            this.appStatus = builder.appStatus;
            this.appVersion = builder.appVersion;
            this.autoLoginStatus = builder.autoLoginStatus;
            this.batteryHealthPercentage = builder.batteryHealthPercentage;
            this.batteryRemainingPercentage = builder.batteryRemainingPercentage;
            this.CPU = builder.CPU;
            this.city = builder.city;
            this.continent = builder.continent;
            this.country = builder.country;
            this.createTime = builder.createTime;
            this.department = builder.department;
            this.deviceBelong = builder.deviceBelong;
            this.deviceModel = builder.deviceModel;
            this.deviceStatus = builder.deviceStatus;
            this.deviceTag = builder.deviceTag;
            this.deviceType = builder.deviceType;
            this.deviceVersion = builder.deviceVersion;
            this.disk = builder.disk;
            this.diskAvailable = builder.diskAvailable;
            this.diskUsed = builder.diskUsed;
            this.dlpStatus = builder.dlpStatus;
            this.edrStatus = builder.edrStatus;
            this.historyUsers = builder.historyUsers;
            this.hostname = builder.hostname;
            this.iaStatus = builder.iaStatus;
            this.innerIP = builder.innerIP;
            this.joinAdDomain = builder.joinAdDomain;
            this.mac = builder.mac;
            this.matchDeviceGroupIds = builder.matchDeviceGroupIds;
            this.memory = builder.memory;
            this.nacStatus = builder.nacStatus;
            this.netInterfaceInfo = builder.netInterfaceInfo;
            this.paStatus = builder.paStatus;
            this.processes = builder.processes;
            this.province = builder.province;
            this.saseUserId = builder.saseUserId;
            this.sharingStatus = builder.sharingStatus;
            this.snBaseBoard = builder.snBaseBoard;
            this.snBios = builder.snBios;
            this.snDiskDrive = builder.snDiskDrive;
            this.snProcessor = builder.snProcessor;
            this.snSystem = builder.snSystem;
            this.srcIP = builder.srcIP;
            this.terminalInfoCollectTime = builder.terminalInfoCollectTime;
            this.updateTime = builder.updateTime;
            this.username = builder.username;
            this.workshop = builder.workshop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
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
         * @return autoLoginStatus
         */
        public String getAutoLoginStatus() {
            return this.autoLoginStatus;
        }

        /**
         * @return batteryHealthPercentage
         */
        public Integer getBatteryHealthPercentage() {
            return this.batteryHealthPercentage;
        }

        /**
         * @return batteryRemainingPercentage
         */
        public Integer getBatteryRemainingPercentage() {
            return this.batteryRemainingPercentage;
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return continent
         */
        public String getContinent() {
            return this.continent;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
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
         * @return diskAvailable
         */
        public Integer getDiskAvailable() {
            return this.diskAvailable;
        }

        /**
         * @return diskUsed
         */
        public Integer getDiskUsed() {
            return this.diskUsed;
        }

        /**
         * @return dlpStatus
         */
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        /**
         * @return edrStatus
         */
        public String getEdrStatus() {
            return this.edrStatus;
        }

        /**
         * @return historyUsers
         */
        public java.util.List<HistoryUsers> getHistoryUsers() {
            return this.historyUsers;
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
         * @return joinAdDomain
         */
        public Boolean getJoinAdDomain() {
            return this.joinAdDomain;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return matchDeviceGroupIds
         */
        public java.util.List<String> getMatchDeviceGroupIds() {
            return this.matchDeviceGroupIds;
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
         * @return processes
         */
        public java.util.List<Processes> getProcesses() {
            return this.processes;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
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
         * @return snBaseBoard
         */
        public String getSnBaseBoard() {
            return this.snBaseBoard;
        }

        /**
         * @return snBios
         */
        public String getSnBios() {
            return this.snBios;
        }

        /**
         * @return snDiskDrive
         */
        public String getSnDiskDrive() {
            return this.snDiskDrive;
        }

        /**
         * @return snProcessor
         */
        public String getSnProcessor() {
            return this.snProcessor;
        }

        /**
         * @return snSystem
         */
        public String getSnSystem() {
            return this.snSystem;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return terminalInfoCollectTime
         */
        public Long getTerminalInfoCollectTime() {
            return this.terminalInfoCollectTime;
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

        /**
         * @return workshop
         */
        public String getWorkshop() {
            return this.workshop;
        }

        public static final class Builder {
            private String appStatus; 
            private String appVersion; 
            private String autoLoginStatus; 
            private Integer batteryHealthPercentage; 
            private Integer batteryRemainingPercentage; 
            private String CPU; 
            private String city; 
            private String continent; 
            private String country; 
            private String createTime; 
            private String department; 
            private String deviceBelong; 
            private String deviceModel; 
            private String deviceStatus; 
            private String deviceTag; 
            private String deviceType; 
            private String deviceVersion; 
            private String disk; 
            private Integer diskAvailable; 
            private Integer diskUsed; 
            private String dlpStatus; 
            private String edrStatus; 
            private java.util.List<HistoryUsers> historyUsers; 
            private String hostname; 
            private String iaStatus; 
            private String innerIP; 
            private Boolean joinAdDomain; 
            private String mac; 
            private java.util.List<String> matchDeviceGroupIds; 
            private String memory; 
            private String nacStatus; 
            private java.util.List<NetInterfaceInfo> netInterfaceInfo; 
            private String paStatus; 
            private java.util.List<Processes> processes; 
            private String province; 
            private String saseUserId; 
            private Boolean sharingStatus; 
            private String snBaseBoard; 
            private String snBios; 
            private String snDiskDrive; 
            private String snProcessor; 
            private String snSystem; 
            private String srcIP; 
            private Long terminalInfoCollectTime; 
            private String updateTime; 
            private String username; 
            private String workshop; 

            private Builder() {
            } 

            private Builder(Device model) {
                this.appStatus = model.appStatus;
                this.appVersion = model.appVersion;
                this.autoLoginStatus = model.autoLoginStatus;
                this.batteryHealthPercentage = model.batteryHealthPercentage;
                this.batteryRemainingPercentage = model.batteryRemainingPercentage;
                this.CPU = model.CPU;
                this.city = model.city;
                this.continent = model.continent;
                this.country = model.country;
                this.createTime = model.createTime;
                this.department = model.department;
                this.deviceBelong = model.deviceBelong;
                this.deviceModel = model.deviceModel;
                this.deviceStatus = model.deviceStatus;
                this.deviceTag = model.deviceTag;
                this.deviceType = model.deviceType;
                this.deviceVersion = model.deviceVersion;
                this.disk = model.disk;
                this.diskAvailable = model.diskAvailable;
                this.diskUsed = model.diskUsed;
                this.dlpStatus = model.dlpStatus;
                this.edrStatus = model.edrStatus;
                this.historyUsers = model.historyUsers;
                this.hostname = model.hostname;
                this.iaStatus = model.iaStatus;
                this.innerIP = model.innerIP;
                this.joinAdDomain = model.joinAdDomain;
                this.mac = model.mac;
                this.matchDeviceGroupIds = model.matchDeviceGroupIds;
                this.memory = model.memory;
                this.nacStatus = model.nacStatus;
                this.netInterfaceInfo = model.netInterfaceInfo;
                this.paStatus = model.paStatus;
                this.processes = model.processes;
                this.province = model.province;
                this.saseUserId = model.saseUserId;
                this.sharingStatus = model.sharingStatus;
                this.snBaseBoard = model.snBaseBoard;
                this.snBios = model.snBios;
                this.snDiskDrive = model.snDiskDrive;
                this.snProcessor = model.snProcessor;
                this.snSystem = model.snSystem;
                this.srcIP = model.srcIP;
                this.terminalInfoCollectTime = model.terminalInfoCollectTime;
                this.updateTime = model.updateTime;
                this.username = model.username;
                this.workshop = model.workshop;
            } 

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
             * AutoLoginStatus.
             */
            public Builder autoLoginStatus(String autoLoginStatus) {
                this.autoLoginStatus = autoLoginStatus;
                return this;
            }

            /**
             * BatteryHealthPercentage.
             */
            public Builder batteryHealthPercentage(Integer batteryHealthPercentage) {
                this.batteryHealthPercentage = batteryHealthPercentage;
                return this;
            }

            /**
             * BatteryRemainingPercentage.
             */
            public Builder batteryRemainingPercentage(Integer batteryRemainingPercentage) {
                this.batteryRemainingPercentage = batteryRemainingPercentage;
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Continent.
             */
            public Builder continent(String continent) {
                this.continent = continent;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * DiskAvailable.
             */
            public Builder diskAvailable(Integer diskAvailable) {
                this.diskAvailable = diskAvailable;
                return this;
            }

            /**
             * DiskUsed.
             */
            public Builder diskUsed(Integer diskUsed) {
                this.diskUsed = diskUsed;
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
             * EdrStatus.
             */
            public Builder edrStatus(String edrStatus) {
                this.edrStatus = edrStatus;
                return this;
            }

            /**
             * HistoryUsers.
             */
            public Builder historyUsers(java.util.List<HistoryUsers> historyUsers) {
                this.historyUsers = historyUsers;
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
             * JoinAdDomain.
             */
            public Builder joinAdDomain(Boolean joinAdDomain) {
                this.joinAdDomain = joinAdDomain;
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
             * MatchDeviceGroupIds.
             */
            public Builder matchDeviceGroupIds(java.util.List<String> matchDeviceGroupIds) {
                this.matchDeviceGroupIds = matchDeviceGroupIds;
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
             * NetInterfaceInfo.
             */
            public Builder netInterfaceInfo(java.util.List<NetInterfaceInfo> netInterfaceInfo) {
                this.netInterfaceInfo = netInterfaceInfo;
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
             * Processes.
             */
            public Builder processes(java.util.List<Processes> processes) {
                this.processes = processes;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
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
             * SnBaseBoard.
             */
            public Builder snBaseBoard(String snBaseBoard) {
                this.snBaseBoard = snBaseBoard;
                return this;
            }

            /**
             * SnBios.
             */
            public Builder snBios(String snBios) {
                this.snBios = snBios;
                return this;
            }

            /**
             * SnDiskDrive.
             */
            public Builder snDiskDrive(String snDiskDrive) {
                this.snDiskDrive = snDiskDrive;
                return this;
            }

            /**
             * SnProcessor.
             */
            public Builder snProcessor(String snProcessor) {
                this.snProcessor = snProcessor;
                return this;
            }

            /**
             * SnSystem.
             */
            public Builder snSystem(String snSystem) {
                this.snSystem = snSystem;
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
             * TerminalInfoCollectTime.
             */
            public Builder terminalInfoCollectTime(Long terminalInfoCollectTime) {
                this.terminalInfoCollectTime = terminalInfoCollectTime;
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

            /**
             * Workshop.
             */
            public Builder workshop(String workshop) {
                this.workshop = workshop;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
}
