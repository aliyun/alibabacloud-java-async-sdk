// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaysResponseBody</p>
 */
public class DescribeGatewaysResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Gateways")
    private Gateways gateways;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGatewaysResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateways = builder.gateways;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateways
     */
    public Gateways getGateways() {
        return this.gateways;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Gateways gateways; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Gateways.
         */
        public Builder gateways(Gateways gateways) {
            this.gateways = gateways;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGatewaysResponseBody build() {
            return new DescribeGatewaysResponseBody(this);
        } 

    } 

    public static class ElasticNodes extends TeaModel {
        @NameInMap("ElasticNode")
        private java.util.List < String > elasticNode;

        private ElasticNodes(Builder builder) {
            this.elasticNode = builder.elasticNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticNodes create() {
            return builder().build();
        }

        /**
         * @return elasticNode
         */
        public java.util.List < String > getElasticNode() {
            return this.elasticNode;
        }

        public static final class Builder {
            private java.util.List < String > elasticNode; 

            /**
             * ElasticNode.
             */
            public Builder elasticNode(java.util.List < String > elasticNode) {
                this.elasticNode = elasticNode;
                return this;
            }

            public ElasticNodes build() {
                return new ElasticNodes(this);
            } 

        } 

    }
    public static class Gateway extends TeaModel {
        @NameInMap("ActivatedTime")
        private Long activatedTime;

        @NameInMap("BuyURL")
        private String buyURL;

        @NameInMap("Capacity")
        private Integer capacity;

        @NameInMap("Category")
        private String category;

        @NameInMap("CommonBuyInstanceId")
        private String commonBuyInstanceId;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DataLoadInterval")
        private Integer dataLoadInterval;

        @NameInMap("DataLoadType")
        private String dataLoadType;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("ElasticGateway")
        private Boolean elasticGateway;

        @NameInMap("ElasticNodes")
        private ElasticNodes elasticNodes;

        @NameInMap("ExpireStatus")
        private Integer expireStatus;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("GatewayClass")
        private String gatewayClass;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("GatewayRegionId")
        private String gatewayRegionId;

        @NameInMap("GatewayType")
        private String gatewayType;

        @NameInMap("GatewayVersion")
        private String gatewayVersion;

        @NameInMap("HighAvailability")
        private Boolean highAvailability;

        @NameInMap("InnerIp")
        private String innerIp;

        @NameInMap("InnerIpv6Ip")
        private String innerIpv6Ip;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IsPostPaid")
        private Boolean isPostPaid;

        @NameInMap("IsReleaseAfterExpiration")
        private Boolean isReleaseAfterExpiration;

        @NameInMap("LastErrorKey")
        private String lastErrorKey;

        @NameInMap("Location")
        private String location;

        @NameInMap("MaxThroughput")
        private Integer maxThroughput;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublicNetworkBandwidth")
        private Integer publicNetworkBandwidth;

        @NameInMap("RenewURL")
        private String renewURL;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageBundleId")
        private String storageBundleId;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Type")
        private String type;

        @NameInMap("UntrustedEnvInstanceType")
        private String untrustedEnvInstanceType;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Gateway(Builder builder) {
            this.activatedTime = builder.activatedTime;
            this.buyURL = builder.buyURL;
            this.capacity = builder.capacity;
            this.category = builder.category;
            this.commonBuyInstanceId = builder.commonBuyInstanceId;
            this.createdTime = builder.createdTime;
            this.dataLoadInterval = builder.dataLoadInterval;
            this.dataLoadType = builder.dataLoadType;
            this.description = builder.description;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.elasticGateway = builder.elasticGateway;
            this.elasticNodes = builder.elasticNodes;
            this.expireStatus = builder.expireStatus;
            this.expiredTime = builder.expiredTime;
            this.gatewayClass = builder.gatewayClass;
            this.gatewayId = builder.gatewayId;
            this.gatewayRegionId = builder.gatewayRegionId;
            this.gatewayType = builder.gatewayType;
            this.gatewayVersion = builder.gatewayVersion;
            this.highAvailability = builder.highAvailability;
            this.innerIp = builder.innerIp;
            this.innerIpv6Ip = builder.innerIpv6Ip;
            this.ip = builder.ip;
            this.isPostPaid = builder.isPostPaid;
            this.isReleaseAfterExpiration = builder.isReleaseAfterExpiration;
            this.lastErrorKey = builder.lastErrorKey;
            this.location = builder.location;
            this.maxThroughput = builder.maxThroughput;
            this.name = builder.name;
            this.publicNetworkBandwidth = builder.publicNetworkBandwidth;
            this.renewURL = builder.renewURL;
            this.status = builder.status;
            this.storageBundleId = builder.storageBundleId;
            this.taskId = builder.taskId;
            this.type = builder.type;
            this.untrustedEnvInstanceType = builder.untrustedEnvInstanceType;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateway create() {
            return builder().build();
        }

        /**
         * @return activatedTime
         */
        public Long getActivatedTime() {
            return this.activatedTime;
        }

        /**
         * @return buyURL
         */
        public String getBuyURL() {
            return this.buyURL;
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return commonBuyInstanceId
         */
        public String getCommonBuyInstanceId() {
            return this.commonBuyInstanceId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataLoadInterval
         */
        public Integer getDataLoadInterval() {
            return this.dataLoadInterval;
        }

        /**
         * @return dataLoadType
         */
        public String getDataLoadType() {
            return this.dataLoadType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return elasticGateway
         */
        public Boolean getElasticGateway() {
            return this.elasticGateway;
        }

        /**
         * @return elasticNodes
         */
        public ElasticNodes getElasticNodes() {
            return this.elasticNodes;
        }

        /**
         * @return expireStatus
         */
        public Integer getExpireStatus() {
            return this.expireStatus;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gatewayClass
         */
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayRegionId
         */
        public String getGatewayRegionId() {
            return this.gatewayRegionId;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return gatewayVersion
         */
        public String getGatewayVersion() {
            return this.gatewayVersion;
        }

        /**
         * @return highAvailability
         */
        public Boolean getHighAvailability() {
            return this.highAvailability;
        }

        /**
         * @return innerIp
         */
        public String getInnerIp() {
            return this.innerIp;
        }

        /**
         * @return innerIpv6Ip
         */
        public String getInnerIpv6Ip() {
            return this.innerIpv6Ip;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isPostPaid
         */
        public Boolean getIsPostPaid() {
            return this.isPostPaid;
        }

        /**
         * @return isReleaseAfterExpiration
         */
        public Boolean getIsReleaseAfterExpiration() {
            return this.isReleaseAfterExpiration;
        }

        /**
         * @return lastErrorKey
         */
        public String getLastErrorKey() {
            return this.lastErrorKey;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return maxThroughput
         */
        public Integer getMaxThroughput() {
            return this.maxThroughput;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicNetworkBandwidth
         */
        public Integer getPublicNetworkBandwidth() {
            return this.publicNetworkBandwidth;
        }

        /**
         * @return renewURL
         */
        public String getRenewURL() {
            return this.renewURL;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageBundleId
         */
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return untrustedEnvInstanceType
         */
        public String getUntrustedEnvInstanceType() {
            return this.untrustedEnvInstanceType;
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
            private Long activatedTime; 
            private String buyURL; 
            private Integer capacity; 
            private String category; 
            private String commonBuyInstanceId; 
            private Long createdTime; 
            private Integer dataLoadInterval; 
            private String dataLoadType; 
            private String description; 
            private String ecsInstanceId; 
            private Boolean elasticGateway; 
            private ElasticNodes elasticNodes; 
            private Integer expireStatus; 
            private Long expiredTime; 
            private String gatewayClass; 
            private String gatewayId; 
            private String gatewayRegionId; 
            private String gatewayType; 
            private String gatewayVersion; 
            private Boolean highAvailability; 
            private String innerIp; 
            private String innerIpv6Ip; 
            private String ip; 
            private Boolean isPostPaid; 
            private Boolean isReleaseAfterExpiration; 
            private String lastErrorKey; 
            private String location; 
            private Integer maxThroughput; 
            private String name; 
            private Integer publicNetworkBandwidth; 
            private String renewURL; 
            private String status; 
            private String storageBundleId; 
            private String taskId; 
            private String type; 
            private String untrustedEnvInstanceType; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * ActivatedTime.
             */
            public Builder activatedTime(Long activatedTime) {
                this.activatedTime = activatedTime;
                return this;
            }

            /**
             * BuyURL.
             */
            public Builder buyURL(String buyURL) {
                this.buyURL = buyURL;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CommonBuyInstanceId.
             */
            public Builder commonBuyInstanceId(String commonBuyInstanceId) {
                this.commonBuyInstanceId = commonBuyInstanceId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DataLoadInterval.
             */
            public Builder dataLoadInterval(Integer dataLoadInterval) {
                this.dataLoadInterval = dataLoadInterval;
                return this;
            }

            /**
             * DataLoadType.
             */
            public Builder dataLoadType(String dataLoadType) {
                this.dataLoadType = dataLoadType;
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
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * ElasticGateway.
             */
            public Builder elasticGateway(Boolean elasticGateway) {
                this.elasticGateway = elasticGateway;
                return this;
            }

            /**
             * ElasticNodes.
             */
            public Builder elasticNodes(ElasticNodes elasticNodes) {
                this.elasticNodes = elasticNodes;
                return this;
            }

            /**
             * ExpireStatus.
             */
            public Builder expireStatus(Integer expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GatewayClass.
             */
            public Builder gatewayClass(String gatewayClass) {
                this.gatewayClass = gatewayClass;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayRegionId.
             */
            public Builder gatewayRegionId(String gatewayRegionId) {
                this.gatewayRegionId = gatewayRegionId;
                return this;
            }

            /**
             * GatewayType.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * GatewayVersion.
             */
            public Builder gatewayVersion(String gatewayVersion) {
                this.gatewayVersion = gatewayVersion;
                return this;
            }

            /**
             * HighAvailability.
             */
            public Builder highAvailability(Boolean highAvailability) {
                this.highAvailability = highAvailability;
                return this;
            }

            /**
             * InnerIp.
             */
            public Builder innerIp(String innerIp) {
                this.innerIp = innerIp;
                return this;
            }

            /**
             * InnerIpv6Ip.
             */
            public Builder innerIpv6Ip(String innerIpv6Ip) {
                this.innerIpv6Ip = innerIpv6Ip;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * IsPostPaid.
             */
            public Builder isPostPaid(Boolean isPostPaid) {
                this.isPostPaid = isPostPaid;
                return this;
            }

            /**
             * IsReleaseAfterExpiration.
             */
            public Builder isReleaseAfterExpiration(Boolean isReleaseAfterExpiration) {
                this.isReleaseAfterExpiration = isReleaseAfterExpiration;
                return this;
            }

            /**
             * LastErrorKey.
             */
            public Builder lastErrorKey(String lastErrorKey) {
                this.lastErrorKey = lastErrorKey;
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
             * MaxThroughput.
             */
            public Builder maxThroughput(Integer maxThroughput) {
                this.maxThroughput = maxThroughput;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublicNetworkBandwidth.
             */
            public Builder publicNetworkBandwidth(Integer publicNetworkBandwidth) {
                this.publicNetworkBandwidth = publicNetworkBandwidth;
                return this;
            }

            /**
             * RenewURL.
             */
            public Builder renewURL(String renewURL) {
                this.renewURL = renewURL;
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
             * StorageBundleId.
             */
            public Builder storageBundleId(String storageBundleId) {
                this.storageBundleId = storageBundleId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UntrustedEnvInstanceType.
             */
            public Builder untrustedEnvInstanceType(String untrustedEnvInstanceType) {
                this.untrustedEnvInstanceType = untrustedEnvInstanceType;
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

            public Gateway build() {
                return new Gateway(this);
            } 

        } 

    }
    public static class Gateways extends TeaModel {
        @NameInMap("Gateway")
        private java.util.List < Gateway> gateway;

        private Gateways(Builder builder) {
            this.gateway = builder.gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateways create() {
            return builder().build();
        }

        /**
         * @return gateway
         */
        public java.util.List < Gateway> getGateway() {
            return this.gateway;
        }

        public static final class Builder {
            private java.util.List < Gateway> gateway; 

            /**
             * Gateway.
             */
            public Builder gateway(java.util.List < Gateway> gateway) {
                this.gateway = gateway;
                return this;
            }

            public Gateways build() {
                return new Gateways(this);
            } 

        } 

    }
}
