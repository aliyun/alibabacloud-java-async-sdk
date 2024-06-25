// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignListResponseBody</p>
 */
public class QuerySmsSignListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsSignList")
    private java.util.List < SmsSignList> smsSignList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QuerySmsSignListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smsSignList = builder.smsSignList;
        this.totalCount = builder.totalCount;
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return smsSignList
     */
    public java.util.List < SmsSignList> getSmsSignList() {
        return this.smsSignList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SmsSignList> smsSignList; 
        private Long totalCount; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The number of signatures per page. Valid values: **1 to 50**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried message signatures.
         */
        public Builder smsSignList(java.util.List < SmsSignList> smsSignList) {
            this.smsSignList = smsSignList;
            return this;
        }

        /**
         * The total number of signatures.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySmsSignListResponseBody build() {
            return new QuerySmsSignListResponseBody(this);
        } 

    } 

    public static class Reason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RejectDate")
        private String rejectDate;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        @com.aliyun.core.annotation.NameInMap("RejectSubInfo")
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
             * The time when the signature was rejected. Format: yyyy-MM-dd HH:mm:ss.
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * The reason why the signature was rejected.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * The remarks about the rejection.
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
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private Reason reason;

        @com.aliyun.core.annotation.NameInMap("SignName")
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
             * The approval status of the signature. Valid values:
             * <p>
             * 
             * *   **AUDIT_STATE_INIT**: The signature is pending approval.
             * *   **AUDIT_STATE_PASS**: The signature is approved.
             * *   **AUDIT_STATE_NOT_PASS**: The signature is rejected. You can view the reason in the Reason response parameter.
             * *   **AUDIT_STATE_CANCEL**: The approval is canceled.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * The type of the signature scenario. The return value ends with "type". Valid values:
             * <p>
             * 
             * *   Verification code type
             * *   General-purpose type
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * The time when the signature was created. Format: yyyy-MM-dd HH:mm:ss.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The ticket ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The approval remarks.
             * <p>
             * 
             * *   If the value of AuditStatus is **AUDIT_STATE_PASS** or **AUDIT_STATE_INIT**, the value of Reason is No Approval Remarks.
             * *   If the value of AuditStatus is **AUDIT_STATE_NOT_PASS**, the reason why the signature is rejected is returned.
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The name of the signature.
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
