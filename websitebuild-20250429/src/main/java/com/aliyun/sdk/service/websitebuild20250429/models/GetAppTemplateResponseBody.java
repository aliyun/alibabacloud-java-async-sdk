// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppTemplateResponseBody</p>
 */
public class GetAppTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private GetAppTemplateResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(GetAppTemplateResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The access denial details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether a retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>ish-intelligence-store-platform-admin-web</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the value of the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>Indicates whether the deletion was successful.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The root error message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetAppTemplateResponseBody build() {
            return new GetAppTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppTemplateResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("ColorScheme")
        private String colorScheme;

        @com.aliyun.core.annotation.NameInMap("ColorSchemeName")
        private String colorSchemeName;

        @com.aliyun.core.annotation.NameInMap("CopyCount")
        private Integer copyCount;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LikeCount")
        private Integer likeCount;

        @com.aliyun.core.annotation.NameInMap("Liked")
        private Boolean liked;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("ShareCount")
        private Integer shareCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
        private String thumbnailUrl;

        @com.aliyun.core.annotation.NameInMap("ViewCount")
        private Integer viewCount;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Module(Builder builder) {
            this.appType = builder.appType;
            this.bizId = builder.bizId;
            this.colorScheme = builder.colorScheme;
            this.colorSchemeName = builder.colorSchemeName;
            this.copyCount = builder.copyCount;
            this.creator = builder.creator;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.id = builder.id;
            this.industry = builder.industry;
            this.industryName = builder.industryName;
            this.lastModifier = builder.lastModifier;
            this.likeCount = builder.likeCount;
            this.liked = builder.liked;
            this.metadata = builder.metadata;
            this.previewUrl = builder.previewUrl;
            this.productVersion = builder.productVersion;
            this.productVersionName = builder.productVersionName;
            this.shareCount = builder.shareCount;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.thumbnailUrl = builder.thumbnailUrl;
            this.viewCount = builder.viewCount;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return colorScheme
         */
        public String getColorScheme() {
            return this.colorScheme;
        }

        /**
         * @return colorSchemeName
         */
        public String getColorSchemeName() {
            return this.colorSchemeName;
        }

        /**
         * @return copyCount
         */
        public Integer getCopyCount() {
            return this.copyCount;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return likeCount
         */
        public Integer getLikeCount() {
            return this.likeCount;
        }

        /**
         * @return liked
         */
        public Boolean getLiked() {
            return this.liked;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return shareCount
         */
        public Integer getShareCount() {
            return this.shareCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return thumbnailUrl
         */
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /**
         * @return viewCount
         */
        public Integer getViewCount() {
            return this.viewCount;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String appType; 
            private String bizId; 
            private String colorScheme; 
            private String colorSchemeName; 
            private Integer copyCount; 
            private String creator; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private Long id; 
            private String industry; 
            private String industryName; 
            private String lastModifier; 
            private Integer likeCount; 
            private Boolean liked; 
            private String metadata; 
            private String previewUrl; 
            private String productVersion; 
            private String productVersionName; 
            private Integer shareCount; 
            private String status; 
            private String templateId; 
            private String templateName; 
            private String thumbnailUrl; 
            private Integer viewCount; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.appType = model.appType;
                this.bizId = model.bizId;
                this.colorScheme = model.colorScheme;
                this.colorSchemeName = model.colorSchemeName;
                this.copyCount = model.copyCount;
                this.creator = model.creator;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.id = model.id;
                this.industry = model.industry;
                this.industryName = model.industryName;
                this.lastModifier = model.lastModifier;
                this.likeCount = model.likeCount;
                this.liked = model.liked;
                this.metadata = model.metadata;
                this.previewUrl = model.previewUrl;
                this.productVersion = model.productVersion;
                this.productVersionName = model.productVersionName;
                this.shareCount = model.shareCount;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.thumbnailUrl = model.thumbnailUrl;
                this.viewCount = model.viewCount;
                this.weight = model.weight;
            } 

            /**
             * <p>The application type.</p>
             * 
             * <strong>example:</strong>
             * <p>TRACE</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>WD20250703155602000001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The color scheme.</p>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder colorScheme(String colorScheme) {
                this.colorScheme = colorScheme;
                return this;
            }

            /**
             * <p>The color scheme name.</p>
             * 
             * <strong>example:</strong>
             * <p>red</p>
             */
            public Builder colorSchemeName(String colorSchemeName) {
                this.colorSchemeName = colorSchemeName;
                return this;
            }

            /**
             * <p>The actual amount of data copied from the original table during a DMS lock-free schema change.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder copyCount(Integer copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * <p>The user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>208614160512124381</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time in UTC. The date format follows ISO 8601.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-04T01:40:25Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The modification time in ISO 8601 format. The time zone is UTC (Z).</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-05T11:16:57.785Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>16257</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry. Default value: <strong>common</strong> (general industry). Valid values:</p>
             * <ul>
             * <li><p><strong>microVideo</strong>: short video industry.</p>
             * </li>
             * <li><p><strong>common</strong>: general industry.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>indextry</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>The last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>The number of likes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder likeCount(Integer likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            /**
             * <p>Indicates whether the current user has liked the template.</p>
             */
            public Builder liked(Boolean liked) {
                this.liked = liked;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>The metadata map of the text chunk.</p>
             * <blockquote>
             * <p>The <code>file_path</code> field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving a document search knowledge base, if a chunk contains images, the image URL is returned in the <code>image_url</code> field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <p>The metadata map of the text chunk.</p>
             * <blockquote>
             * <p>The <code>file_path</code> field in the metadata map of a document search knowledge base is meaningless. Do not use it in your business code.</p>
             * </blockquote>
             * <blockquote>
             * <p>When retrieving a document search knowledge base, if a chunk contains images, the image URL is returned in the <code>image_url</code> field of the metadata map, along with an expiration time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;operations\&quot;:[{\&quot;operator\&quot;:\&quot;replace\&quot;,\&quot;oldMetaName\&quot;:\&quot;character2_add\&quot;,\&quot;newMetaType\&quot;:\&quot;varchar(2)\&quot;}]}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The preview URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://preview-lyj.aliyuncs.com/preview/4825a3849c2e49e1b48804c7f90b766f?subSceneIds=807648">https://preview-lyj.aliyuncs.com/preview/4825a3849c2e49e1b48804c7f90b766f?subSceneIds=807648</a></p>
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * <p>The product version. Valid values:</p>
             * <ul>
             * <li><strong>BasicVersion</strong>: Basic edition.</li>
             * <li><strong>EnterpriseVersion</strong>: Enterprise edition.<blockquote>
             * <p>This parameter is required only when ProductForm is set to IntegrationForm.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>V2</p>
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * <p>The edition name.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.2</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The number of shares.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder shareCount(Integer shareCount) {
                this.shareCount = shareCount;
                return this;
            }

            /**
             * <p>trial,draft,live,refunded,expired,released</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7cc17da1-b670-4be7-a6b4-0b3cdf7bf5f7</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>siemProtect_All_</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The application thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p>placeHolder</p>
             */
            public Builder thumbnailUrl(String thumbnailUrl) {
                this.thumbnailUrl = thumbnailUrl;
                return this;
            }

            /**
             * <p>The number of views.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder viewCount(Integer viewCount) {
                this.viewCount = viewCount;
                return this;
            }

            /**
             * <p>The weight of the hot word. Valid values: integers in the range of [1, 5].
             * Common value: 4.
             * If the effect is not obvious, increase the weight as needed. However, an excessively large weight may cause negative effects and lead to inaccurate recognition of other words.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
