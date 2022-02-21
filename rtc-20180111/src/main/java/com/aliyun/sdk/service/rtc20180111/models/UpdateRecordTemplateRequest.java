// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecordTemplateRequest</p>
 */
public class UpdateRecordTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("BackgroundColor")
    private Integer backgroundColor;

    @Query
    @NameInMap("Backgrounds")
    private java.util.List < Backgrounds> backgrounds;

    @Query
    @NameInMap("ClockWidgets")
    private java.util.List < ClockWidgets> clockWidgets;

    @Query
    @NameInMap("DelayStopTime")
    @Validation(maximum = 86400, minimum = 5)
    private Integer delayStopTime;

    @Query
    @NameInMap("EnableM3u8DateTime")
    private Boolean enableM3u8DateTime;

    @Query
    @NameInMap("FileSplitInterval")
    @Validation(required = true)
    private Integer fileSplitInterval;

    @Query
    @NameInMap("Formats")
    @Validation(required = true)
    private java.util.List < String > formats;

    @Query
    @NameInMap("HttpCallbackUrl")
    private String httpCallbackUrl;

    @Query
    @NameInMap("LayoutIds")
    @Validation(required = true)
    private java.util.List < Long > layoutIds;

    @Query
    @NameInMap("MediaEncode")
    @Validation(required = true)
    private Integer mediaEncode;

    @Query
    @NameInMap("MnsQueue")
    private String mnsQueue;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Query
    @NameInMap("OssFilePrefix")
    @Validation(required = true)
    private String ossFilePrefix;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TaskProfile")
    @Validation(required = true)
    private String taskProfile;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("Watermarks")
    private java.util.List < Watermarks> watermarks;

    private UpdateRecordTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgroundColor = builder.backgroundColor;
        this.backgrounds = builder.backgrounds;
        this.clockWidgets = builder.clockWidgets;
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
        this.ownerId = builder.ownerId;
        this.taskProfile = builder.taskProfile;
        this.templateId = builder.templateId;
        this.watermarks = builder.watermarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<UpdateRecordTemplateRequest, Builder> {
        private String appId; 
        private Integer backgroundColor; 
        private java.util.List < Backgrounds> backgrounds; 
        private java.util.List < ClockWidgets> clockWidgets; 
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
        private Long ownerId; 
        private String taskProfile; 
        private String templateId; 
        private java.util.List < Watermarks> watermarks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecordTemplateRequest response) {
            super(response);
            this.appId = response.appId;
            this.backgroundColor = response.backgroundColor;
            this.backgrounds = response.backgrounds;
            this.clockWidgets = response.clockWidgets;
            this.delayStopTime = response.delayStopTime;
            this.enableM3u8DateTime = response.enableM3u8DateTime;
            this.fileSplitInterval = response.fileSplitInterval;
            this.formats = response.formats;
            this.httpCallbackUrl = response.httpCallbackUrl;
            this.layoutIds = response.layoutIds;
            this.mediaEncode = response.mediaEncode;
            this.mnsQueue = response.mnsQueue;
            this.name = response.name;
            this.ossBucket = response.ossBucket;
            this.ossFilePrefix = response.ossFilePrefix;
            this.ownerId = response.ownerId;
            this.taskProfile = response.taskProfile;
            this.templateId = response.templateId;
            this.watermarks = response.watermarks;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BackgroundColor.
         */
        public Builder backgroundColor(Integer backgroundColor) {
            this.putQueryParameter("BackgroundColor", backgroundColor);
            this.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * Backgrounds.
         */
        public Builder backgrounds(java.util.List < Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * ClockWidgets.
         */
        public Builder clockWidgets(java.util.List < ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * DelayStopTime.
         */
        public Builder delayStopTime(Integer delayStopTime) {
            this.putQueryParameter("DelayStopTime", delayStopTime);
            this.delayStopTime = delayStopTime;
            return this;
        }

        /**
         * EnableM3u8DateTime.
         */
        public Builder enableM3u8DateTime(Boolean enableM3u8DateTime) {
            this.putQueryParameter("EnableM3u8DateTime", enableM3u8DateTime);
            this.enableM3u8DateTime = enableM3u8DateTime;
            return this;
        }

        /**
         * FileSplitInterval.
         */
        public Builder fileSplitInterval(Integer fileSplitInterval) {
            this.putQueryParameter("FileSplitInterval", fileSplitInterval);
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }

        /**
         * Formats.
         */
        public Builder formats(java.util.List < String > formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * HttpCallbackUrl.
         */
        public Builder httpCallbackUrl(String httpCallbackUrl) {
            this.putQueryParameter("HttpCallbackUrl", httpCallbackUrl);
            this.httpCallbackUrl = httpCallbackUrl;
            return this;
        }

        /**
         * LayoutIds.
         */
        public Builder layoutIds(java.util.List < Long > layoutIds) {
            this.putQueryParameter("LayoutIds", layoutIds);
            this.layoutIds = layoutIds;
            return this;
        }

        /**
         * MediaEncode.
         */
        public Builder mediaEncode(Integer mediaEncode) {
            this.putQueryParameter("MediaEncode", mediaEncode);
            this.mediaEncode = mediaEncode;
            return this;
        }

        /**
         * MnsQueue.
         */
        public Builder mnsQueue(String mnsQueue) {
            this.putQueryParameter("MnsQueue", mnsQueue);
            this.mnsQueue = mnsQueue;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssFilePrefix.
         */
        public Builder ossFilePrefix(String ossFilePrefix) {
            this.putQueryParameter("OssFilePrefix", ossFilePrefix);
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TaskProfile.
         */
        public Builder taskProfile(String taskProfile) {
            this.putQueryParameter("TaskProfile", taskProfile);
            this.taskProfile = taskProfile;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Watermarks.
         */
        public Builder watermarks(java.util.List < Watermarks> watermarks) {
            this.putQueryParameter("Watermarks", watermarks);
            this.watermarks = watermarks;
            return this;
        }

        @Override
        public UpdateRecordTemplateRequest build() {
            return new UpdateRecordTemplateRequest(this);
        } 

    } 

    public static class Backgrounds extends TeaModel {
        @NameInMap("Display")
        private Integer display;

        @NameInMap("Height")
        private Float height;

        @NameInMap("Url")
        private String url;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer ZOrder;

        private Backgrounds(Builder builder) {
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.ZOrder = builder.ZOrder;
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
         * @return ZOrder
         */
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public static final class Builder {
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer ZOrder; 

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
            public Builder ZOrder(Integer ZOrder) {
                this.ZOrder = ZOrder;
                return this;
            }

            public Backgrounds build() {
                return new Backgrounds(this);
            } 

        } 

    }
    public static class ClockWidgets extends TeaModel {
        @NameInMap("FontColor")
        private Integer fontColor;

        @NameInMap("FontSize")
        private Integer fontSize;

        @NameInMap("FontType")
        private Integer fontType;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer ZOrder;

        private ClockWidgets(Builder builder) {
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.x = builder.x;
            this.y = builder.y;
            this.ZOrder = builder.ZOrder;
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
         * @return ZOrder
         */
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public static final class Builder {
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private Float x; 
            private Float y; 
            private Integer ZOrder; 

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
            public Builder ZOrder(Integer ZOrder) {
                this.ZOrder = ZOrder;
                return this;
            }

            public ClockWidgets build() {
                return new ClockWidgets(this);
            } 

        } 

    }
    public static class Watermarks extends TeaModel {
        @NameInMap("Alpha")
        private Float alpha;

        @NameInMap("Display")
        private Integer display;

        @NameInMap("Height")
        private Float height;

        @NameInMap("Url")
        private String url;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer ZOrder;

        private Watermarks(Builder builder) {
            this.alpha = builder.alpha;
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.ZOrder = builder.ZOrder;
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
         * @return ZOrder
         */
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public static final class Builder {
            private Float alpha; 
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer ZOrder; 

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
            public Builder ZOrder(Integer ZOrder) {
                this.ZOrder = ZOrder;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
}
