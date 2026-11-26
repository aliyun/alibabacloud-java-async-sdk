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
 * {@link ModifyViewLayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyViewLayoutRequest</p>
 */
public class ModifyViewLayoutRequest extends Request {
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

    private ModifyViewLayoutRequest(Builder builder) {
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

    public static ModifyViewLayoutRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyViewLayoutRequest, Builder> {
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

        private Builder(ModifyViewLayoutRequest request) {
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
         * <p>The background images.</p>
         */
        public Builder backgrounds(java.util.List<Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
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
         * <p>The global image watermark.</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The blacklists and whitelists settings.</p>
         */
        public Builder layoutSpecifiedUsers(LayoutSpecifiedUsers layoutSpecifiedUsers) {
            String layoutSpecifiedUsersShrink = shrink(layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
            this.putQueryParameter("LayoutSpecifiedUsers", layoutSpecifiedUsersShrink);
            this.layoutSpecifiedUsers = layoutSpecifiedUsers;
            return this;
        }

        /**
         * <p>The pane settings. You can configure up to 16 panes.</p>
         */
        public Builder panes(java.util.List<Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        /**
         * <p>The task ID. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
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

        @Override
        public ModifyViewLayoutRequest build() {
            return new ModifyViewLayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
             * <p>The opacity of the image.</p>
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
             * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
             * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
             * <p>The opacity of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The opacity of the text box.</p>
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
             * <p>The border color of the text box.</p>
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
             * <p>The clock font size.</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
             * <p>The opacity of the image.</p>
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
             * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
             * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
             * <p>The URL of the image.</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
             * <p>The user list type. Valid values: black: Blacklist. white: Whitelist.</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
     */
    public static class PanesImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

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
                this.height = model.height;
                this.layer = model.layer;
                this.paneImageCropMode = model.paneImageCropMode;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The opacity of the image.</p>
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
             * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
             * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
             * <p>The URL of the image.</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
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
             * <p>The opacity of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The opacity of the text box.</p>
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
             * <p>The border color of the text box.</p>
             */
            public Builder boxColor(TextsBoxColor boxColor) {
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
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<PanesImages> images;

        @com.aliyun.core.annotation.NameInMap("PaneCropMode")
        private Integer paneCropMode;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String paneId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<PanesTexts> texts;

        private Panes(Builder builder) {
            this.images = builder.images;
            this.paneCropMode = builder.paneCropMode;
            this.paneId = builder.paneId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.texts = builder.texts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List<PanesImages> images; 
            private Integer paneCropMode; 
            private String paneId; 
            private String source; 
            private String sourceType; 
            private java.util.List<PanesTexts> texts; 

            private Builder() {
            } 

            private Builder(Panes model) {
                this.images = model.images;
                this.paneCropMode = model.paneCropMode;
                this.paneId = model.paneId;
                this.source = model.source;
                this.sourceType = model.sourceType;
                this.texts = model.texts;
            } 

            /**
             * <p>The image watermarks for the pane.</p>
             */
            public Builder images(java.util.List<PanesImages> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The crop mode of the image. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
             * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
             * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
             * <p>The ID of the pane. The ID starts from 0.</p>
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
             * <p>The media source of the pane. You can specify a userId. To specify a specific user type, you can use wildcard configurations. The following types are supported:</p>
             * <ul>
             * <li><strong>$ActiveSpeaker</strong>: The active speaker in the current channel.</li>
             * <li><strong>$ScreenShare</strong>: The user who is sharing the screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
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
             * <li><strong>video</strong>: The camera or screen sharing stream of the user. This is the default value.</li>
             * <li><strong>camera</strong>: The camera stream.</li>
             * <li><strong>screen</strong>: The screen sharing stream.</li>
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
             * <p>The text watermarks for the pane.</p>
             */
            public Builder texts(java.util.List<PanesTexts> texts) {
                this.texts = texts;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
     */
    public static class ModifyViewLayoutRequestTextsBoxColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private ModifyViewLayoutRequestTextsBoxColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyViewLayoutRequestTextsBoxColor create() {
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

            private Builder(ModifyViewLayoutRequestTextsBoxColor model) {
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

            public ModifyViewLayoutRequestTextsBoxColor build() {
                return new ModifyViewLayoutRequestTextsBoxColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
     */
    public static class ModifyViewLayoutRequestTextsFontColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        private Integer r;

        private ModifyViewLayoutRequestTextsFontColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyViewLayoutRequestTextsFontColor create() {
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

            private Builder(ModifyViewLayoutRequestTextsFontColor model) {
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

            public ModifyViewLayoutRequestTextsFontColor build() {
                return new ModifyViewLayoutRequestTextsFontColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyViewLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyViewLayoutRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private ModifyViewLayoutRequestTextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private ModifyViewLayoutRequestTextsFontColor fontColor;

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
        public ModifyViewLayoutRequestTextsBoxColor getBoxColor() {
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
        public ModifyViewLayoutRequestTextsFontColor getFontColor() {
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
            private ModifyViewLayoutRequestTextsBoxColor boxColor; 
            private Integer font; 
            private ModifyViewLayoutRequestTextsFontColor fontColor; 
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
             * <p>The opacity of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The opacity of the text box.</p>
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
             * <p>The border color of the text box.</p>
             */
            public Builder boxColor(ModifyViewLayoutRequestTextsBoxColor boxColor) {
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
            public Builder fontColor(ModifyViewLayoutRequestTextsFontColor fontColor) {
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
