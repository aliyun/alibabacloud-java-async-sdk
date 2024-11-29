// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CouponApprovalStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>CouponApprovalStatusListResponseBody</p>
 */
public class CouponApprovalStatusListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private CouponApprovalStatusListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CouponApprovalStatusListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public CouponApprovalStatusListResponseBody build() {
            return new CouponApprovalStatusListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CouponApprovalStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>CouponApprovalStatusListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssuerAccount")
        private String issuerAccount;

        @com.aliyun.core.annotation.NameInMap("IssuerUid")
        private String issuerUid;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateStatus")
        private Long templateStatus;

        @com.aliyun.core.annotation.NameInMap("TimeOfRequest")
        private String timeOfRequest;

        private Data(Builder builder) {
            this.issuerAccount = builder.issuerAccount;
            this.issuerUid = builder.issuerUid;
            this.note = builder.note;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateStatus = builder.templateStatus;
            this.timeOfRequest = builder.timeOfRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return issuerAccount
         */
        public String getIssuerAccount() {
            return this.issuerAccount;
        }

        /**
         * @return issuerUid
         */
        public String getIssuerUid() {
            return this.issuerUid;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateStatus
         */
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        /**
         * @return timeOfRequest
         */
        public String getTimeOfRequest() {
            return this.timeOfRequest;
        }

        public static final class Builder {
            private String issuerAccount; 
            private String issuerUid; 
            private String note; 
            private String templateId; 
            private String templateName; 
            private Long templateStatus; 
            private String timeOfRequest; 

            /**
             * IssuerAccount.
             */
            public Builder issuerAccount(String issuerAccount) {
                this.issuerAccount = issuerAccount;
                return this;
            }

            /**
             * IssuerUid.
             */
            public Builder issuerUid(String issuerUid) {
                this.issuerUid = issuerUid;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateStatus.
             */
            public Builder templateStatus(Long templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * TimeOfRequest.
             */
            public Builder timeOfRequest(String timeOfRequest) {
                this.timeOfRequest = timeOfRequest;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
