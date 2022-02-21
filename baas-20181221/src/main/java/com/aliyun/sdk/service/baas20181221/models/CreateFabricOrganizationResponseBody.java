// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFabricOrganizationResponseBody</p>
 */
public class CreateFabricOrganizationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CreateFabricOrganizationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricOrganizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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

        public CreateFabricOrganizationResponseBody build() {
            return new CreateFabricOrganizationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ClusterState")
        private String clusterState;

        @NameInMap("CodeName")
        private String codeName;

        @NameInMap("ConsortiumCount")
        private Integer consortiumCount;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("OrganizationDescription")
        private String organizationDescription;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("OrganizationName")
        private String organizationName;

        @NameInMap("OwnerBid")
        private String ownerBid;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("OwnerUid")
        private Long ownerUid;

        @NameInMap("PeerCount")
        private Integer peerCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ServiceState")
        private String serviceState;

        @NameInMap("SpecName")
        private String specName;

        @NameInMap("UserCount")
        private Integer userCount;

        @NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.clusterState = builder.clusterState;
            this.codeName = builder.codeName;
            this.consortiumCount = builder.consortiumCount;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.organizationDescription = builder.organizationDescription;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
            this.ownerBid = builder.ownerBid;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.peerCount = builder.peerCount;
            this.regionId = builder.regionId;
            this.requestId = builder.requestId;
            this.serviceState = builder.serviceState;
            this.specName = builder.specName;
            this.userCount = builder.userCount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return codeName
         */
        public String getCodeName() {
            return this.codeName;
        }

        /**
         * @return consortiumCount
         */
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return organizationDescription
         */
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return ownerBid
         */
        public String getOwnerBid() {
            return this.ownerBid;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return peerCount
         */
        public Integer getPeerCount() {
            return this.peerCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterState; 
            private String codeName; 
            private Integer consortiumCount; 
            private String createTime; 
            private String domain; 
            private String organizationDescription; 
            private String organizationId; 
            private String organizationName; 
            private String ownerBid; 
            private String ownerName; 
            private Long ownerUid; 
            private Integer peerCount; 
            private String regionId; 
            private String requestId; 
            private String serviceState; 
            private String specName; 
            private Integer userCount; 
            private String zoneId; 

            /**
             * ClusterState.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * CodeName.
             */
            public Builder codeName(String codeName) {
                this.codeName = codeName;
                return this;
            }

            /**
             * ConsortiumCount.
             */
            public Builder consortiumCount(Integer consortiumCount) {
                this.consortiumCount = consortiumCount;
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * OrganizationDescription.
             */
            public Builder organizationDescription(String organizationDescription) {
                this.organizationDescription = organizationDescription;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
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
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
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
             * PeerCount.
             */
            public Builder peerCount(Integer peerCount) {
                this.peerCount = peerCount;
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
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
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
