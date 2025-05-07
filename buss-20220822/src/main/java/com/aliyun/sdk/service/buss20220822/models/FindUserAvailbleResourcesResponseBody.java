// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link FindUserAvailbleResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>FindUserAvailbleResourcesResponseBody</p>
 */
public class FindUserAvailbleResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private FindUserAvailbleResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserAvailbleResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Long count; 
        private Data data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(FindUserAvailbleResourcesResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * <p>This parameter is required.</p>
         */
        public Builder nextToken(String nextToken) {
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

        public FindUserAvailbleResourcesResponseBody build() {
            return new FindUserAvailbleResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindUserAvailbleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserAvailbleResourcesResponseBody</p>
     */
    public static class PegCoordinates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BussinessCode")
        private String bussinessCode;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Coordinate")
        private java.util.Map<String, ?> coordinate;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("ResCreateTime")
        private String resCreateTime;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ServiceCreatedTime")
        private String serviceCreatedTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private PegCoordinates(Builder builder) {
            this.bussinessCode = builder.bussinessCode;
            this.chargeType = builder.chargeType;
            this.coordinate = builder.coordinate;
            this.idType = builder.idType;
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.releaseTime = builder.releaseTime;
            this.resCreateTime = builder.resCreateTime;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.serviceCreatedTime = builder.serviceCreatedTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PegCoordinates create() {
            return builder().build();
        }

        /**
         * @return bussinessCode
         */
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return coordinate
         */
        public java.util.Map<String, ?> getCoordinate() {
            return this.coordinate;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return resCreateTime
         */
        public String getResCreateTime() {
            return this.resCreateTime;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return serviceCreatedTime
         */
        public String getServiceCreatedTime() {
            return this.serviceCreatedTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bussinessCode; 
            private String chargeType; 
            private java.util.Map<String, ?> coordinate; 
            private String idType; 
            private String instanceId; 
            private String region; 
            private String releaseTime; 
            private String resCreateTime; 
            private String resourceStatus; 
            private String resourceType; 
            private String serviceCreatedTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(PegCoordinates model) {
                this.bussinessCode = model.bussinessCode;
                this.chargeType = model.chargeType;
                this.coordinate = model.coordinate;
                this.idType = model.idType;
                this.instanceId = model.instanceId;
                this.region = model.region;
                this.releaseTime = model.releaseTime;
                this.resCreateTime = model.resCreateTime;
                this.resourceStatus = model.resourceStatus;
                this.resourceType = model.resourceType;
                this.serviceCreatedTime = model.serviceCreatedTime;
                this.userId = model.userId;
            } 

            /**
             * BussinessCode.
             */
            public Builder bussinessCode(String bussinessCode) {
                this.bussinessCode = bussinessCode;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Coordinate.
             */
            public Builder coordinate(java.util.Map<String, ?> coordinate) {
                this.coordinate = coordinate;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * ResCreateTime.
             */
            public Builder resCreateTime(String resCreateTime) {
                this.resCreateTime = resCreateTime;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ServiceCreatedTime.
             */
            public Builder serviceCreatedTime(String serviceCreatedTime) {
                this.serviceCreatedTime = serviceCreatedTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PegCoordinates build() {
                return new PegCoordinates(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindUserAvailbleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserAvailbleResourcesResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GcLevel")
        private String gcLevel;

        @com.aliyun.core.annotation.NameInMap("HitWhiteReason")
        private String hitWhiteReason;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserSite")
        private String userSite;

        @com.aliyun.core.annotation.NameInMap("WhiteUser")
        private Boolean whiteUser;

        private UserInfo(Builder builder) {
            this.gcLevel = builder.gcLevel;
            this.hitWhiteReason = builder.hitWhiteReason;
            this.userId = builder.userId;
            this.userSite = builder.userSite;
            this.whiteUser = builder.whiteUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return gcLevel
         */
        public String getGcLevel() {
            return this.gcLevel;
        }

        /**
         * @return hitWhiteReason
         */
        public String getHitWhiteReason() {
            return this.hitWhiteReason;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userSite
         */
        public String getUserSite() {
            return this.userSite;
        }

        /**
         * @return whiteUser
         */
        public Boolean getWhiteUser() {
            return this.whiteUser;
        }

        public static final class Builder {
            private String gcLevel; 
            private String hitWhiteReason; 
            private String userId; 
            private String userSite; 
            private Boolean whiteUser; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.gcLevel = model.gcLevel;
                this.hitWhiteReason = model.hitWhiteReason;
                this.userId = model.userId;
                this.userSite = model.userSite;
                this.whiteUser = model.whiteUser;
            } 

            /**
             * GcLevel.
             */
            public Builder gcLevel(String gcLevel) {
                this.gcLevel = gcLevel;
                return this;
            }

            /**
             * HitWhiteReason.
             */
            public Builder hitWhiteReason(String hitWhiteReason) {
                this.hitWhiteReason = hitWhiteReason;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserSite.
             */
            public Builder userSite(String userSite) {
                this.userSite = userSite;
                return this;
            }

            /**
             * WhiteUser.
             */
            public Builder whiteUser(Boolean whiteUser) {
                this.whiteUser = whiteUser;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindUserAvailbleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>FindUserAvailbleResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PegCoordinates")
        private java.util.List<PegCoordinates> pegCoordinates;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        private Data(Builder builder) {
            this.pegCoordinates = builder.pegCoordinates;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pegCoordinates
         */
        public java.util.List<PegCoordinates> getPegCoordinates() {
            return this.pegCoordinates;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private java.util.List<PegCoordinates> pegCoordinates; 
            private UserInfo userInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pegCoordinates = model.pegCoordinates;
                this.userInfo = model.userInfo;
            } 

            /**
             * PegCoordinates.
             */
            public Builder pegCoordinates(java.util.List<PegCoordinates> pegCoordinates) {
                this.pegCoordinates = pegCoordinates;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
