// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetWatermarksConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetWatermarksConsoleResponseBody</p>
 */
public class GetWatermarksConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WatermarkInfos")
    private WatermarkInfos watermarkInfos;

    @com.aliyun.core.annotation.NameInMap("Watermarks")
    private Watermarks watermarks;

    private GetWatermarksConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.watermarkInfos = builder.watermarkInfos;
        this.watermarks = builder.watermarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarksConsoleResponseBody create() {
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
     * @return watermarkInfos
     */
    public WatermarkInfos getWatermarkInfos() {
        return this.watermarkInfos;
    }

    /**
     * @return watermarks
     */
    public Watermarks getWatermarks() {
        return this.watermarks;
    }

    public static final class Builder {
        private String requestId; 
        private WatermarkInfos watermarkInfos; 
        private Watermarks watermarks; 

        private Builder() {
        } 

        private Builder(GetWatermarksConsoleResponseBody model) {
            this.requestId = model.requestId;
            this.watermarkInfos = model.watermarkInfos;
            this.watermarks = model.watermarks;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WatermarkInfos.
         */
        public Builder watermarkInfos(WatermarkInfos watermarkInfos) {
            this.watermarkInfos = watermarkInfos;
            return this;
        }

        /**
         * Watermarks.
         */
        public Builder watermarks(Watermarks watermarks) {
            this.watermarks = watermarks;
            return this;
        }

        public GetWatermarksConsoleResponseBody build() {
            return new GetWatermarksConsoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWatermarksConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWatermarksConsoleResponseBody</p>
     */
    public static class WatermarkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScreenHeight")
        private Integer screenHeight;

        @com.aliyun.core.annotation.NameInMap("ScreenWidth")
        private Integer screenWidth;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
        private String watermarkConfig;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        private WatermarkInfo(Builder builder) {
            this.creationTime = builder.creationTime;
            this.fileUrl = builder.fileUrl;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
            this.type = builder.type;
            this.watermarkConfig = builder.watermarkConfig;
            this.watermarkId = builder.watermarkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkInfo create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return screenHeight
         */
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return watermarkConfig
         */
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public static final class Builder {
            private String creationTime; 
            private String fileUrl; 
            private String isDefault; 
            private String name; 
            private Integer screenHeight; 
            private Integer screenWidth; 
            private String type; 
            private String watermarkConfig; 
            private String watermarkId; 

            private Builder() {
            } 

            private Builder(WatermarkInfo model) {
                this.creationTime = model.creationTime;
                this.fileUrl = model.fileUrl;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.screenHeight = model.screenHeight;
                this.screenWidth = model.screenWidth;
                this.type = model.type;
                this.watermarkConfig = model.watermarkConfig;
                this.watermarkId = model.watermarkId;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
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
             * ScreenHeight.
             */
            public Builder screenHeight(Integer screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * ScreenWidth.
             */
            public Builder screenWidth(Integer screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WatermarkConfig.
             */
            public Builder watermarkConfig(String watermarkConfig) {
                this.watermarkConfig = watermarkConfig;
                return this;
            }

            /**
             * WatermarkId.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            public WatermarkInfo build() {
                return new WatermarkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWatermarksConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWatermarksConsoleResponseBody</p>
     */
    public static class WatermarkInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WatermarkInfo")
        private java.util.List<WatermarkInfo> watermarkInfo;

        private WatermarkInfos(Builder builder) {
            this.watermarkInfo = builder.watermarkInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkInfos create() {
            return builder().build();
        }

        /**
         * @return watermarkInfo
         */
        public java.util.List<WatermarkInfo> getWatermarkInfo() {
            return this.watermarkInfo;
        }

        public static final class Builder {
            private java.util.List<WatermarkInfo> watermarkInfo; 

            private Builder() {
            } 

            private Builder(WatermarkInfos model) {
                this.watermarkInfo = model.watermarkInfo;
            } 

            /**
             * WatermarkInfo.
             */
            public Builder watermarkInfo(java.util.List<WatermarkInfo> watermarkInfo) {
                this.watermarkInfo = watermarkInfo;
                return this;
            }

            public WatermarkInfos build() {
                return new WatermarkInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWatermarksConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWatermarksConsoleResponseBody</p>
     */
    public static class Watermark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private String active;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("HorizontalOffset")
        private String horizontalOffset;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("ScreenMode")
        private String screenMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VerticalOffset")
        private String verticalOffset;

        @com.aliyun.core.annotation.NameInMap("VideoHeight")
        private Integer videoHeight;

        @com.aliyun.core.annotation.NameInMap("VideoWidth")
        private Integer videoWidth;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Watermark(Builder builder) {
            this.active = builder.active;
            this.createTime = builder.createTime;
            this.height = builder.height;
            this.horizontalOffset = builder.horizontalOffset;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.position = builder.position;
            this.screenMode = builder.screenMode;
            this.url = builder.url;
            this.verticalOffset = builder.verticalOffset;
            this.videoHeight = builder.videoHeight;
            this.videoWidth = builder.videoWidth;
            this.watermarkId = builder.watermarkId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermark create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public String getActive() {
            return this.active;
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return horizontalOffset
         */
        public String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return screenMode
         */
        public String getScreenMode() {
            return this.screenMode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return verticalOffset
         */
        public String getVerticalOffset() {
            return this.verticalOffset;
        }

        /**
         * @return videoHeight
         */
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        /**
         * @return videoWidth
         */
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String active; 
            private Integer createTime; 
            private String height; 
            private String horizontalOffset; 
            private String isDefault; 
            private String name; 
            private String position; 
            private String screenMode; 
            private String url; 
            private String verticalOffset; 
            private Integer videoHeight; 
            private Integer videoWidth; 
            private String watermarkId; 
            private String width; 

            private Builder() {
            } 

            private Builder(Watermark model) {
                this.active = model.active;
                this.createTime = model.createTime;
                this.height = model.height;
                this.horizontalOffset = model.horizontalOffset;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.position = model.position;
                this.screenMode = model.screenMode;
                this.url = model.url;
                this.verticalOffset = model.verticalOffset;
                this.videoHeight = model.videoHeight;
                this.videoWidth = model.videoWidth;
                this.watermarkId = model.watermarkId;
                this.width = model.width;
            } 

            /**
             * Active.
             */
            public Builder active(String active) {
                this.active = active;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * HorizontalOffset.
             */
            public Builder horizontalOffset(String horizontalOffset) {
                this.horizontalOffset = horizontalOffset;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
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
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * ScreenMode.
             */
            public Builder screenMode(String screenMode) {
                this.screenMode = screenMode;
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
             * VerticalOffset.
             */
            public Builder verticalOffset(String verticalOffset) {
                this.verticalOffset = verticalOffset;
                return this;
            }

            /**
             * VideoHeight.
             */
            public Builder videoHeight(Integer videoHeight) {
                this.videoHeight = videoHeight;
                return this;
            }

            /**
             * VideoWidth.
             */
            public Builder videoWidth(Integer videoWidth) {
                this.videoWidth = videoWidth;
                return this;
            }

            /**
             * WatermarkId.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Watermark build() {
                return new Watermark(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWatermarksConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetWatermarksConsoleResponseBody</p>
     */
    public static class Watermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Watermark")
        private java.util.List<Watermark> watermark;

        private Watermarks(Builder builder) {
            this.watermark = builder.watermark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return watermark
         */
        public java.util.List<Watermark> getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private java.util.List<Watermark> watermark; 

            private Builder() {
            } 

            private Builder(Watermarks model) {
                this.watermark = model.watermark;
            } 

            /**
             * Watermark.
             */
            public Builder watermark(java.util.List<Watermark> watermark) {
                this.watermark = watermark;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
}
