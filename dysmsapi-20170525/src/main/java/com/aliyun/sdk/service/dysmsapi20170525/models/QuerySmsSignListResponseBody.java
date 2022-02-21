// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignListResponseBody</p>
 */
public class QuerySmsSignListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmsSignList")
    private java.util.List < SmsSignList> smsSignList;

    private QuerySmsSignListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.smsSignList = builder.smsSignList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsSignList
     */
    public java.util.List < SmsSignList> getSmsSignList() {
        return this.smsSignList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < SmsSignList> smsSignList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmsSignList.
         */
        public Builder smsSignList(java.util.List < SmsSignList> smsSignList) {
            this.smsSignList = smsSignList;
            return this;
        }

        public QuerySmsSignListResponseBody build() {
            return new QuerySmsSignListResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @NameInMap("RejectDate")
        private String rejectDate;

        @NameInMap("RejectInfo")
        private String rejectInfo;

        @NameInMap("RejectSubInfo")
        private String rejectSubInfo;

        private Reason(Builder builder) {
            this.rejectDate = builder.rejectDate;
            this.rejectInfo = builder.rejectInfo;
            this.rejectSubInfo = builder.rejectSubInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reason create() {
            return builder().build();
        }

        /**
         * @return rejectDate
         */
        public String getRejectDate() {
            return this.rejectDate;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        /**
         * @return rejectSubInfo
         */
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

        public static final class Builder {
            private String rejectDate; 
            private String rejectInfo; 
            private String rejectSubInfo; 

            /**
             * RejectDate.
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * RejectInfo.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * RejectSubInfo.
             */
            public Builder rejectSubInfo(String rejectSubInfo) {
                this.rejectSubInfo = rejectSubInfo;
                return this;
            }

            public Reason build() {
                return new Reason(this);
            } 

        } 

    }
    public static class SmsSignList extends TeaModel {
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("Reason")
        private Reason reason;

        @NameInMap("SignName")
        private String signName;

        private SmsSignList(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.businessType = builder.businessType;
            this.createDate = builder.createDate;
            this.orderId = builder.orderId;
            this.reason = builder.reason;
            this.signName = builder.signName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSignList create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return reason
         */
        public Reason getReason() {
            return this.reason;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        public static final class Builder {
            private String auditStatus; 
            private String businessType; 
            private String createDate; 
            private String orderId; 
            private Reason reason; 
            private String signName; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
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
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            public SmsSignList build() {
                return new SmsSignList(this);
            } 

        } 

    }
}
