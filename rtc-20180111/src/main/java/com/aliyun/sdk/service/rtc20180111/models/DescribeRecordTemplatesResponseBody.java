// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordTemplatesResponseBody</p>
 */
public class DescribeRecordTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List<Templates> templates;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeRecordTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordTemplatesResponseBody create() {
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
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Templates> templates; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeRecordTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.templates = model.templates;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C292B80E-5175-4BA4-8CC292B80E-5175-4BA4-8C1E-2ABEC4D7C2FE1E-2ABEC4D7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The recording configuration templates.</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRecordTemplatesResponseBody build() {
            return new DescribeRecordTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordTemplatesResponseBody</p>
     */
    public static class Backgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Backgrounds(Builder builder) {
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backgrounds create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Backgrounds model) {
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>Specifies whether to display the background image. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (None): Not displayed.</li>
             * <li><strong>1</strong> (Always): Always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the background image pane. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the background image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the background image pane. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate of the background image. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate of the background image. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order of the background image. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above the bottom layer, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Backgrounds build() {
                return new Backgrounds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordTemplatesResponseBody</p>
     */
    public static class ClockWidgets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FontColor")
        private Integer fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("FontType")
        private Integer fontType;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private ClockWidgets(Builder builder) {
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockWidgets create() {
            return builder().build();
        }

        /**
         * @return fontColor
         */
        public Integer getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return fontType
         */
        public Integer getFontType() {
            return this.fontType;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(ClockWidgets model) {
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.fontType = model.fontType;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The text color of the clock (RGB).</p>
             * <p>The calculation formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size of the clock. Valid values: <strong>(0, 72]</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The font type of the clock. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): NOTO_SERIF_CJKSC_REGULAR</li>
             * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR</li>
             * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD</li>
             * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy</li>
             * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT</li>
             * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * <p>The X-coordinate of the clock. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate of the clock. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order of the clock. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above the bottom layer, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public ClockWidgets build() {
                return new ClockWidgets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordTemplatesResponseBody</p>
     */
    public static class Watermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Float alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Watermarks(Builder builder) {
            this.alpha = builder.alpha;
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float alpha; 
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Watermarks model) {
                this.alpha = model.alpha;
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The transparency of the watermark. The value is a normalized percentage. A value of 0 indicates transparent, and a value of 1 indicates completely opaque.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Specifies whether to display the watermark. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (None): Not displayed.</li>
             * <li><strong>1</strong> (Always): Always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the watermark pane. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the watermark pane. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate of the watermark. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate of the watermark. The value is a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order of the watermark. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above the bottom layer, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundColor")
        private Integer backgroundColor;

        @com.aliyun.core.annotation.NameInMap("Backgrounds")
        private java.util.List<Backgrounds> backgrounds;

        @com.aliyun.core.annotation.NameInMap("ClockWidgets")
        private java.util.List<ClockWidgets> clockWidgets;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DelayStopTime")
        private Integer delayStopTime;

        @com.aliyun.core.annotation.NameInMap("EnableM3u8DateTime")
        private Boolean enableM3u8DateTime;

        @com.aliyun.core.annotation.NameInMap("FileSplitInterval")
        private Integer fileSplitInterval;

        @com.aliyun.core.annotation.NameInMap("Formats")
        private java.util.List<String> formats;

        @com.aliyun.core.annotation.NameInMap("HttpCallbackUrl")
        private String httpCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        private java.util.List<Long> layoutIds;

        @com.aliyun.core.annotation.NameInMap("MediaEncode")
        private Integer mediaEncode;

        @com.aliyun.core.annotation.NameInMap("MnsQueue")
        private String mnsQueue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssFilePrefix")
        private String ossFilePrefix;

        @com.aliyun.core.annotation.NameInMap("TaskProfile")
        private String taskProfile;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Watermarks")
        private java.util.List<Watermarks> watermarks;

        private Templates(Builder builder) {
            this.backgroundColor = builder.backgroundColor;
            this.backgrounds = builder.backgrounds;
            this.clockWidgets = builder.clockWidgets;
            this.createTime = builder.createTime;
            this.delayStopTime = builder.delayStopTime;
            this.enableM3u8DateTime = builder.enableM3u8DateTime;
            this.fileSplitInterval = builder.fileSplitInterval;
            this.formats = builder.formats;
            this.httpCallbackUrl = builder.httpCallbackUrl;
            this.layoutIds = builder.layoutIds;
            this.mediaEncode = builder.mediaEncode;
            this.mnsQueue = builder.mnsQueue;
            this.name = builder.name;
            this.ossBucket = builder.ossBucket;
            this.ossFilePrefix = builder.ossFilePrefix;
            this.taskProfile = builder.taskProfile;
            this.templateId = builder.templateId;
            this.watermarks = builder.watermarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return backgroundColor
         */
        public Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        /**
         * @return backgrounds
         */
        public java.util.List<Backgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        /**
         * @return clockWidgets
         */
        public java.util.List<ClockWidgets> getClockWidgets() {
            return this.clockWidgets;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delayStopTime
         */
        public Integer getDelayStopTime() {
            return this.delayStopTime;
        }

        /**
         * @return enableM3u8DateTime
         */
        public Boolean getEnableM3u8DateTime() {
            return this.enableM3u8DateTime;
        }

        /**
         * @return fileSplitInterval
         */
        public Integer getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        /**
         * @return formats
         */
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        /**
         * @return httpCallbackUrl
         */
        public String getHttpCallbackUrl() {
            return this.httpCallbackUrl;
        }

        /**
         * @return layoutIds
         */
        public java.util.List<Long> getLayoutIds() {
            return this.layoutIds;
        }

        /**
         * @return mediaEncode
         */
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        /**
         * @return mnsQueue
         */
        public String getMnsQueue() {
            return this.mnsQueue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossFilePrefix
         */
        public String getOssFilePrefix() {
            return this.ossFilePrefix;
        }

        /**
         * @return taskProfile
         */
        public String getTaskProfile() {
            return this.taskProfile;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return watermarks
         */
        public java.util.List<Watermarks> getWatermarks() {
            return this.watermarks;
        }

        public static final class Builder {
            private Integer backgroundColor; 
            private java.util.List<Backgrounds> backgrounds; 
            private java.util.List<ClockWidgets> clockWidgets; 
            private String createTime; 
            private Integer delayStopTime; 
            private Boolean enableM3u8DateTime; 
            private Integer fileSplitInterval; 
            private java.util.List<String> formats; 
            private String httpCallbackUrl; 
            private java.util.List<Long> layoutIds; 
            private Integer mediaEncode; 
            private String mnsQueue; 
            private String name; 
            private String ossBucket; 
            private String ossFilePrefix; 
            private String taskProfile; 
            private String templateId; 
            private java.util.List<Watermarks> watermarks; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.backgroundColor = model.backgroundColor;
                this.backgrounds = model.backgrounds;
                this.clockWidgets = model.clockWidgets;
                this.createTime = model.createTime;
                this.delayStopTime = model.delayStopTime;
                this.enableM3u8DateTime = model.enableM3u8DateTime;
                this.fileSplitInterval = model.fileSplitInterval;
                this.formats = model.formats;
                this.httpCallbackUrl = model.httpCallbackUrl;
                this.layoutIds = model.layoutIds;
                this.mediaEncode = model.mediaEncode;
                this.mnsQueue = model.mnsQueue;
                this.name = model.name;
                this.ossBucket = model.ossBucket;
                this.ossFilePrefix = model.ossFilePrefix;
                this.taskProfile = model.taskProfile;
                this.templateId = model.templateId;
                this.watermarks = model.watermarks;
            } 

            /**
             * <p>The RGB value of the background color. Default value: <strong>0</strong> (black). The calculation formula is R + G × 256 + B × 65536. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backgroundColor(Integer backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }

            /**
             * <p>The list of background image information.</p>
             */
            public Builder backgrounds(java.util.List<Backgrounds> backgrounds) {
                this.backgrounds = backgrounds;
                return this;
            }

            /**
             * <p>The list of clock widgets.</p>
             */
            public Builder clockWidgets(java.util.List<ClockWidgets> clockWidgets) {
                this.clockWidgets = clockWidgets;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-04T06:22:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The delay before stopping the recording. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder delayStopTime(Integer delayStopTime) {
                this.delayStopTime = delayStopTime;
                return this;
            }

            /**
             * <p>Specifies whether to add the timestamp of the TS file to the recorded M3U8 file.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableM3u8DateTime(Boolean enableM3u8DateTime) {
                this.enableM3u8DateTime = enableM3u8DateTime;
                return this;
            }

            /**
             * <p>The file splitting duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder fileSplitInterval(Integer fileSplitInterval) {
                this.fileSplitInterval = fileSplitInterval;
                return this;
            }

            /**
             * <p>The list of recording file formats. Valid formats include M3U8, FLV, and MP4.</p>
             */
            public Builder formats(java.util.List<String> formats) {
                this.formats = formats;
                return this;
            }

            /**
             * <p>The HTTP callback URL for recording events.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
             */
            public Builder httpCallbackUrl(String httpCallbackUrl) {
                this.httpCallbackUrl = httpCallbackUrl;
                return this;
            }

            /**
             * <p>The list of mixed-stream layout IDs used by the recording template.</p>
             */
            public Builder layoutIds(java.util.List<Long> layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * <p>The encoding options.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * <p>The name of the Message Service (MNS) queue for recording event callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p>record-callback-queue</p>
             */
            public Builder mnsQueue(String mnsQueue) {
                this.mnsQueue = mnsQueue;
                return this;
            }

            /**
             * <p>The name of the recording configuration template.</p>
             * 
             * <strong>example:</strong>
             * <p>Template-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket where recording files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>rtc-record-oss</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The naming rule for recording files.</p>
             * 
             * <strong>example:</strong>
             * <p>record/pre/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
             */
            public Builder ossFilePrefix(String ossFilePrefix) {
                this.ossFilePrefix = ossFilePrefix;
                return this;
            }

            /**
             * <p>The task specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>4IN_1080P</p>
             */
            public Builder taskProfile(String taskProfile) {
                this.taskProfile = taskProfile;
                return this;
            }

            /**
             * <p>The ID of the recording configuration template.</p>
             * 
             * <strong>example:</strong>
             * <p>1ca698e2-57fa-4314-8e11-00d950d4****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The list of watermark information.</p>
             */
            public Builder watermarks(java.util.List<Watermarks> watermarks) {
                this.watermarks = watermarks;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
