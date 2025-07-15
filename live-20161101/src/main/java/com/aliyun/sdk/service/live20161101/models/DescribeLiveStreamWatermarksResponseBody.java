// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamWatermarksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamWatermarksResponseBody</p>
 */
public class DescribeLiveStreamWatermarksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("WatermarkList")
    private WatermarkList watermarkList;

    private DescribeLiveStreamWatermarksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.watermarkList = builder.watermarkList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamWatermarksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return watermarkList
     */
    public WatermarkList getWatermarkList() {
        return this.watermarkList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer total; 
        private WatermarkList watermarkList; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamWatermarksResponseBody model) {
            this.requestId = model.requestId;
            this.total = model.total;
            this.watermarkList = model.watermarkList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of watermark templates that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>Details of the watermark templates.</p>
         */
        public Builder watermarkList(WatermarkList watermarkList) {
            this.watermarkList = watermarkList;
            return this;
        }

        public DescribeLiveStreamWatermarksResponseBody build() {
            return new DescribeLiveStreamWatermarksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamWatermarksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamWatermarksResponseBody</p>
     */
    public static class Watermark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OffsetCorner")
        private String offsetCorner;

        @com.aliyun.core.annotation.NameInMap("PictureUrl")
        private String pictureUrl;

        @com.aliyun.core.annotation.NameInMap("RefHeight")
        private Integer refHeight;

        @com.aliyun.core.annotation.NameInMap("RefWidth")
        private Integer refWidth;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Transparency")
        private Integer transparency;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("XOffset")
        private Float xOffset;

        @com.aliyun.core.annotation.NameInMap("YOffset")
        private Float yOffset;

        private Watermark(Builder builder) {
            this.description = builder.description;
            this.height = builder.height;
            this.name = builder.name;
            this.offsetCorner = builder.offsetCorner;
            this.pictureUrl = builder.pictureUrl;
            this.refHeight = builder.refHeight;
            this.refWidth = builder.refWidth;
            this.ruleCount = builder.ruleCount;
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
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
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
            private Integer ruleCount; 
            private String templateId; 
            private Integer transparency; 
            private Integer type; 
            private Float xOffset; 
            private Float yOffset; 

            private Builder() {
            } 

            private Builder(Watermark model) {
                this.description = model.description;
                this.height = model.height;
                this.name = model.name;
                this.offsetCorner = model.offsetCorner;
                this.pictureUrl = model.pictureUrl;
                this.refHeight = model.refHeight;
                this.refWidth = model.refWidth;
                this.ruleCount = model.ruleCount;
                this.templateId = model.templateId;
                this.transparency = model.transparency;
                this.type = model.type;
                this.xOffset = model.xOffset;
                this.yOffset = model.yOffset;
            } 

            /**
             * <p>The description of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>my watermark</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The height of the watermark. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The name of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>livewatermark****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The position of the watermark.</p>
             * <ul>
             * <li>TopLeft: the upper-left corner.</li>
             * <li>TopRight: the upper-right corner.</li>
             * <li>BottomLeft: the lower-left corner.</li>
             * <li>BottomRight: the lower-right corner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TopRight</p>
             */
            public Builder offsetCorner(String offsetCorner) {
                this.offsetCorner = offsetCorner;
                return this;
            }

            /**
             * <p>The URL of the watermark image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder pictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
                return this;
            }

            /**
             * <p>The height of the background video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder refHeight(Integer refHeight) {
                this.refHeight = refHeight;
                return this;
            }

            /**
             * <p>The width of the background video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder refWidth(Integer refWidth) {
                this.refWidth = refWidth;
                return this;
            }

            /**
             * <p>The number of watermark rules configured for the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * <p>The ID of the watermark template.</p>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-4 61d-8f29-4bec2eb9 ****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The transparency of the watermark. A smaller value indicates a more transparent watermark. Valid values: 0 to 255.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder transparency(Integer transparency) {
                this.transparency = transparency;
                return this;
            }

            /**
             * <p>The watermark type.</p>
             * <ul>
             * <li>0: image. Only image watermarks are supported.</li>
             * <li>1: text.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The offset of the watermark along the x-axis. Unit: pixels.</p>
             * <blockquote>
             * <p> The value of the RefWidth parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the XOffset parameter indicates the x-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the x-axis is positive toward the right.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50.0</p>
             */
            public Builder xOffset(Float xOffset) {
                this.xOffset = xOffset;
                return this;
            }

            /**
             * <p>The offset of the watermark along the y-axis. Unit: pixels.</p>
             * <blockquote>
             * <p> The value of the RefHeight parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the YOffset parameter indicates the y-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the y-axis is positive downward.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
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
    /**
     * 
     * {@link DescribeLiveStreamWatermarksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamWatermarksResponseBody</p>
     */
    public static class WatermarkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Watermark")
        private java.util.List<Watermark> watermark;

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
        public java.util.List<Watermark> getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private java.util.List<Watermark> watermark; 

            private Builder() {
            } 

            private Builder(WatermarkList model) {
                this.watermark = model.watermark;
            } 

            /**
             * Watermark.
             */
            public Builder watermark(java.util.List<Watermark> watermark) {
                this.watermark = watermark;
                return this;
            }

            public WatermarkList build() {
                return new WatermarkList(this);
            } 

        } 

    }
}
