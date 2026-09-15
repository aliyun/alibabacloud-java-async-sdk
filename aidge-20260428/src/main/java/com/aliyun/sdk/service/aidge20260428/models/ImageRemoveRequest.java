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
    private java.util.List<Integer> objectRemoveElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserImage")
    private java.util.List<String> userImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserText")
    private java.util.List<String> userText;

    private ImageRemoveRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.mask = builder.mask;
        this.nonObjectRemoveElements = builder.nonObjectRemoveElements;
        this.objectRemoveElements = builder.objectRemoveElements;
        this.position = builder.position;
        this.userImage = builder.userImage;
        this.userText = builder.userText;
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

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return userImage
     */
    public java.util.List<String> getUserImage() {
        return this.userImage;
    }

    /**
     * @return userText
     */
    public java.util.List<String> getUserText() {
        return this.userText;
    }

    public static final class Builder extends Request.Builder<ImageRemoveRequest, Builder> {
        private String imageUrl; 
        private String mask; 
        private java.util.List<Integer> nonObjectRemoveElements; 
        private java.util.List<Integer> objectRemoveElements; 
        private String position; 
        private java.util.List<String> userImage; 
        private java.util.List<String> userText; 

        private Builder() {
            super();
        } 

        private Builder(ImageRemoveRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.mask = request.mask;
            this.nonObjectRemoveElements = request.nonObjectRemoveElements;
            this.objectRemoveElements = request.objectRemoveElements;
            this.position = request.position;
            this.userImage = request.userImage;
            this.userText = request.userText;
        } 

        /**
         * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 3000 × 3000 pixels, and a file size of no more than 10 MB.</p>
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
         * <p>The specific removal area. This parameter must be used with the editor. The input format is RLE.
         * If specified, this parameter takes priority and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;474556 160 475356 160 476156 160 476956 160 477756 160 478556 160 479356 160 480156 160 480956 160 481756 160 482556 160 483356 160 484156 160 484956 160 485756 160 486556 160 487356 160 488156 160 488956 160 489756 160 490556 160 491356 160 492156 160&quot;</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * <p>The elements to remove from the non-subject area of the image (1 = transparent text blocks, 2 = specific names, 3 = text, 4 = image blemishes). You can select multiple element types. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
         * Refer to the product description for details about each type.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2]</p>
         */
        public Builder nonObjectRemoveElements(java.util.List<Integer> nonObjectRemoveElements) {
            String nonObjectRemoveElementsShrink = shrink(nonObjectRemoveElements, "NonObjectRemoveElements", "json");
            this.putQueryParameter("NonObjectRemoveElements", nonObjectRemoveElementsShrink);
            this.nonObjectRemoveElements = nonObjectRemoveElements;
            return this;
        }

        /**
         * <p>The elements to remove from the image subject (1 = transparent text blocks, 2 = specific names, 3 = text, 4 = image blemishes). You can select multiple element types. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
         * Refer to the product description for details about each type.
         * Image subject: The core product area in the image.</p>
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

        /**
         * <p>The specific removal area. This parameter must be used with the editor. The input format is four-point coordinates [xx,yy,zz,dd]. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
         * 
         * <strong>example:</strong>
         * <p>[10,10,100,100]</p>
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>The user-specified image element links to remove. Multiple image links are supported. The input format is [&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22,%22https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22%5D">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;,&quot;https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;]</a>. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg%22%5D">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg&quot;]</a></p>
         */
        public Builder userImage(java.util.List<String> userImage) {
            String userImageShrink = shrink(userImage, "UserImage", "json");
            this.putQueryParameter("UserImage", userImageShrink);
            this.userImage = userImage;
            return this;
        }

        /**
         * <p>The user-specified text to remove. Multiple text inputs are supported. The input format is [&quot;xx&quot;,&quot;yy&quot;]. This parameter is optional, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
         * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;xx&quot;,&quot;yy&quot;]</p>
         */
        public Builder userText(java.util.List<String> userText) {
            String userTextShrink = shrink(userText, "UserText", "json");
            this.putQueryParameter("UserText", userTextShrink);
            this.userText = userText;
            return this;
        }

        @Override
        public ImageRemoveRequest build() {
            return new ImageRemoveRequest(this);
        } 

    } 

}
