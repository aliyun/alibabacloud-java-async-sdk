// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryDigitalTemplateDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDigitalTemplateDetailNewResponseBody</p>
 */
public class QueryDigitalTemplateDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.NameInMap("AuditRemarkInfo")
    private String auditRemarkInfo;

    @com.aliyun.core.annotation.NameInMap("AuditState")
    private String auditState;

    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("ExpireDateStr")
    private String expireDateStr;

    @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
    private String gmtCreateStr;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("IsAnyParam")
    private Boolean isAnyParam;

    @com.aliyun.core.annotation.NameInMap("IsDefaultTemplate")
    private Boolean isDefaultTemplate;

    @com.aliyun.core.annotation.NameInMap("IsRecently")
    private Boolean isRecently;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private OssKeys ossKeys;

    @com.aliyun.core.annotation.NameInMap("PassErrType")
    private String passErrType;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignType")
    private Integer signType;

    @com.aliyun.core.annotation.NameInMap("SmsContent")
    private String smsContent;

    @com.aliyun.core.annotation.NameInMap("SupportVendor")
    private String supportVendor;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    private QueryDigitalTemplateDetailNewResponseBody(Builder builder) {
        this.auditInfo = builder.auditInfo;
        this.auditRemarkInfo = builder.auditRemarkInfo;
        this.auditState = builder.auditState;
        this.bizType = builder.bizType;
        this.expireDateStr = builder.expireDateStr;
        this.gmtCreateStr = builder.gmtCreateStr;
        this.id = builder.id;
        this.isAnyParam = builder.isAnyParam;
        this.isDefaultTemplate = builder.isDefaultTemplate;
        this.isRecently = builder.isRecently;
        this.orderId = builder.orderId;
        this.ossKeys = builder.ossKeys;
        this.passErrType = builder.passErrType;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.signType = builder.signType;
        this.smsContent = builder.smsContent;
        this.supportVendor = builder.supportVendor;
        this.tags = builder.tags;
        this.templateCode = builder.templateCode;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDigitalTemplateDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditInfo
     */
    public String getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return auditRemarkInfo
     */
    public String getAuditRemarkInfo() {
        return this.auditRemarkInfo;
    }

    /**
     * @return auditState
     */
    public String getAuditState() {
        return this.auditState;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return expireDateStr
     */
    public String getExpireDateStr() {
        return this.expireDateStr;
    }

    /**
     * @return gmtCreateStr
     */
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isAnyParam
     */
    public Boolean getIsAnyParam() {
        return this.isAnyParam;
    }

    /**
     * @return isDefaultTemplate
     */
    public Boolean getIsDefaultTemplate() {
        return this.isDefaultTemplate;
    }

    /**
     * @return isRecently
     */
    public Boolean getIsRecently() {
        return this.isRecently;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return ossKeys
     */
    public OssKeys getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return passErrType
     */
    public String getPassErrType() {
        return this.passErrType;
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
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    /**
     * @return smsContent
     */
    public String getSmsContent() {
        return this.smsContent;
    }

    /**
     * @return supportVendor
     */
    public String getSupportVendor() {
        return this.supportVendor;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
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
     * @return templateRule
     */
    public String getTemplateRule() {
        return this.templateRule;
    }

    public static final class Builder {
        private String auditInfo; 
        private String auditRemarkInfo; 
        private String auditState; 
        private String bizType; 
        private String expireDateStr; 
        private String gmtCreateStr; 
        private String id; 
        private Boolean isAnyParam; 
        private Boolean isDefaultTemplate; 
        private Boolean isRecently; 
        private String orderId; 
        private OssKeys ossKeys; 
        private String passErrType; 
        private String remark; 
        private String requestId; 
        private Integer signType; 
        private String smsContent; 
        private String supportVendor; 
        private Tags tags; 
        private String templateCode; 
        private String templateContent; 
        private String templateName; 
        private String templateRule; 

        private Builder() {
        } 

        private Builder(QueryDigitalTemplateDetailNewResponseBody model) {
            this.auditInfo = model.auditInfo;
            this.auditRemarkInfo = model.auditRemarkInfo;
            this.auditState = model.auditState;
            this.bizType = model.bizType;
            this.expireDateStr = model.expireDateStr;
            this.gmtCreateStr = model.gmtCreateStr;
            this.id = model.id;
            this.isAnyParam = model.isAnyParam;
            this.isDefaultTemplate = model.isDefaultTemplate;
            this.isRecently = model.isRecently;
            this.orderId = model.orderId;
            this.ossKeys = model.ossKeys;
            this.passErrType = model.passErrType;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.signType = model.signType;
            this.smsContent = model.smsContent;
            this.supportVendor = model.supportVendor;
            this.tags = model.tags;
            this.templateCode = model.templateCode;
            this.templateContent = model.templateContent;
            this.templateName = model.templateName;
            this.templateRule = model.templateRule;
        } 

        /**
         * AuditInfo.
         */
        public Builder auditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * AuditRemarkInfo.
         */
        public Builder auditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }

        /**
         * AuditState.
         */
        public Builder auditState(String auditState) {
            this.auditState = auditState;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * ExpireDateStr.
         */
        public Builder expireDateStr(String expireDateStr) {
            this.expireDateStr = expireDateStr;
            return this;
        }

        /**
         * GmtCreateStr.
         */
        public Builder gmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * IsAnyParam.
         */
        public Builder isAnyParam(Boolean isAnyParam) {
            this.isAnyParam = isAnyParam;
            return this;
        }

        /**
         * IsDefaultTemplate.
         */
        public Builder isDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }

        /**
         * IsRecently.
         */
        public Builder isRecently(Boolean isRecently) {
            this.isRecently = isRecently;
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
         * OssKeys.
         */
        public Builder ossKeys(OssKeys ossKeys) {
            this.ossKeys = ossKeys;
            return this;
        }

        /**
         * PassErrType.
         */
        public Builder passErrType(String passErrType) {
            this.passErrType = passErrType;
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
         * SignType.
         */
        public Builder signType(Integer signType) {
            this.signType = signType;
            return this;
        }

        /**
         * SmsContent.
         */
        public Builder smsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }

        /**
         * SupportVendor.
         */
        public Builder supportVendor(String supportVendor) {
            this.supportVendor = supportVendor;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
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
         * TemplateRule.
         */
        public Builder templateRule(String templateRule) {
            this.templateRule = templateRule;
            return this;
        }

        public QueryDigitalTemplateDetailNewResponseBody build() {
            return new QueryDigitalTemplateDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDigitalTemplateDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDigitalTemplateDetailNewResponseBody</p>
     */
    public static class OssKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssKey")
        private java.util.List<String> ossKey;

        private OssKeys(Builder builder) {
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssKeys create() {
            return builder().build();
        }

        /**
         * @return ossKey
         */
        public java.util.List<String> getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private java.util.List<String> ossKey; 

            private Builder() {
            } 

            private Builder(OssKeys model) {
                this.ossKey = model.ossKey;
            } 

            /**
             * OssKey.
             */
            public Builder ossKey(java.util.List<String> ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public OssKeys build() {
                return new OssKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDigitalTemplateDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDigitalTemplateDetailNewResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDigitalTemplateDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDigitalTemplateDetailNewResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
