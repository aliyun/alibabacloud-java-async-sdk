// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamWatermarksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamWatermarksResponseBody</p>
 */
public class DescribeLiveStreamWatermarksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WatermarkList")
    private WatermarkList watermarkList;

    private DescribeLiveStreamWatermarksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.watermarkList = builder.watermarkList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamWatermarksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return watermarkList
     */
    public WatermarkList getWatermarkList() {
        return this.watermarkList;
    }

    public static final class Builder {
        private String requestId; 
        private WatermarkList watermarkList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WatermarkList.
         */
        public Builder watermarkList(WatermarkList watermarkList) {
            this.watermarkList = watermarkList;
            return this;
        }

        public DescribeLiveStreamWatermarksResponseBody build() {
            return new DescribeLiveStreamWatermarksResponseBody(this);
        } 

    } 

    public static class Watermark extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Name")
        private String name;

        @NameInMap("OffsetCorner")
        private String offsetCorner;

        @NameInMap("PictureUrl")
        private String pictureUrl;

        @NameInMap("RefHeight")
        private Integer refHeight;

        @NameInMap("RefWidth")
        private Integer refWidth;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("Transparency")
        private Integer transparency;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("XOffset")
        private Float xOffset;

        @NameInMap("YOffset")
        private Float yOffset;

        private Watermark(Builder builder) {
            this.description = builder.description;
            this.height = builder.height;
            this.name = builder.name;
            this.offsetCorner = builder.offsetCorner;
            this.pictureUrl = builder.pictureUrl;
            this.refHeight = builder.refHeight;
            this.refWidth = builder.refWidth;
            this.templateId = builder.templateId;
            this.transparency = builder.transparency;
            this.type = builder.type;
            this.xOffset = builder.xOffset;
            this.yOffset = builder.yOffset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermark create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offsetCorner
         */
        public String getOffsetCorner() {
            return this.offsetCorner;
        }

        /**
         * @return pictureUrl
         */
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        /**
         * @return refHeight
         */
        public Integer getRefHeight() {
            return this.refHeight;
        }

        /**
         * @return refWidth
         */
        public Integer getRefWidth() {
            return this.refWidth;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return transparency
         */
        public Integer getTransparency() {
            return this.transparency;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return xOffset
         */
        public Float getXOffset() {
            return this.xOffset;
        }

        /**
         * @return yOffset
         */
        public Float getYOffset() {
            return this.yOffset;
        }

        public static final class Builder {
            private String description; 
            private Integer height; 
            private String name; 
            private String offsetCorner; 
            private String pictureUrl; 
            private Integer refHeight; 
            private Integer refWidth; 
            private String templateId; 
            private Integer transparency; 
            private Integer type; 
            private Float xOffset; 
            private Float yOffset; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OffsetCorner.
             */
            public Builder offsetCorner(String offsetCorner) {
                this.offsetCorner = offsetCorner;
                return this;
            }

            /**
             * PictureUrl.
             */
            public Builder pictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
                return this;
            }

            /**
             * RefHeight.
             */
            public Builder refHeight(Integer refHeight) {
                this.refHeight = refHeight;
                return this;
            }

            /**
             * RefWidth.
             */
            public Builder refWidth(Integer refWidth) {
                this.refWidth = refWidth;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * Transparency.
             */
            public Builder transparency(Integer transparency) {
                this.transparency = transparency;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * XOffset.
             */
            public Builder xOffset(Float xOffset) {
                this.xOffset = xOffset;
                return this;
            }

            /**
             * YOffset.
             */
            public Builder yOffset(Float yOffset) {
                this.yOffset = yOffset;
                return this;
            }

            public Watermark build() {
                return new Watermark(this);
            } 

        } 

    }
    public static class WatermarkList extends TeaModel {
        @NameInMap("Watermark")
        private java.util.List < Watermark> watermark;

        private WatermarkList(Builder builder) {
            this.watermark = builder.watermark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkList create() {
            return builder().build();
        }

        /**
         * @return watermark
         */
        public java.util.List < Watermark> getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private java.util.List < Watermark> watermark; 

            /**
             * Watermark.
             */
            public Builder watermark(java.util.List < Watermark> watermark) {
                this.watermark = watermark;
                return this;
            }

            public WatermarkList build() {
                return new WatermarkList(this);
            } 

        } 

    }
}
