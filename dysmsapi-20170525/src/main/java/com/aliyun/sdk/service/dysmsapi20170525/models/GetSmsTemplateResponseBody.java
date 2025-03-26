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
 * {@link GetSmsTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsTemplateResponseBody</p>
 */
public class GetSmsTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyScene")
    private String applyScene;

    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private AuditInfo auditInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("FileUrlList")
    private FileUrlList fileUrlList;

    @com.aliyun.core.annotation.NameInMap("IntlType")
    private Integer intlType;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MoreDataFileUrlList")
    private MoreDataFileUrlList moreDataFileUrlList;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RelatedSignName")
    private String relatedSignName;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private String templateStatus;

    @com.aliyun.core.annotation.NameInMap("TemplateTag")
    private Integer templateTag;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    @com.aliyun.core.annotation.NameInMap("VariableAttribute")
    private String variableAttribute;

    @com.aliyun.core.annotation.NameInMap("VendorAuditStatus")
    private java.util.Map<String, ?> vendorAuditStatus;

    private GetSmsTemplateResponseBody(Builder builder) {
        this.applyScene = builder.applyScene;
        this.auditInfo = builder.auditInfo;
        this.code = builder.code;
        this.createDate = builder.createDate;
        this.fileUrlList = builder.fileUrlList;
        this.intlType = builder.intlType;
        this.message = builder.message;
        this.moreDataFileUrlList = builder.moreDataFileUrlList;
        this.orderId = builder.orderId;
        this.relatedSignName = builder.relatedSignName;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.templateCode = builder.templateCode;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateStatus = builder.templateStatus;
        this.templateTag = builder.templateTag;
        this.templateType = builder.templateType;
        this.variableAttribute = builder.variableAttribute;
        this.vendorAuditStatus = builder.vendorAuditStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyScene
     */
    public String getApplyScene() {
        return this.applyScene;
    }

    /**
     * @return auditInfo
     */
    public AuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return fileUrlList
     */
    public FileUrlList getFileUrlList() {
        return this.fileUrlList;
    }

    /**
     * @return intlType
     */
    public Integer getIntlType() {
        return this.intlType;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return moreDataFileUrlList
     */
    public MoreDataFileUrlList getMoreDataFileUrlList() {
        return this.moreDataFileUrlList;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return relatedSignName
     */
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return templateStatus
     */
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return templateTag
     */
    public Integer getTemplateTag() {
        return this.templateTag;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return variableAttribute
     */
    public String getVariableAttribute() {
        return this.variableAttribute;
    }

    /**
     * @return vendorAuditStatus
     */
    public java.util.Map<String, ?> getVendorAuditStatus() {
        return this.vendorAuditStatus;
    }

    public static final class Builder {
        private String applyScene; 
        private AuditInfo auditInfo; 
        private String code; 
        private String createDate; 
        private FileUrlList fileUrlList; 
        private Integer intlType; 
        private String message; 
        private MoreDataFileUrlList moreDataFileUrlList; 
        private String orderId; 
        private String relatedSignName; 
        private String remark; 
        private String requestId; 
        private String templateCode; 
        private String templateContent; 
        private String templateName; 
        private String templateStatus; 
        private Integer templateTag; 
        private String templateType; 
        private String variableAttribute; 
        private java.util.Map<String, ?> vendorAuditStatus; 

        private Builder() {
        } 

        private Builder(GetSmsTemplateResponseBody model) {
            this.applyScene = model.applyScene;
            this.auditInfo = model.auditInfo;
            this.code = model.code;
            this.createDate = model.createDate;
            this.fileUrlList = model.fileUrlList;
            this.intlType = model.intlType;
            this.message = model.message;
            this.moreDataFileUrlList = model.moreDataFileUrlList;
            this.orderId = model.orderId;
            this.relatedSignName = model.relatedSignName;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.templateCode = model.templateCode;
            this.templateContent = model.templateContent;
            this.templateName = model.templateName;
            this.templateStatus = model.templateStatus;
            this.templateTag = model.templateTag;
            this.templateType = model.templateType;
            this.variableAttribute = model.variableAttribute;
            this.vendorAuditStatus = model.vendorAuditStatus;
        } 

        /**
         * <p>Application scenario content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
         */
        public Builder applyScene(String applyScene) {
            this.applyScene = applyScene;
            return this;
        }

        /**
         * <p>Audit information.</p>
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * <p>Request status code.</p>
         * <ul>
         * <li>OK indicates a successful request.</li>
         * <li>For other error codes, please refer to <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</li>
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
         * <p>The time when the SMS template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 10:02:34</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>File information, compatible with signatures created by the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-addsmstemplate?spm">AddSmsSign</a> API.</p>
         */
        public Builder fileUrlList(FileUrlList fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }

        /**
         * <p>International/Hong Kong, Macao, and Taiwan template type. When the <strong>TemplateType</strong> parameter is <strong>3</strong>, this parameter is required for international/Hong Kong, Macao, and Taiwan templates, with values:</p>
         * <ul>
         * <li><strong>0</strong>: Verification code.</li>
         * <li><strong>1</strong>: SMS notification.</li>
         * <li><strong>2</strong>: Promotional SMS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder intlType(Integer intlType) {
            this.intlType = intlType;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Additional documentation information, supplementing uploaded business proof files or operational screenshots file list.</p>
         */
        public Builder moreDataFileUrlList(MoreDataFileUrlList moreDataFileUrlList) {
            this.moreDataFileUrlList = moreDataFileUrlList;
            return this;
        }

        /**
         * <p>Work order number.</p>
         * <p>This parameter is used by auditors when querying the audit. You need to provide this work order number when requesting expedited review.</p>
         * 
         * <strong>example:</strong>
         * <p>2003019****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The SMS signature associated with the template when applied.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        public Builder relatedSignName(String relatedSignName) {
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * <p>Explanation for the SMS template application, which is one of the reference information for template review.</p>
         * 
         * <strong>example:</strong>
         * <p>申请验证码模板</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting and issue定位.</p>
         * 
         * <strong>example:</strong>
         * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SMS template code.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_20375****</p>
         */
        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Content of the SMS template.</p>
         * 
         * <strong>example:</strong>
         * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
         */
        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>Name of the SMS template.</p>
         * 
         * <strong>example:</strong>
         * <p>验证码</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Template review status. Return values:</p>
         * <ul>
         * <li><strong>0</strong>: Under review.</li>
         * <li><strong>1</strong>: Approved.</li>
         * <li><strong>2</strong>: Not approved, with reasons for failure returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.41fd339f3bPSCQ">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-updatesmstemplate?spm">UpdateSmsTemplate</a> API or modify the SMS template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
         * <li><strong>10</strong>: Review canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder templateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>Template identifier, indicating whether the template is user-defined or system-provided. Values:</p>
         * <ul>
         * <li><p><strong>2</strong>: User-defined template.</p>
         * </li>
         * <li><p><strong>3</strong>: System-provided template.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder templateTag(Integer templateTag) {
            this.templateTag = templateTag;
            return this;
        }

        /**
         * <p>SMS type. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Verification code.</li>
         * <li><strong>1</strong>: SMS notification.</li>
         * <li><strong>2</strong>: Promotional SMS.</li>
         * <li><strong>3</strong>: International/Hong Kong, Macao, and Taiwan messages.</li>
         * </ul>
         * <blockquote>
         * <p>Only enterprise-certified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. For details on the differences between personal and enterprise user rights, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Notes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>Template variable rules.</p>
         * <p>For detailed rules of template variables, refer to the <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example">Example Document</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
         */
        public Builder variableAttribute(String variableAttribute) {
            this.variableAttribute = variableAttribute;
            return this;
        }

        /**
         * VendorAuditStatus.
         */
        public Builder vendorAuditStatus(java.util.Map<String, ?> vendorAuditStatus) {
            this.vendorAuditStatus = vendorAuditStatus;
            return this;
        }

        public GetSmsTemplateResponseBody build() {
            return new GetSmsTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateResponseBody</p>
     */
    public static class AuditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDate")
        private String auditDate;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        private AuditInfo(Builder builder) {
            this.auditDate = builder.auditDate;
            this.rejectInfo = builder.rejectInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditInfo create() {
            return builder().build();
        }

        /**
         * @return auditDate
         */
        public String getAuditDate() {
            return this.auditDate;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public static final class Builder {
            private String auditDate; 
            private String rejectInfo; 

            private Builder() {
            } 

            private Builder(AuditInfo model) {
                this.auditDate = model.auditDate;
                this.rejectInfo = model.rejectInfo;
            } 

            /**
             * <p>Audit date and time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-03 11:20:34</p>
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * <p>Reasons for failed audit.</p>
             * 
             * <strong>example:</strong>
             * <p>模板内容中包含错别字。</p>
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            public AuditInfo build() {
                return new AuditInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmsTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateResponseBody</p>
     */
    public static class FileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private java.util.List<String> fileUrl;

        private FileUrlList(Builder builder) {
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileUrlList create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private java.util.List<String> fileUrl; 

            private Builder() {
            } 

            private Builder(FileUrlList model) {
                this.fileUrl = model.fileUrl;
            } 

            /**
             * FileUrl.
             */
            public Builder fileUrl(java.util.List<String> fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FileUrlList build() {
                return new FileUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmsTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateResponseBody</p>
     */
    public static class MoreDataFileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MoreDataFileUrl")
        private java.util.List<String> moreDataFileUrl;

        private MoreDataFileUrlList(Builder builder) {
            this.moreDataFileUrl = builder.moreDataFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoreDataFileUrlList create() {
            return builder().build();
        }

        /**
         * @return moreDataFileUrl
         */
        public java.util.List<String> getMoreDataFileUrl() {
            return this.moreDataFileUrl;
        }

        public static final class Builder {
            private java.util.List<String> moreDataFileUrl; 

            private Builder() {
            } 

            private Builder(MoreDataFileUrlList model) {
                this.moreDataFileUrl = model.moreDataFileUrl;
            } 

            /**
             * MoreDataFileUrl.
             */
            public Builder moreDataFileUrl(java.util.List<String> moreDataFileUrl) {
                this.moreDataFileUrl = moreDataFileUrl;
                return this;
            }

            public MoreDataFileUrlList build() {
                return new MoreDataFileUrlList(this);
            } 

        } 

    }
}
