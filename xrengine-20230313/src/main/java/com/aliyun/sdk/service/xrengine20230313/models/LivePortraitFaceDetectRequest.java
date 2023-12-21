// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LivePortraitFaceDetectRequest} extends {@link RequestModel}
 *
 * <p>LivePortraitFaceDetectRequest</p>
 */
public class LivePortraitFaceDetectRequest extends Request {
    @Body
    @NameInMap("ImageUrl")
    @Validation(required = true)
    private String imageUrl;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    private LivePortraitFaceDetectRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LivePortraitFaceDetectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<LivePortraitFaceDetectRequest, Builder> {
        private String imageUrl; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(LivePortraitFaceDetectRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.jwtToken = request.jwtToken;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public LivePortraitFaceDetectRequest build() {
            return new LivePortraitFaceDetectRequest(this);
        } 

    } 

}
