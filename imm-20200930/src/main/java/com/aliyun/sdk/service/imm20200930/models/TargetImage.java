// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TargetImage} extends {@link TeaModel}
 *
 * <p>TargetImage</p>
 */
public class TargetImage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Animations")
    private java.util.List < Animations> animations;

    @com.aliyun.core.annotation.NameInMap("Snapshots")
    private java.util.List < Snapshots> snapshots;

    @com.aliyun.core.annotation.NameInMap("Sprites")
    private java.util.List < Sprites> sprites;

    private TargetImage(Builder builder) {
        this.animations = builder.animations;
        this.snapshots = builder.snapshots;
        this.sprites = builder.sprites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetImage create() {
        return builder().build();
    }

    /**
     * @return animations
     */
    public java.util.List < Animations> getAnimations() {
        return this.animations;
    }

    /**
     * @return snapshots
     */
    public java.util.List < Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return sprites
     */
    public java.util.List < Sprites> getSprites() {
        return this.sprites;
    }

    public static final class Builder {
        private java.util.List < Animations> animations; 
        private java.util.List < Snapshots> snapshots; 
        private java.util.List < Sprites> sprites; 

        /**
         * Animations.
         */
        public Builder animations(java.util.List < Animations> animations) {
            this.animations = animations;
            return this;
        }

        /**
         * Snapshots.
         */
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * Sprites.
         */
        public Builder sprites(java.util.List < Sprites> sprites) {
            this.sprites = sprites;
            return this;
        }

        public TargetImage build() {
            return new TargetImage(this);
        } 

    } 

    /**
     * 
     * {@link TargetImage} extends {@link TeaModel}
     *
     * <p>TargetImage</p>
     */
    public static class Animations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Double frameRate;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Double interval;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Double width;

        private Animations(Builder builder) {
            this.format = builder.format;
            this.frameRate = builder.frameRate;
            this.height = builder.height;
            this.interval = builder.interval;
            this.number = builder.number;
            this.scaleType = builder.scaleType;
            this.startTime = builder.startTime;
            this.URI = builder.URI;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Animations create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return frameRate
         */
        public Double getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return interval
         */
        public Double getInterval() {
            return this.interval;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        /**
         * @return width
         */
        public Double getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String format; 
            private Double frameRate; 
            private Double height; 
            private Double interval; 
            private Integer number; 
            private String scaleType; 
            private Double startTime; 
            private String URI; 
            private Double width; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * FrameRate.
             */
            public Builder frameRate(Double frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Double interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * ScaleType.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            public Animations build() {
                return new Animations(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetImage} extends {@link TeaModel}
     *
     * <p>TargetImage</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Double height;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Double interval;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Double width;

        private Snapshots(Builder builder) {
            this.format = builder.format;
            this.height = builder.height;
            this.interval = builder.interval;
            this.number = builder.number;
            this.scaleType = builder.scaleType;
            this.startTime = builder.startTime;
            this.URI = builder.URI;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return interval
         */
        public Double getInterval() {
            return this.interval;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        /**
         * @return width
         */
        public Double getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String format; 
            private Double height; 
            private Double interval; 
            private Integer number; 
            private String scaleType; 
            private Double startTime; 
            private String URI; 
            private Double width; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Double interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * ScaleType.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link TargetImage} extends {@link TeaModel}
     *
     * <p>TargetImage</p>
     */
    public static class Sprites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Double interval;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private Integer margin;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Pad")
        private Integer pad;

        @com.aliyun.core.annotation.NameInMap("ScaleHeight")
        private Float scaleHeight;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        @com.aliyun.core.annotation.NameInMap("ScaleWidth")
        private Float scaleWidth;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("TileHeight")
        private Integer tileHeight;

        @com.aliyun.core.annotation.NameInMap("TileWidth")
        private Integer tileWidth;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private Sprites(Builder builder) {
            this.format = builder.format;
            this.interval = builder.interval;
            this.margin = builder.margin;
            this.number = builder.number;
            this.pad = builder.pad;
            this.scaleHeight = builder.scaleHeight;
            this.scaleType = builder.scaleType;
            this.scaleWidth = builder.scaleWidth;
            this.startTime = builder.startTime;
            this.tileHeight = builder.tileHeight;
            this.tileWidth = builder.tileWidth;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sprites create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return interval
         */
        public Double getInterval() {
            return this.interval;
        }

        /**
         * @return margin
         */
        public Integer getMargin() {
            return this.margin;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return pad
         */
        public Integer getPad() {
            return this.pad;
        }

        /**
         * @return scaleHeight
         */
        public Float getScaleHeight() {
            return this.scaleHeight;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        /**
         * @return scaleWidth
         */
        public Float getScaleWidth() {
            return this.scaleWidth;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return tileHeight
         */
        public Integer getTileHeight() {
            return this.tileHeight;
        }

        /**
         * @return tileWidth
         */
        public Integer getTileWidth() {
            return this.tileWidth;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String format; 
            private Double interval; 
            private Integer margin; 
            private Integer number; 
            private Integer pad; 
            private Float scaleHeight; 
            private String scaleType; 
            private Float scaleWidth; 
            private Double startTime; 
            private Integer tileHeight; 
            private Integer tileWidth; 
            private String URI; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Double interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Margin.
             */
            public Builder margin(Integer margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * Pad.
             */
            public Builder pad(Integer pad) {
                this.pad = pad;
                return this;
            }

            /**
             * ScaleHeight.
             */
            public Builder scaleHeight(Float scaleHeight) {
                this.scaleHeight = scaleHeight;
                return this;
            }

            /**
             * ScaleType.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * ScaleWidth.
             */
            public Builder scaleWidth(Float scaleWidth) {
                this.scaleWidth = scaleWidth;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TileHeight.
             */
            public Builder tileHeight(Integer tileHeight) {
                this.tileHeight = tileHeight;
                return this;
            }

            /**
             * TileWidth.
             */
            public Builder tileWidth(Integer tileWidth) {
                this.tileWidth = tileWidth;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sprites build() {
                return new Sprites(this);
            } 

        } 

    }
}
