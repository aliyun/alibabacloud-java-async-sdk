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
 * {@link StartStreamingOutRequest} extends {@link RequestModel}
 *
 * <p>StartStreamingOutRequest</p>
 */
public class StartStreamingOutRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RegionColor")
    private RegionColor regionColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservePaneForNoCameraUser")
    private Boolean reservePaneForNoCameraUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDefaultBackgroundOnMute")
    private Boolean showDefaultBackgroundOnMute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecMixedUserList")
    private java.util.List<String> specMixedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannel")
    private Boolean startWithoutChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannelWaitTime")
    private Integer startWithoutChannelWaitTime;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String url;

    private StartStreamingOutRequest(Builder builder) {
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
        this.regionColor = builder.regionColor;
        this.reservePaneForNoCameraUser = builder.reservePaneForNoCameraUser;
        this.showDefaultBackgroundOnMute = builder.showDefaultBackgroundOnMute;
        this.specMixedUserList = builder.specMixedUserList;
        this.startWithoutChannel = builder.startWithoutChannel;
        this.startWithoutChannelWaitTime = builder.startWithoutChannelWaitTime;
        this.subHighResolutionStream = builder.subHighResolutionStream;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.texts = builder.texts;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartStreamingOutRequest create() {
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
     * @return specMixedUserList
     */
    public java.util.List<String> getSpecMixedUserList() {
        return this.specMixedUserList;
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<StartStreamingOutRequest, Builder> {
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
        private RegionColor regionColor; 
        private Boolean reservePaneForNoCameraUser; 
        private Boolean showDefaultBackgroundOnMute; 
        private java.util.List<String> specMixedUserList; 
        private Boolean startWithoutChannel; 
        private Integer startWithoutChannelWaitTime; 
        private Boolean subHighResolutionStream; 
        private String taskId; 
        private String templateId; 
        private java.util.List<Texts> texts; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(StartStreamingOutRequest request) {
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
            this.regionColor = request.regionColor;
            this.reservePaneForNoCameraUser = request.reservePaneForNoCameraUser;
            this.showDefaultBackgroundOnMute = request.showDefaultBackgroundOnMute;
            this.specMixedUserList = request.specMixedUserList;
            this.startWithoutChannel = request.startWithoutChannel;
            this.startWithoutChannelWaitTime = request.startWithoutChannelWaitTime;
            this.subHighResolutionStream = request.subHighResolutionStream;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.texts = request.texts;
            this.url = request.url;
        } 

        /**
         * <p>The annotation switch.</p>
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
         * <p>The background image.</p>
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
         * <li><strong>1</strong>: Crop the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders (default).</li>
         * <li><strong>3</strong>: Stretch the image to fill the pane.</li>
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
         * <p>The global image watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The specified user list for layout generation, including Blacklist/Whitelist.</p>
         * <p>Whitelist: specifies the users whose video streams are subscribed to in the channel.</p>
         * <ul>
         * <li>After the settings are applied, automatic padding is performed in sequence based on this list.</li>
         * <li>When switching between multiple layouts in a template, only users in the whitelist are considered.</li>
         * </ul>
         * <p>Blacklist: specifies the users whose video streams are not subscribed to in the channel.</p>
         * <ul>
         * <li>When switching between multiple layouts in a template, only users not in the blacklist are considered.</li>
         * </ul>
         */
        public Builder layoutSpecifiedUsers(LayoutSpecifiedUsers layoutSpecifiedUsers) {
            String layoutSpecifiedUsersShrink = shrink(layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
            this.putQueryParameter("LayoutSpecifiedUsers", layoutSpecifiedUsersShrink);
            this.layoutSpecifiedUsers = layoutSpecifiedUsers;
            return this;
        }

        /**
         * <p>The pane settings.</p>
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
         * <p>The global pane background color.</p>
         */
        public Builder regionColor(RegionColor regionColor) {
            this.putQueryParameter("RegionColor", regionColor);
            this.regionColor = regionColor;
            return this;
        }

        /**
         * <p>Specifies whether to reserve a pane placeholder for users who do not push camera streams. Default value: true. A value of true indicates that a pane is reserved when a user does not push a camera stream. A value of false indicates that no pane is reserved.</p>
         */
        public Builder reservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
            this.putQueryParameter("ReservePaneForNoCameraUser", reservePaneForNoCameraUser);
            this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
            return this;
        }

        /**
         * <p>Specifies whether to display the default background image of a pane when the user is muted. Valid values:</p>
         * <ul>
         * <li>true: Displays the default background image (default).</li>
         * <li>false: Does not display the default background image, but the configured local pane background image is still displayed.</li>
         * </ul>
         */
        public Builder showDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
            this.putQueryParameter("ShowDefaultBackgroundOnMute", showDefaultBackgroundOnMute);
            this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
            return this;
        }

        /**
         * <p>The list of specified users for audio mixing.</p>
         */
        public Builder specMixedUserList(java.util.List<String> specMixedUserList) {
            this.putQueryParameter("SpecMixedUserList", specMixedUserList);
            this.specMixedUserList = specMixedUserList;
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
         * <p>The wait time for the task when the channel is not started, in seconds. This parameter is valid only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
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
         * <p>Specifies whether to subscribe to high resolution streams. Valid values:</p>
         * <ul>
         * <li>false: Subscribes to streams of different resolutions based on the pane area (default).</li>
         * <li>true: Uses the highest resolution stream pushed by the client for padding by default.</li>
         * </ul>
         */
        public Builder subHighResolutionStream(Boolean subHighResolutionStream) {
            this.putQueryParameter("SubHighResolutionStream", subHighResolutionStream);
            this.subHighResolutionStream = subHighResolutionStream;
            return this;
        }

        /**
         * <p>The task ID of the bypass streaming task. Only a single ID is supported. The ID can contain uppercase and lowercase letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length. If you do not specify this parameter, the system automatically generates a task ID.</p>
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
         * <p>The global text watermark.</p>
         */
        public Builder texts(java.util.List<Texts> texts) {
            this.putQueryParameter("Texts", texts);
            this.texts = texts;
            return this;
        }

        /**
         * <p>The live stream ingest URL. Only a single URL is supported. This URL cannot be used by multiple tasks at the same time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public StartStreamingOutRequest build() {
            return new StartStreamingOutRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The crop mode. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
             * <li><strong>3</strong>: Stretch to fill.</li>
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
             * <p>The image URL.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the rectangle box.</p>
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
             * <p>Specifies whether a rectangle box is required.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The transparency.</p>
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
             * <p>The crop mode. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
             * <li><strong>3</strong>: Stretch to fill.</li>
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
             * <p>0.2</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The display condition. Valid values:</p>
             * <ul>
             * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: Displayed when the current user does not have a video stream.</li>
             * <li>always: Always displayed.</li>
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
             * <p>The crop mode. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
             * <li><strong>3</strong>: Stretch to fill.</li>
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
             * <p>The image URL.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The transparency.</p>
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
             * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: Displayed when the current user does not have a video stream.</li>
             * <li>always: Always displayed.</li>
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
             * <p>The crop mode. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
             * <li><strong>3</strong>: Stretch to fill.</li>
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
             * <p>The corresponding image content cannot be updated while streaming.</p>
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

            public PanesImages build() {
                return new PanesImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The watermark transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the rectangle box.</p>
             */
            public Builder boxColor(TextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The condition for displaying the watermark. Valid values:</p>
             * <ul>
             * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
             * <li>backup: Displayed when the current user does not have a video stream.</li>
             * <li>always: Always displayed.</li>
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
             * <p>Specifies whether a rectangle box is required.</p>
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
             * <p>The watermark content.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The whiteboard ID. Default value: default.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
        private String paneId;

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
        public String getPaneId() {
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
            private String paneId; 
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
             * <p>The local background images.</p>
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
             * <p>The crop mode. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
             * <li><strong>3</strong>: Stretch to fill.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paneCropMode(Integer paneCropMode) {
                this.paneCropMode = paneCropMode;
                return this;
            }

            /**
             * <p>The pane ID. The value starts from 0.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paneId(String paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>Specifies whether to reserve the pane for users who have not joined the meeting.
             * Default value: true. This value indicates that when the specific user or wildcard user specified for the grid is offline, the pane is forcibly reserved.
             * A value of false indicates that when the specific user or wildcard user specified for the grid is offline, video streams are displayed based on the automatic fill order.</p>
             */
            public Builder reservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
                this.reservePaneForOfflineUser = reservePaneForOfflineUser;
                return this;
            }

            /**
             * <p>The media source of the pane. You can specify a userId. To specify a specific user type, you can use wildcard configurations. The following types are supported:</p>
             * <ul>
             * <li><strong>$ActiveSpeaker</strong>: The current speaker in the channel.</li>
             * <li><strong>$ScreenShare</strong>: The user who is sharing their screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
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
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
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
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
     */
    public static class StartStreamingOutRequestTextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private StartStreamingOutRequestTextsBoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartStreamingOutRequestTextsBoxColor create() {
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

            private Builder(StartStreamingOutRequestTextsBoxColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public StartStreamingOutRequestTextsBoxColor build() {
                return new StartStreamingOutRequestTextsBoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
     */
    public static class StartStreamingOutRequestTextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private StartStreamingOutRequestTextsFontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartStreamingOutRequestTextsFontColor create() {
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

            private Builder(StartStreamingOutRequestTextsFontColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public StartStreamingOutRequestTextsFontColor build() {
                return new StartStreamingOutRequestTextsFontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartStreamingOutRequest} extends {@link TeaModel}
     *
     * <p>StartStreamingOutRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private StartStreamingOutRequestTextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private StartStreamingOutRequestTextsFontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Texture")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public StartStreamingOutRequestTextsBoxColor getBoxColor() {
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
        public StartStreamingOutRequestTextsFontColor getFontColor() {
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
            private StartStreamingOutRequestTextsBoxColor boxColor; 
            private Integer font; 
            private StartStreamingOutRequestTextsFontColor fontColor; 
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
             * <p>The watermark transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The transparency of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>The border width of the rectangle box.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>The color of the rectangle box.</p>
             */
            public Builder boxColor(StartStreamingOutRequestTextsBoxColor boxColor) {
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
            public Builder fontColor(StartStreamingOutRequestTextsFontColor fontColor) {
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
             * <p>Specifies whether a rectangle box is required.</p>
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
             * <p>The watermark content.</p>
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
