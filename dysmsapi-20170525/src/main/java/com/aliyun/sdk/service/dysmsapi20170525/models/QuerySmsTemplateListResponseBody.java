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
 * {@link QuerySmsTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateListResponseBody</p>
 */
public class QuerySmsTemplateListResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("SmsTemplateList")
    private java.util.List<SmsTemplateList> smsTemplateList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QuerySmsTemplateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smsTemplateList = builder.smsTemplateList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsTemplateListResponseBody create() {
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
     * @return smsTemplateList
     */
    public java.util.List<SmsTemplateList> getSmsTemplateList() {
        return this.smsTemplateList;
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
        private java.util.List<SmsTemplateList> smsTemplateList; 
        private Long totalCount; 

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
         * <p>The number of templates per page. Valid values: <strong>1 to 50</strong>.</p>
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
         * <p>The queried message templates.</p>
         */
        public Builder smsTemplateList(java.util.List<SmsTemplateList> smsTemplateList) {
            this.smsTemplateList = smsTemplateList;
            return this;
        }

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySmsTemplateListResponseBody build() {
            return new QuerySmsTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateListResponseBody</p>
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

            /**
             * <p>The time when the message template was rejected. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-04 16:01:17</p>
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * <p>The reason why the message template was rejected.</p>
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
     * {@link QuerySmsTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateListResponseBody</p>
     */
    public static class SmsTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OuterTemplateType")
        private Integer outerTemplateType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private Reason reason;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private String templateContent;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        private SmsTemplateList(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.createDate = builder.createDate;
            this.orderId = builder.orderId;
            this.outerTemplateType = builder.outerTemplateType;
            this.reason = builder.reason;
            this.templateCode = builder.templateCode;
            this.templateContent = builder.templateContent;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsTemplateList create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
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
         * @return outerTemplateType
         */
        public Integer getOuterTemplateType() {
            return this.outerTemplateType;
        }

        /**
         * @return reason
         */
        public Reason getReason() {
            return this.reason;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String auditStatus; 
            private String createDate; 
            private String orderId; 
            private Integer outerTemplateType; 
            private Reason reason; 
            private String templateCode; 
            private String templateContent; 
            private String templateName; 
            private Integer templateType; 

            /**
             * <p>The approval status of the message template. Valid values:</p>
             * <ul>
             * <li><strong>AUDIT_STATE_INIT</strong>: The message template is pending approval.</li>
             * <li><strong>AUDIT_STATE_PASS</strong>: The message template is approved.</li>
             * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The message template is rejected. You can view the reason in the Reason response parameter.</li>
             * <li><strong>AUDIT_STATE_CANCEL</strong> or <strong>AUDIT_SATE_CANCEL</strong>: The approval is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIT_STATE_PASS</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>The time when the message template was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-04 11:42:17</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The ticket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2361****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The type of the message template. We recommend that you specify this parameter. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: verification code</li>
             * <li><strong>1</strong>: notification message</li>
             * <li><strong>2</strong>: promotional message</li>
             * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
             * <li><strong>7</strong>: digital message</li>
             * </ul>
             * <blockquote>
             * <p>The template type is the same as the value of the TemplateType parameter in the AddSmsTemplate and ModifySmsTemplate operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outerTemplateType(Integer outerTemplateType) {
                this.outerTemplateType = outerTemplateType;
                return this;
            }

            /**
             * <p>The approval remarks.</p>
             * <ul>
             * <li>If the value of AuditStatus is <strong>AUDIT_STATE_PASS</strong> or <strong>AUDIT_STATE_INIT</strong>, the value of Reason is No Approval Remarks.</li>
             * <li>If the value of AuditStatus is <strong>AUDIT_STATE_NOT_PASS</strong>, the reason why the message template is rejected is returned.</li>
             * </ul>
             */
            public Builder reason(Reason reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the message template.</p>
             * <p>You can log on to the <a href="https://dysms.console.aliyun.com/dysms.htm">Short Message Service (SMS) console</a>, click <strong>Go China</strong> or <strong>Go Globe</strong> in the left-side navigation pane, and then view the template code on the <strong>Templates</strong> tab. You can also call the <a href="https://help.aliyun.com/document_detail/121208.html">AddSmsTemplate</a> operation to obtain the template code.</p>
             * 
             * <strong>example:</strong>
             * <p>SMS_1525***</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The content of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * <p>The name of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun verification code</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of the message template. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: notification message</li>
             * <li><strong>1</strong>: promotional message</li>
             * <li><strong>2</strong>: verification code</li>
             * <li><strong>6</strong>: message sent to countries or regions outside the Chinese mainland</li>
             * <li><strong>7</strong>: digital message</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            public SmsTemplateList build() {
                return new SmsTemplateList(this);
            } 

        } 

    }
}
