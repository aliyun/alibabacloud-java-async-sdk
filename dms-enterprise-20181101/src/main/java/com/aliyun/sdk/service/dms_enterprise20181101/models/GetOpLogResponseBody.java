// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpLogResponseBody</p>
 */
public class GetOpLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OpLogDetails")
    private OpLogDetails opLogDetails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetOpLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.opLogDetails = builder.opLogDetails;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpLogResponseBody create() {
        return builder().build();
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
     * @return opLogDetails
     */
    public OpLogDetails getOpLogDetails() {
        return this.opLogDetails;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private OpLogDetails opLogDetails; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

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
         * OpLogDetails.
         */
        public Builder opLogDetails(OpLogDetails opLogDetails) {
            this.opLogDetails = opLogDetails;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetOpLogResponseBody build() {
            return new GetOpLogResponseBody(this);
        } 

    } 

    public static class OpLogDetail extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Module")
        private String module;

        @NameInMap("OpContent")
        private String opContent;

        @NameInMap("OpTime")
        private String opTime;

        @NameInMap("OpUserId")
        private Long opUserId;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNick")
        private String userNick;

        private OpLogDetail(Builder builder) {
            this.database = builder.database;
            this.module = builder.module;
            this.opContent = builder.opContent;
            this.opTime = builder.opTime;
            this.opUserId = builder.opUserId;
            this.orderId = builder.orderId;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpLogDetail create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return opContent
         */
        public String getOpContent() {
            return this.opContent;
        }

        /**
         * @return opTime
         */
        public String getOpTime() {
            return this.opTime;
        }

        /**
         * @return opUserId
         */
        public Long getOpUserId() {
            return this.opUserId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String database; 
            private String module; 
            private String opContent; 
            private String opTime; 
            private Long opUserId; 
            private Long orderId; 
            private String userId; 
            private String userNick; 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * OpContent.
             */
            public Builder opContent(String opContent) {
                this.opContent = opContent;
                return this;
            }

            /**
             * OpTime.
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * OpUserId.
             */
            public Builder opUserId(Long opUserId) {
                this.opUserId = opUserId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
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
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public OpLogDetail build() {
                return new OpLogDetail(this);
            } 

        } 

    }
    public static class OpLogDetails extends TeaModel {
        @NameInMap("OpLogDetail")
        private java.util.List < OpLogDetail> opLogDetail;

        private OpLogDetails(Builder builder) {
            this.opLogDetail = builder.opLogDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpLogDetails create() {
            return builder().build();
        }

        /**
         * @return opLogDetail
         */
        public java.util.List < OpLogDetail> getOpLogDetail() {
            return this.opLogDetail;
        }

        public static final class Builder {
            private java.util.List < OpLogDetail> opLogDetail; 

            /**
             * OpLogDetail.
             */
            public Builder opLogDetail(java.util.List < OpLogDetail> opLogDetail) {
                this.opLogDetail = opLogDetail;
                return this;
            }

            public OpLogDetails build() {
                return new OpLogDetails(this);
            } 

        } 

    }
}
