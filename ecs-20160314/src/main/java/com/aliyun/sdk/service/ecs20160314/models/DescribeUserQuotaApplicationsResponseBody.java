// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserQuotaApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserQuotaApplicationsResponseBody</p>
 */
public class DescribeUserQuotaApplicationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("UserQuotaApplications")
    private UserQuotaApplications userQuotaApplications;

    private DescribeUserQuotaApplicationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userQuotaApplications = builder.userQuotaApplications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserQuotaApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return userQuotaApplications
     */
    public UserQuotaApplications getUserQuotaApplications() {
        return this.userQuotaApplications;
    }

    public static final class Builder {
        private String nextToken; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private UserQuotaApplications userQuotaApplications; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UserQuotaApplications.
         */
        public Builder userQuotaApplications(UserQuotaApplications userQuotaApplications) {
            this.userQuotaApplications = userQuotaApplications;
            return this;
        }

        public DescribeUserQuotaApplicationsResponseBody build() {
            return new DescribeUserQuotaApplicationsResponseBody(this);
        } 

    } 

    public static class UserQuotaApplication extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("QuotaType")
        private String quotaType;

        @NameInMap("QuotaValue")
        private Long quotaValue;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        private UserQuotaApplication(Builder builder) {
            this.applicationId = builder.applicationId;
            this.chargeType = builder.chargeType;
            this.comment = builder.comment;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.instanceType = builder.instanceType;
            this.quotaType = builder.quotaType;
            this.quotaValue = builder.quotaValue;
            this.resultCode = builder.resultCode;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserQuotaApplication create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return quotaValue
         */
        public Long getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String applicationId; 
            private String chargeType; 
            private String comment; 
            private String creationTime; 
            private String description; 
            private String expireTime; 
            private String instanceType; 
            private String quotaType; 
            private Long quotaValue; 
            private String resultCode; 
            private String startTime; 
            private String status; 
            private String zoneId; 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * QuotaType.
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * QuotaValue.
             */
            public Builder quotaValue(Long quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public UserQuotaApplication build() {
                return new UserQuotaApplication(this);
            } 

        } 

    }
    public static class UserQuotaApplications extends TeaModel {
        @NameInMap("UserQuotaApplication")
        private java.util.List < UserQuotaApplication> userQuotaApplication;

        private UserQuotaApplications(Builder builder) {
            this.userQuotaApplication = builder.userQuotaApplication;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserQuotaApplications create() {
            return builder().build();
        }

        /**
         * @return userQuotaApplication
         */
        public java.util.List < UserQuotaApplication> getUserQuotaApplication() {
            return this.userQuotaApplication;
        }

        public static final class Builder {
            private java.util.List < UserQuotaApplication> userQuotaApplication; 

            /**
             * UserQuotaApplication.
             */
            public Builder userQuotaApplication(java.util.List < UserQuotaApplication> userQuotaApplication) {
                this.userQuotaApplication = userQuotaApplication;
                return this;
            }

            public UserQuotaApplications build() {
                return new UserQuotaApplications(this);
            } 

        } 

    }
}
