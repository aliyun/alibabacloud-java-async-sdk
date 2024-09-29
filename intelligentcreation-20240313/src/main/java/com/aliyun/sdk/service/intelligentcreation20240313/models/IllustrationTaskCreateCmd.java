// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IllustrationTaskCreateCmd} extends {@link TeaModel}
 *
 * <p>IllustrationTaskCreateCmd</p>
 */
public class IllustrationTaskCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backgroundType")
    private Integer backgroundType;

    @com.aliyun.core.annotation.NameInMap("dstHeight")
    private Integer dstHeight;

    @com.aliyun.core.annotation.NameInMap("dstWidth")
    private Integer dstWidth;

    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.NameInMap("nums")
    private Integer nums;

    @com.aliyun.core.annotation.NameInMap("ossPaths")
    private java.util.List < String > ossPaths;

    @com.aliyun.core.annotation.NameInMap("stickerText")
    private String stickerText;

    private IllustrationTaskCreateCmd(Builder builder) {
        this.backgroundType = builder.backgroundType;
        this.dstHeight = builder.dstHeight;
        this.dstWidth = builder.dstWidth;
        this.idempotentId = builder.idempotentId;
        this.nums = builder.nums;
        this.ossPaths = builder.ossPaths;
        this.stickerText = builder.stickerText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IllustrationTaskCreateCmd create() {
        return builder().build();
    }

    /**
     * @return backgroundType
     */
    public Integer getBackgroundType() {
        return this.backgroundType;
    }

    /**
     * @return dstHeight
     */
    public Integer getDstHeight() {
        return this.dstHeight;
    }

    /**
     * @return dstWidth
     */
    public Integer getDstWidth() {
        return this.dstWidth;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return nums
     */
    public Integer getNums() {
        return this.nums;
    }

    /**
     * @return ossPaths
     */
    public java.util.List < String > getOssPaths() {
        return this.ossPaths;
    }

    /**
     * @return stickerText
     */
    public String getStickerText() {
        return this.stickerText;
    }

    public static final class Builder {
        private Integer backgroundType; 
        private Integer dstHeight; 
        private Integer dstWidth; 
        private String idempotentId; 
        private Integer nums; 
        private java.util.List < String > ossPaths; 
        private String stickerText; 

        /**
         * backgroundType.
         */
        public Builder backgroundType(Integer backgroundType) {
            this.backgroundType = backgroundType;
            return this;
        }

        /**
         * dstHeight.
         */
        public Builder dstHeight(Integer dstHeight) {
            this.dstHeight = dstHeight;
            return this;
        }

        /**
         * dstWidth.
         */
        public Builder dstWidth(Integer dstWidth) {
            this.dstWidth = dstWidth;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * nums.
         */
        public Builder nums(Integer nums) {
            this.nums = nums;
            return this;
        }

        /**
         * ossPaths.
         */
        public Builder ossPaths(java.util.List < String > ossPaths) {
            this.ossPaths = ossPaths;
            return this;
        }

        /**
         * stickerText.
         */
        public Builder stickerText(String stickerText) {
            this.stickerText = stickerText;
            return this;
        }

        public IllustrationTaskCreateCmd build() {
            return new IllustrationTaskCreateCmd(this);
        } 

    } 

}
