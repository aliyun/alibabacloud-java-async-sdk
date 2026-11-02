// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateAvatarTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateAvatarTrainingJobRequest</p>
 */
public class CreateAvatarTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 1027)
    private String avatarDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 7)
    private String avatarName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarType")
    private String avatarType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Portrait")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 32)
    private String portrait;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Thumbnail")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String thumbnail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transparent")
    private Boolean transparent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Video")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 32)
    private String video;

    private CreateAvatarTrainingJobRequest(Builder builder) {
        super(builder);
        this.avatarDescription = builder.avatarDescription;
        this.avatarName = builder.avatarName;
        this.avatarType = builder.avatarType;
        this.portrait = builder.portrait;
        this.thumbnail = builder.thumbnail;
        this.transparent = builder.transparent;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAvatarTrainingJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarDescription
     */
    public String getAvatarDescription() {
        return this.avatarDescription;
    }

    /**
     * @return avatarName
     */
    public String getAvatarName() {
        return this.avatarName;
    }

    /**
     * @return avatarType
     */
    public String getAvatarType() {
        return this.avatarType;
    }

    /**
     * @return portrait
     */
    public String getPortrait() {
        return this.portrait;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    /**
     * @return transparent
     */
    public Boolean getTransparent() {
        return this.transparent;
    }

    /**
     * @return video
     */
    public String getVideo() {
        return this.video;
    }

    public static final class Builder extends Request.Builder<CreateAvatarTrainingJobRequest, Builder> {
        private String avatarDescription; 
        private String avatarName; 
        private String avatarType; 
        private String portrait; 
        private String thumbnail; 
        private Boolean transparent; 
        private String video; 

        private Builder() {
            super();
        } 

        private Builder(CreateAvatarTrainingJobRequest request) {
            super(request);
            this.avatarDescription = request.avatarDescription;
            this.avatarName = request.avatarName;
            this.avatarType = request.avatarType;
            this.portrait = request.portrait;
            this.thumbnail = request.thumbnail;
            this.transparent = request.transparent;
            this.video = request.video;
        } 

        /**
         * <p>The description of the digital human. The description can be up to 1000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a digital human used for a specific scenario.</p>
         */
        public Builder avatarDescription(String avatarDescription) {
            this.putQueryParameter("AvatarDescription", avatarDescription);
            this.avatarDescription = avatarDescription;
            return this;
        }

        /**
         * <p>The name of the digital human. The name can be up to 7 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Decimal</p>
         */
        public Builder avatarName(String avatarName) {
            this.putQueryParameter("AvatarName", avatarName);
            this.avatarName = avatarName;
            return this;
        }

        /**
         * <p>The type of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p>2DAvatar</p>
         */
        public Builder avatarType(String avatarType) {
            this.putQueryParameter("AvatarType", avatarType);
            this.avatarType = avatarType;
            return this;
        }

        /**
         * <ul>
         * <li>The media asset ID of the avatar image. The ID is 32 characters in length.</li>
         * <li>If you subsequently call SubmitAvatarTrainingJob to submit the training, this field is required.</li>
         * <li>The image must have equal width and height.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        public Builder portrait(String portrait) {
            this.putQueryParameter("Portrait", portrait);
            this.portrait = portrait;
            return this;
        }

        /**
         * <p>The thumbnail URL.</p>
         * <ul>
         * <li>After training succeeds, the thumbnail is uploaded to this address.</li>
         * <li>The URL must be a valid public OSS URL under the current user.</li>
         * <li>The URL can be up to 512 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
         */
        public Builder thumbnail(String thumbnail) {
            this.putQueryParameter("Thumbnail", thumbnail);
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * <p>Specifies whether the training video supports a transparent channel.</p>
         * <blockquote>
         * <p>Notice: Make sure that this setting is consistent with the submitted training video. Otherwise, the synthesized digital human may be abnormal.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder transparent(Boolean transparent) {
            this.putQueryParameter("Transparent", transparent);
            this.transparent = transparent;
            return this;
        }

        /**
         * <p>The media asset ID of the training video.</p>
         * <ul>
         * <li>The ID is 32 characters in length.</li>
         * <li>Supported formats: mp4, mov, and webm.</li>
         * <li>The duration of the material must be between 5 minutes and 15 minutes.</li>
         * <li>The resolution of the material must be 1920 × 1080 or 1080 × 1920.</li>
         * <li>If you subsequently call SubmitAvatarTrainingJob to submit the training, this field is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        public Builder video(String video) {
            this.putQueryParameter("Video", video);
            this.video = video;
            return this;
        }

        @Override
        public CreateAvatarTrainingJobRequest build() {
            return new CreateAvatarTrainingJobRequest(this);
        } 

    } 

}
