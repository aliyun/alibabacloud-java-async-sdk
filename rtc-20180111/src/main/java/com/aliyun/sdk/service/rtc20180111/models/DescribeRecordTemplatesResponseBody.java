// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordTemplatesResponseBody</p>
 */
public class DescribeRecordTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List < Templates> templates;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
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
        private java.util.List < Templates> templates; 
        private Long totalNum; 
        private Long totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRecordTemplatesResponseBody build() {
            return new DescribeRecordTemplatesResponseBody(this);
        } 

    } 

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

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
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

            /**
             * FontColor.
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * FontType.
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
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

            /**
             * Alpha.
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
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
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundColor")
        private Integer backgroundColor;

        @com.aliyun.core.annotation.NameInMap("Backgrounds")
        private java.util.List < Backgrounds> backgrounds;

        @com.aliyun.core.annotation.NameInMap("ClockWidgets")
        private java.util.List < ClockWidgets> clockWidgets;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DelayStopTime")
        private Integer delayStopTime;

        @com.aliyun.core.annotation.NameInMap("EnableM3u8DateTime")
        private Boolean enableM3u8DateTime;

        @com.aliyun.core.annotation.NameInMap("FileSplitInterval")
        private Integer fileSplitInterval;

        @com.aliyun.core.annotation.NameInMap("Formats")
        private java.util.List < String > formats;

        @com.aliyun.core.annotation.NameInMap("HttpCallbackUrl")
        private String httpCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        private java.util.List < Long > layoutIds;

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
        private java.util.List < Watermarks> watermarks;

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
        public java.util.List < Backgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        /**
         * @return clockWidgets
         */
        public java.util.List < ClockWidgets> getClockWidgets() {
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
        public java.util.List < String > getFormats() {
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
        public java.util.List < Long > getLayoutIds() {
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
        public java.util.List < Watermarks> getWatermarks() {
            return this.watermarks;
        }

        public static final class Builder {
            private Integer backgroundColor; 
            private java.util.List < Backgrounds> backgrounds; 
            private java.util.List < ClockWidgets> clockWidgets; 
            private String createTime; 
            private Integer delayStopTime; 
            private Boolean enableM3u8DateTime; 
            private Integer fileSplitInterval; 
            private java.util.List < String > formats; 
            private String httpCallbackUrl; 
            private java.util.List < Long > layoutIds; 
            private Integer mediaEncode; 
            private String mnsQueue; 
            private String name; 
            private String ossBucket; 
            private String ossFilePrefix; 
            private String taskProfile; 
            private String templateId; 
            private java.util.List < Watermarks> watermarks; 

            /**
             * BackgroundColor.
             */
            public Builder backgroundColor(Integer backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }

            /**
             * Backgrounds.
             */
            public Builder backgrounds(java.util.List < Backgrounds> backgrounds) {
                this.backgrounds = backgrounds;
                return this;
            }

            /**
             * ClockWidgets.
             */
            public Builder clockWidgets(java.util.List < ClockWidgets> clockWidgets) {
                this.clockWidgets = clockWidgets;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DelayStopTime.
             */
            public Builder delayStopTime(Integer delayStopTime) {
                this.delayStopTime = delayStopTime;
                return this;
            }

            /**
             * EnableM3u8DateTime.
             */
            public Builder enableM3u8DateTime(Boolean enableM3u8DateTime) {
                this.enableM3u8DateTime = enableM3u8DateTime;
                return this;
            }

            /**
             * FileSplitInterval.
             */
            public Builder fileSplitInterval(Integer fileSplitInterval) {
                this.fileSplitInterval = fileSplitInterval;
                return this;
            }

            /**
             * Formats.
             */
            public Builder formats(java.util.List < String > formats) {
                this.formats = formats;
                return this;
            }

            /**
             * HttpCallbackUrl.
             */
            public Builder httpCallbackUrl(String httpCallbackUrl) {
                this.httpCallbackUrl = httpCallbackUrl;
                return this;
            }

            /**
             * LayoutIds.
             */
            public Builder layoutIds(java.util.List < Long > layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * MediaEncode.
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * MnsQueue.
             */
            public Builder mnsQueue(String mnsQueue) {
                this.mnsQueue = mnsQueue;
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
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssFilePrefix.
             */
            public Builder ossFilePrefix(String ossFilePrefix) {
                this.ossFilePrefix = ossFilePrefix;
                return this;
            }

            /**
             * TaskProfile.
             */
            public Builder taskProfile(String taskProfile) {
                this.taskProfile = taskProfile;
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
             * Watermarks.
             */
            public Builder watermarks(java.util.List < Watermarks> watermarks) {
                this.watermarks = watermarks;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
