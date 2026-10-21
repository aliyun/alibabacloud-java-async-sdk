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
 * {@link ImageRecognitionAsyncRequest} extends {@link RequestModel}
 *
 * <p>ImageRecognitionAsyncRequest</p>
 */
public class ImageRecognitionAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NonObjectDetectElements")
    private java.util.List<Integer> nonObjectDetectElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectDetectElements")
    private java.util.List<Integer> objectDetectElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnBorderPixel")
    private Integer returnBorderPixel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnCharacter")
    private Integer returnCharacter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnCharacterProp")
    private Integer returnCharacterProp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnProductNum")
    private Integer returnProductNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnProductProp")
    private Integer returnProductProp;

    private ImageRecognitionAsyncRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.imageUrl = builder.imageUrl;
        this.nonObjectDetectElements = builder.nonObjectDetectElements;
        this.objectDetectElements = builder.objectDetectElements;
        this.returnBorderPixel = builder.returnBorderPixel;
        this.returnCharacter = builder.returnCharacter;
        this.returnCharacterProp = builder.returnCharacterProp;
        this.returnProductNum = builder.returnProductNum;
        this.returnProductProp = builder.returnProductProp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageRecognitionAsyncRequest create() {
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
     * @return nonObjectDetectElements
     */
    public java.util.List<Integer> getNonObjectDetectElements() {
        return this.nonObjectDetectElements;
    }

    /**
     * @return objectDetectElements
     */
    public java.util.List<Integer> getObjectDetectElements() {
        return this.objectDetectElements;
    }

    /**
     * @return returnBorderPixel
     */
    public Integer getReturnBorderPixel() {
        return this.returnBorderPixel;
    }

    /**
     * @return returnCharacter
     */
    public Integer getReturnCharacter() {
        return this.returnCharacter;
    }

    /**
     * @return returnCharacterProp
     */
    public Integer getReturnCharacterProp() {
        return this.returnCharacterProp;
    }

    /**
     * @return returnProductNum
     */
    public Integer getReturnProductNum() {
        return this.returnProductNum;
    }

    /**
     * @return returnProductProp
     */
    public Integer getReturnProductProp() {
        return this.returnProductProp;
    }

    public static final class Builder extends Request.Builder<ImageRecognitionAsyncRequest, Builder> {
        private String bizId; 
        private String imageUrl; 
        private java.util.List<Integer> nonObjectDetectElements; 
        private java.util.List<Integer> objectDetectElements; 
        private Integer returnBorderPixel; 
        private Integer returnCharacter; 
        private Integer returnCharacterProp; 
        private Integer returnProductNum; 
        private Integer returnProductProp; 

        private Builder() {
            super();
        } 

        private Builder(ImageRecognitionAsyncRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.imageUrl = request.imageUrl;
            this.nonObjectDetectElements = request.nonObjectDetectElements;
            this.objectDetectElements = request.objectDetectElements;
            this.returnBorderPixel = request.returnBorderPixel;
            this.returnCharacter = request.returnCharacter;
            this.returnCharacterProp = request.returnCharacterProp;
            this.returnProductNum = request.returnProductNum;
            this.returnProductProp = request.returnProductProp;
        } 

        /**
         * <p>The business ID of the caller. It is recorded upon acceptance and returned as is when you query the result of the asynchronous task.</p>
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
         * <p>The image URL. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
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

        /**
         * <p>The types of elements to detect outside the image subject. Valid values:</p>
         * <ul>
         * <li>1: watermark</li>
         * <li>2: logo</li>
         * <li>3: text</li>
         * <li>4: text-containing color block
         * You can specify multiple values. This parameter and ObjectDetectElements cannot be empty at the same time.</li>
         * </ul>
         */
        public Builder nonObjectDetectElements(java.util.List<Integer> nonObjectDetectElements) {
            String nonObjectDetectElementsShrink = shrink(nonObjectDetectElements, "NonObjectDetectElements", "json");
            this.putQueryParameter("NonObjectDetectElements", nonObjectDetectElementsShrink);
            this.nonObjectDetectElements = nonObjectDetectElements;
            return this;
        }

        /**
         * <p>The types of elements to detect on the image subject. Valid values:</p>
         * <ul>
         * <li>1: watermark</li>
         * <li>2: logo</li>
         * <li>3: text</li>
         * <li>4: text-containing color block
         * You can specify multiple values.</li>
         * </ul>
         */
        public Builder objectDetectElements(java.util.List<Integer> objectDetectElements) {
            String objectDetectElementsShrink = shrink(objectDetectElements, "ObjectDetectElements", "json");
            this.putQueryParameter("ObjectDetectElements", objectDetectElementsShrink);
            this.objectDetectElements = objectDetectElements;
            return this;
        }

        /**
         * <p>Specifies whether to return the marginalization distance of the subject. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no
         * Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnBorderPixel(Integer returnBorderPixel) {
            this.putQueryParameter("ReturnBorderPixel", returnBorderPixel);
            this.returnBorderPixel = returnBorderPixel;
            return this;
        }

        /**
         * <p>Specifies whether to return the OCR result of the text in the recognized area. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no
         * Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnCharacter(Integer returnCharacter) {
            this.putQueryParameter("ReturnCharacter", returnCharacter);
            this.returnCharacter = returnCharacter;
            return this;
        }

        /**
         * <p>Specifies whether to return the text proportion. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no
         * Default value: 0.
         * This parameter takes effect only when the following two conditions are met:</li>
         * </ul>
         * <ol>
         * <li>ReturnCharacter is set to 1.</li>
         * <li>ObjectDetectElements or NonObjectDetectElements is set to 3, which means text needs to be recognized.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnCharacterProp(Integer returnCharacterProp) {
            this.putQueryParameter("ReturnCharacterProp", returnCharacterProp);
            this.returnCharacterProp = returnCharacterProp;
            return this;
        }

        /**
         * <p>Specifies whether to return the number of subjects. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no
         * Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnProductNum(Integer returnProductNum) {
            this.putQueryParameter("ReturnProductNum", returnProductNum);
            this.returnProductNum = returnProductNum;
            return this;
        }

        /**
         * <p>Specifies whether to return the area proportion of the subject. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no
         * Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnProductProp(Integer returnProductProp) {
            this.putQueryParameter("ReturnProductProp", returnProductProp);
            this.returnProductProp = returnProductProp;
            return this;
        }

        @Override
        public ImageRecognitionAsyncRequest build() {
            return new ImageRecognitionAsyncRequest(this);
        } 

    } 

}
