// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link AddWaterMarkTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>AddWaterMarkTemplateResponseBody</p>
 */
public class AddWaterMarkTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaterMarkTemplate")
    private WaterMarkTemplate waterMarkTemplate;

    private AddWaterMarkTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waterMarkTemplate = builder.waterMarkTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWaterMarkTemplateResponseBody create() {
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
     * @return waterMarkTemplate
     */
    public WaterMarkTemplate getWaterMarkTemplate() {
        return this.waterMarkTemplate;
    }

    public static final class Builder {
        private String requestId; 
        private WaterMarkTemplate waterMarkTemplate; 

        private Builder() {
        } 

        private Builder(AddWaterMarkTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.waterMarkTemplate = model.waterMarkTemplate;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54BB917F-DD35-4F32-BABA-E60E31B21W63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the watermark template.</p>
         */
        public Builder waterMarkTemplate(WaterMarkTemplate waterMarkTemplate) {
            this.waterMarkTemplate = waterMarkTemplate;
            return this;
        }

        public AddWaterMarkTemplateResponseBody build() {
            return new AddWaterMarkTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddWaterMarkTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddWaterMarkTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RatioRefer model) {
                this.dx = model.dx;
                this.dy = model.dy;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * <p>The horizontal offset of the watermark relative to the output video image. Default value: <strong>0</strong>. The default value indicates no offset. The value can be an integer or a decimal.</p>
             * <ul>
             * <li><strong>Integer</strong>: the vertical offset. This indicates the absolute position. Unit: pixel.</li>
             * <li><strong>Decimal</strong>: the ratio of the horizontal offset to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.51</p>
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The vertical offset of the watermark relative to the output video image. Default value: <strong>0</strong>. The default value indicates no offset. The value can be an integer or a decimal.</p>
             * <ul>
             * <li><strong>Integer</strong>: the vertical offset. This indicates the absolute position. Unit: pixel.</li>
             * <li><strong>Decimal</strong>: the ratio of the vertical offset to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.28</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the watermark image in the output video. The value can be an integer or a decimal.</p>
             * <ul>
             * <li><strong>Integer</strong>: the height of the watermark image. This indicates the absolute position. Unit: pixel.</li>
             * <li><strong>Decimal</strong>: the ratio of the height of the watermark image to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.33</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The width of the watermark image in the output video. The value can be an integer or a decimal.</p>
             * <ul>
             * <li><strong>Integer</strong>: the width of the watermark image. This indicates the absolute position. Unit: pixel.</li>
             * <li><strong>Decimal</strong>: the ratio of the width of the watermark image to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.36</p>
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
    /**
     * 
     * {@link AddWaterMarkTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddWaterMarkTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Timeline model) {
                this.duration = model.duration;
                this.start = model.start;
            } 

            /**
             * <p>The display duration of the watermark. Default value: <strong>ToEND</strong>. The default value indicates that the watermark is displayed until the video ends.</p>
             * 
             * <strong>example:</strong>
             * <p>ToEND</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the watermark is displayed.</p>
             * <ul>
             * <li>Unit: seconds.</li>
             * <li>Default value: <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link AddWaterMarkTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddWaterMarkTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(WaterMarkTemplate model) {
                this.dx = model.dx;
                this.dy = model.dy;
                this.height = model.height;
                this.id = model.id;
                this.name = model.name;
                this.ratioRefer = model.ratioRefer;
                this.referPos = model.referPos;
                this.state = model.state;
                this.timeline = model.timeline;
                this.type = model.type;
                this.width = model.width;
            } 

            /**
             * <p>The horizontal offset. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The vertical offset. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the watermark image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the watermark template. We recommend that you keep this ID for subsequent operation calls.</p>
             * 
             * <strong>example:</strong>
             * <p>3780bd69b2b74540bc7b1096f564****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the watermark template.</p>
             * 
             * <strong>example:</strong>
             * <p>example-watermark-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The values of the Height, Width, Dx, and Dy parameters relative to the reference edges. If the values of the Height, Width, Dx, and Dy parameters are decimals between 0 and 1, the values are calculated by referring to the following edges in sequence:</p>
             * <ul>
             * <li><strong>Width</strong>: the width edge.</li>
             * <li><strong>Height</strong>: the height edge.</li>
             * <li><strong>Long</strong>: the long edge.</li>
             * <li><strong>Short</strong>: the short edge.</li>
             * </ul>
             */
            public Builder ratioRefer(RatioRefer ratioRefer) {
                this.ratioRefer = ratioRefer;
                return this;
            }

            /**
             * <p>The position of the watermark. Valid values:</p>
             * <ul>
             * <li><strong>TopRight</strong>: the upper-right corner.</li>
             * <li><strong>TopLeft</strong>: the upper-left corner.</li>
             * <li><strong>BottomRight</strong>: the lower-right corner.</li>
             * <li><strong>BottomLeft</strong>: the lower-left corner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TopRight</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The status of the watermark template.</p>
             * <ul>
             * <li><strong>Normal</strong>: The watermark template is normal.</li>
             * <li><strong>Deleted</strong>: The watermark template is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The timeline of the watermark.</p>
             */
            public Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The type of the watermark. Valid values:</p>
             * <ul>
             * <li>Image: an image watermark.</li>
             * <li>Text: a text watermark.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The width of the watermark image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
}
