// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link CouponApprovalStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>CouponApprovalStatusListResponseBody</p>
 */
public class CouponApprovalStatusListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(CouponApprovalStatusListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.issuerAccount = model.issuerAccount;
                this.issuerUid = model.issuerUid;
                this.note = model.note;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateStatus = model.templateStatus;
                this.timeOfRequest = model.timeOfRequest;
            } 

            /**
             * <p>The issuing account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder issuerAccount(String issuerAccount) {
                this.issuerAccount = issuerAccount;
                return this;
            }

            /**
             * <p>The UID of the issuing account.</p>
             * 
             * <strong>example:</strong>
             * <p>5432738203821334</p>
             */
            public Builder issuerUid(String issuerUid) {
                this.issuerUid = issuerUid;
                return this;
            }

            /**
             * <p>The approval comment.</p>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000101-100040</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the coupon template.</p>
             * 
             * <strong>example:</strong>
             * <p>Template name</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The status of the coupon template. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: application revoked</li>
             * <li><strong>2</strong>: under review</li>
             * <li><strong>3</strong>: review rejected</li>
             * <li><strong>4</strong>: review approved</li>
             * <li><strong>5</strong>: review approved but issuance failed</li>
             * <li><strong>6</strong>: automatically approved</li>
             * <li><strong>7</strong>: automatically approved but issuance failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder templateStatus(Long templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * <p>The application time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-02 09:46:59</p>
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
