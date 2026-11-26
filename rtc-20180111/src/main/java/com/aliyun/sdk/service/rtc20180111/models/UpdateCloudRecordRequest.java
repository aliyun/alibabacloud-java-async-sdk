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
 * {@link UpdateCloudRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudRecordRequest</p>
 */
public class UpdateCloudRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Backgrounds")
    private java.util.List<Backgrounds> backgrounds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockWidgets")
    private java.util.List<ClockWidgets> clockWidgets;

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
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 55, minLength = 1)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Texts")
    private java.util.List<Texts> texts;

    private UpdateCloudRecordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgrounds = builder.backgrounds;
        this.channelId = builder.channelId;
        this.clockWidgets = builder.clockWidgets;
        this.images = builder.images;
        this.layoutSpecifiedUsers = builder.layoutSpecifiedUsers;
        this.panes = builder.panes;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.texts = builder.texts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudRecordRequest create() {
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
     * @return backgrounds
     */
    public java.util.List<Backgrounds> getBackgrounds() {
        return this.backgrounds;
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

    public static final class Builder extends Request.Builder<UpdateCloudRecordRequest, Builder> {
        private String appId; 
        private java.util.List<Backgrounds> backgrounds; 
        private String channelId; 
        private java.util.List<ClockWidgets> clockWidgets; 
        private java.util.List<Images> images; 
        private LayoutSpecifiedUsers layoutSpecifiedUsers; 
        private java.util.List<Panes> panes; 
        private String taskId; 
        private String templateId; 
        private java.util.List<Texts> texts; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudRecordRequest request) {
            super(request);
            this.appId = request.appId;
            this.backgrounds = request.backgrounds;
            this.channelId = request.channelId;
            this.clockWidgets = request.clockWidgets;
            this.images = request.images;
            this.layoutSpecifiedUsers = request.layoutSpecifiedUsers;
            this.panes = request.panes;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.texts = request.texts;
        } 

        /**
         * <p>The application ID. You can create and query it in the console. Only one ID is supported.</p>
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
         * <p>Background images.</p>
         */
        public Builder backgrounds(java.util.List<Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * <p>The existing channel ID. Only one ID is supported.</p>
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
         * <p>Global clock watermarks.</p>
         */
        public Builder clockWidgets(java.util.List<ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * <p>Global image watermarks.</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>A list that specifies users for layout generation. It supports both blacklists and whitelists.</p>
         * <p>Whitelist: Specifies the users whose video streams are subscribed to in the channel.</p>
         * <ul>
         * <li><p>The auto-fill feature uses this list for sequential filling.</p>
         * </li>
         * <li><p>During multi-layout switching, only users in the whitelist are included.</p>
         * </li>
         * </ul>
         * <p>Blacklist: Specifies the users whose video streams are not subscribed to in the channel.</p>
         * <ul>
         * <li>During multi-layout switching, only users not in the blacklist are included.</li>
         * </ul>
         */
        public Builder layoutSpecifiedUsers(LayoutSpecifiedUsers layoutSpecifiedUsers) {
            String layoutSpecifiedUsersShrink = shrink(layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
            this.putQueryParameter("LayoutSpecifiedUsers", layoutSpecifiedUsersShrink);
            this.layoutSpecifiedUsers = layoutSpecifiedUsers;
            return this;
        }

        /**
         * <p>Cell settings.</p>
         */
        public Builder panes(java.util.List<Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        /**
         * <p>The task ID for this cloud recording. Only one ID is supported. It can contain letters, digits, underscores (_), and hyphens (-), with a maximum length of 55 bytes.</p>
         * <p>This parameter is required.</p>
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
         * <blockquote>
         * <p>Notice: To update the layout, change the template ID. Resolution updates are not supported.</p>
         * </blockquote>
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
         * <p>Global text watermarks.</p>
         */
        public Builder texts(java.util.List<Texts> texts) {
            this.putQueryParameter("Texts", texts);
            this.texts = texts;
            return this;
        }

        @Override
        public UpdateCloudRecordRequest build() {
            return new UpdateCloudRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class Backgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BackgroundCropMode")
        private Integer backgroundCropMode;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
             * <p>Transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
             * </li>
             * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
             * </li>
             * <li><p><strong>3</strong>: Stretch to fill.</p>
             * </li>
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
             * <p>Height.</p>
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
             * <p>Width.</p>
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
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class BoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class FontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class ClockWidgets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private BoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        @com.aliyun.core.annotation.Validation(maximum = 9)
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private FontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        @com.aliyun.core.annotation.Validation(maximum = 72)
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double y;

        @com.aliyun.core.annotation.NameInMap("Zone")
        @com.aliyun.core.annotation.Validation(maximum = 12)
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
             * <p>Transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Rectangle box transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>Rectangle box border width.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>Rectangle box color.</p>
             */
            public Builder boxColor(BoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>Font.</p>
             * <ul>
             * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
             * </li>
             * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
             * </li>
             * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
             * </li>
             * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
             * </li>
             * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
             * </li>
             * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
             * </li>
             * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
             * </li>
             * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
             * </li>
             * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
             * </li>
             * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
             * </li>
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
             * <p>Font color.</p>
             */
            public Builder fontColor(FontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>Clock font size.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Whether to draw a rectangle box.</p>
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
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
             * <p>Time zone.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("ImageCropMode")
        private Integer imageCropMode;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
             * <p>Transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Height.</p>
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
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
             * </li>
             * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
             * </li>
             * <li><p><strong>3</strong>: Stretch to fill.</p>
             * </li>
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
             * <p><a href="https://aliyun.com/123.jpg">https://aliyun.com/123.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>Width.</p>
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
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
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
             * <p>The type of the user list. Valid values: `black` for a blacklist and `white` for a whitelist.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class PanesBackgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("PaneBackgroundCropMode")
        private Integer paneBackgroundCropMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
             * <p>Transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>When to display.</p>
             * <ul>
             * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
             * </li>
             * <li><p>backup: Display only when the user has no video stream.</p>
             * </li>
             * <li><p>always: Always display.</p>
             * </li>
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
             * <p>Height.</p>
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
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
             * </li>
             * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
             * </li>
             * <li><p><strong>3</strong>: Stretch to fill.</p>
             * </li>
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
             * <p>The background image URL.</p>
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
             * <p>Width.</p>
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
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class PanesImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("PaneImageCropMode")
        private Integer paneImageCropMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
             * <p>Transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>When to display the watermark.</p>
             * <ul>
             * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
             * </li>
             * <li><p>backup: Display only when the user has no video stream.</p>
             * </li>
             * <li><p>always: Always display.</p>
             * </li>
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
             * <p>Height.</p>
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
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
             * </li>
             * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
             * </li>
             * <li><p><strong>3</strong>: Stretch to fill.</p>
             * </li>
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
             * <p>Width.</p>
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
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class TextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class TextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class PanesTexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private TextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Font")
        @com.aliyun.core.annotation.Validation(maximum = 9)
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private TextsFontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        @com.aliyun.core.annotation.Validation(maximum = 72)
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Texture")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String texture;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
             * <p>Watermark transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Rectangle box transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>Rectangle box border width.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>Rectangle box color.</p>
             */
            public Builder boxColor(TextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>When to display the watermark.</p>
             * <ul>
             * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
             * </li>
             * <li><p>backup: Display only when the user has no video stream.</p>
             * </li>
             * <li><p>always: Always display.</p>
             * </li>
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
             * <p>Font.</p>
             * <ul>
             * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
             * </li>
             * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
             * </li>
             * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
             * </li>
             * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
             * </li>
             * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
             * </li>
             * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
             * </li>
             * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
             * </li>
             * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
             * </li>
             * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
             * </li>
             * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
             * </li>
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
             * <p>Font color.</p>
             */
            public Builder fontColor(TextsFontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>Font size.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Whether to draw a rectangle box.</p>
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
             * <p>文字水印</p>
             */
            public Builder texture(String texture) {
                this.texture = texture;
                return this;
            }

            /**
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backgrounds")
        private java.util.List<PanesBackgrounds> backgrounds;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<PanesImages> images;

        @com.aliyun.core.annotation.NameInMap("PaneCropMode")
        private Integer paneCropMode;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 15)
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
             * <p>Background images.</p>
             */
            public Builder backgrounds(java.util.List<PanesBackgrounds> backgrounds) {
                this.backgrounds = backgrounds;
                return this;
            }

            /**
             * <p>Local image watermarks for the pane.</p>
             */
            public Builder images(java.util.List<PanesImages> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The cropping mode. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
             * </li>
             * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
             * </li>
             * <li><p><strong>3</strong>: Stretch to fill.</p>
             * </li>
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
             * <p>The pane ID, starting from 0.</p>
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
             * <p>Reserves a pane for a user who goes offline. The default value is true. If true, the pane for a specified user or wildcard user remains as a placeholder. If false, the pane is filled with a video stream based on the Auto Fill order.</p>
             */
            public Builder reservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
                this.reservePaneForOfflineUser = reservePaneForOfflineUser;
                return this;
            }

            /**
             * <p>The media source for the cell. You can specify a userId to target a specific user. Wildcard characters are also supported:</p>
             * <ul>
             * <li><p><strong>$ActiveSpeaker</strong>: The current active speaker in the channel.</p>
             * </li>
             * <li><p><strong>$ScreenShare</strong>: A screen-sharing user. If multiple users share their screens, they are filled in sequence.</p>
             * </li>
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
             * <p>The media type of the cell. Valid values:</p>
             * <ul>
             * <li><p><strong>video</strong>: Camera or screen sharing stream (default).</p>
             * </li>
             * <li><p><strong>camera</strong>: Camera stream.</p>
             * </li>
             * <li><p><strong>screen</strong>: Screen sharing stream.</p>
             * </li>
             * <li><p><strong>whiteboard</strong>: Whiteboard.</p>
             * </li>
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
             * <p>Local text watermarks for the pane.</p>
             */
            public Builder texts(java.util.List<PanesTexts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>The fill order when SourceType is video.</p>
             * <ul>
             * <li><p>screenFirst: Prioritize screen sharing (default).</p>
             * </li>
             * <li><p>cameraFirst: Prioritize camera.</p>
             * </li>
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
             * <p>Whiteboard configuration.</p>
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
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class UpdateCloudRecordRequestTextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private UpdateCloudRecordRequestTextsBoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCloudRecordRequestTextsBoxColor create() {
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

            private Builder(UpdateCloudRecordRequestTextsBoxColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public UpdateCloudRecordRequestTextsBoxColor build() {
                return new UpdateCloudRecordRequestTextsBoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class UpdateCloudRecordRequestTextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private UpdateCloudRecordRequestTextsFontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCloudRecordRequestTextsFontColor create() {
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

            private Builder(UpdateCloudRecordRequestTextsFontColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>B.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>G.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>R.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public UpdateCloudRecordRequestTextsFontColor build() {
                return new UpdateCloudRecordRequestTextsFontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCloudRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudRecordRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private UpdateCloudRecordRequestTextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        @com.aliyun.core.annotation.Validation(maximum = 9)
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private UpdateCloudRecordRequestTextsFontColor fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        @com.aliyun.core.annotation.Validation(maximum = 72)
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("HasBox")
        private Boolean hasBox;

        @com.aliyun.core.annotation.NameInMap("Layer")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer layer;

        @com.aliyun.core.annotation.NameInMap("Texture")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String texture;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
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
        public UpdateCloudRecordRequestTextsBoxColor getBoxColor() {
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
        public UpdateCloudRecordRequestTextsFontColor getFontColor() {
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
            private UpdateCloudRecordRequestTextsBoxColor boxColor; 
            private Integer font; 
            private UpdateCloudRecordRequestTextsFontColor fontColor; 
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
             * <p>Watermark transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Rectangle box transparency.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * <p>Rectangle box border width.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * <p>Rectangle box color.</p>
             */
            public Builder boxColor(UpdateCloudRecordRequestTextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>Font.</p>
             * <ul>
             * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
             * </li>
             * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
             * </li>
             * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
             * </li>
             * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
             * </li>
             * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
             * </li>
             * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
             * </li>
             * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
             * </li>
             * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
             * </li>
             * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
             * </li>
             * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
             * </li>
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
             * <p>Font color.</p>
             */
            public Builder fontColor(UpdateCloudRecordRequestTextsFontColor fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>Font size.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>Whether to draw a rectangle box.</p>
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
             * <p>文字水印</p>
             */
            public Builder texture(String texture) {
                this.texture = texture;
                return this;
            }

            /**
             * <p>The horizontal coordinate.</p>
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
             * <p>The vertical coordinate.</p>
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
