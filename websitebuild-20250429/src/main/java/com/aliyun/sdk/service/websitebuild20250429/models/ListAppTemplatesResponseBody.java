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
 * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppTemplatesResponseBody</p>
 */
public class ListAppTemplatesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppTemplatesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppTemplatesResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppTemplatesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The app name.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
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
         * <p>The dynamic message. This parameter is not used and can be ignored.</p>
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
         * <p>The number of results returned per query. Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The token used to start the next query. This parameter is empty if there is no next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>The exception message.</p>
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

        public ListAppTemplatesResponseBody build() {
            return new ListAppTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("IsRecommended")
        private Boolean isRecommended;

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

        private Data(Builder builder) {
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
            this.isRecommended = builder.isRecommended;
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

        public static Data create() {
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
         * @return isRecommended
         */
        public Boolean getIsRecommended() {
            return this.isRecommended;
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
            private Boolean isRecommended; 
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

            private Builder(Data model) {
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
                this.isRecommended = model.isRecommended;
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
             * <p>supabase</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The application instance ID.</p>
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
             * <p>Red</p>
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
             * <p>The actual amount of data copied from the original table during a DMS lock-free change.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder copyCount(Integer copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * <p>The creator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>SOAR</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in ISO 8601 format in UTC (Z).</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-20T02:26:38Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The modification time. The time is a UNIX timestamp in milliseconds.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>1627545952000</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>9953352</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry of the file to be analyzed. Default value: <strong>common</strong> (general industry). Select an appropriate industry so that the backend can match the applicable algorithm combination. Valid values: </p>
             * <ul>
             * <li><strong>microVideo</strong>: short video industry</li>
             * <li><strong>common</strong>: general industry</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOUSE</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>Specifies whether the template is recommended.</p>
             */
            public Builder isRecommended(Boolean isRecommended) {
                this.isRecommended = isRecommended;
                return this;
            }

            /**
             * <p>The last modifier ID.</p>
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
             * <p>Indicates whether the current user has liked the item.</p>
             */
            public Builder liked(Boolean liked) {
                this.liked = liked;
                return this;
            }

            /**
             * <p>The repair action.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;memFrom\&quot;: \&quot;text\&quot;, \&quot;uid\&quot;: \&quot;text\&quot;, \&quot;labels\&quot;: \&quot;jsonb\&quot;, \&quot;content\&quot;: \&quot;text\&quot;, \&quot;fromId\&quot;: \&quot;text\&quot;, \&quot;uuid\&quot;: \&quot;text\&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The preview URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://preview-lyj.aliyuncs.com/preview/b2c5a245c44946b99cf5435210bbb8b8?subSceneIds=728166">https://preview-lyj.aliyuncs.com/preview/b2c5a245c44946b99cf5435210bbb8b8?subSceneIds=728166</a></p>
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * <p>The product version. Valid values:</p>
             * <ul>
             * <li><strong>BasicVersion</strong>: Basic Edition</li>
             * <li><strong>EnterpriseVersion</strong>: Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseVersion</p>
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * <p>The edition name.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
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
             * <p>The file status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>de10bf7d782392a70f293a3b1f7bb8fc</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * <ul>
             * <li>The maximum length is 128 characters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cfdna6</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The application thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppTemplatesResponseBody</p>
     */
    public static class Next extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("IsRecommended")
        private Boolean isRecommended;

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

        private Next(Builder builder) {
            this.appType = builder.appType;
            this.bizId = builder.bizId;
            this.colorScheme = builder.colorScheme;
            this.colorSchemeName = builder.colorSchemeName;
            this.copyCount = builder.copyCount;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.industry = builder.industry;
            this.industryName = builder.industryName;
            this.isRecommended = builder.isRecommended;
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

        public static Next create() {
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return isRecommended
         */
        public Boolean getIsRecommended() {
            return this.isRecommended;
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
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String industry; 
            private String industryName; 
            private Boolean isRecommended; 
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

            private Builder(Next model) {
                this.appType = model.appType;
                this.bizId = model.bizId;
                this.colorScheme = model.colorScheme;
                this.colorSchemeName = model.colorSchemeName;
                this.copyCount = model.copyCount;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.industry = model.industry;
                this.industryName = model.industryName;
                this.isRecommended = model.isRecommended;
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
             * <p>memory</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The bizId of the associated application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WS20260502160409000001</p>
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
             * <p>The actual amount of data copied from the original table during a DMS lock-free change.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder copyCount(Integer copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * <p>The tenant user information.</p>
             * 
             * <strong>example:</strong>
             * <p>208116853206125255</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-17 20:43:21</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-18T10:03:56+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>1000039405002</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry. Default value: <strong>common</strong> (General industry). Valid values:</p>
             * <ul>
             * <li><p><strong>microVideo</strong>: Short video industry.</p>
             * </li>
             * <li><p><strong>common</strong>: General industry.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOUSE</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>Specifies whether the template is recommended.</p>
             */
            public Builder isRecommended(Boolean isRecommended) {
                this.isRecommended = isRecommended;
                return this;
            }

            /**
             * <p>The ID of the last modifier.</p>
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
             * <p>Indicates whether the current user has liked the item.</p>
             */
            public Builder liked(Boolean liked) {
                this.liked = liked;
                return this;
            }

            /**
             * <p>The fix details.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;knowledge_point\&quot;:\&quot;text\&quot;,\&quot;trunk_id\&quot;:\&quot;text\&quot;,\&quot;doc_name\&quot;:\&quot;text\&quot;,\&quot;knowledge_point_id\&quot;:\&quot;text\&quot;,\&quot;doc_id\&quot;:\&quot;text\&quot;,\&quot;trunk_content\&quot;:\&quot;text\&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The preview URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://preview-lyj.aliyuncs.com/preview/b989c9ac526e4fb48e018805f43d5fb1?subSceneIds=816576">https://preview-lyj.aliyuncs.com/preview/b989c9ac526e4fb48e018805f43d5fb1?subSceneIds=816576</a></p>
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * <p>The product version. Valid values:</p>
             * <ul>
             * <li><strong>BasicVersion</strong>: Basic Edition.</li>
             * <li><strong>EnterpriseVersion</strong>: Enterprise Edition.<blockquote>
             * <p>Specify this parameter only when ProductForm is set to IntegrationForm.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BasicVersion</p>
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
             * <p>The status. Valid values: unknown, init, testing, and online.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3802aefc8cb0003b71286c47afc83624</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>iem</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The application thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Next build() {
                return new Next(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppTemplatesResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Next next;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Boolean nextPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Boolean prePage;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Boolean resultLimit;

        @com.aliyun.core.annotation.NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @com.aliyun.core.annotation.NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.data = builder.data;
            this.next = builder.next;
            this.nextPage = builder.nextPage;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.resultLimit = builder.resultLimit;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Next getNext() {
            return this.next;
        }

        /**
         * @return nextPage
         */
        public Boolean getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return prePage
         */
        public Boolean getPrePage() {
            return this.prePage;
        }

        /**
         * @return resultLimit
         */
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List<Data> data; 
            private Next next; 
            private Boolean nextPage; 
            private Integer pageSize; 
            private Boolean prePage; 
            private Boolean resultLimit; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currentPageNum = model.currentPageNum;
                this.data = model.data;
                this.next = model.next;
                this.nextPage = model.nextPage;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.resultLimit = model.resultLimit;
                this.totalItemNum = model.totalItemNum;
                this.totalPageNum = model.totalPageNum;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * <p>The request results.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The decision weight.</p>
             */
            public Builder next(Next next) {
                this.next = next;
                return this;
            }

            /**
             * <p>Indicates whether a next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder nextPage(Boolean nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Indicates whether a previous page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder prePage(Boolean prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * <p>Indicates whether the query result is truncated. In addition to the pagination limit, the server processes a maximum of the latest 1,000 records for the current query. If the number of results exceeds 1,000, <strong>ResultLimit</strong> is set to <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is set to <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder resultLimit(Boolean resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
