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
 * {@link CreateDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDistributionResponseBody</p>
 */
public class CreateDistributionResponseBody extends TeaModel {
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

    private CreateDistributionResponseBody(Builder builder) {
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

    public static CreateDistributionResponseBody create() {
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

        private Builder(CreateDistributionResponseBody model) {
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
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retry is allowed. Valid values:</p>
         * <ul>
         * <li>false: Retry is not allowed.</li>
         * <li>true: Retry is allowed.</li>
         * </ul>
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
         * <p>watermark</p>
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
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is processed synchronously.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public CreateDistributionResponseBody build() {
            return new CreateDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDistributionResponseBody</p>
     */
    public static class CoverImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaterialFileId")
        private String materialFileId;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("SortOrder")
        private Integer sortOrder;

        private CoverImages(Builder builder) {
            this.materialFileId = builder.materialFileId;
            this.ossUrl = builder.ossUrl;
            this.sortOrder = builder.sortOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImages create() {
            return builder().build();
        }

        /**
         * @return materialFileId
         */
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return sortOrder
         */
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        public static final class Builder {
            private String materialFileId; 
            private String ossUrl; 
            private Integer sortOrder; 

            private Builder() {
            } 

            private Builder(CoverImages model) {
                this.materialFileId = model.materialFileId;
                this.ossUrl = model.ossUrl;
                this.sortOrder = model.sortOrder;
            } 

            /**
             * <p>The file ID in the material center.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder materialFileId(String materialFileId) {
                this.materialFileId = materialFileId;
                return this;
            }

            /**
             * <p>The CDN URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://another-bucket.oss-cn-hangzhou.aliyuncs.com/path/to/file3%5C%5C%22%5C%5C%22%60curl">http://another-bucket.oss-cn-hangzhou.aliyuncs.com/path/to/file3\\&quot;\\&quot;`curl</a> YFLd1vS4.popscan.xaliyun.com`\&quot;\&quot;</p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>The sort order number.</p>
             * 
             * <strong>example:</strong>
             * <p>Desc</p>
             */
            public Builder sortOrder(Integer sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            public CoverImages build() {
                return new CoverImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDistributionResponseBody</p>
     */
    public static class Drafts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptStatus")
        private String adaptStatus;

        @com.aliyun.core.annotation.NameInMap("AdaptedContent")
        private String adaptedContent;

        @com.aliyun.core.annotation.NameInMap("AdaptedTitle")
        private String adaptedTitle;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ChannelAccount")
        private String channelAccount;

        @com.aliyun.core.annotation.NameInMap("ChannelAccountName")
        private String channelAccountName;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("CoverImages")
        private java.util.List<CoverImages> coverImages;

        @com.aliyun.core.annotation.NameInMap("DraftId")
        private String draftId;

        @com.aliyun.core.annotation.NameInMap("ExternalId")
        private String externalId;

        @com.aliyun.core.annotation.NameInMap("ExternalUrl")
        private String externalUrl;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("PublishConfig")
        private String publishConfig;

        @com.aliyun.core.annotation.NameInMap("PublishedAt")
        private Long publishedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Drafts(Builder builder) {
            this.adaptStatus = builder.adaptStatus;
            this.adaptedContent = builder.adaptedContent;
            this.adaptedTitle = builder.adaptedTitle;
            this.channel = builder.channel;
            this.channelAccount = builder.channelAccount;
            this.channelAccountName = builder.channelAccountName;
            this.channelName = builder.channelName;
            this.channelType = builder.channelType;
            this.coverImages = builder.coverImages;
            this.draftId = builder.draftId;
            this.externalId = builder.externalId;
            this.externalUrl = builder.externalUrl;
            this.failReason = builder.failReason;
            this.publishConfig = builder.publishConfig;
            this.publishedAt = builder.publishedAt;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Drafts create() {
            return builder().build();
        }

        /**
         * @return adaptStatus
         */
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        /**
         * @return adaptedContent
         */
        public String getAdaptedContent() {
            return this.adaptedContent;
        }

        /**
         * @return adaptedTitle
         */
        public String getAdaptedTitle() {
            return this.adaptedTitle;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return channelAccount
         */
        public String getChannelAccount() {
            return this.channelAccount;
        }

        /**
         * @return channelAccountName
         */
        public String getChannelAccountName() {
            return this.channelAccountName;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return coverImages
         */
        public java.util.List<CoverImages> getCoverImages() {
            return this.coverImages;
        }

        /**
         * @return draftId
         */
        public String getDraftId() {
            return this.draftId;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return externalUrl
         */
        public String getExternalUrl() {
            return this.externalUrl;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return publishConfig
         */
        public String getPublishConfig() {
            return this.publishConfig;
        }

        /**
         * @return publishedAt
         */
        public Long getPublishedAt() {
            return this.publishedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String adaptStatus; 
            private String adaptedContent; 
            private String adaptedTitle; 
            private String channel; 
            private String channelAccount; 
            private String channelAccountName; 
            private String channelName; 
            private String channelType; 
            private java.util.List<CoverImages> coverImages; 
            private String draftId; 
            private String externalId; 
            private String externalUrl; 
            private String failReason; 
            private String publishConfig; 
            private Long publishedAt; 
            private String status; 

            private Builder() {
            } 

            private Builder(Drafts model) {
                this.adaptStatus = model.adaptStatus;
                this.adaptedContent = model.adaptedContent;
                this.adaptedTitle = model.adaptedTitle;
                this.channel = model.channel;
                this.channelAccount = model.channelAccount;
                this.channelAccountName = model.channelAccountName;
                this.channelName = model.channelName;
                this.channelType = model.channelType;
                this.coverImages = model.coverImages;
                this.draftId = model.draftId;
                this.externalId = model.externalId;
                this.externalUrl = model.externalUrl;
                this.failReason = model.failReason;
                this.publishConfig = model.publishConfig;
                this.publishedAt = model.publishedAt;
                this.status = model.status;
            } 

            /**
             * <p>The AI adaptation status. Valid values: NONE, ADAPTING, DONE, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder adaptStatus(String adaptStatus) {
                this.adaptStatus = adaptStatus;
                return this;
            }

            /**
             * <p>The channel-adapted content body.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder adaptedContent(String adaptedContent) {
                this.adaptedContent = adaptedContent;
                return this;
            }

            /**
             * <p>The channel-adapted title.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder adaptedTitle(String adaptedTitle) {
                this.adaptedTitle = adaptedTitle;
                return this;
            }

            /**
             * <p>The channel enumeration value.</p>
             * 
             * <strong>example:</strong>
             * <p>WECHAT</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The publishing account snapshot. For overseas channels, this is the OWLAIS socialAccountNo.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder channelAccount(String channelAccount) {
                this.channelAccount = channelAccount;
                return this;
            }

            /**
             * <p>The display name of the publishing account.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder channelAccountName(String channelAccountName) {
                this.channelAccountName = channelAccountName;
                return this;
            }

            /**
             * <p>The display name of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>ch3</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The channel type. Valid values: DOMESTIC, OVERSEA, and INTERNAL.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The list of channel cover images.</p>
             */
            public Builder coverImages(java.util.List<CoverImages> coverImages) {
                this.coverImages = coverImages;
                return this;
            }

            /**
             * <p>The channel draft ID.</p>
             * 
             * <strong>example:</strong>
             * <p>draft-789</p>
             */
            public Builder draftId(String draftId) {
                this.draftId = draftId;
                return this;
            }

            /**
             * <p>The ID returned by the platform.</p>
             * 
             * <strong>example:</strong>
             * <p>1378080</p>
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * <p>The redirect URL of the platform.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://net-video.mistong.com:10160/api/preview/video/2026/04/15/67603b7c84694e619435e4662e98cb23_20260415095633.mp4">https://net-video.mistong.com:10160/api/preview/video/2026/04/15/67603b7c84694e619435e4662e98cb23_20260415095633.mp4</a></p>
             */
            public Builder externalUrl(String externalUrl) {
                this.externalUrl = externalUrl;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The channel-specific publish configuration in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder publishConfig(String publishConfig) {
                this.publishConfig = publishConfig;
                return this;
            }

            /**
             * <p>The publish time, in millisecond timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder publishedAt(Long publishedAt) {
                this.publishedAt = publishedAt;
                return this;
            }

            /**
             * <p>The status. Valid values: EDITING, PUBLISHING, SUCCESS, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Drafts build() {
                return new Drafts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDistributionResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArticleId")
        private String articleId;

        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Drafts")
        private java.util.List<Drafts> drafts;

        private Module(Builder builder) {
            this.articleId = builder.articleId;
            this.batchId = builder.batchId;
            this.createTime = builder.createTime;
            this.drafts = builder.drafts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return articleId
         */
        public String getArticleId() {
            return this.articleId;
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return drafts
         */
        public java.util.List<Drafts> getDrafts() {
            return this.drafts;
        }

        public static final class Builder {
            private String articleId; 
            private String batchId; 
            private Long createTime; 
            private java.util.List<Drafts> drafts; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.articleId = model.articleId;
                this.batchId = model.batchId;
                this.createTime = model.createTime;
                this.drafts = model.drafts;
            } 

            /**
             * <p>The article ID.</p>
             * 
             * <strong>example:</strong>
             * <p>28733</p>
             */
            public Builder articleId(String articleId) {
                this.articleId = articleId;
                return this;
            }

            /**
             * <p>The distribution batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pcb-uf6dkhq311uxuwo2</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The creation time, in millisecond timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-03 02:05:01</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The list of channel drafts within the batch.</p>
             */
            public Builder drafts(java.util.List<Drafts> drafts) {
                this.drafts = drafts;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
