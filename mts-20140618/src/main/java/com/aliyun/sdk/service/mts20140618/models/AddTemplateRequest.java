// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
         * The audio stream settings. The value must be a JSON object. For more information, see [Audio](~~29253~~).
         * <p>
         * 
         * > If you do not specify this parameter, output files do not contain audio streams. This parameter is required if you want to retain the audio streams.
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * The container format. The value must be a JSON object that contains the Format parameter. If you do not specify this parameter, the transcoded media file is in MP4 format by default. This parameter is required if you want to use the transcoding template to generate media files in other formats. For more information, see [Container](~~29253~~).
         * <p>
         * 
         * *   Default value: MP4.
         * *   Video transcoding supports the following formats: FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).
         * 
         * > If the container format is FLV, the video codec cannot be set to H.265.
         * 
         * *   Audio transcoding supports the following formats: MP3, MP4, OGG, FLAC, and M4A.
         * *   Image transcoding supports the GIF and WebP formats.
         * 
         * > 
         * 
         * *   If the container format is GIF, the video codec must be set to GIF.
         * 
         * *   If the container format is WebP, the video codec must be set to WebP.
         */
        public Builder container(String container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * The segment settings. The value must be a JSON object. For more information, see [MuxConfig](~~29253~~). If you do not specify this parameter, media segment files are not generated. This parameter is required if you want to generate media segment files.
         */
        public Builder muxConfig(String muxConfig) {
            this.putQueryParameter("MuxConfig", muxConfig);
            this.muxConfig = muxConfig;
            return this;
        }

        /**
         * The name of the transcoding template. The name can be up to 128 bytes in length.
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
         * The general transcoding settings. The value must be a JSON object. For more information, see [TransConfig](~~29253~~). If you do not specify this parameter, the default settings are used. This parameter is required if the default settings cannot meet your business requirements.
         */
        public Builder transConfig(String transConfig) {
            this.putQueryParameter("TransConfig", transConfig);
            this.transConfig = transConfig;
            return this;
        }

        /**
         * The video stream settings. The value must be a JSON object. For more information, see [Video](~~29253~~).
         * <p>
         * 
         * > If you do not specify this parameter, output files do not contain video streams. This parameter is required if you want to retain the video streams.
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
