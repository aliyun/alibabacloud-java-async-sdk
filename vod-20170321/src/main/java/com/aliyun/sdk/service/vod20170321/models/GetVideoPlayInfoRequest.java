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
 * {@link GetVideoPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVideoPlayInfoRequest</p>
 */
public class GetVideoPlayInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientTS")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long clientTS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaySign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private GetVideoPlayInfoRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.clientTS = builder.clientTS;
        this.clientVersion = builder.clientVersion;
        this.ownerId = builder.ownerId;
        this.playSign = builder.playSign;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signVersion = builder.signVersion;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoPlayInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return clientTS
     */
    public Long getClientTS() {
        return this.clientTS;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playSign
     */
    public String getPlaySign() {
        return this.playSign;
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
     * @return signVersion
     */
    public String getSignVersion() {
        return this.signVersion;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetVideoPlayInfoRequest, Builder> {
        private String channel; 
        private Long clientTS; 
        private String clientVersion; 
        private Long ownerId; 
        private String playSign; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signVersion; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoPlayInfoRequest request) {
            super(request);
            this.channel = request.channel;
            this.clientTS = request.clientTS;
            this.clientVersion = request.clientVersion;
            this.ownerId = request.ownerId;
            this.playSign = request.playSign;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signVersion = request.signVersion;
            this.videoId = request.videoId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientTS(Long clientTS) {
            this.putQueryParameter("ClientTS", clientTS);
            this.clientTS = clientTS;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
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
         * <p>This parameter is required.</p>
         */
        public Builder playSign(String playSign) {
            this.putQueryParameter("PlaySign", playSign);
            this.playSign = playSign;
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
        public Builder signVersion(String signVersion) {
            this.putQueryParameter("SignVersion", signVersion);
            this.signVersion = signVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetVideoPlayInfoRequest build() {
            return new GetVideoPlayInfoRequest(this);
        } 

    } 

}
