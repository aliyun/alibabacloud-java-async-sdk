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
 * {@link ListUserDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDevicesResponseBody</p>
 */
public class ListUserDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List<Devices> devices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListUserDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDevicesResponseBody create() {
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

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Devices> devices; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListUserDevicesResponseBody model) {
            this.devices = model.devices;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of endpoint devices.</p>
         */
        public Builder devices(java.util.List<Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of endpoint devices.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListUserDevicesResponseBody build() {
            return new ListUserDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDevicesResponseBody</p>
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
             * <p>The MAC address of the network interface.</p>
             * 
             * <strong>example:</strong>
             * <p>00:16:XX:XX:7c:46</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The name of the network interface.</p>
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
     * {@link ListUserDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserDevicesResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppStatus")
        private String appStatus;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AutoLoginStatus")
        private String autoLoginStatus;

        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityEn")
        private String cityEn;

        @com.aliyun.core.annotation.NameInMap("CityZh")
        private String cityZh;

        @com.aliyun.core.annotation.NameInMap("Continent")
        private String continent;

        @com.aliyun.core.annotation.NameInMap("ContinentEn")
        private String continentEn;

        @com.aliyun.core.annotation.NameInMap("ContinentZh")
        private String continentZh;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CountryEn")
        private String countryEn;

        @com.aliyun.core.annotation.NameInMap("CountryZh")
        private String countryZh;

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

        @com.aliyun.core.annotation.NameInMap("EdrStatus")
        private String edrStatus;

        @com.aliyun.core.annotation.NameInMap("FullDepartment")
        private java.util.List<String> fullDepartment;

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

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("ProvinceEn")
        private String provinceEn;

        @com.aliyun.core.annotation.NameInMap("ProvinceZh")
        private String provinceZh;

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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Workshop")
        private String workshop;

        private Devices(Builder builder) {
            this.appStatus = builder.appStatus;
            this.appVersion = builder.appVersion;
            this.autoLoginStatus = builder.autoLoginStatus;
            this.CPU = builder.CPU;
            this.city = builder.city;
            this.cityEn = builder.cityEn;
            this.cityZh = builder.cityZh;
            this.continent = builder.continent;
            this.continentEn = builder.continentEn;
            this.continentZh = builder.continentZh;
            this.country = builder.country;
            this.countryEn = builder.countryEn;
            this.countryZh = builder.countryZh;
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
            this.edrStatus = builder.edrStatus;
            this.fullDepartment = builder.fullDepartment;
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
            this.province = builder.province;
            this.provinceEn = builder.provinceEn;
            this.provinceZh = builder.provinceZh;
            this.saseUserId = builder.saseUserId;
            this.sharingStatus = builder.sharingStatus;
            this.snBaseBoard = builder.snBaseBoard;
            this.snBios = builder.snBios;
            this.snDiskDrive = builder.snDiskDrive;
            this.snProcessor = builder.snProcessor;
            this.snSystem = builder.snSystem;
            this.srcIP = builder.srcIP;
            this.updateTime = builder.updateTime;
            this.username = builder.username;
            this.workshop = builder.workshop;
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
         * @return autoLoginStatus
         */
        public String getAutoLoginStatus() {
            return this.autoLoginStatus;
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
         * @return cityEn
         */
        public String getCityEn() {
            return this.cityEn;
        }

        /**
         * @return cityZh
         */
        public String getCityZh() {
            return this.cityZh;
        }

        /**
         * @return continent
         */
        public String getContinent() {
            return this.continent;
        }

        /**
         * @return continentEn
         */
        public String getContinentEn() {
            return this.continentEn;
        }

        /**
         * @return continentZh
         */
        public String getContinentZh() {
            return this.continentZh;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryEn
         */
        public String getCountryEn() {
            return this.countryEn;
        }

        /**
         * @return countryZh
         */
        public String getCountryZh() {
            return this.countryZh;
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
         * @return edrStatus
         */
        public String getEdrStatus() {
            return this.edrStatus;
        }

        /**
         * @return fullDepartment
         */
        public java.util.List<String> getFullDepartment() {
            return this.fullDepartment;
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
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return provinceEn
         */
        public String getProvinceEn() {
            return this.provinceEn;
        }

        /**
         * @return provinceZh
         */
        public String getProvinceZh() {
            return this.provinceZh;
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
            private String CPU; 
            private String city; 
            private String cityEn; 
            private String cityZh; 
            private String continent; 
            private String continentEn; 
            private String continentZh; 
            private String country; 
            private String countryEn; 
            private String countryZh; 
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
            private String edrStatus; 
            private java.util.List<String> fullDepartment; 
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
            private String province; 
            private String provinceEn; 
            private String provinceZh; 
            private String saseUserId; 
            private Boolean sharingStatus; 
            private String snBaseBoard; 
            private String snBios; 
            private String snDiskDrive; 
            private String snProcessor; 
            private String snSystem; 
            private String srcIP; 
            private String updateTime; 
            private String username; 
            private String workshop; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.appStatus = model.appStatus;
                this.appVersion = model.appVersion;
                this.autoLoginStatus = model.autoLoginStatus;
                this.CPU = model.CPU;
                this.city = model.city;
                this.cityEn = model.cityEn;
                this.cityZh = model.cityZh;
                this.continent = model.continent;
                this.continentEn = model.continentEn;
                this.continentZh = model.continentZh;
                this.country = model.country;
                this.countryEn = model.countryEn;
                this.countryZh = model.countryZh;
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
                this.edrStatus = model.edrStatus;
                this.fullDepartment = model.fullDepartment;
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
                this.province = model.province;
                this.provinceEn = model.provinceEn;
                this.provinceZh = model.provinceZh;
                this.saseUserId = model.saseUserId;
                this.sharingStatus = model.sharingStatus;
                this.snBaseBoard = model.snBaseBoard;
                this.snBios = model.snBios;
                this.snDiskDrive = model.snDiskDrive;
                this.snProcessor = model.snProcessor;
                this.snSystem = model.snSystem;
                this.srcIP = model.srcIP;
                this.updateTime = model.updateTime;
                this.username = model.username;
                this.workshop = model.workshop;
            } 

            /**
             * <p>The client status. Valid values:</p>
             * <ul>
             * <li><strong>Online</strong>: online.</li>
             * <li><strong>Offline</strong>: offline.</li>
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
             * <p>The auto-logon status of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder autoLoginStatus(String autoLoginStatus) {
                this.autoLoginStatus = autoLoginStatus;
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The city name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing City</p>
             */
            public Builder cityEn(String cityEn) {
                this.cityEn = cityEn;
                return this;
            }

            /**
             * <p>The city name in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>北京市</p>
             */
            public Builder cityZh(String cityZh) {
                this.cityZh = cityZh;
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
             * <p>The continent name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia</p>
             */
            public Builder continentEn(String continentEn) {
                this.continentEn = continentEn;
                return this;
            }

            /**
             * <p>The continent name in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>亚洲</p>
             */
            public Builder continentZh(String continentZh) {
                this.continentZh = continentZh;
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
             * <p>The country name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryEn(String countryEn) {
                this.countryEn = countryEn;
                return this;
            }

            /**
             * <p>The country name in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>中国</p>
             */
            public Builder countryZh(String countryZh) {
                this.countryZh = countryZh;
                return this;
            }

            /**
             * <p>The registration time of the endpoint device.</p>
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
             * <li><strong>Personal</strong>: personal device.</li>
             * <li><strong>Company</strong>: company device.</li>
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
             * <li><strong>Online</strong>: online.</li>
             * <li><strong>Offline</strong>: offline.</li>
             * <li><strong>LongTermOffline</strong>: long-term offline.</li>
             * <li><strong>Locked</strong>: locked.</li>
             * <li><strong>Lost</strong>: reported as lost.</li>
             * <li><strong>Unbound</strong>: unbound.</li>
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
             * <li><strong>Windows</strong>: Windows.</li>
             * <li><strong>macOS</strong>: macOS.</li>
             * <li><strong>Linux</strong>: Linux.</li>
             * <li><strong>Android</strong>: Android.</li>
             * <li><strong>iOS</strong>: iOS.</li>
             * <li><strong>Windows_Wuying</strong>: WUYING Workspace.</li>
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
             * <p>The office data protection status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
             * <li><strong>Unprovisioned</strong>: not configured.</li>
             * <li><strong>Unauthorized</strong>: unauthorized.</li>
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
             * <p>The anti-intrusion status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder edrStatus(String edrStatus) {
                this.edrStatus = edrStatus;
                return this;
            }

            /**
             * <p>The list of full department paths.</p>
             */
            public Builder fullDepartment(java.util.List<String> fullDepartment) {
                this.fullDepartment = fullDepartment;
                return this;
            }

            /**
             * <p>The name of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>win10-64bit</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The Internet access status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
             * <li><strong>Unprovisioned</strong>: not configured.</li>
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
             * <p>The internal IP address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder innerIP(String innerIP) {
                this.innerIP = innerIP;
                return this;
            }

            /**
             * <p>Indicates whether the device is joined to an Active Directory (AD) domain.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder joinAdDomain(Boolean joinAdDomain) {
                this.joinAdDomain = joinAdDomain;
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
             * <p>The collection of matched device group IDs.</p>
             */
            public Builder matchDeviceGroupIds(java.util.List<String> matchDeviceGroupIds) {
                this.matchDeviceGroupIds = matchDeviceGroupIds;
                return this;
            }

            /**
             * <p>The memory capacity of the endpoint device. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The network access control status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
             * <li><strong>Unprovisioned</strong>: not configured.</li>
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
             * <p>The list of network interfaces of the endpoint device.</p>
             */
            public Builder netInterfaceInfo(java.util.List<NetInterfaceInfo> netInterfaceInfo) {
                this.netInterfaceInfo = netInterfaceInfo;
                return this;
            }

            /**
             * <p>The private access status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: enabled.</li>
             * <li><strong>Disabled</strong>: disabled.</li>
             * <li><strong>Unprovisioned</strong>: not configured.</li>
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
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The province name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder provinceEn(String provinceEn) {
                this.provinceEn = provinceEn;
                return this;
            }

            /**
             * <p>The province name in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>北京市</p>
             */
            public Builder provinceZh(String provinceZh) {
                this.provinceZh = provinceZh;
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
             * <p>Specifies whether sharing is enabled for the device. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Sharing is enabled.</li>
             * <li><strong>false</strong>: Sharing is disabled.</li>
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
             * <p>The motherboard serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>PJGGU00WBD****</p>
             */
            public Builder snBaseBoard(String snBaseBoard) {
                this.snBaseBoard = snBaseBoard;
                return this;
            }

            /**
             * <p>The BIOS system serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>5CG003****</p>
             */
            public Builder snBios(String snBios) {
                this.snBios = snBios;
                return this;
            }

            /**
             * <p>The hard disk serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>WD-WXR1A99A****</p>
             */
            public Builder snDiskDrive(String snDiskDrive) {
                this.snDiskDrive = snDiskDrive;
                return this;
            }

            /**
             * <p>The processor serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>BFEBFBFF0008****</p>
             */
            public Builder snProcessor(String snProcessor) {
                this.snProcessor = snProcessor;
                return this;
            }

            /**
             * <p>The system serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>KVN9C9****</p>
             */
            public Builder snSystem(String snSystem) {
                this.snSystem = snSystem;
                return this;
            }

            /**
             * <p>The logon IP address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>11.49.XX.XX</p>
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * <p>The last online time of the endpoint device.</p>
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

            /**
             * <p>The name of the office area.</p>
             * 
             * <strong>example:</strong>
             * <p>测试办公区</p>
             */
            public Builder workshop(String workshop) {
                this.workshop = workshop;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
