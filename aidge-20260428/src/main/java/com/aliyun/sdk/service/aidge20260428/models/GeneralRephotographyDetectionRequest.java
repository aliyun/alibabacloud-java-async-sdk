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
 * {@link GeneralRephotographyDetectionRequest} extends {@link RequestModel}
 *
 * <p>GeneralRephotographyDetectionRequest</p>
 */
public class GeneralRephotographyDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    private GeneralRephotographyDetectionRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralRephotographyDetectionRequest create() {
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

    public static final class Builder extends Request.Builder<GeneralRephotographyDetectionRequest, Builder> {
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(GeneralRephotographyDetectionRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The HTTPS URL of the original image to recognize. The URL must be accessible and must not contain whitespace or URL-embedded usernames or passwords.</p>
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
        public GeneralRephotographyDetectionRequest build() {
            return new GeneralRephotographyDetectionRequest(this);
        } 

    } 

}
