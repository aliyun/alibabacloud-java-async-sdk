// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWaterMarkTemplateListResponseBody</p>
 */
public class QueryWaterMarkTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistWids")
    private NonExistWids nonExistWids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaterMarkTemplateList")
    private WaterMarkTemplateList waterMarkTemplateList;

    private QueryWaterMarkTemplateListResponseBody(Builder builder) {
        this.nonExistWids = builder.nonExistWids;
        this.requestId = builder.requestId;
        this.waterMarkTemplateList = builder.waterMarkTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWaterMarkTemplateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistWids
     */
    public NonExistWids getNonExistWids() {
        return this.nonExistWids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waterMarkTemplateList
     */
    public WaterMarkTemplateList getWaterMarkTemplateList() {
        return this.waterMarkTemplateList;
    }

    public static final class Builder {
        private NonExistWids nonExistWids; 
        private String requestId; 
        private WaterMarkTemplateList waterMarkTemplateList; 

        /**
         * The IDs of the templates that do not exist.
         */
        public Builder nonExistWids(NonExistWids nonExistWids) {
            this.nonExistWids = nonExistWids;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the watermark templates.
         */
        public Builder waterMarkTemplateList(WaterMarkTemplateList waterMarkTemplateList) {
            this.waterMarkTemplateList = waterMarkTemplateList;
            return this;
        }

        public QueryWaterMarkTemplateListResponseBody build() {
            return new QueryWaterMarkTemplateListResponseBody(this);
        } 

    } 

    public static class NonExistWids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistWids(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistWids create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistWids build() {
                return new NonExistWids(this);
            } 

        } 

    }
    public static class RatioRefer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private RatioRefer(Builder builder) {
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RatioRefer create() {
            return builder().build();
        }

        /**
         * @return dx
         */
        public String getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public String getDy() {
            return this.dy;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String dx; 
            private String dy; 
            private String height; 
            private String width; 

            /**
             * The horizontal offset of the watermark relative to the output video image. Default value: **0**. The default value indicates no offset. The value can be an integer or a decimal.
             * <p>
             * 
             * *   **Integer**: the vertical offset. This indicates the absolute position. Unit: pixel.
             * *   **Decimal**: the ratio of the horizontal offset to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * The vertical offset of the watermark relative to the output video image. Default value: **0**. The default value indicates no offset. The value can be an integer or a decimal.
             * <p>
             * 
             * *   **Integer**: the vertical offset. This indicates the absolute position. Unit: pixel.
             * *   **Decimal**: the ratio of the vertical offset to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * The height of the watermark image in the output video. The value can be an integer or a decimal.
             * <p>
             * 
             * *   **Integer**: the height of the watermark image. This indicates the absolute position. Unit: pixel.
             * *   **Decimal**: the ratio of the height of the watermark image to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The width of the watermark image in the output video. The value can be an integer or a decimal.
             * <p>
             * 
             * *   **Integer**: the width of the watermark image. This indicates the absolute position. Unit: pixel.
             * *   **Decimal**: the ratio of the width of the watermark image to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public RatioRefer build() {
                return new RatioRefer(this);
            } 

        } 

    }
    public static class Timeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Timeline(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * The display duration of the watermark. Default value: **ToEND**. The default value indicates that the watermark is displayed until the video ends.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The beginning of the time range during which the watermark is displayed.
             * <p>
             * 
             * *   Unit: seconds.
             * *   Default value: **0**.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    public static class WaterMarkTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RatioRefer")
        private RatioRefer ratioRefer;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private Timeline timeline;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private WaterMarkTemplate(Builder builder) {
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.height = builder.height;
            this.id = builder.id;
            this.name = builder.name;
            this.ratioRefer = builder.ratioRefer;
            this.referPos = builder.referPos;
            this.state = builder.state;
            this.timeline = builder.timeline;
            this.type = builder.type;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkTemplate create() {
            return builder().build();
        }

        /**
         * @return dx
         */
        public String getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public String getDy() {
            return this.dy;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ratioRefer
         */
        public RatioRefer getRatioRefer() {
            return this.ratioRefer;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timeline
         */
        public Timeline getTimeline() {
            return this.timeline;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String dx; 
            private String dy; 
            private String height; 
            private String id; 
            private String name; 
            private RatioRefer ratioRefer; 
            private String referPos; 
            private String state; 
            private Timeline timeline; 
            private String type; 
            private String width; 

            /**
             * The horizontal offset. Unit: pixel.
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * The vertical offset. Unit: pixel.
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * The height of the watermark image. Unit: pixel.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The ID of the watermark template.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the watermark template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The values of the Height, Width, Dx, and Dy parameters relative to the reference edges. If the values of the Height, Width, Dx, and Dy parameters are decimals between 0 and 1, the values are calculated by referring to the following edges in sequence:
             * <p>
             * 
             * *   **Width**: the width edge.
             * *   **Height**: the height edge.
             * *   **Long**: the long edge.
             * *   **Short**: the short edge.
             */
            public Builder ratioRefer(RatioRefer ratioRefer) {
                this.ratioRefer = ratioRefer;
                return this;
            }

            /**
             * The position of the watermark. Valid values:
             * <p>
             * 
             * *   **TopRight**: the upper-right corner.
             * *   **TopLeft**: the upper-left corner.
             * *   **BottomRight**: the lower-right corner.
             * *   **BottomLeft**: the lower-left corner.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * The status of the watermark template. Valid values: Valid values:
             * <p>
             * 
             * *   **Normal**: The watermark template is normal.
             * *   **Deleted**: The watermark template is deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The timeline of the watermark.
             */
            public Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * The type of the watermark. Valid values:
             * <p>
             * 
             * *   Image: an image watermark.
             * *   Text: a text watermark.
             * 
             * > Only watermarks of the **Image** type are supported.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The width of the watermark image. Unit: pixel.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public WaterMarkTemplate build() {
                return new WaterMarkTemplate(this);
            } 

        } 

    }
    public static class WaterMarkTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WaterMarkTemplate")
        private java.util.List < WaterMarkTemplate> waterMarkTemplate;

        private WaterMarkTemplateList(Builder builder) {
            this.waterMarkTemplate = builder.waterMarkTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkTemplateList create() {
            return builder().build();
        }

        /**
         * @return waterMarkTemplate
         */
        public java.util.List < WaterMarkTemplate> getWaterMarkTemplate() {
            return this.waterMarkTemplate;
        }

        public static final class Builder {
            private java.util.List < WaterMarkTemplate> waterMarkTemplate; 

            /**
             * WaterMarkTemplate.
             */
            public Builder waterMarkTemplate(java.util.List < WaterMarkTemplate> waterMarkTemplate) {
                this.waterMarkTemplate = waterMarkTemplate;
                return this;
            }

            public WaterMarkTemplateList build() {
                return new WaterMarkTemplateList(this);
            } 

        } 

    }
}
