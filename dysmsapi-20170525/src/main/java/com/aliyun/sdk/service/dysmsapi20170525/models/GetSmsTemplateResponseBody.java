// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsTemplateResponseBody create() {
        return builder().build();
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

        /**
         * ApplyScene.
         */
        public Builder applyScene(String applyScene) {
            this.applyScene = applyScene;
            return this;
        }

        /**
         * AuditInfo.
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * FileUrlList.
         */
        public Builder fileUrlList(FileUrlList fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }

        /**
         * IntlType.
         */
        public Builder intlType(Integer intlType) {
            this.intlType = intlType;
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
         * MoreDataFileUrlList.
         */
        public Builder moreDataFileUrlList(MoreDataFileUrlList moreDataFileUrlList) {
            this.moreDataFileUrlList = moreDataFileUrlList;
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
         * RelatedSignName.
         */
        public Builder relatedSignName(String relatedSignName) {
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
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
        public Builder templateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * TemplateTag.
         */
        public Builder templateTag(Integer templateTag) {
            this.templateTag = templateTag;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        /**
         * VariableAttribute.
         */
        public Builder variableAttribute(String variableAttribute) {
            this.variableAttribute = variableAttribute;
            return this;
        }

        public GetSmsTemplateResponseBody build() {
            return new GetSmsTemplateResponseBody(this);
        } 

    } 

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

            /**
             * AuditDate.
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * RejectInfo.
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
    public static class FileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private java.util.List < String > fileUrl;

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
        public java.util.List < String > getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private java.util.List < String > fileUrl; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(java.util.List < String > fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FileUrlList build() {
                return new FileUrlList(this);
            } 

        } 

    }
    public static class MoreDataFileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MoreDataFileUrl")
        private java.util.List < String > moreDataFileUrl;

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
        public java.util.List < String > getMoreDataFileUrl() {
            return this.moreDataFileUrl;
        }

        public static final class Builder {
            private java.util.List < String > moreDataFileUrl; 

            /**
             * MoreDataFileUrl.
             */
            public Builder moreDataFileUrl(java.util.List < String > moreDataFileUrl) {
                this.moreDataFileUrl = moreDataFileUrl;
                return this;
            }

            public MoreDataFileUrlList build() {
                return new MoreDataFileUrlList(this);
            } 

        } 

    }
}
