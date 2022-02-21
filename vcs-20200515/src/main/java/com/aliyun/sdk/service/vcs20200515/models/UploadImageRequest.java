// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadImageRequest} extends {@link RequestModel}
 *
 * <p>UploadImageRequest</p>
 */
public class UploadImageRequest extends Request {
    @Body
    @NameInMap("ImageUrl")
    @Validation(required = true)
    private String imageUrl;

    private UploadImageRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadImageRequest create() {
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

    public static final class Builder extends Request.Builder<UploadImageRequest, Builder> {
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(UploadImageRequest response) {
            super(response);
            this.imageUrl = response.imageUrl;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public UploadImageRequest build() {
            return new UploadImageRequest(this);
        } 

    } 

}
