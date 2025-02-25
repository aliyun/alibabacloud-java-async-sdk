// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MemberAccountDetailPageQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MemberAccountDetailPageQueryResponseBody</p>
 */
public class MemberAccountDetailPageQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private MemberAccountDetailPageQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberAccountDetailPageQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
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

        public MemberAccountDetailPageQueryResponseBody build() {
            return new MemberAccountDetailPageQueryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountBalance")
        private String accountBalance;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private Integer accountType;

        @com.aliyun.core.annotation.NameInMap("ActivityType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("DetailValue")
        private String detailValue;

        @com.aliyun.core.annotation.NameInMap("Extra")
        @com.aliyun.core.annotation.Validation(required = true)
        private String extra;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Data(Builder builder) {
            this.accountBalance = builder.accountBalance;
            this.accountType = builder.accountType;
            this.activityType = builder.activityType;
            this.channelCode = builder.channelCode;
            this.detailValue = builder.detailValue;
            this.extra = builder.extra;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.openMerchantId = builder.openMerchantId;
            this.operateType = builder.operateType;
            this.outerMemberId = builder.outerMemberId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountBalance
         */
        public String getAccountBalance() {
            return this.accountBalance;
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return detailValue
         */
        public String getDetailValue() {
            return this.detailValue;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return outerMemberId
         */
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String accountBalance; 
            private Integer accountType; 
            private String activityType; 
            private String channelCode; 
            private String detailValue; 
            private String extra; 
            private String gmtCreate; 
            private String gmtModified; 
            private String openMerchantId; 
            private String operateType; 
            private String outerMemberId; 
            private String remark; 

            /**
             * AccountBalance.
             */
            public Builder accountBalance(String accountBalance) {
                this.accountBalance = accountBalance;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * ActivityType.
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * DetailValue.
             */
            public Builder detailValue(String detailValue) {
                this.detailValue = detailValue;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * OuterMemberId.
             */
            public Builder outerMemberId(String outerMemberId) {
                this.outerMemberId = outerMemberId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
