// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The IDs of the templates that do not exist.</p>
         */
        public Builder nonExistWids(NonExistWids nonExistWids) {
            this.nonExistWids = nonExistWids;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17079AF5-6276-51A9-B755-D26594C93F3C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the watermark templates.</p>
         */
        public Builder waterMarkTemplateList(WaterMarkTemplateList waterMarkTemplateList) {
            this.waterMarkTemplateList = waterMarkTemplateList;
            return this;
        }

        public QueryWaterMarkTemplateListResponseBody build() {
            return new QueryWaterMarkTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWaterMarkTemplateListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWaterMarkTemplateListResponseBody</p>
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
             * <p>0.4</p>
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
     * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWaterMarkTemplateListResponseBody</p>
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

            /**
             * <p>The display duration of the watermark. Default value: <strong>ToEND</strong>. The default value indicates that the watermark is displayed until the video ends.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWaterMarkTemplateListResponseBody</p>
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

            /**
             * <p>The horizontal offset. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The vertical offset. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the watermark image. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the watermark template.</p>
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
             * <p>example-watermark</p>
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
             * <p>The status of the watermark template. Valid values: Valid values:</p>
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
             * <blockquote>
             * <p>Only watermarks of the <strong>Image</strong> type are supported.</p>
             * </blockquote>
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
             * <p>8</p>
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
    /**
     * 
     * {@link QueryWaterMarkTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWaterMarkTemplateListResponseBody</p>
     */
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
