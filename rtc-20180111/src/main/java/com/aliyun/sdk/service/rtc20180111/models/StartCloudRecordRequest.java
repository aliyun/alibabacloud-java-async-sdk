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
 * {@link StartCloudRecordRequest} extends {@link RequestModel}
 *
 * <p>StartCloudRecordRequest</p>
 */
public class StartCloudRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotation")
    private String annotation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Backgrounds")
    private java.util.List<Backgrounds> backgrounds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgColor")
    private BgColor bgColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockWidgets")
    private java.util.List<ClockWidgets> clockWidgets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CropMode")
    private Integer cropMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutSpecifiedUsers")
    private LayoutSpecifiedUsers layoutSpecifiedUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Panes")
    private java.util.List<Panes> panes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordMode")
    private Integer recordMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionColor")
    private RegionColor regionColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservePaneForNoCameraUser")
    private Boolean reservePaneForNoCameraUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDefaultBackgroundOnMute")
    private Boolean showDefaultBackgroundOnMute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SingleStreamingRecord")
    private SingleStreamingRecord singleStreamingRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannel")
    private Boolean startWithoutChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannelWaitTime")
    private Integer startWithoutChannelWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private StorageConfig storageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubHighResolutionStream")
    private Boolean subHighResolutionStream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(maxLength = 55, minLength = 1)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Texts")
    private java.util.List<Texts> texts;

    private StartCloudRecordRequest(Builder builder) {
        super(builder);
        this.annotation = builder.annotation;
        this.appId = builder.appId;
        this.backgrounds = builder.backgrounds;
        this.bgColor = builder.bgColor;
        this.channelId = builder.channelId;
        this.clockWidgets = builder.clockWidgets;
        this.cropMode = builder.cropMode;
        this.images = builder.images;
        this.layoutSpecifiedUsers = builder.layoutSpecifiedUsers;
        this.panes = builder.panes;
        this.recordMode = builder.recordMode;
        this.regionColor = builder.regionColor;
        this.reservePaneForNoCameraUser = builder.reservePaneForNoCameraUser;
        this.showDefaultBackgroundOnMute = builder.showDefaultBackgroundOnMute;
        this.singleStreamingRecord = builder.singleStreamingRecord;
        this.startWithoutChannel = builder.startWithoutChannel;
        this.startWithoutChannelWaitTime = builder.startWithoutChannelWaitTime;
        this.storageConfig = builder.storageConfig;
        this.subHighResolutionStream = builder.subHighResolutionStream;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.texts = builder.texts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCloudRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotation
     */
    public String getAnnotation() {
        return this.annotation;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return backgrounds
     */
    public java.util.List<Backgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    /**
     * @return bgColor
     */
    public BgColor getBgColor() {
        return this.bgColor;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return clockWidgets
     */
    public java.util.List<ClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    /**
     * @return cropMode
     */
    public Integer getCropMode() {
        return this.cropMode;
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
        return this.images;
    }

    /**
     * @return layoutSpecifiedUsers
     */
    public LayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    /**
     * @return panes
     */
    public java.util.List<Panes> getPanes() {
        return this.panes;
    }

    /**
     * @return recordMode
     */
    public Integer getRecordMode() {
        return this.recordMode;
    }

    /**
     * @return regionColor
     */
    public RegionColor getRegionColor() {
        return this.regionColor;
    }

    /**
     * @return reservePaneForNoCameraUser
     */
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    /**
     * @return showDefaultBackgroundOnMute
     */
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    /**
     * @return singleStreamingRecord
     */
    public SingleStreamingRecord getSingleStreamingRecord() {
        return this.singleStreamingRecord;
    }

    /**
     * @return startWithoutChannel
     */
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    /**
     * @return startWithoutChannelWaitTime
     */
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    /**
     * @return storageConfig
     */
    public StorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * @return subHighResolutionStream
     */
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return texts
     */
    public java.util.List<Texts> getTexts() {
        return this.texts;
    }

    public static final class Builder extends Request.Builder<StartCloudRecordRequest, Builder> {
        private String annotation; 
        private String appId; 
        private java.util.List<Backgrounds> backgrounds; 
        private BgColor bgColor; 
        private String channelId; 
        private java.util.List<ClockWidgets> clockWidgets; 
        private Integer cropMode; 
        private java.util.List<Images> images; 
        private LayoutSpecifiedUsers layoutSpecifiedUsers; 
        private java.util.List<Panes> panes; 
        private Integer recordMode; 
        private RegionColor regionColor; 
        private Boolean reservePaneForNoCameraUser; 
        private Boolean showDefaultBackgroundOnMute; 
        private SingleStreamingRecord singleStreamingRecord; 
        private Boolean startWithoutChannel; 
        private Integer startWithoutChannelWaitTime; 
        private StorageConfig storageConfig; 
        private Boolean subHighResolutionStream; 
        private String taskId; 
        private String templateId; 
        private java.util.List<Texts> texts; 

        private Builder() {
            super();
        } 

        private Builder(StartCloudRecordRequest request) {
            super(request);
            this.annotation = request.annotation;
            this.appId = request.appId;
            this.backgrounds = request.backgrounds;
            this.bgColor = request.bgColor;
            this.channelId = request.channelId;
            this.clockWidgets = request.clockWidgets;
            this.cropMode = request.cropMode;
            this.images = request.images;
            this.layoutSpecifiedUsers = request.layoutSpecifiedUsers;
            this.panes = request.panes;
            this.recordMode = request.recordMode;
            this.regionColor = request.regionColor;
            this.reservePaneForNoCameraUser = request.reservePaneForNoCameraUser;
            this.showDefaultBackgroundOnMute = request.showDefaultBackgroundOnMute;
            this.singleStreamingRecord = request.singleStreamingRecord;
            this.startWithoutChannel = request.startWithoutChannel;
            this.startWithoutChannelWaitTime = request.startWithoutChannelWaitTime;
            this.storageConfig = request.storageConfig;
            this.subHighResolutionStream = request.subHighResolutionStream;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.texts = request.texts;
        } 

        /**
         * <p>Specifies whether to enable the annotation feature.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder annotation(String annotation) {
            this.putQueryParameter("Annotation", annotation);
            this.annotation = annotation;
            return this;
        }

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The local background images for the pane.</p>
         */
        public Builder backgrounds(java.util.List<Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * <p>The global background color.</p>
         */
        public Builder bgColor(BgColor bgColor) {
            this.putQueryParameter("BgColor", bgColor);
            this.bgColor = bgColor;
            return this;
        }

        /**
         * <p>The ID of an existing channel. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The global clock watermark.</p>
         */
        public Builder clockWidgets(java.util.List<ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the video while keeping the aspect ratio.</li>
         * <li><strong>2</strong>: Keeps the aspect ratio and adds padding (default).</li>
         * <li><strong>3</strong>: Stretches the video to fill the pane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cropMode(Integer cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * <p>The global image watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The specified user list for layout generation, which includes Blacklist/Whitelist.</p>
         * <p>Whitelist: specifies the users whose video streams are subscribed to in the room.</p>
         * <ul>
         * <li>After the settings are applied, padding is automatically performed in sequence based on this list.</li>
         * <li>When switching between multiple layouts in a template, only users in the whitelist are calculated.</li>
         * </ul>
         * <p>Blacklist: specifies the users whose video streams are not subscribed to in the room.</p>
         * <ul>
         * <li>When switching between multiple layouts in a template, only users not in the blacklist are calculated.</li>
         * </ul>
         */
        public Builder layoutSpecifiedUsers(LayoutSpecifiedUsers layoutSpecifiedUsers) {
            String layoutSpecifiedUsersShrink = shrink(layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
            this.putQueryParameter("LayoutSpecifiedUsers", layoutSpecifiedUsersShrink);
            this.layoutSpecifiedUsers = layoutSpecifiedUsers;
            return this;
        }

        /**
         * <p>The pane settings. You can configure up to 16 panes.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder panes(java.util.List<Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        /**
         * <p>The recording mode. Valid values:</p>
         * <ul>
         * <li>0: Mixed-stream recording. This is the default value.</li>
         * <li>1: Single-stream recording. Single-stream recording does not support updates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recordMode(Integer recordMode) {
            this.putQueryParameter("RecordMode", recordMode);
            this.recordMode = recordMode;
            return this;
        }

        /**
         * <p>The global frame background color.</p>
         */
        public Builder regionColor(RegionColor regionColor) {
            this.putQueryParameter("RegionColor", regionColor);
            this.regionColor = regionColor;
            return this;
        }

        /**
         * <p>Specifies whether to reserve a pane for a user who does not publish a camera stream. Default value: true. A value of true indicates that a pane is reserved. A value of false indicates that no pane is reserved.</p>
         */
        public Builder reservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
            this.putQueryParameter("ReservePaneForNoCameraUser", reservePaneForNoCameraUser);
            this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
            return this;
        }

        /**
         * <p>Specifies whether to display the default background image of the pane when the user is muted. Valid values:</p>
         * <ul>
         * <li>true: Displays the default background image (default).</li>
         * <li>false: Does not display the default background image. The custom background image of the pane is still displayed.</li>
         * </ul>
         */
        public Builder showDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
            this.putQueryParameter("ShowDefaultBackgroundOnMute", showDefaultBackgroundOnMute);
            this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
            return this;
        }

        /**
         * <p>The parameters for single-stream recording.</p>
         */
        public Builder singleStreamingRecord(SingleStreamingRecord singleStreamingRecord) {
            String singleStreamingRecordShrink = shrink(singleStreamingRecord, "SingleStreamingRecord", "json");
            this.putQueryParameter("SingleStreamingRecord", singleStreamingRecordShrink);
            this.singleStreamingRecord = singleStreamingRecord;
            return this;
        }

        /**
         * <p>Specifies whether to allow starting the task when the channel does not exist. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No (default).</li>
         * </ul>
         */
        public Builder startWithoutChannel(Boolean startWithoutChannel) {
            this.putQueryParameter("StartWithoutChannel", startWithoutChannel);
            this.startWithoutChannel = startWithoutChannel;
            return this;
        }

        /**
         * <p>The wait time for the task when the channel is not started, in seconds. This parameter takes effect only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder startWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
            this.putQueryParameter("StartWithoutChannelWaitTime", startWithoutChannelWaitTime);
            this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
            return this;
        }

        /**
         * <p>The storage configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder storageConfig(StorageConfig storageConfig) {
            this.putQueryParameter("StorageConfig", storageConfig);
            this.storageConfig = storageConfig;
            return this;
        }

        /**
         * <p>Specifies whether to subscribe to high-resolution streams. Valid values:</p>
         * <ul>
         * <li>false: Subscribes to streams of different resolutions based on the pane area (default).</li>
         * <li>true: Uses the highest resolution stream published by the client as padding.</li>
         * </ul>
         */
        public Builder subHighResolutionStream(Boolean subHighResolutionStream) {
            this.putQueryParameter("SubHighResolutionStream", subHighResolutionStream);
            this.subHighResolutionStream = subHighResolutionStream;
            return this;
        }

        /**
         * <p>The task ID of the cloud recording task. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>567</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The global text watermarks.</p>
         */
        public Builder texts(java.util.List<Texts> texts) {
            this.putQueryParameter("Texts", texts);
            this.texts = texts;
            return this;
        }

        @Override
        public StartCloudRecordRequest build() {
            return new StartCloudRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Backgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BackgroundCropMode")
        private Integer backgroundCropMode;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private Backgrounds(Builder builder) {
            this.alpha = builder.alpha;
            this.backgroundCropMode = builder.backgroundCropMode;
            this.height = builder.height;
            this.layer = builder.layer;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backgrounds create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return backgroundCropMode
         */
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
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
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private Integer backgroundCropMode; 
            private Double height; 
            private Integer layer; 
            private String url; 
            private Double width; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(Backgrounds model) {
                this.alpha = model.alpha;
                this.backgroundCropMode = model.backgroundCropMode;
                this.height = model.height;
                this.layer = model.layer;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
             * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder backgroundCropMode(Integer backgroundCropMode) {
                this.backgroundCropMode = backgroundCropMode;
                return this;
            }

            /**
             * <p>The height.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/123.jpg">https://aliyun.com/123.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public Backgrounds build() {
                return new Backgrounds(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class BgColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private BgColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(BgColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public BgColor build() {
                return new BgColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class BoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private BoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoxColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(BoxColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public BoxColor build() {
                return new BoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class FontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private FontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FontColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(FontColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public FontColor build() {
                return new FontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class ClockWidgets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private BoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private FontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private Integer zone;

        private ClockWidgets(Builder builder) {
            this.alpha = builder.alpha;
            this.boxAlpha = builder.boxAlpha;
            this.boxBorderw = builder.boxBorderw;
            this.boxColor = builder.boxColor;
            this.font = builder.font;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.hasBox = builder.hasBox;
            this.layer = builder.layer;
            this.x = builder.x;
            this.y = builder.y;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockWidgets create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return boxAlpha
         */
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        /**
         * @return boxBorderw
         */
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        /**
         * @return boxColor
         */
        public BoxColor getBoxColor() {
            return this.boxColor;
        }

        /**
         * @return font
         */
        public Integer getFont() {
            return this.font;
        }

        /**
         * @return fontColor
         */
        public FontColor getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return hasBox
         */
        public Boolean getHasBox() {
            return this.hasBox;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        /**
         * @return zone
         */
        public Integer getZone() {
            return this.zone;
        }

        public static final class Builder {
            private Double alpha; 
            private Double boxAlpha; 
            private Integer boxBorderw; 
            private BoxColor boxColor; 
            private Integer font; 
            private FontColor fontColor; 
            private Integer fontSize; 
            private Boolean hasBox; 
            private Integer layer; 
            private Double x; 
            private Double y; 
            private Integer zone; 

            private Builder() {
            } 

            private Builder(ClockWidgets model) {
                this.alpha = model.alpha;
                this.boxAlpha = model.boxAlpha;
                this.boxBorderw = model.boxBorderw;
                this.boxColor = model.boxColor;
                this.font = model.font;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.hasBox = model.hasBox;
                this.layer = model.layer;
                this.x = model.x;
                this.y = model.y;
                this.zone = model.zone;
            } 

            /**
             * <p>The transparency of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the text box.</p>
             */
            public Builder boxColor(BoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The font. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
             * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
             * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
             * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
             * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
             * <li><strong>5</strong>: Alimama ShuHeiTi</li>
             * <li><strong>6</strong>: DingTalk JinBuTi</li>
             * <li><strong>7</strong>: Alimama DaoLiTi</li>
             * <li><strong>8</strong>: Alimama DongFangDaKai</li>
             * <li><strong>9</strong>: Alimama FangYuanTi</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * <p>The font color.</p>
             */
            public Builder fontColor(FontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size of the clock.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Specifies whether to display a text box.</p>
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder zone(Integer zone) {
                this.zone = zone;
                return this;
            }

            public ClockWidgets build() {
                return new ClockWidgets(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("ImageCropMode")
        private Integer imageCropMode;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private Images(Builder builder) {
            this.alpha = builder.alpha;
            this.height = builder.height;
            this.imageCropMode = builder.imageCropMode;
            this.layer = builder.layer;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return imageCropMode
         */
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
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
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private Double height; 
            private Integer imageCropMode; 
            private Integer layer; 
            private String url; 
            private Double width; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.alpha = model.alpha;
                this.height = model.height;
                this.imageCropMode = model.imageCropMode;
                this.layer = model.layer;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The height.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
             * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder imageCropMode(Integer imageCropMode) {
                this.imageCropMode = imageCropMode;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The image URL. The image content cannot be updated during stream ingest.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/123xxx.jpg">https://aliyun.com/123xxx.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class LayoutSpecifiedUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ids")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> ids;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private LayoutSpecifiedUsers(Builder builder) {
            this.ids = builder.ids;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutSpecifiedUsers create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<String> getIds() {
            return this.ids;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> ids; 
            private String type; 

            private Builder() {
            } 

            private Builder(LayoutSpecifiedUsers model) {
                this.ids = model.ids;
                this.type = model.type;
            } 

            /**
             * <p>The list of specified user IDs.</p>
             * <p>This parameter is required.</p>
             */
            public Builder ids(java.util.List<String> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The type of the user list. Valid values:</p>
             * <ul>
             * <li>black: Blacklist.</li>
             * <li>white: Whitelist.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LayoutSpecifiedUsers build() {
                return new LayoutSpecifiedUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class PanesBackgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("PaneBackgroundCropMode")
        private Integer paneBackgroundCropMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private PanesBackgrounds(Builder builder) {
            this.alpha = builder.alpha;
            this.display = builder.display;
            this.height = builder.height;
            this.layer = builder.layer;
            this.paneBackgroundCropMode = builder.paneBackgroundCropMode;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PanesBackgrounds create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
        }

        /**
         * @return paneBackgroundCropMode
         */
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
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
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private String display; 
            private Double height; 
            private Integer layer; 
            private Integer paneBackgroundCropMode; 
            private String url; 
            private Double width; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(PanesBackgrounds model) {
                this.alpha = model.alpha;
                this.display = model.display;
                this.height = model.height;
                this.layer = model.layer;
                this.paneBackgroundCropMode = model.paneBackgroundCropMode;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The condition for displaying the background image. Valid values:</p>
             * <ul>
             * <li>streamOnly: The background image is displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: The background image is displayed when the current user does not have a video stream.</li>
             * <li>always: The background image is always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
             * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paneBackgroundCropMode(Integer paneBackgroundCropMode) {
                this.paneBackgroundCropMode = paneBackgroundCropMode;
                return this;
            }

            /**
             * <p>The URL of the image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public PanesBackgrounds build() {
                return new PanesBackgrounds(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class PanesImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("PaneImageCropMode")
        private Integer paneImageCropMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private PanesImages(Builder builder) {
            this.alpha = builder.alpha;
            this.display = builder.display;
            this.height = builder.height;
            this.layer = builder.layer;
            this.paneImageCropMode = builder.paneImageCropMode;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PanesImages create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
        }

        /**
         * @return paneImageCropMode
         */
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
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
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private String display; 
            private Double height; 
            private Integer layer; 
            private Integer paneImageCropMode; 
            private String url; 
            private Double width; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(PanesImages model) {
                this.alpha = model.alpha;
                this.display = model.display;
                this.height = model.height;
                this.layer = model.layer;
                this.paneImageCropMode = model.paneImageCropMode;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The condition for displaying the watermark. Valid values:</p>
             * <ul>
             * <li>streamOnly: The watermark is displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: The watermark is displayed when the current user does not have a video stream.</li>
             * <li>always: The watermark is always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
             * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paneImageCropMode(Integer paneImageCropMode) {
                this.paneImageCropMode = paneImageCropMode;
                return this;
            }

            /**
             * <p>The URL of the image. The image content cannot be updated during stream ingest.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public PanesImages build() {
                return new PanesImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class TextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private TextsBoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextsBoxColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(TextsBoxColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public TextsBoxColor build() {
                return new TextsBoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class TextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private TextsFontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextsFontColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(TextsFontColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public TextsFontColor build() {
                return new TextsFontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class PanesTexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private TextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Font")
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private TextsFontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Texture")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String texture;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private PanesTexts(Builder builder) {
            this.alpha = builder.alpha;
            this.boxAlpha = builder.boxAlpha;
            this.boxBorderw = builder.boxBorderw;
            this.boxColor = builder.boxColor;
            this.display = builder.display;
            this.font = builder.font;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.hasBox = builder.hasBox;
            this.layer = builder.layer;
            this.texture = builder.texture;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PanesTexts create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return boxAlpha
         */
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        /**
         * @return boxBorderw
         */
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        /**
         * @return boxColor
         */
        public TextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return font
         */
        public Integer getFont() {
            return this.font;
        }

        /**
         * @return fontColor
         */
        public TextsFontColor getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return hasBox
         */
        public Boolean getHasBox() {
            return this.hasBox;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
        }

        /**
         * @return texture
         */
        public String getTexture() {
            return this.texture;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private Double boxAlpha; 
            private Integer boxBorderw; 
            private TextsBoxColor boxColor; 
            private String display; 
            private Integer font; 
            private TextsFontColor fontColor; 
            private Integer fontSize; 
            private Boolean hasBox; 
            private Integer layer; 
            private String texture; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(PanesTexts model) {
                this.alpha = model.alpha;
                this.boxAlpha = model.boxAlpha;
                this.boxBorderw = model.boxBorderw;
                this.boxColor = model.boxColor;
                this.display = model.display;
                this.font = model.font;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.hasBox = model.hasBox;
                this.layer = model.layer;
                this.texture = model.texture;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the text box.</p>
             */
            public Builder boxColor(TextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The condition for displaying the watermark. Valid values:</p>
             * <ul>
             * <li>streamOnly: The watermark is displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: The watermark is displayed when the current user does not have a video stream.</li>
             * <li>always: The watermark is always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The font. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
             * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
             * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
             * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
             * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
             * <li><strong>5</strong>: Alimama ShuHeiTi</li>
             * <li><strong>6</strong>: DingTalk JinBuTi</li>
             * <li><strong>7</strong>: Alimama DaoLiTi</li>
             * <li><strong>8</strong>: Alimama DongFangDaKai</li>
             * <li><strong>9</strong>: Alimama FangYuanTi</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * <p>The font color.</p>
             */
            public Builder fontColor(TextsFontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Specifies whether to display a text box.</p>
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The content of the watermark.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Text watermark</p>
             */
            public Builder texture(String texture) {
                this.texture = texture;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public PanesTexts build() {
                return new PanesTexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Whiteboard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WhiteboardId")
        private String whiteboardId;

        private Whiteboard(Builder builder) {
            this.whiteboardId = builder.whiteboardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whiteboard create() {
            return builder().build();
        }

        /**
         * @return whiteboardId
         */
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

        public static final class Builder {
            private String whiteboardId; 

            private Builder() {
            } 

            private Builder(Whiteboard model) {
                this.whiteboardId = model.whiteboardId;
            } 

            /**
             * <p>The ID of the whiteboard. Default value: default.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder whiteboardId(String whiteboardId) {
                this.whiteboardId = whiteboardId;
                return this;
            }

            public Whiteboard build() {
                return new Whiteboard(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backgrounds")
        private java.util.List<PanesBackgrounds> backgrounds;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<PanesImages> images;

        @com.aliyun.core.annotation.NameInMap("PaneCropMode")
        private Integer paneCropMode;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("ReservePaneForOfflineUser")
        private Boolean reservePaneForOfflineUser;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<PanesTexts> texts;

        @com.aliyun.core.annotation.NameInMap("VideoOrder")
        private String videoOrder;

        @com.aliyun.core.annotation.NameInMap("Whiteboard")
        private Whiteboard whiteboard;

        private Panes(Builder builder) {
            this.backgrounds = builder.backgrounds;
            this.images = builder.images;
            this.paneCropMode = builder.paneCropMode;
            this.paneId = builder.paneId;
            this.reservePaneForOfflineUser = builder.reservePaneForOfflineUser;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.texts = builder.texts;
            this.videoOrder = builder.videoOrder;
            this.whiteboard = builder.whiteboard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return backgrounds
         */
        public java.util.List<PanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        /**
         * @return images
         */
        public java.util.List<PanesImages> getImages() {
            return this.images;
        }

        /**
         * @return paneCropMode
         */
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return reservePaneForOfflineUser
         */
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return texts
         */
        public java.util.List<PanesTexts> getTexts() {
            return this.texts;
        }

        /**
         * @return videoOrder
         */
        public String getVideoOrder() {
            return this.videoOrder;
        }

        /**
         * @return whiteboard
         */
        public Whiteboard getWhiteboard() {
            return this.whiteboard;
        }

        public static final class Builder {
            private java.util.List<PanesBackgrounds> backgrounds; 
            private java.util.List<PanesImages> images; 
            private Integer paneCropMode; 
            private Integer paneId; 
            private Boolean reservePaneForOfflineUser; 
            private String source; 
            private String sourceType; 
            private java.util.List<PanesTexts> texts; 
            private String videoOrder; 
            private Whiteboard whiteboard; 

            private Builder() {
            } 

            private Builder(Panes model) {
                this.backgrounds = model.backgrounds;
                this.images = model.images;
                this.paneCropMode = model.paneCropMode;
                this.paneId = model.paneId;
                this.reservePaneForOfflineUser = model.reservePaneForOfflineUser;
                this.source = model.source;
                this.sourceType = model.sourceType;
                this.texts = model.texts;
                this.videoOrder = model.videoOrder;
                this.whiteboard = model.whiteboard;
            } 

            /**
             * <p>The local background images for the pane.</p>
             */
            public Builder backgrounds(java.util.List<PanesBackgrounds> backgrounds) {
                this.backgrounds = backgrounds;
                return this;
            }

            /**
             * <p>The local image watermarks for the pane.</p>
             */
            public Builder images(java.util.List<PanesImages> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
             * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder paneCropMode(Integer paneCropMode) {
                this.paneCropMode = paneCropMode;
                return this;
            }

            /**
             * <p>The ID of the pane. The value starts from 0.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>Specifies whether to reserve the pane as a placeholder for users who have not joined the meeting.
             * Default value: true. A value of true indicates that if the specific user or wildcard user specified for the pane is offline, the pane is forcibly reserved as a placeholder. A value of false indicates that if the specific user or wildcard user specified for the pane is offline, video streams are displayed based on the automatic fill order.</p>
             */
            public Builder reservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
                this.reservePaneForOfflineUser = reservePaneForOfflineUser;
                return this;
            }

            /**
             * <p>The media source of the pane. You can specify a user ID. To specify a specific user type, you can use wildcard configurations. The following wildcard types are supported:</p>
             * <ul>
             * <li><strong>$ActiveSpeaker</strong>: the current speaker in the channel.</li>
             * <li><strong>$ScreenShare</strong>: the user who is sharing the screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The media type of the pane. Valid values:</p>
             * <ul>
             * <li><strong>video</strong>: The user camera or screen sharing stream. This is the default value.</li>
             * <li><strong>camera</strong>: The camera stream.</li>
             * <li><strong>screen</strong>: The screen sharing stream.</li>
             * <li><strong>whiteboard</strong>: The whiteboard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The local text watermarks for the pane.</p>
             */
            public Builder texts(java.util.List<PanesTexts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>The fill order when SourceType is set to video. Valid values:</p>
             * <ul>
             * <li>screenFirst: Screen sharing takes precedence. This is the default value.</li>
             * <li>cameraFirst: The camera takes precedence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cameraFirst</p>
             */
            public Builder videoOrder(String videoOrder) {
                this.videoOrder = videoOrder;
                return this;
            }

            /**
             * <p>The whiteboard configurations.</p>
             */
            public Builder whiteboard(Whiteboard whiteboard) {
                this.whiteboard = whiteboard;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class RegionColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private RegionColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(RegionColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public RegionColor build() {
                return new RegionColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class SpecifiedStreams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ids")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> ids;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SpecifiedStreams(Builder builder) {
            this.ids = builder.ids;
            this.streamType = builder.streamType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecifiedStreams create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<String> getIds() {
            return this.ids;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> ids; 
            private String streamType; 
            private String type; 

            private Builder() {
            } 

            private Builder(SpecifiedStreams model) {
                this.ids = model.ids;
                this.streamType = model.streamType;
                this.type = model.type;
            } 

            /**
             * <p>The list of user IDs.</p>
             * <p>This parameter is required.</p>
             */
            public Builder ids(java.util.List<String> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The type of the stream. Valid values:</p>
             * <ul>
             * <li>mic: Audio stream.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mic</p>
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The blacklists and whitelists type for single-stream recording streams. Valid values:</p>
             * <ul>
             * <li>white: Whitelist. Indicates that the stream is recorded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SpecifiedStreams build() {
                return new SpecifiedStreams(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Integer sampleRate;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.codec = builder.codec;
            this.sampleRate = builder.sampleRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return sampleRate
         */
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public static final class Builder {
            private Integer bitrate; 
            private String codec; 
            private Integer sampleRate; 

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.codec = model.codec;
                this.sampleRate = model.sampleRate;
            } 

            /**
             * <p>The bitrate, in kbps.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The audio codec format. Valid values:</p>
             * <ul>
             * <li>mp3</li>
             * <li>aac</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The sample rate. Valid values:</p>
             * <ul>
             * <li>8000</li>
             * <li>16000</li>
             * <li>32000</li>
             * <li>44100</li>
             * <li>48000</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>48000</p>
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class TranscodingParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        private TranscodingParameters(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodingParameters create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public String getContainer() {
            return this.container;
        }

        public static final class Builder {
            private Audio audio; 
            private String container; 

            private Builder() {
            } 

            private Builder(TranscodingParameters model) {
                this.audio = model.audio;
                this.container = model.container;
            } 

            /**
             * <p>The audio encoding settings.</p>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The container format for the recording file. Valid values:</p>
             * <ul>
             * <li>mp3</li>
             * <li>aac</li>
             * <li>mp4</li>
             * <li>ts</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            public TranscodingParameters build() {
                return new TranscodingParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class SingleStreamingRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvMerge")
        private Boolean avMerge;

        @com.aliyun.core.annotation.NameInMap("SpecifiedStreams")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SpecifiedStreams> specifiedStreams;

        @com.aliyun.core.annotation.NameInMap("TranscodingParameters")
        private TranscodingParameters transcodingParameters;

        private SingleStreamingRecord(Builder builder) {
            this.avMerge = builder.avMerge;
            this.specifiedStreams = builder.specifiedStreams;
            this.transcodingParameters = builder.transcodingParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleStreamingRecord create() {
            return builder().build();
        }

        /**
         * @return avMerge
         */
        public Boolean getAvMerge() {
            return this.avMerge;
        }

        /**
         * @return specifiedStreams
         */
        public java.util.List<SpecifiedStreams> getSpecifiedStreams() {
            return this.specifiedStreams;
        }

        /**
         * @return transcodingParameters
         */
        public TranscodingParameters getTranscodingParameters() {
            return this.transcodingParameters;
        }

        public static final class Builder {
            private Boolean avMerge; 
            private java.util.List<SpecifiedStreams> specifiedStreams; 
            private TranscodingParameters transcodingParameters; 

            private Builder() {
            } 

            private Builder(SingleStreamingRecord model) {
                this.avMerge = model.avMerge;
                this.specifiedStreams = model.specifiedStreams;
                this.transcodingParameters = model.transcodingParameters;
            } 

            /**
             * <p>Specifies whether to merge the audio file into the video file. Default value: false.</p>
             */
            public Builder avMerge(Boolean avMerge) {
                this.avMerge = avMerge;
                return this;
            }

            /**
             * <p>The streams specified for single-stream recording.</p>
             * <p>This parameter is required.</p>
             */
            public Builder specifiedStreams(java.util.List<SpecifiedStreams> specifiedStreams) {
                this.specifiedStreams = specifiedStreams;
                return this;
            }

            /**
             * <p>The transcoding parameters. By default, single-stream recording writes files in MP3 format. Specify this parameter if transcoding is required.</p>
             */
            public Builder transcodingParameters(TranscodingParameters transcodingParameters) {
                this.transcodingParameters = transcodingParameters;
                return this;
            }

            public SingleStreamingRecord build() {
                return new SingleStreamingRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class StorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
        private Integer vendor;

        private StorageConfig(Builder builder) {
            this.accessKey = builder.accessKey;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.region = builder.region;
            this.secretKey = builder.secretKey;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageConfig create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String accessKey; 
            private String bucket; 
            private String endpoint; 
            private Integer region; 
            private String secretKey; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(StorageConfig model) {
                this.accessKey = model.accessKey;
                this.bucket = model.bucket;
                this.endpoint = model.endpoint;
                this.region = model.region;
                this.secretKey = model.secretKey;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The AccessKey. Make sure that the RAM user associated with the AccessKey pair is granted the <strong>write</strong> permissions on the object storage service of the corresponding cloud provider. Otherwise, the result files fail to be written.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAX***</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The name of the bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-for-recording</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The private endpoint for Apsara Stack.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyuns.dalian.oss.com">https://aliyuns.dalian.oss.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The storage region.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Region</th>
             * <th>Alibaba Cloud OSS</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>0</td>
             * <td>CN_Hangzhou</td>
             * </tr>
             * <tr>
             * <td>1</td>
             * <td>CN_Shanghai</td>
             * </tr>
             * <tr>
             * <td>2</td>
             * <td>CN_Qingdao</td>
             * </tr>
             * <tr>
             * <td>3</td>
             * <td>CN_Beijing</td>
             * </tr>
             * <tr>
             * <td>4</td>
             * <td>CN_Zhangjiakou</td>
             * </tr>
             * <tr>
             * <td>5</td>
             * <td>CN_Huhehaote</td>
             * </tr>
             * <tr>
             * <td>6</td>
             * <td>CN_Shenzhen</td>
             * </tr>
             * <tr>
             * <td>7</td>
             * <td>CN_Hongkong</td>
             * </tr>
             * <tr>
             * <td>8</td>
             * <td>US_West_1</td>
             * </tr>
             * <tr>
             * <td>9</td>
             * <td>US_East_1</td>
             * </tr>
             * <tr>
             * <td>10</td>
             * <td>AP_Southeast_1</td>
             * </tr>
             * <tr>
             * <td>11</td>
             * <td>AP_Southeast_2 (Deprecated. Do not use.)</td>
             * </tr>
             * <tr>
             * <td>12</td>
             * <td>AP_Southeast_3</td>
             * </tr>
             * <tr>
             * <td>13</td>
             * <td>AP_Southeast_5</td>
             * </tr>
             * <tr>
             * <td>14</td>
             * <td>AP_Northeast_1</td>
             * </tr>
             * <tr>
             * <td>15</td>
             * <td>AP_South_1 (Deprecated. Do not use.)</td>
             * </tr>
             * <tr>
             * <td>16</td>
             * <td>EU_Central_1</td>
             * </tr>
             * <tr>
             * <td>17</td>
             * <td>EU_West_1</td>
             * </tr>
             * <tr>
             * <td>18</td>
             * <td>EU_East_1(ME_East_1)</td>
             * </tr>
             * <tr>
             * <td>19</td>
             * <td>AP_Southeast_6</td>
             * </tr>
             * <tr>
             * <td>20</td>
             * <td>CN_Heyuan</td>
             * </tr>
             * <tr>
             * <td>21</td>
             * <td>CN_Guangzhou</td>
             * </tr>
             * <tr>
             * <td>22</td>
             * <td>CN_Chengdu</td>
             * </tr>
             * <tr>
             * <td>23</td>
             * <td>CN_Nanjing</td>
             * </tr>
             * <tr>
             * <td>24</td>
             * <td>CN_Fuzhou</td>
             * </tr>
             * <tr>
             * <td>25</td>
             * <td>CN_Wulanchabu</td>
             * </tr>
             * <tr>
             * <td>26</td>
             * <td>CN_Northeast_2</td>
             * </tr>
             * <tr>
             * <td>27</td>
             * <td>CN_Southeast_7</td>
             * </tr>
             * <tr>
             * <td>28</td>
             * <td>CN_Wuhan_LR</td>
             * </tr>
             * <tr>
             * <td>100</td>
             * <td>oss-cn-hzjbp</td>
             * </tr>
             * <tr>
             * <td>101</td>
             * <td>oss-cn-shanghai-finance-1</td>
             * </tr>
             * <tr>
             * <td>102</td>
             * <td>oss-cn-shenzhen-finance-1</td>
             * </tr>
             * <tr>
             * <td>103</td>
             * <td>oss-cn-beijing-finance-1</td>
             * </tr>
             * <tr>
             * <td>104</td>
             * <td>oss-cn-hzfinance</td>
             * </tr>
             * <tr>
             * <td>105</td>
             * <td>oss-cn-shanghai-finance-1-pub</td>
             * </tr>
             * <tr>
             * <td>106</td>
             * <td>oss-cn-szfinance</td>
             * </tr>
             * <tr>
             * <td>107</td>
             * <td>oss-cn-beijing-finance-1-pub</td>
             * </tr>
             * </tbody></table>
             * <table>
             * <thead>
             * <tr>
             * <th>Region</th>
             * <th>Apsara Stack OSS</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>0</td>
             * <td>default</td>
             * </tr>
             * </tbody></table>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * <p>secretKey</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APb6qWYEzKtYxE***</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The storage platform. Valid values:</p>
             * <table>
             * <thead>
             * <tr>
             * <th>vendor</th>
             * <th>Object storage service</th>
             * <th>Remarks</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>1</td>
             * <td>AliYun OSS</td>
             * <td>Alibaba Cloud</td>
             * </tr>
             * <tr>
             * <td>2</td>
             * <td>Apsara Stack OSS</td>
             * <td>Alibaba Cloud Apsara Stack</td>
             * </tr>
             * </tbody></table>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public StorageConfig build() {
                return new StorageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class StartCloudRecordRequestTextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private StartCloudRecordRequestTextsBoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartCloudRecordRequestTextsBoxColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(StartCloudRecordRequestTextsBoxColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public StartCloudRecordRequestTextsBoxColor build() {
                return new StartCloudRecordRequestTextsBoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class StartCloudRecordRequestTextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private StartCloudRecordRequestTextsFontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartCloudRecordRequestTextsFontColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(StartCloudRecordRequestTextsFontColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The blue component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The green component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The red component.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public StartCloudRecordRequestTextsFontColor build() {
                return new StartCloudRecordRequestTextsFontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>StartCloudRecordRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private StartCloudRecordRequestTextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private StartCloudRecordRequestTextsFontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Texture")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String texture;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private Texts(Builder builder) {
            this.alpha = builder.alpha;
            this.boxAlpha = builder.boxAlpha;
            this.boxBorderw = builder.boxBorderw;
            this.boxColor = builder.boxColor;
            this.font = builder.font;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.hasBox = builder.hasBox;
            this.layer = builder.layer;
            this.texture = builder.texture;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Texts create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Double getAlpha() {
            return this.alpha;
        }

        /**
         * @return boxAlpha
         */
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        /**
         * @return boxBorderw
         */
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        /**
         * @return boxColor
         */
        public StartCloudRecordRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        /**
         * @return font
         */
        public Integer getFont() {
            return this.font;
        }

        /**
         * @return fontColor
         */
        public StartCloudRecordRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return hasBox
         */
        public Boolean getHasBox() {
            return this.hasBox;
        }

        /**
         * @return layer
         */
        public Integer getLayer() {
            return this.layer;
        }

        /**
         * @return texture
         */
        public String getTexture() {
            return this.texture;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double alpha; 
            private Double boxAlpha; 
            private Integer boxBorderw; 
            private StartCloudRecordRequestTextsBoxColor boxColor; 
            private Integer font; 
            private StartCloudRecordRequestTextsFontColor fontColor; 
            private Integer fontSize; 
            private Boolean hasBox; 
            private Integer layer; 
            private String texture; 
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(Texts model) {
                this.alpha = model.alpha;
                this.boxAlpha = model.boxAlpha;
                this.boxBorderw = model.boxBorderw;
                this.boxColor = model.boxColor;
                this.font = model.font;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.hasBox = model.hasBox;
                this.layer = model.layer;
                this.texture = model.texture;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The transparency of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the text box.</p>
             */
            public Builder boxColor(StartCloudRecordRequestTextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The font. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
             * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
             * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
             * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
             * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
             * <li><strong>5</strong>: Alimama ShuHeiTi</li>
             * <li><strong>6</strong>: DingTalk JinBuTi</li>
             * <li><strong>7</strong>: Alimama DaoLiTi</li>
             * <li><strong>8</strong>: Alimama DongFangDaKai</li>
             * <li><strong>9</strong>: Alimama FangYuanTi</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * <p>The font color.</p>
             */
            public Builder fontColor(StartCloudRecordRequestTextsFontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Specifies whether to display a text box.</p>
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * <p>The z-axis layer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The content of the watermark.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Text watermark</p>
             */
            public Builder texture(String texture) {
                this.texture = texture;
                return this;
            }

            /**
             * <p>The x-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public Texts build() {
                return new Texts(this);
            } 

        } 

    }
}
