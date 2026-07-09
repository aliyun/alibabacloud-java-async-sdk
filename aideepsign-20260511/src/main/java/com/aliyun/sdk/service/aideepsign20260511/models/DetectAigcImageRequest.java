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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    private DetectAigcImageRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.objectKey = builder.objectKey;
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

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    public static final class Builder extends Request.Builder<DetectAigcImageRequest, Builder> {
        private String imageUrl; 
        private String objectKey; 

        private Builder() {
            super();
        } 

        private Builder(DetectAigcImageRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.objectKey = request.objectKey;
        } 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        @Override
        public DetectAigcImageRequest build() {
            return new DetectAigcImageRequest(this);
        } 

    } 

}
