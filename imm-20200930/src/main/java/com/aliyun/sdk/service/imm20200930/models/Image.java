// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Image} extends {@link TeaModel}
 *
 * <p>Image</p>
 */
public class Image extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CroppingSuggestions")
    private java.util.List < CroppingSuggestion > croppingSuggestions;

    @com.aliyun.core.annotation.NameInMap("EXIF")
    private String EXIF;

    @com.aliyun.core.annotation.NameInMap("ImageHeight")
    private Long imageHeight;

    @com.aliyun.core.annotation.NameInMap("ImageScore")
    private ImageScore imageScore;

    @com.aliyun.core.annotation.NameInMap("ImageWidth")
    private Long imageWidth;

    @com.aliyun.core.annotation.NameInMap("OCRContents")
    private java.util.List < OCRContents > OCRContents;

    private Image(Builder builder) {
        this.croppingSuggestions = builder.croppingSuggestions;
        this.EXIF = builder.EXIF;
        this.imageHeight = builder.imageHeight;
        this.imageScore = builder.imageScore;
        this.imageWidth = builder.imageWidth;
        this.OCRContents = builder.OCRContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Image create() {
        return builder().build();
    }

    /**
     * @return croppingSuggestions
     */
    public java.util.List < CroppingSuggestion > getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    /**
     * @return EXIF
     */
    public String getEXIF() {
        return this.EXIF;
    }

    /**
     * @return imageHeight
     */
    public Long getImageHeight() {
        return this.imageHeight;
    }

    /**
     * @return imageScore
     */
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    /**
     * @return imageWidth
     */
    public Long getImageWidth() {
        return this.imageWidth;
    }

    /**
     * @return OCRContents
     */
    public java.util.List < OCRContents > getOCRContents() {
        return this.OCRContents;
    }

    public static final class Builder {
        private java.util.List < CroppingSuggestion > croppingSuggestions; 
        private String EXIF; 
        private Long imageHeight; 
        private ImageScore imageScore; 
        private Long imageWidth; 
        private java.util.List < OCRContents > OCRContents; 

        /**
         * CroppingSuggestions.
         */
        public Builder croppingSuggestions(java.util.List < CroppingSuggestion > croppingSuggestions) {
            this.croppingSuggestions = croppingSuggestions;
            return this;
        }

        /**
         * EXIF.
         */
        public Builder EXIF(String EXIF) {
            this.EXIF = EXIF;
            return this;
        }

        /**
         * ImageHeight.
         */
        public Builder imageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        /**
         * ImageScore.
         */
        public Builder imageScore(ImageScore imageScore) {
            this.imageScore = imageScore;
            return this;
        }

        /**
         * ImageWidth.
         */
        public Builder imageWidth(Long imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        /**
         * OCRContents.
         */
        public Builder OCRContents(java.util.List < OCRContents > OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }

        public Image build() {
            return new Image(this);
        } 

    } 

}
