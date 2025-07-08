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
 * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTemplateByCodeNewResponseBody</p>
 */
public class QuerySmsTemplateByCodeNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("ApplicationScene")
    private ApplicationScene applicationScene;

    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.NameInMap("AuditRemarkInfo")
    private String auditRemarkInfo;

    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("FileIds")
    private FileIds fileIds;

    @com.aliyun.core.annotation.NameInMap("FileUrlList")
    private FileUrlList fileUrlList;

    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
    private String gmtCreateStr;

    @com.aliyun.core.annotation.NameInMap("IntlType")
    private Integer intlType;

    @com.aliyun.core.annotation.NameInMap("MoreDataFileIds")
    private MoreDataFileIds moreDataFileIds;

    @com.aliyun.core.annotation.NameInMap("MoreDataFileUrls")
    private MoreDataFileUrls moreDataFileUrls;

    @com.aliyun.core.annotation.NameInMap("MoreDataOssKeys")
    private MoreDataOssKeys moreDataOssKeys;

    @com.aliyun.core.annotation.NameInMap("NeedAuthorized")
    private Boolean needAuthorized;

    @com.aliyun.core.annotation.NameInMap("OpenTag")
    private Boolean openTag;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private OssKeys ossKeys;

    @com.aliyun.core.annotation.NameInMap("ProductUrl")
    private String productUrl;

    @com.aliyun.core.annotation.NameInMap("RelatedSignName")
    private String relatedSignName;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RmdTemplateId")
    private Integer rmdTemplateId;

    @com.aliyun.core.annotation.NameInMap("RmdTemplateVariableNum")
    private Integer rmdTemplateVariableNum;

    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.NameInMap("SignType")
    private Integer signType;

    @com.aliyun.core.annotation.NameInMap("SmsContent")
    private String smsContent;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    private QuerySmsTemplateByCodeNewResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.applicationScene = builder.applicationScene;
        this.auditInfo = builder.auditInfo;
        this.auditRemarkInfo = builder.auditRemarkInfo;
        this.bizType = builder.bizType;
        this.fileIds = builder.fileIds;
        this.fileUrlList = builder.fileUrlList;
        this.from = builder.from;
        this.gmtCreateStr = builder.gmtCreateStr;
        this.intlType = builder.intlType;
        this.moreDataFileIds = builder.moreDataFileIds;
        this.moreDataFileUrls = builder.moreDataFileUrls;
        this.moreDataOssKeys = builder.moreDataOssKeys;
        this.needAuthorized = builder.needAuthorized;
        this.openTag = builder.openTag;
        this.orderId = builder.orderId;
        this.ossKeys = builder.ossKeys;
        this.productUrl = builder.productUrl;
        this.relatedSignName = builder.relatedSignName;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.rmdTemplateId = builder.rmdTemplateId;
        this.rmdTemplateVariableNum = builder.rmdTemplateVariableNum;
        this.signName = builder.signName;
        this.signType = builder.signType;
        this.smsContent = builder.smsContent;
        this.tags = builder.tags;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsTemplateByCodeNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return applicationScene
     */
    public ApplicationScene getApplicationScene() {
        return this.applicationScene;
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return fileIds
     */
    public FileIds getFileIds() {
        return this.fileIds;
    }

    /**
     * @return fileUrlList
     */
    public FileUrlList getFileUrlList() {
        return this.fileUrlList;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return gmtCreateStr
     */
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    /**
     * @return intlType
     */
    public Integer getIntlType() {
        return this.intlType;
    }

    /**
     * @return moreDataFileIds
     */
    public MoreDataFileIds getMoreDataFileIds() {
        return this.moreDataFileIds;
    }

    /**
     * @return moreDataFileUrls
     */
    public MoreDataFileUrls getMoreDataFileUrls() {
        return this.moreDataFileUrls;
    }

    /**
     * @return moreDataOssKeys
     */
    public MoreDataOssKeys getMoreDataOssKeys() {
        return this.moreDataOssKeys;
    }

    /**
     * @return needAuthorized
     */
    public Boolean getNeedAuthorized() {
        return this.needAuthorized;
    }

    /**
     * @return openTag
     */
    public Boolean getOpenTag() {
        return this.openTag;
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
     * @return productUrl
     */
    public String getProductUrl() {
        return this.productUrl;
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
     * @return rmdTemplateId
     */
    public Integer getRmdTemplateId() {
        return this.rmdTemplateId;
    }

    /**
     * @return rmdTemplateVariableNum
     */
    public Integer getRmdTemplateVariableNum() {
        return this.rmdTemplateVariableNum;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
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
        private String accessToken; 
        private ApplicationScene applicationScene; 
        private String auditInfo; 
        private String auditRemarkInfo; 
        private String bizType; 
        private FileIds fileIds; 
        private FileUrlList fileUrlList; 
        private String from; 
        private String gmtCreateStr; 
        private Integer intlType; 
        private MoreDataFileIds moreDataFileIds; 
        private MoreDataFileUrls moreDataFileUrls; 
        private MoreDataOssKeys moreDataOssKeys; 
        private Boolean needAuthorized; 
        private Boolean openTag; 
        private String orderId; 
        private OssKeys ossKeys; 
        private String productUrl; 
        private String relatedSignName; 
        private String remark; 
        private String requestId; 
        private Integer rmdTemplateId; 
        private Integer rmdTemplateVariableNum; 
        private String signName; 
        private Integer signType; 
        private String smsContent; 
        private Tags tags; 
        private String templateCode; 
        private String templateName; 
        private String templateRule; 

        private Builder() {
        } 

        private Builder(QuerySmsTemplateByCodeNewResponseBody model) {
            this.accessToken = model.accessToken;
            this.applicationScene = model.applicationScene;
            this.auditInfo = model.auditInfo;
            this.auditRemarkInfo = model.auditRemarkInfo;
            this.bizType = model.bizType;
            this.fileIds = model.fileIds;
            this.fileUrlList = model.fileUrlList;
            this.from = model.from;
            this.gmtCreateStr = model.gmtCreateStr;
            this.intlType = model.intlType;
            this.moreDataFileIds = model.moreDataFileIds;
            this.moreDataFileUrls = model.moreDataFileUrls;
            this.moreDataOssKeys = model.moreDataOssKeys;
            this.needAuthorized = model.needAuthorized;
            this.openTag = model.openTag;
            this.orderId = model.orderId;
            this.ossKeys = model.ossKeys;
            this.productUrl = model.productUrl;
            this.relatedSignName = model.relatedSignName;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.rmdTemplateId = model.rmdTemplateId;
            this.rmdTemplateVariableNum = model.rmdTemplateVariableNum;
            this.signName = model.signName;
            this.signType = model.signType;
            this.smsContent = model.smsContent;
            this.tags = model.tags;
            this.templateCode = model.templateCode;
            this.templateName = model.templateName;
            this.templateRule = model.templateRule;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * ApplicationScene.
         */
        public Builder applicationScene(ApplicationScene applicationScene) {
            this.applicationScene = applicationScene;
            return this;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * FileIds.
         */
        public Builder fileIds(FileIds fileIds) {
            this.fileIds = fileIds;
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
         * From.
         */
        public Builder from(String from) {
            this.from = from;
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
         * IntlType.
         */
        public Builder intlType(Integer intlType) {
            this.intlType = intlType;
            return this;
        }

        /**
         * MoreDataFileIds.
         */
        public Builder moreDataFileIds(MoreDataFileIds moreDataFileIds) {
            this.moreDataFileIds = moreDataFileIds;
            return this;
        }

        /**
         * MoreDataFileUrls.
         */
        public Builder moreDataFileUrls(MoreDataFileUrls moreDataFileUrls) {
            this.moreDataFileUrls = moreDataFileUrls;
            return this;
        }

        /**
         * MoreDataOssKeys.
         */
        public Builder moreDataOssKeys(MoreDataOssKeys moreDataOssKeys) {
            this.moreDataOssKeys = moreDataOssKeys;
            return this;
        }

        /**
         * NeedAuthorized.
         */
        public Builder needAuthorized(Boolean needAuthorized) {
            this.needAuthorized = needAuthorized;
            return this;
        }

        /**
         * OpenTag.
         */
        public Builder openTag(Boolean openTag) {
            this.openTag = openTag;
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
         * ProductUrl.
         */
        public Builder productUrl(String productUrl) {
            this.productUrl = productUrl;
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
         * RmdTemplateId.
         */
        public Builder rmdTemplateId(Integer rmdTemplateId) {
            this.rmdTemplateId = rmdTemplateId;
            return this;
        }

        /**
         * RmdTemplateVariableNum.
         */
        public Builder rmdTemplateVariableNum(Integer rmdTemplateVariableNum) {
            this.rmdTemplateVariableNum = rmdTemplateVariableNum;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.signName = signName;
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

        public QuerySmsTemplateByCodeNewResponseBody build() {
            return new QuerySmsTemplateByCodeNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class ApplicationScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApplicationScene(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationScene create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApplicationScene model) {
                this.content = model.content;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApplicationScene build() {
                return new ApplicationScene(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class FileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private java.util.List<Long> fileId;

        private FileIds(Builder builder) {
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileIds create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private java.util.List<Long> fileId; 

            private Builder() {
            } 

            private Builder(FileIds model) {
                this.fileId = model.fileId;
            } 

            /**
             * FileId.
             */
            public Builder fileId(java.util.List<Long> fileId) {
                this.fileId = fileId;
                return this;
            }

            public FileIds build() {
                return new FileIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
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
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class MoreDataFileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MoreDataFileId")
        private java.util.List<Long> moreDataFileId;

        private MoreDataFileIds(Builder builder) {
            this.moreDataFileId = builder.moreDataFileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoreDataFileIds create() {
            return builder().build();
        }

        /**
         * @return moreDataFileId
         */
        public java.util.List<Long> getMoreDataFileId() {
            return this.moreDataFileId;
        }

        public static final class Builder {
            private java.util.List<Long> moreDataFileId; 

            private Builder() {
            } 

            private Builder(MoreDataFileIds model) {
                this.moreDataFileId = model.moreDataFileId;
            } 

            /**
             * MoreDataFileId.
             */
            public Builder moreDataFileId(java.util.List<Long> moreDataFileId) {
                this.moreDataFileId = moreDataFileId;
                return this;
            }

            public MoreDataFileIds build() {
                return new MoreDataFileIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class MoreDataFileUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MoreDataFileUrl")
        private java.util.List<String> moreDataFileUrl;

        private MoreDataFileUrls(Builder builder) {
            this.moreDataFileUrl = builder.moreDataFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoreDataFileUrls create() {
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

            private Builder(MoreDataFileUrls model) {
                this.moreDataFileUrl = model.moreDataFileUrl;
            } 

            /**
             * MoreDataFileUrl.
             */
            public Builder moreDataFileUrl(java.util.List<String> moreDataFileUrl) {
                this.moreDataFileUrl = moreDataFileUrl;
                return this;
            }

            public MoreDataFileUrls build() {
                return new MoreDataFileUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class MoreDataOssKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MoreDataOssKey")
        private java.util.List<String> moreDataOssKey;

        private MoreDataOssKeys(Builder builder) {
            this.moreDataOssKey = builder.moreDataOssKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoreDataOssKeys create() {
            return builder().build();
        }

        /**
         * @return moreDataOssKey
         */
        public java.util.List<String> getMoreDataOssKey() {
            return this.moreDataOssKey;
        }

        public static final class Builder {
            private java.util.List<String> moreDataOssKey; 

            private Builder() {
            } 

            private Builder(MoreDataOssKeys model) {
                this.moreDataOssKey = model.moreDataOssKey;
            } 

            /**
             * MoreDataOssKey.
             */
            public Builder moreDataOssKey(java.util.List<String> moreDataOssKey) {
                this.moreDataOssKey = moreDataOssKey;
                return this;
            }

            public MoreDataOssKeys build() {
                return new MoreDataOssKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
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
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagInfo(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
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
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TagInfo model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
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

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsTemplateByCodeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTemplateByCodeNewResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagInfo = model.tagInfo;
            } 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
