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
 * {@link ImageRecognitionRequest} extends {@link RequestModel}
 *
 * <p>ImageRecognitionRequest</p>
 */
public class ImageRecognitionRequest extends Request {
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

    private ImageRecognitionRequest(Builder builder) {
        super(builder);
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

    public static ImageRecognitionRequest create() {
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

    public static final class Builder extends Request.Builder<ImageRecognitionRequest, Builder> {
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

        private Builder(ImageRecognitionRequest request) {
            super(request);
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://fb-es.mrvcdn.com/kf/E6332bde0101849968532c4f08dac757cZ.jpg">https://fb-es.mrvcdn.com/kf/E6332bde0101849968532c4f08dac757cZ.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * NonObjectDetectElements.
         */
        public Builder nonObjectDetectElements(java.util.List<Integer> nonObjectDetectElements) {
            String nonObjectDetectElementsShrink = shrink(nonObjectDetectElements, "NonObjectDetectElements", "json");
            this.putQueryParameter("NonObjectDetectElements", nonObjectDetectElementsShrink);
            this.nonObjectDetectElements = nonObjectDetectElements;
            return this;
        }

        /**
         * ObjectDetectElements.
         */
        public Builder objectDetectElements(java.util.List<Integer> objectDetectElements) {
            String objectDetectElementsShrink = shrink(objectDetectElements, "ObjectDetectElements", "json");
            this.putQueryParameter("ObjectDetectElements", objectDetectElementsShrink);
            this.objectDetectElements = objectDetectElements;
            return this;
        }

        /**
         * ReturnBorderPixel.
         */
        public Builder returnBorderPixel(Integer returnBorderPixel) {
            this.putQueryParameter("ReturnBorderPixel", returnBorderPixel);
            this.returnBorderPixel = returnBorderPixel;
            return this;
        }

        /**
         * ReturnCharacter.
         */
        public Builder returnCharacter(Integer returnCharacter) {
            this.putQueryParameter("ReturnCharacter", returnCharacter);
            this.returnCharacter = returnCharacter;
            return this;
        }

        /**
         * ReturnCharacterProp.
         */
        public Builder returnCharacterProp(Integer returnCharacterProp) {
            this.putQueryParameter("ReturnCharacterProp", returnCharacterProp);
            this.returnCharacterProp = returnCharacterProp;
            return this;
        }

        /**
         * ReturnProductNum.
         */
        public Builder returnProductNum(Integer returnProductNum) {
            this.putQueryParameter("ReturnProductNum", returnProductNum);
            this.returnProductNum = returnProductNum;
            return this;
        }

        /**
         * ReturnProductProp.
         */
        public Builder returnProductProp(Integer returnProductProp) {
            this.putQueryParameter("ReturnProductProp", returnProductProp);
            this.returnProductProp = returnProductProp;
            return this;
        }

        @Override
        public ImageRecognitionRequest build() {
            return new ImageRecognitionRequest(this);
        } 

    } 

}
