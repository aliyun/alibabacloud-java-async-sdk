// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Backgrounds")
    private java.util.List < Backgrounds> backgrounds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockWidgets")
    private java.util.List < ClockWidgets> clockWidgets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CropMode")
    private Integer cropMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List < Images> images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Panes")
    private java.util.List < Panes> panes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionColor")
    private RegionColor regionColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private StorageConfig storageConfig;

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
    private java.util.List < Texts> texts;

    private StartCloudRecordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgrounds = builder.backgrounds;
        this.channelId = builder.channelId;
        this.clockWidgets = builder.clockWidgets;
        this.cropMode = builder.cropMode;
        this.images = builder.images;
        this.panes = builder.panes;
        this.regionColor = builder.regionColor;
        this.storageConfig = builder.storageConfig;
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return backgrounds
     */
    public java.util.List < Backgrounds> getBackgrounds() {
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
    public java.util.List < ClockWidgets> getClockWidgets() {
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
    public java.util.List < Images> getImages() {
        return this.images;
    }

    /**
     * @return panes
     */
    public java.util.List < Panes> getPanes() {
        return this.panes;
    }

    /**
     * @return regionColor
     */
    public RegionColor getRegionColor() {
        return this.regionColor;
    }

    /**
     * @return storageConfig
     */
    public StorageConfig getStorageConfig() {
        return this.storageConfig;
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
    public java.util.List < Texts> getTexts() {
        return this.texts;
    }

    public static final class Builder extends Request.Builder<StartCloudRecordRequest, Builder> {
        private String appId; 
        private java.util.List < Backgrounds> backgrounds; 
        private String channelId; 
        private java.util.List < ClockWidgets> clockWidgets; 
        private Integer cropMode; 
        private java.util.List < Images> images; 
        private java.util.List < Panes> panes; 
        private RegionColor regionColor; 
        private StorageConfig storageConfig; 
        private String taskId; 
        private String templateId; 
        private java.util.List < Texts> texts; 

        private Builder() {
            super();
        } 

        private Builder(StartCloudRecordRequest request) {
            super(request);
            this.appId = request.appId;
            this.backgrounds = request.backgrounds;
            this.channelId = request.channelId;
            this.clockWidgets = request.clockWidgets;
            this.cropMode = request.cropMode;
            this.images = request.images;
            this.panes = request.panes;
            this.regionColor = request.regionColor;
            this.storageConfig = request.storageConfig;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.texts = request.texts;
        } 

        /**
         * <p>appId</p>
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
         * Backgrounds.
         */
        public Builder backgrounds(java.util.List < Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * <p>channelName</p>
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
         * ClockWidgets.
         */
        public Builder clockWidgets(java.util.List < ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * CropMode.
         */
        public Builder cropMode(Integer cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(java.util.List < Images> images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>panes</p>
         */
        public Builder panes(java.util.List < Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        /**
         * RegionColor.
         */
        public Builder regionColor(RegionColor regionColor) {
            this.putQueryParameter("RegionColor", regionColor);
            this.regionColor = regionColor;
            return this;
        }

        /**
         * <p>storageConfig</p>
         * <p>This parameter is required.</p>
         */
        public Builder storageConfig(StorageConfig storageConfig) {
            this.putQueryParameter("StorageConfig", storageConfig);
            this.storageConfig = storageConfig;
            return this;
        }

        /**
         * <p>taskId</p>
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
         * <p>templateId</p>
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
         * Texts.
         */
        public Builder texts(java.util.List < Texts> texts) {
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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BackgroundCropMode.
             */
            public Builder backgroundCropMode(Integer backgroundCropMode) {
                this.backgroundCropMode = backgroundCropMode;
                return this;
            }

            /**
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
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BoxAlpha.
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * BoxBorderw.
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * BoxColor.
             */
            public Builder boxColor(BoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * Font.
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(FontColor fontColor) {
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
             * HasBox.
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
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
             * Zone.
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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
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
             * ImageCropMode.
             */
            public Builder imageCropMode(Integer imageCropMode) {
                this.imageCropMode = imageCropMode;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
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
    public static class PanesImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
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
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
             * PaneImageCropMode.
             */
            public Builder paneImageCropMode(Integer paneImageCropMode) {
                this.paneImageCropMode = paneImageCropMode;
                return this;
            }

            /**
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BoxAlpha.
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * BoxBorderw.
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * BoxColor.
             */
            public Builder boxColor(TextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * Font.
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(TextsFontColor fontColor) {
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
             * HasBox.
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
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
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List < PanesImages> images;

        @com.aliyun.core.annotation.NameInMap("PaneCropMode")
        private Integer paneCropMode;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 15)
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List < PanesTexts> texts;

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
        public java.util.List < PanesImages> getImages() {
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
        public java.util.List < PanesTexts> getTexts() {
            return this.texts;
        }

        public static final class Builder {
            private java.util.List < PanesImages> images; 
            private Integer paneCropMode; 
            private Integer paneId; 
            private String source; 
            private String sourceType; 
            private java.util.List < PanesTexts> texts; 

            /**
             * Images.
             */
            public Builder images(java.util.List < PanesImages> images) {
                this.images = images;
                return this;
            }

            /**
             * PaneCropMode.
             */
            public Builder paneCropMode(Integer paneCropMode) {
                this.paneCropMode = paneCropMode;
                return this;
            }

            /**
             * <p>paneId</p>
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
             * <p>source</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>sourceType</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Texts.
             */
            public Builder texts(java.util.List < PanesTexts> texts) {
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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
    public static class StorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String bucket;

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
            private Integer region; 
            private String secretKey; 
            private Integer vendor; 

            /**
             * <p>accessKey</p>
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
             * <p>bucket</p>
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
             * <p>region</p>
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
             * <p>vendor</p>
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
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
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

            /**
             * B.
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * G.
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * R.
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
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double alpha;

        @com.aliyun.core.annotation.NameInMap("BoxAlpha")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double boxAlpha;

        @com.aliyun.core.annotation.NameInMap("BoxBorderw")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
        private Integer boxBorderw;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private StartCloudRecordRequestTextsBoxColor boxColor;

        @com.aliyun.core.annotation.NameInMap("Font")
        @com.aliyun.core.annotation.Validation(maximum = 9)
        private Integer font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private StartCloudRecordRequestTextsFontColor fontColor;

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

            /**
             * Alpha.
             */
            public Builder alpha(Double alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * BoxAlpha.
             */
            public Builder boxAlpha(Double boxAlpha) {
                this.boxAlpha = boxAlpha;
                return this;
            }

            /**
             * BoxBorderw.
             */
            public Builder boxBorderw(Integer boxBorderw) {
                this.boxBorderw = boxBorderw;
                return this;
            }

            /**
             * BoxColor.
             */
            public Builder boxColor(StartCloudRecordRequestTextsBoxColor boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * Font.
             */
            public Builder font(Integer font) {
                this.font = font;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(StartCloudRecordRequestTextsFontColor fontColor) {
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
             * HasBox.
             */
            public Builder hasBox(Boolean hasBox) {
                this.hasBox = hasBox;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(Integer layer) {
                this.layer = layer;
                return this;
            }

            /**
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
