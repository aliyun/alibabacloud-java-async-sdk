// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMotionShopTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitMotionShopTaskRequest</p>
 */
public class SubmitMotionShopTaskRequest extends Request {
    @Body
    @NameInMap("AvatarId")
    @Validation(required = true)
    private String avatarId;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private SubmitMotionShopTaskRequest(Builder builder) {
        super(builder);
        this.avatarId = builder.avatarId;
        this.jwtToken = builder.jwtToken;
        this.title = builder.title;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMotionShopTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarId
     */
    public String getAvatarId() {
        return this.avatarId;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitMotionShopTaskRequest, Builder> {
        private String avatarId; 
        private String jwtToken; 
        private String title; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMotionShopTaskRequest request) {
            super(request);
            this.avatarId = request.avatarId;
            this.jwtToken = request.jwtToken;
            this.title = request.title;
            this.videoId = request.videoId;
        } 

        /**
         * AvatarId.
         */
        public Builder avatarId(String avatarId) {
            this.putBodyParameter("AvatarId", avatarId);
            this.avatarId = avatarId;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putBodyParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitMotionShopTaskRequest build() {
            return new SubmitMotionShopTaskRequest(this);
        } 

    } 

}
