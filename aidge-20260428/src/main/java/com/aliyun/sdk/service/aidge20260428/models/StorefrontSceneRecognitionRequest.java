// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link StorefrontSceneRecognitionRequest} extends {@link RequestModel}
 *
 * <p>StorefrontSceneRecognitionRequest</p>
 */
public class StorefrontSceneRecognitionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    private StorefrontSceneRecognitionRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorefrontSceneRecognitionRequest create() {
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

    public static final class Builder extends Request.Builder<StorefrontSceneRecognitionRequest, Builder> {
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(StorefrontSceneRecognitionRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The HTTP(S) URL of the image to be reviewed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public StorefrontSceneRecognitionRequest build() {
            return new StorefrontSceneRecognitionRequest(this);
        } 

    } 

}
