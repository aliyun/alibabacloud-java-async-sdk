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
 * {@link ImageRemovalProAsyncRequest} extends {@link RequestModel}
 *
 * <p>ImageRemovalProAsyncRequest</p>
 */
public class ImageRemovalProAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    private ImageRemovalProAsyncRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRemovalProAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static final class Builder extends Request.Builder<ImageRemovalProAsyncRequest, Builder> {
        private String bizId; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImageRemovalProAsyncRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The business order ID of the caller. This ID is recorded when the request is accepted and returned as-is when you query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>order-20260928-001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The URL of the original image. The image must be in the JPG, JPEG, PNG, BMP, or WEBP format.
         * · Resolution: 256×256 to 3000×3000. File size: ≤ 10 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public ImageRemovalProAsyncRequest build() {
            return new ImageRemovalProAsyncRequest(this);
        } 

    } 

}
