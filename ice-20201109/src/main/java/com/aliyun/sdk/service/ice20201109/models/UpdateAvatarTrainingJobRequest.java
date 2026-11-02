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
 * {@link UpdateAvatarTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateAvatarTrainingJobRequest</p>
 */
public class UpdateAvatarTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String avatarDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarName")
    @com.aliyun.core.annotation.Validation(maxLength = 7)
    private String avatarName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

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

    private UpdateAvatarTrainingJobRequest(Builder builder) {
        super(builder);
        this.avatarDescription = builder.avatarDescription;
        this.avatarName = builder.avatarName;
        this.jobId = builder.jobId;
        this.portrait = builder.portrait;
        this.thumbnail = builder.thumbnail;
        this.transparent = builder.transparent;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAvatarTrainingJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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

    public static final class Builder extends Request.Builder<UpdateAvatarTrainingJobRequest, Builder> {
        private String avatarDescription; 
        private String avatarName; 
        private String jobId; 
        private String portrait; 
        private String thumbnail; 
        private Boolean transparent; 
        private String video; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAvatarTrainingJobRequest request) {
            super(request);
            this.avatarDescription = request.avatarDescription;
            this.avatarName = request.avatarName;
            this.jobId = request.jobId;
            this.portrait = request.portrait;
            this.thumbnail = request.thumbnail;
            this.transparent = request.transparent;
            this.video = request.video;
        } 

        /**
         * <p>The description of the digital human. The description can be up to 1,000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a digital human, intended for use in a certain scenario.</p>
         */
        public Builder avatarDescription(String avatarDescription) {
            this.putQueryParameter("AvatarDescription", avatarDescription);
            this.avatarDescription = avatarDescription;
            return this;
        }

        /**
         * <p>The name of the digital human. The name can be up to 7 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the digital human.</p>
         */
        public Builder avatarName(String avatarName) {
            this.putQueryParameter("AvatarName", avatarName);
            this.avatarName = avatarName;
            return this;
        }

        /**
         * <p>The ID of the digital human training task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The media asset ID of the profile picture. The ID must be 32 characters in length.</p>
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
         * <p>The URL of the thumbnail.</p>
         * <ul>
         * <li>The thumbnail is uploaded to this URL after the training succeeds.</li>
         * <li>The URL must be a valid public Object Storage Service (OSS) URL within your account.</li>
         * <li>The URL can be up to 512 characters in length.</li>
         * <li>The URL cannot be updated after the training succeeds.</li>
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
         * <p>Specifies whether the uploaded video supports a transparent channel.</p>
         * <p>You can modify this parameter only for tasks in the Initialized or Training Failed state.
         * <notice>Make sure that this setting matches the properties of the submitted training video. Otherwise, the synthesized digital human may behave abnormally.</notice></p>
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
         * <li>The ID must be 32 characters in length.</li>
         * <li>The MP4, MOV, and WebM formats are supported.</li>
         * <li>The video duration must be between 5 and 15 minutes.</li>
         * <li>The video resolution must be 1920 × 1080 or 1080 × 1920.</li>
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
        public UpdateAvatarTrainingJobRequest build() {
            return new UpdateAvatarTrainingJobRequest(this);
        } 

    } 

}
