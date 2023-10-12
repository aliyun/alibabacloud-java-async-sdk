// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceResourceResponseBody</p>
 */
public class GetDeviceResourceResponseBody extends TeaModel {
    @NameInMap("DeviceResource")
    private DeviceResource deviceResource;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceResourceResponseBody(Builder builder) {
        this.deviceResource = builder.deviceResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceResource
     */
    public DeviceResource getDeviceResource() {
        return this.deviceResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceResource deviceResource; 
        private String requestId; 

        /**
         * DeviceResource.
         */
        public Builder deviceResource(DeviceResource deviceResource) {
            this.deviceResource = deviceResource;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceResourceResponseBody build() {
            return new GetDeviceResourceResponseBody(this);
        } 

    } 

    public static class DeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        private String blockNumber;

        @NameInMap("Business")
        private String business;

        @NameInMap("Config")
        private String config;

        @NameInMap("ConfigTaskStatus")
        private String configTaskStatus;

        @NameInMap("DeliveryIp")
        private String deliveryIp;

        @NameInMap("DeviceNum")
        private String deviceNum;

        @NameInMap("DeviceResourceId")
        private String deviceResourceId;

        @NameInMap("GenerateConfig")
        private String generateConfig;

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

        private DeviceResource(Builder builder) {
            this.blockNumber = builder.blockNumber;
            this.business = builder.business;
            this.config = builder.config;
            this.configTaskStatus = builder.configTaskStatus;
            this.deliveryIp = builder.deliveryIp;
            this.deviceNum = builder.deviceNum;
            this.deviceResourceId = builder.deviceResourceId;
            this.generateConfig = builder.generateConfig;
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

        public static DeviceResource create() {
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
         * @return deviceNum
         */
        public String getDeviceNum() {
            return this.deviceNum;
        }

        /**
         * @return deviceResourceId
         */
        public String getDeviceResourceId() {
            return this.deviceResourceId;
        }

        /**
         * @return generateConfig
         */
        public String getGenerateConfig() {
            return this.generateConfig;
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
            private String configTaskStatus; 
            private String deliveryIp; 
            private String deviceNum; 
            private String deviceResourceId; 
            private String generateConfig; 
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
             * DeviceNum.
             */
            public Builder deviceNum(String deviceNum) {
                this.deviceNum = deviceNum;
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
             * GenerateConfig.
             */
            public Builder generateConfig(String generateConfig) {
                this.generateConfig = generateConfig;
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
             * 建设项目id
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

            public DeviceResource build() {
                return new DeviceResource(this);
            } 

        } 

    }
}
