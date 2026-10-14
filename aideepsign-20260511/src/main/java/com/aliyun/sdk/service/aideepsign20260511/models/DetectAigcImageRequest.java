// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link DetectAigcImageRequest} extends {@link RequestModel}
 *
 * <p>DetectAigcImageRequest</p>
 */
public class DetectAigcImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    private DetectAigcImageRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectAigcImageRequest create() {
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

    public static final class Builder extends Request.Builder<DetectAigcImageRequest, Builder> {
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(DetectAigcImageRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The URL of the image to detect. Only HTTP/HTTPS protocols are supported. You must provide at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public DetectAigcImageRequest build() {
            return new DetectAigcImageRequest(this);
        } 

    } 

}
