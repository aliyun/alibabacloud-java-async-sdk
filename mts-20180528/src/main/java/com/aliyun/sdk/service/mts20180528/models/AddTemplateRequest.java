// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddTemplateRequest</p>
 */
public class AddTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audio")
    private String audio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Container")
    private String container;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuxConfig")
    private String muxConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransConfig")
    private String transConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Video")
    private String video;

    private AddTemplateRequest(Builder builder) {
        super(builder);
        this.audio = builder.audio;
        this.container = builder.container;
        this.muxConfig = builder.muxConfig;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transConfig = builder.transConfig;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audio
     */
    public String getAudio() {
        return this.audio;
    }

    /**
     * @return container
     */
    public String getContainer() {
        return this.container;
    }

    /**
     * @return muxConfig
     */
    public String getMuxConfig() {
        return this.muxConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return transConfig
     */
    public String getTransConfig() {
        return this.transConfig;
    }

    /**
     * @return video
     */
    public String getVideo() {
        return this.video;
    }

    public static final class Builder extends Request.Builder<AddTemplateRequest, Builder> {
        private String audio; 
        private String container; 
        private String muxConfig; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transConfig; 
        private String video; 

        private Builder() {
            super();
        } 

        private Builder(AddTemplateRequest request) {
            super(request);
            this.audio = request.audio;
            this.container = request.container;
            this.muxConfig = request.muxConfig;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transConfig = request.transConfig;
            this.video = request.video;
        } 

        /**
         * Audio.
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * Container.
         */
        public Builder container(String container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * MuxConfig.
         */
        public Builder muxConfig(String muxConfig) {
            this.putQueryParameter("MuxConfig", muxConfig);
            this.muxConfig = muxConfig;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * TransConfig.
         */
        public Builder transConfig(String transConfig) {
            this.putQueryParameter("TransConfig", transConfig);
            this.transConfig = transConfig;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(String video) {
            this.putQueryParameter("Video", video);
            this.video = video;
            return this;
        }

        @Override
        public AddTemplateRequest build() {
            return new AddTemplateRequest(this);
        } 

    } 

}
