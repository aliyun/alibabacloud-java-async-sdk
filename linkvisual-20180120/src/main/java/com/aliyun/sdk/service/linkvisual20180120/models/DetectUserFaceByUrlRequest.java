// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectUserFaceByUrlRequest} extends {@link RequestModel}
 *
 * <p>DetectUserFaceByUrlRequest</p>
 */
public class DetectUserFaceByUrlRequest extends Request {
    @Query
    @NameInMap("FacePicUrl")
    @Validation(required = true)
    private String facePicUrl;

    private DetectUserFaceByUrlRequest(Builder builder) {
        super(builder);
        this.facePicUrl = builder.facePicUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectUserFaceByUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return facePicUrl
     */
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public static final class Builder extends Request.Builder<DetectUserFaceByUrlRequest, Builder> {
        private String facePicUrl; 

        private Builder() {
            super();
        } 

        private Builder(DetectUserFaceByUrlRequest request) {
            super(request);
            this.facePicUrl = request.facePicUrl;
        } 

        /**
         * FacePicUrl.
         */
        public Builder facePicUrl(String facePicUrl) {
            this.putQueryParameter("FacePicUrl", facePicUrl);
            this.facePicUrl = facePicUrl;
            return this;
        }

        @Override
        public DetectUserFaceByUrlRequest build() {
            return new DetectUserFaceByUrlRequest(this);
        } 

    } 

}
