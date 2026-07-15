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
 * {@link ImageRemovalProRequest} extends {@link RequestModel}
 *
 * <p>ImageRemovalProRequest</p>
 */
public class ImageRemovalProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    private ImageRemovalProRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRemovalProRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static final class Builder extends Request.Builder<ImageRemovalProRequest, Builder> {
        private Boolean async; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImageRemovalProRequest request) {
            super(request);
            this.async = request.async;
            this.imageUrl = request.imageUrl;
        } 

        /**
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cbu01.alicdn.com/imgextra/i2/1067106875/O1CN013rvpXP20enxPQttb3_!!4611686018427380283-0-item_pic.jpg">https://cbu01.alicdn.com/imgextra/i2/1067106875/O1CN013rvpXP20enxPQttb3_!!4611686018427380283-0-item_pic.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public ImageRemovalProRequest build() {
            return new ImageRemovalProRequest(this);
        } 

    } 

}
