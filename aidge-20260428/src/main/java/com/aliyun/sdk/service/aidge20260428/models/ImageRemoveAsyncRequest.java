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
 * {@link ImageRemoveAsyncRequest} extends {@link RequestModel}
 *
 * <p>ImageRemoveAsyncRequest</p>
 */
public class ImageRemoveAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

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

    private ImageRemoveAsyncRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
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

    public static ImageRemoveAsyncRequest create() {
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

    public static final class Builder extends Request.Builder<ImageRemoveAsyncRequest, Builder> {
        private String bizId; 
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

        private Builder(ImageRemoveAsyncRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.imageUrl = request.imageUrl;
            this.mask = request.mask;
            this.nonObjectRemoveElements = request.nonObjectRemoveElements;
            this.objectRemoveElements = request.objectRemoveElements;
            this.position = request.position;
            this.userImage = request.userImage;
            this.userText = request.userText;
        } 

        /**
         * <p>The business order ID of the caller. This ID is recorded when the request is accepted and returned as-is when you query the result of the asynchronous task.</p>
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
         * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a>&quot;</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The specific area to erase. This parameter must be used in conjunction with the editor. The input format is Run-Length Encoding (RLE).
         * If this parameter is specified, it takes precedence and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
         * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
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
         * <p>The list of element types to remove from the image background.</p>
         */
        public Builder nonObjectRemoveElements(java.util.List<Integer> nonObjectRemoveElements) {
            String nonObjectRemoveElementsShrink = shrink(nonObjectRemoveElements, "NonObjectRemoveElements", "json");
            this.putQueryParameter("NonObjectRemoveElements", nonObjectRemoveElementsShrink);
            this.nonObjectRemoveElements = nonObjectRemoveElements;
            return this;
        }

        /**
         * <p>The types of elements to remove from the image subject. Valid values:</p>
         * <ul>
         * <li>1: Transparent text blocks.</li>
         * <li>2: Specific names.</li>
         * <li>3: Text.</li>
         * <li>4: Promotional stickers.
         * You can select multiple element types. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
         * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
         * For more information about each type, see the product documentation.
         * Image subject: the core product area in the image.</li>
         * </ul>
         */
        public Builder objectRemoveElements(java.util.List<Integer> objectRemoveElements) {
            String objectRemoveElementsShrink = shrink(objectRemoveElements, "ObjectRemoveElements", "json");
            this.putQueryParameter("ObjectRemoveElements", objectRemoveElementsShrink);
            this.objectRemoveElements = objectRemoveElements;
            return this;
        }

        /**
         * <p>The specific area to erase. This parameter must be used in conjunction with the editor. The input format is a four-point coordinate array, such as [xx,yy,zz,dd]. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
         * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
         * 
         * <strong>example:</strong>
         * <p>[10,20,100,200]</p>
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>The list of URLs for user-specified image elements to erase.</p>
         */
        public Builder userImage(java.util.List<String> userImage) {
            String userImageShrink = shrink(userImage, "UserImage", "json");
            this.putQueryParameter("UserImage", userImageShrink);
            this.userImage = userImage;
            return this;
        }

        /**
         * <p>The list of user-specified text strings to erase.</p>
         */
        public Builder userText(java.util.List<String> userText) {
            String userTextShrink = shrink(userText, "UserText", "json");
            this.putQueryParameter("UserText", userTextShrink);
            this.userText = userText;
            return this;
        }

        @Override
        public ImageRemoveAsyncRequest build() {
            return new ImageRemoveAsyncRequest(this);
        } 

    } 

}
