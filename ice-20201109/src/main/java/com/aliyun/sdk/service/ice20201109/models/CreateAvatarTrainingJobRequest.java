// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAvatarTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateAvatarTrainingJobRequest</p>
 */
public class CreateAvatarTrainingJobRequest extends Request {
    @Query
    @NameInMap("AvatarDescription")
    @Validation(maxLength = 1027)
    private String avatarDescription;

    @Query
    @NameInMap("AvatarName")
    @Validation(required = true, maxLength = 7)
    private String avatarName;

    @Query
    @NameInMap("AvatarType")
    private String avatarType;

    @Query
    @NameInMap("Portrait")
    @Validation(maxLength = 32, minLength = 32)
    private String portrait;

    @Query
    @NameInMap("Thumbnail")
    @Validation(maxLength = 512)
    private String thumbnail;

    @Query
    @NameInMap("Transparent")
    private Boolean transparent;

    @Query
    @NameInMap("Video")
    @Validation(maxLength = 32, minLength = 32)
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
         * AvatarDescription.
         */
        public Builder avatarDescription(String avatarDescription) {
            this.putQueryParameter("AvatarDescription", avatarDescription);
            this.avatarDescription = avatarDescription;
            return this;
        }

        /**
         * AvatarName.
         */
        public Builder avatarName(String avatarName) {
            this.putQueryParameter("AvatarName", avatarName);
            this.avatarName = avatarName;
            return this;
        }

        /**
         * AvatarType.
         */
        public Builder avatarType(String avatarType) {
            this.putQueryParameter("AvatarType", avatarType);
            this.avatarType = avatarType;
            return this;
        }

        /**
         * Portrait.
         */
        public Builder portrait(String portrait) {
            this.putQueryParameter("Portrait", portrait);
            this.portrait = portrait;
            return this;
        }

        /**
         * Thumbnail.
         */
        public Builder thumbnail(String thumbnail) {
            this.putQueryParameter("Thumbnail", thumbnail);
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * Transparent.
         */
        public Builder transparent(Boolean transparent) {
            this.putQueryParameter("Transparent", transparent);
            this.transparent = transparent;
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
        public CreateAvatarTrainingJobRequest build() {
            return new CreateAvatarTrainingJobRequest(this);
        } 

    } 

}
