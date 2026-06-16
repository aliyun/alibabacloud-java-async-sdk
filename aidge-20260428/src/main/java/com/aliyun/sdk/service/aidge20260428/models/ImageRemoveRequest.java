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
 * {@link ImageRemoveRequest} extends {@link RequestModel}
 *
 * <p>ImageRemoveRequest</p>
 */
public class ImageRemoveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NonObjectRemoveElements")
    private java.util.List<Integer> nonObjectRemoveElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectRemoveElements")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> objectRemoveElements;

    private ImageRemoveRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.mask = builder.mask;
        this.nonObjectRemoveElements = builder.nonObjectRemoveElements;
        this.objectRemoveElements = builder.objectRemoveElements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRemoveRequest create() {
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
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return nonObjectRemoveElements
     */
    public java.util.List<Integer> getNonObjectRemoveElements() {
        return this.nonObjectRemoveElements;
    }

    /**
     * @return objectRemoveElements
     */
    public java.util.List<Integer> getObjectRemoveElements() {
        return this.objectRemoveElements;
    }

    public static final class Builder extends Request.Builder<ImageRemoveRequest, Builder> {
        private String imageUrl; 
        private String mask; 
        private java.util.List<Integer> nonObjectRemoveElements; 
        private java.util.List<Integer> objectRemoveElements; 

        private Builder() {
            super();
        } 

        private Builder(ImageRemoveRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.mask = request.mask;
            this.nonObjectRemoveElements = request.nonObjectRemoveElements;
            this.objectRemoveElements = request.objectRemoveElements;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * NonObjectRemoveElements.
         */
        public Builder nonObjectRemoveElements(java.util.List<Integer> nonObjectRemoveElements) {
            String nonObjectRemoveElementsShrink = shrink(nonObjectRemoveElements, "NonObjectRemoveElements", "json");
            this.putQueryParameter("NonObjectRemoveElements", nonObjectRemoveElementsShrink);
            this.nonObjectRemoveElements = nonObjectRemoveElements;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2]</p>
         */
        public Builder objectRemoveElements(java.util.List<Integer> objectRemoveElements) {
            String objectRemoveElementsShrink = shrink(objectRemoveElements, "ObjectRemoveElements", "json");
            this.putQueryParameter("ObjectRemoveElements", objectRemoveElementsShrink);
            this.objectRemoveElements = objectRemoveElements;
            return this;
        }

        @Override
        public ImageRemoveRequest build() {
            return new ImageRemoveRequest(this);
        } 

    } 

}
