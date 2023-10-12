// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceResource} extends {@link TeaModel}
 *
 * <p>DeviceResource</p>
 */
public class DeviceResource extends TeaModel {
    @NameInMap("ArchId")
    private String archId;

    @NameInMap("BusinessType")
    private String businessType;

    @NameInMap("BusinessTypeId")
    private String businessTypeId;

    @NameInMap("BusinessTypeParams")
    private String businessTypeParams;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Data")
    private String data;

    @NameInMap("DeviceResource")
    private java.util.List < DeviceResourceDeviceResource> deviceResource;

    @NameInMap("DeviceResourceId")
    private String deviceResourceId;

    @NameInMap("DeviceResourceIds")
    private java.util.List < String > deviceResourceIds;

    @NameInMap("DownloadType")
    private String downloadType;

    @NameInMap("IpType")
    private String ipType;

    @NameInMap("ListType")
    private String listType;

    @NameInMap("LoopbackPort")
    private String loopbackPort;

    @NameInMap("NetLocation")
    private String netLocation;

    @NameInMap("SetupProjectId")
    private String setupProjectId;

    @NameInMap("Type")
    private String type;

    private DeviceResource(Builder builder) {
        this.archId = builder.archId;
        this.businessType = builder.businessType;
        this.businessTypeId = builder.businessTypeId;
        this.businessTypeParams = builder.businessTypeParams;
        this.createTime = builder.createTime;
        this.data = builder.data;
        this.deviceResource = builder.deviceResource;
        this.deviceResourceId = builder.deviceResourceId;
        this.deviceResourceIds = builder.deviceResourceIds;
        this.downloadType = builder.downloadType;
        this.ipType = builder.ipType;
        this.listType = builder.listType;
        this.loopbackPort = builder.loopbackPort;
        this.netLocation = builder.netLocation;
        this.setupProjectId = builder.setupProjectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceResource create() {
        return builder().build();
    }

    /**
     * @return archId
     */
    public String getArchId() {
        return this.archId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * @return businessTypeParams
     */
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return deviceResource
     */
    public java.util.List < DeviceResourceDeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    /**
     * @return deviceResourceId
     */
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    /**
     * @return deviceResourceIds
     */
    public java.util.List < String > getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    /**
     * @return downloadType
     */
    public String getDownloadType() {
        return this.downloadType;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return loopbackPort
     */
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    /**
     * @return netLocation
     */
    public String getNetLocation() {
        return this.netLocation;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String archId; 
        private String businessType; 
        private String businessTypeId; 
        private String businessTypeParams; 
        private String createTime; 
        private String data; 
        private java.util.List < DeviceResourceDeviceResource> deviceResource; 
        private String deviceResourceId; 
        private java.util.List < String > deviceResourceIds; 
        private String downloadType; 
        private String ipType; 
        private String listType; 
        private String loopbackPort; 
        private String netLocation; 
        private String setupProjectId; 
        private String type; 

        /**
         * ArchId.
         */
        public Builder archId(String archId) {
            this.archId = archId;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * BusinessTypeId.
         */
        public Builder businessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }

        /**
         * BusinessTypeParams.
         */
        public Builder businessTypeParams(String businessTypeParams) {
            this.businessTypeParams = businessTypeParams;
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
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * DeviceResource.
         */
        public Builder deviceResource(java.util.List < DeviceResourceDeviceResource> deviceResource) {
            this.deviceResource = deviceResource;
            return this;
        }

        /**
         * DeviceResourceId.
         */
        public Builder deviceResourceId(String deviceResourceId) {
            this.deviceResourceId = deviceResourceId;
            return this;
        }

        /**
         * DeviceResourceIds.
         */
        public Builder deviceResourceIds(java.util.List < String > deviceResourceIds) {
            this.deviceResourceIds = deviceResourceIds;
            return this;
        }

        /**
         * DownloadType.
         */
        public Builder downloadType(String downloadType) {
            this.downloadType = downloadType;
            return this;
        }

        /**
         * IpType.
         */
        public Builder ipType(String ipType) {
            this.ipType = ipType;
            return this;
        }

        /**
         * ListType.
         */
        public Builder listType(String listType) {
            this.listType = listType;
            return this;
        }

        /**
         * LoopbackPort.
         */
        public Builder loopbackPort(String loopbackPort) {
            this.loopbackPort = loopbackPort;
            return this;
        }

        /**
         * NetLocation.
         */
        public Builder netLocation(String netLocation) {
            this.netLocation = netLocation;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DeviceResource build() {
            return new DeviceResource(this);
        } 

    } 

    public static class DeviceResourceDeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        private String blockNumber;

        @NameInMap("Business")
        private String business;

        @NameInMap("Config")
        private String config;

        @NameInMap("ConfigGenerate")
        private Boolean configGenerate;

        @NameInMap("ConfigTaskStatus")
        private String configTaskStatus;

        @NameInMap("DeliveryIp")
        private String deliveryIp;

        @NameInMap("DeviceNumber")
        private String deviceNumber;

        @NameInMap("DeviceResourceId")
        private String deviceResourceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InterConnection")
        private String interConnection;

        @NameInMap("Location")
        private String location;

        @NameInMap("Loopback")
        private String loopback;

        @NameInMap("ManagerIp")
        private String managerIp;

        @NameInMap("Model")
        private String model;

        @NameInMap("Role")
        private String role;

        @NameInMap("SetupProjectId")
        private String setupProjectId;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Stack")
        private Boolean stack;

        @NameInMap("Vendor")
        private String vendor;

        private DeviceResourceDeviceResource(Builder builder) {
            this.blockNumber = builder.blockNumber;
            this.business = builder.business;
            this.config = builder.config;
            this.configGenerate = builder.configGenerate;
            this.configTaskStatus = builder.configTaskStatus;
            this.deliveryIp = builder.deliveryIp;
            this.deviceNumber = builder.deviceNumber;
            this.deviceResourceId = builder.deviceResourceId;
            this.hostName = builder.hostName;
            this.interConnection = builder.interConnection;
            this.location = builder.location;
            this.loopback = builder.loopback;
            this.managerIp = builder.managerIp;
            this.model = builder.model;
            this.role = builder.role;
            this.setupProjectId = builder.setupProjectId;
            this.sn = builder.sn;
            this.stack = builder.stack;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceResourceDeviceResource create() {
            return builder().build();
        }

        /**
         * @return blockNumber
         */
        public String getBlockNumber() {
            return this.blockNumber;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return configGenerate
         */
        public Boolean getConfigGenerate() {
            return this.configGenerate;
        }

        /**
         * @return configTaskStatus
         */
        public String getConfigTaskStatus() {
            return this.configTaskStatus;
        }

        /**
         * @return deliveryIp
         */
        public String getDeliveryIp() {
            return this.deliveryIp;
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        /**
         * @return deviceResourceId
         */
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return interConnection
         */
        public String getInterConnection() {
            return this.interConnection;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return loopback
         */
        public String getLoopback() {
            return this.loopback;
        }

        /**
         * @return managerIp
         */
        public String getManagerIp() {
            return this.managerIp;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return setupProjectId
         */
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return stack
         */
        public Boolean getStack() {
            return this.stack;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String blockNumber; 
            private String business; 
            private String config; 
            private Boolean configGenerate; 
            private String configTaskStatus; 
            private String deliveryIp; 
            private String deviceNumber; 
            private String deviceResourceId; 
            private String hostName; 
            private String interConnection; 
            private String location; 
            private String loopback; 
            private String managerIp; 
            private String model; 
            private String role; 
            private String setupProjectId; 
            private String sn; 
            private Boolean stack; 
            private String vendor; 

            /**
             * BlockNumber.
             */
            public Builder blockNumber(String blockNumber) {
                this.blockNumber = blockNumber;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ConfigGenerate.
             */
            public Builder configGenerate(Boolean configGenerate) {
                this.configGenerate = configGenerate;
                return this;
            }

            /**
             * ConfigTaskStatus.
             */
            public Builder configTaskStatus(String configTaskStatus) {
                this.configTaskStatus = configTaskStatus;
                return this;
            }

            /**
             * DeliveryIp.
             */
            public Builder deliveryIp(String deliveryIp) {
                this.deliveryIp = deliveryIp;
                return this;
            }

            /**
             * DeviceNumber.
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * DeviceResourceId.
             */
            public Builder deviceResourceId(String deviceResourceId) {
                this.deviceResourceId = deviceResourceId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InterConnection.
             */
            public Builder interConnection(String interConnection) {
                this.interConnection = interConnection;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Loopback.
             */
            public Builder loopback(String loopback) {
                this.loopback = loopback;
                return this;
            }

            /**
             * ManagerIp.
             */
            public Builder managerIp(String managerIp) {
                this.managerIp = managerIp;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SetupProjectId.
             */
            public Builder setupProjectId(String setupProjectId) {
                this.setupProjectId = setupProjectId;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Stack.
             */
            public Builder stack(Boolean stack) {
                this.stack = stack;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public DeviceResourceDeviceResource build() {
                return new DeviceResourceDeviceResource(this);
            } 

        } 

    }
}
