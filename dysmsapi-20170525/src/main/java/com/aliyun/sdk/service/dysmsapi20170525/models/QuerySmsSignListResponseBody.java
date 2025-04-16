// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
    private java.util.List<SmsSignList> smsSignList;

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
    public java.util.List<SmsSignList> getSmsSignList() {
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
        private java.util.List<SmsSignList> smsSignList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QuerySmsSignListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.smsSignList = model.smsSignList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of signatures per page. Valid values: <strong>1 to 50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried message signatures.</p>
         */
        public Builder smsSignList(java.util.List<SmsSignList> smsSignList) {
            this.smsSignList = smsSignList;
            return this;
        }

        /**
         * <p>The total number of signatures.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySmsSignListResponseBody build() {
            return new QuerySmsSignListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSignListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Reason model) {
                this.rejectDate = model.rejectDate;
                this.rejectInfo = model.rejectInfo;
                this.rejectSubInfo = model.rejectSubInfo;
            } 

            /**
             * <p>The time when the signature was rejected. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-08 19:02:13</p>
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * <p>The reason why the signature was rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * <p>The remarks about the rejection.</p>
             * 
             * <strong>example:</strong>
             * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
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
    /**
     * 
     * {@link QuerySmsSignListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignListResponseBody</p>
     */
    public static class SmsSignList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterId")
        private String authorizationLetterId;

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

        @com.aliyun.core.annotation.NameInMap("authorizationLetterAuditPass")
        private Boolean authorizationLetterAuditPass;

        private SmsSignList(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.authorizationLetterId = builder.authorizationLetterId;
            this.businessType = builder.businessType;
            this.createDate = builder.createDate;
            this.orderId = builder.orderId;
            this.reason = builder.reason;
            this.signName = builder.signName;
            this.authorizationLetterAuditPass = builder.authorizationLetterAuditPass;
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
         * @return authorizationLetterId
         */
        public String getAuthorizationLetterId() {
            return this.authorizationLetterId;
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

        /**
         * @return authorizationLetterAuditPass
         */
        public Boolean getAuthorizationLetterAuditPass() {
            return this.authorizationLetterAuditPass;
        }

        public static final class Builder {
            private String auditStatus; 
            private String authorizationLetterId; 
            private String businessType; 
            private String createDate; 
            private String orderId; 
            private Reason reason; 
            private String signName; 
            private Boolean authorizationLetterAuditPass; 

            private Builder() {
            } 

            private Builder(SmsSignList model) {
                this.auditStatus = model.auditStatus;
                this.authorizationLetterId = model.authorizationLetterId;
                this.businessType = model.businessType;
                this.createDate = model.createDate;
                this.orderId = model.orderId;
                this.reason = model.reason;
                this.signName = model.signName;
                this.authorizationLetterAuditPass = model.authorizationLetterAuditPass;
            } 

            /**
             * <p>The approval status of the signature. Valid values:</p>
             * <ul>
             * <li><strong>AUDIT_STATE_INIT</strong>: The signature is pending approval.</li>
             * <li><strong>AUDIT_STATE_PASS</strong>: The signature is approved.</li>
             * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The signature is rejected. You can view the reason in the Reason response parameter.</li>
             * <li><strong>AUDIT_STATE_CANCEL</strong>: The approval is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIT_STATE_NOT_PASS</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AuthorizationLetterId.
             */
            public Builder authorizationLetterId(String authorizationLetterId) {
                this.authorizationLetterId = authorizationLetterId;
                return this;
            }

            /**
             * <p>The type of the signature scenario. The return value ends with &quot;type&quot;. Valid values:</p>
             * <ul>
             * <li>Verification code type</li>
             * <li>General-purpose type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Verification code type</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The time when the signature was created. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-08 16:44:13</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The ticket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>236****5</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The approval remarks.</p>
             * <ul>
             * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
             * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the signature is rejected is returned.</li>
             * </ul>
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The name of the signature.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * authorizationLetterAuditPass.
             */
            public Builder authorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
                this.authorizationLetterAuditPass = authorizationLetterAuditPass;
                return this;
            }

            public SmsSignList build() {
                return new SmsSignList(this);
            } 

        } 

    }
}
