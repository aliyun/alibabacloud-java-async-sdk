// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEcosphereResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEcosphereResponseBody</p>
 */
public class CreateEcosphereResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEcosphereResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEcosphereResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEcosphereResponseBody build() {
            return new CreateEcosphereResponseBody(this);
        } 

    } 

    public static class Organizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterState")
        private String clusterState;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceState")
        private String serviceState;

        private Organizations(Builder builder) {
            this.clusterState = builder.clusterState;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.domain = builder.domain;
            this.name = builder.name;
            this.serviceState = builder.serviceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organizations create() {
            return builder().build();
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceState
         */
        public String getServiceState() {
            return this.serviceState;
        }

        public static final class Builder {
            private String clusterState; 
            private String code; 
            private String createTime; 
            private String description; 
            private String domain; 
            private String name; 
            private String serviceState; 

            /**
             * ClusterState.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * ServiceState.
             */
            public Builder serviceState(String serviceState) {
                this.serviceState = serviceState;
                return this;
            }

            public Organizations build() {
                return new Organizations(this);
            } 

        } 

    }
    public static class Specification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NumOfNodes")
        private Integer numOfNodes;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Specification(Builder builder) {
            this.name = builder.name;
            this.numOfNodes = builder.numOfNodes;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specification create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numOfNodes
         */
        public Integer getNumOfNodes() {
            return this.numOfNodes;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String name; 
            private Integer numOfNodes; 
            private String title; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NumOfNodes.
             */
            public Builder numOfNodes(Integer numOfNodes) {
                this.numOfNodes = numOfNodes;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Specification build() {
                return new Specification(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelCount")
        private Integer channelCount;

        @com.aliyun.core.annotation.NameInMap("ChannelPolicy")
        private String channelPolicy;

        @com.aliyun.core.annotation.NameInMap("ClusterState")
        private String clusterState;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("MemberCount")
        private Integer memberCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrdererCount")
        private Integer ordererCount;

        @com.aliyun.core.annotation.NameInMap("OrdererType")
        private String ordererType;

        @com.aliyun.core.annotation.NameInMap("Organizations")
        private java.util.List < Organizations> organizations;

        @com.aliyun.core.annotation.NameInMap("OwnerBid")
        private String ownerBid;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceState")
        private String serviceState;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private Specification specification;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.channelCount = builder.channelCount;
            this.channelPolicy = builder.channelPolicy;
            this.clusterState = builder.clusterState;
            this.code = builder.code;
            this.consortiumId = builder.consortiumId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.domain = builder.domain;
            this.memberCount = builder.memberCount;
            this.name = builder.name;
            this.ordererCount = builder.ordererCount;
            this.ordererType = builder.ordererType;
            this.organizations = builder.organizations;
            this.ownerBid = builder.ownerBid;
            this.ownerUid = builder.ownerUid;
            this.regionId = builder.regionId;
            this.serviceState = builder.serviceState;
            this.specName = builder.specName;
            this.specification = builder.specification;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelCount
         */
        public Integer getChannelCount() {
            return this.channelCount;
        }

        /**
         * @return channelPolicy
         */
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
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

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return memberCount
         */
        public Integer getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ordererCount
         */
        public Integer getOrdererCount() {
            return this.ordererCount;
        }

        /**
         * @return ordererType
         */
        public String getOrdererType() {
            return this.ordererType;
        }

        /**
         * @return organizations
         */
        public java.util.List < Organizations> getOrganizations() {
            return this.organizations;
        }

        /**
         * @return ownerBid
         */
        public String getOwnerBid() {
            return this.ownerBid;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceState
         */
        public String getServiceState() {
            return this.serviceState;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return specification
         */
        public Specification getSpecification() {
            return this.specification;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer channelCount; 
            private String channelPolicy; 
            private String clusterState; 
            private String code; 
            private String consortiumId; 
            private String createTime; 
            private String description; 
            private String domain; 
            private Integer memberCount; 
            private String name; 
            private Integer ordererCount; 
            private String ordererType; 
            private java.util.List < Organizations> organizations; 
            private String ownerBid; 
            private Long ownerUid; 
            private String regionId; 
            private String serviceState; 
            private String specName; 
            private Specification specification; 
            private String zoneId; 

            /**
             * ChannelCount.
             */
            public Builder channelCount(Integer channelCount) {
                this.channelCount = channelCount;
                return this;
            }

            /**
             * ChannelPolicy.
             */
            public Builder channelPolicy(String channelPolicy) {
                this.channelPolicy = channelPolicy;
                return this;
            }

            /**
             * ClusterState.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Integer memberCount) {
                this.memberCount = memberCount;
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
             * OrdererCount.
             */
            public Builder ordererCount(Integer ordererCount) {
                this.ordererCount = ordererCount;
                return this;
            }

            /**
             * OrdererType.
             */
            public Builder ordererType(String ordererType) {
                this.ordererType = ordererType;
                return this;
            }

            /**
             * Organizations.
             */
            public Builder organizations(java.util.List < Organizations> organizations) {
                this.organizations = organizations;
                return this;
            }

            /**
             * OwnerBid.
             */
            public Builder ownerBid(String ownerBid) {
                this.ownerBid = ownerBid;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceState.
             */
            public Builder serviceState(String serviceState) {
                this.serviceState = serviceState;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(Specification specification) {
                this.specification = specification;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
