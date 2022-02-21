// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayInfoRequest} extends {@link RequestModel}
 *
 * <p>PlayInfoRequest</p>
 */
public class PlayInfoRequest extends Request {
    @Query
    @NameInMap("AuthInfo")
    @Validation(required = true)
    private String authInfo;

    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("Formats")
    @Validation(required = true)
    private String formats;

    @Query
    @NameInMap("HlsUriToken")
    private String hlsUriToken;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PlayDomain")
    private String playDomain;

    @Query
    @NameInMap("Rand")
    private String rand;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @Query
    @NameInMap("Terminal")
    private String terminal;

    private PlayInfoRequest(Builder builder) {
        super(builder);
        this.authInfo = builder.authInfo;
        this.authTimeout = builder.authTimeout;
        this.formats = builder.formats;
        this.hlsUriToken = builder.hlsUriToken;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.rand = builder.rand;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.terminal = builder.terminal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return this.formats;
    }

    /**
     * @return hlsUriToken
     */
    public String getHlsUriToken() {
        return this.hlsUriToken;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playDomain
     */
    public String getPlayDomain() {
        return this.playDomain;
    }

    /**
     * @return rand
     */
    public String getRand() {
        return this.rand;
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return terminal
     */
    public String getTerminal() {
        return this.terminal;
    }

    public static final class Builder extends Request.Builder<PlayInfoRequest, Builder> {
        private String authInfo; 
        private Long authTimeout; 
        private String formats; 
        private String hlsUriToken; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String playDomain; 
        private String rand; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String terminal; 

        private Builder() {
            super();
        } 

        private Builder(PlayInfoRequest response) {
            super(response);
            this.authInfo = response.authInfo;
            this.authTimeout = response.authTimeout;
            this.formats = response.formats;
            this.hlsUriToken = response.hlsUriToken;
            this.mediaId = response.mediaId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.playDomain = response.playDomain;
            this.rand = response.rand;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.terminal = response.terminal;
        } 

        /**
         * AuthInfo.
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * AuthTimeout.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * Formats.
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * HlsUriToken.
         */
        public Builder hlsUriToken(String hlsUriToken) {
            this.putQueryParameter("HlsUriToken", hlsUriToken);
            this.hlsUriToken = hlsUriToken;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PlayDomain.
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * Rand.
         */
        public Builder rand(String rand) {
            this.putQueryParameter("Rand", rand);
            this.rand = rand;
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Terminal.
         */
        public Builder terminal(String terminal) {
            this.putQueryParameter("Terminal", terminal);
            this.terminal = terminal;
            return this;
        }

        @Override
        public PlayInfoRequest build() {
            return new PlayInfoRequest(this);
        } 

    } 

}
