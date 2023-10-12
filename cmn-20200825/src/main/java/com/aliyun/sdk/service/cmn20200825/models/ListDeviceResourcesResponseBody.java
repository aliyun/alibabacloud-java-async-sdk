// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceResourcesResponseBody</p>
 */
public class ListDeviceResourcesResponseBody extends TeaModel {
    @NameInMap("DeviceResource")
    private java.util.List < DeviceResource> deviceResource;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDeviceResourcesResponseBody(Builder builder) {
        this.deviceResource = builder.deviceResource;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceResource
     */
    public java.util.List < DeviceResource> getDeviceResource() {
        return this.deviceResource;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DeviceResource> deviceResource; 
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DeviceResource.
         */
        public Builder deviceResource(java.util.List < DeviceResource> deviceResource) {
            this.deviceResource = deviceResource;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeviceResourcesResponseBody build() {
            return new ListDeviceResourcesResponseBody(this);
        } 

    } 

    public static class DeviceResource extends TeaModel {
        @NameInMap("BlockNumber")
        private String blockNumber;

        @NameInMap("Business")
        private String business;

        @NameInMap("Config")
        private String config;

        @NameInMap("ConfigTaskId")
        private String configTaskId;

        @NameInMap("ConfigTaskStatus")
        private String configTaskStatus;

        @NameInMap("DeliveryIp")
        private String deliveryIp;

        @NameInMap("DeviceNumber")
        private String deviceNumber;

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

        @NameInMap("Params")
        private String params;

        @NameInMap("Role")
        private String role;

        @NameInMap("SetupProjectId")
        private String setupProjectId;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("Stack")
        private Boolean stack;

        @NameInMap("Vendor")
        private String vendor;

        private DeviceResource(Builder builder) {
            this.blockNumber = builder.blockNumber;
            this.business = builder.business;
            this.config = builder.config;
            this.configTaskId = builder.configTaskId;
            this.configTaskStatus = builder.configTaskStatus;
            this.deliveryIp = builder.deliveryIp;
            this.deviceNumber = builder.deviceNumber;
            this.deviceResourceId = builder.deviceResourceId;
            this.generateConfig = builder.generateConfig;
            this.hostName = builder.hostName;
            this.interConnection = builder.interConnection;
            this.location = builder.location;
            this.loopback = builder.loopback;
            this.managerIp = builder.managerIp;
            this.model = builder.model;
            this.params = builder.params;
            this.role = builder.role;
            this.setupProjectId = builder.setupProjectId;
            this.sn = builder.sn;
            this.specification = builder.specification;
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
         * @return configTaskId
         */
        public String getConfigTaskId() {
            return this.configTaskId;
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
         * @return params
         */
        public String getParams() {
            return this.params;
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
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
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
            private String configTaskId; 
            private String configTaskStatus; 
            private String deliveryIp; 
            private String deviceNumber; 
            private String deviceResourceId; 
            private String generateConfig; 
            private String hostName; 
            private String interConnection; 
            private String location; 
            private String loopback; 
            private String managerIp; 
            private String model; 
            private String params; 
            private String role; 
            private String setupProjectId; 
            private String sn; 
            private String specification; 
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
             * ConfigTaskId.
             */
            public Builder configTaskId(String configTaskId) {
                this.configTaskId = configTaskId;
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
             * 代表资源一级ID的资源属性字段
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
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
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
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
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
