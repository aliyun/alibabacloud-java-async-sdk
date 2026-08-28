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
 * {@link RewriteChannelTitleResponseBody} extends {@link TeaModel}
 *
 * <p>RewriteChannelTitleResponseBody</p>
 */
public class RewriteChannelTitleResponseBody extends TeaModel {
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

    private RewriteChannelTitleResponseBody(Builder builder) {
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

    public static RewriteChannelTitleResponseBody create() {
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

        private Builder(RewriteChannelTitleResponseBody model) {
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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * Module.
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
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public RewriteChannelTitleResponseBody build() {
            return new RewriteChannelTitleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RewriteChannelTitleResponseBody} extends {@link TeaModel}
     *
     * <p>RewriteChannelTitleResponseBody</p>
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
             * MaterialFileId.
             */
            public Builder materialFileId(String materialFileId) {
                this.materialFileId = materialFileId;
                return this;
            }

            /**
             * OssUrl.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * SortOrder.
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
     * {@link RewriteChannelTitleResponseBody} extends {@link TeaModel}
     *
     * <p>RewriteChannelTitleResponseBody</p>
     */
    public static class Module extends TeaModel {
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

        private Module(Builder builder) {
            this.adaptStatus = builder.adaptStatus;
            this.adaptedContent = builder.adaptedContent;
            this.adaptedTitle = builder.adaptedTitle;
            this.channel = builder.channel;
            this.channelAccount = builder.channelAccount;
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

        public static Module create() {
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

            private Builder(Module model) {
                this.adaptStatus = model.adaptStatus;
                this.adaptedContent = model.adaptedContent;
                this.adaptedTitle = model.adaptedTitle;
                this.channel = model.channel;
                this.channelAccount = model.channelAccount;
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
             * AdaptStatus.
             */
            public Builder adaptStatus(String adaptStatus) {
                this.adaptStatus = adaptStatus;
                return this;
            }

            /**
             * AdaptedContent.
             */
            public Builder adaptedContent(String adaptedContent) {
                this.adaptedContent = adaptedContent;
                return this;
            }

            /**
             * AdaptedTitle.
             */
            public Builder adaptedTitle(String adaptedTitle) {
                this.adaptedTitle = adaptedTitle;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * ChannelAccount.
             */
            public Builder channelAccount(String channelAccount) {
                this.channelAccount = channelAccount;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * CoverImages.
             */
            public Builder coverImages(java.util.List<CoverImages> coverImages) {
                this.coverImages = coverImages;
                return this;
            }

            /**
             * DraftId.
             */
            public Builder draftId(String draftId) {
                this.draftId = draftId;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * ExternalUrl.
             */
            public Builder externalUrl(String externalUrl) {
                this.externalUrl = externalUrl;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * PublishConfig.
             */
            public Builder publishConfig(String publishConfig) {
                this.publishConfig = publishConfig;
                return this;
            }

            /**
             * PublishedAt.
             */
            public Builder publishedAt(Long publishedAt) {
                this.publishedAt = publishedAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
