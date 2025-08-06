// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitLiveEditingRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveEditingRequest</p>
 */
public class SubmitLiveEditingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clips")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clips;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetadata")
    private String mediaMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProduceConfig")
    private String produceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitLiveEditingRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clips = builder.clips;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.mediaMetadata = builder.mediaMetadata;
        this.ownerId = builder.ownerId;
        this.produceConfig = builder.produceConfig;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.streamName = builder.streamName;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLiveEditingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clips
     */
    public String getClips() {
        return this.clips;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return mediaMetadata
     */
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return produceConfig
     */
    public String getProduceConfig() {
        return this.produceConfig;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitLiveEditingRequest, Builder> {
        private String appName; 
        private String clips; 
        private String coverURL; 
        private String description; 
        private String domainName; 
        private String mediaMetadata; 
        private Long ownerId; 
        private String produceConfig; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String streamName; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLiveEditingRequest request) {
            super(request);
            this.appName = request.appName;
            this.clips = request.clips;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.domainName = request.domainName;
            this.mediaMetadata = request.mediaMetadata;
            this.ownerId = request.ownerId;
            this.produceConfig = request.produceConfig;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.streamName = request.streamName;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clips(String clips) {
            this.putQueryParameter("Clips", clips);
            this.clips = clips;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * MediaMetadata.
         */
        public Builder mediaMetadata(String mediaMetadata) {
            this.putQueryParameter("MediaMetadata", mediaMetadata);
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProduceConfig.
         */
        public Builder produceConfig(String produceConfig) {
            this.putQueryParameter("ProduceConfig", produceConfig);
            this.produceConfig = produceConfig;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitLiveEditingRequest build() {
            return new SubmitLiveEditingRequest(this);
        } 

    } 

}
