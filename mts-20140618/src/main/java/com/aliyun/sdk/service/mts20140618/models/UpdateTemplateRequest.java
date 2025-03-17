// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransConfig")
    private String transConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Video")
    private String video;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.audio = builder.audio;
        this.container = builder.container;
        this.muxConfig = builder.muxConfig;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
        this.transConfig = builder.transConfig;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String audio; 
        private String container; 
        private String muxConfig; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateId; 
        private String transConfig; 
        private String video; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.audio = request.audio;
            this.container = request.container;
            this.muxConfig = request.muxConfig;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
            this.transConfig = request.transConfig;
            this.video = request.video;
        } 

        /**
         * <p>The transmuxing configurations. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">MuxConfig</a> parameter of the &quot;Parameter details&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;aac&quot;,&quot;Samplerate&quot;:&quot;44100&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Channels&quot;:&quot;2&quot;}</p>
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
            return this;
        }

        /**
         * <p>The configurations of the video stream. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Video</a> parameter of the &quot;Parameter details&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Format&quot;:&quot;mp4&quot;}</p>
         */
        public Builder container(String container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * <p>The general transcoding configurations. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">TransConfig</a> parameter of the &quot;Parameter details&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Segment&quot;:{&quot;Duration&quot;:&quot;10&quot;}}</p>
         */
        public Builder muxConfig(String muxConfig) {
            this.putQueryParameter("MuxConfig", muxConfig);
            this.muxConfig = muxConfig;
            return this;
        }

        /**
         * <p>The container format. The value is a JSON object. Default format: <strong>MP4</strong>.</p>
         * <ul>
         * <li>Video formats: FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4)</li>
         * <li>Audio formats: MP3, MP4, OGG, FLAC, and M4A</li>
         * <li>Images formats: GIF and WebP</li>
         * </ul>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Container</a> parameter of the &quot;Parameter details&quot; topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MPS-example</p>
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
         * <p>The name of the template. The name can be up to 128 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TransMode&quot;:&quot;onepass&quot;}</p>
         */
        public Builder transConfig(String transConfig) {
            this.putQueryParameter("TransConfig", transConfig);
            this.transConfig = transConfig;
            return this;
        }

        /**
         * <p>The configurations of the audio stream. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Audio</a> parameter of the &quot;Parameter details&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Profile&quot;:&quot;high&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Crf&quot;:&quot;15&quot;,&quot;Width&quot;:&quot;256&quot;,&quot;Height&quot;:&quot;800&quot;,&quot;Fps&quot;:&quot;25&quot;,&quot;Gop&quot;:&quot;10&quot;}</p>
         */
        public Builder video(String video) {
            this.putQueryParameter("Video", video);
            this.video = video;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
