// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveAIStudioRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveAIStudioRequest</p>
 */
public class ModifyLiveAIStudioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundResourceId")
    private String backgroundResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundResourceUrl")
    private String backgroundResourceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundType")
    private String backgroundType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MattingLayout")
    @com.aliyun.core.annotation.Validation(required = true)
    private MattingLayout mattingLayout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MattingType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mattingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaLayout")
    private MediaLayout mediaLayout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaResourceId")
    private String mediaResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaResourceUrl")
    private String mediaResourceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String studioName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    private ModifyLiveAIStudioRequest(Builder builder) {
        super(builder);
        this.backgroundResourceId = builder.backgroundResourceId;
        this.backgroundResourceUrl = builder.backgroundResourceUrl;
        this.backgroundType = builder.backgroundType;
        this.description = builder.description;
        this.height = builder.height;
        this.mattingLayout = builder.mattingLayout;
        this.mattingType = builder.mattingType;
        this.mediaLayout = builder.mediaLayout;
        this.mediaResourceId = builder.mediaResourceId;
        this.mediaResourceUrl = builder.mediaResourceUrl;
        this.mediaType = builder.mediaType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.studioName = builder.studioName;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveAIStudioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backgroundResourceId
     */
    public String getBackgroundResourceId() {
        return this.backgroundResourceId;
    }

    /**
     * @return backgroundResourceUrl
     */
    public String getBackgroundResourceUrl() {
        return this.backgroundResourceUrl;
    }

    /**
     * @return backgroundType
     */
    public String getBackgroundType() {
        return this.backgroundType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return mattingLayout
     */
    public MattingLayout getMattingLayout() {
        return this.mattingLayout;
    }

    /**
     * @return mattingType
     */
    public String getMattingType() {
        return this.mattingType;
    }

    /**
     * @return mediaLayout
     */
    public MediaLayout getMediaLayout() {
        return this.mediaLayout;
    }

    /**
     * @return mediaResourceId
     */
    public String getMediaResourceId() {
        return this.mediaResourceId;
    }

    /**
     * @return mediaResourceUrl
     */
    public String getMediaResourceUrl() {
        return this.mediaResourceUrl;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return studioName
     */
    public String getStudioName() {
        return this.studioName;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<ModifyLiveAIStudioRequest, Builder> {
        private String backgroundResourceId; 
        private String backgroundResourceUrl; 
        private String backgroundType; 
        private String description; 
        private Integer height; 
        private MattingLayout mattingLayout; 
        private String mattingType; 
        private MediaLayout mediaLayout; 
        private String mediaResourceId; 
        private String mediaResourceUrl; 
        private String mediaType; 
        private Long ownerId; 
        private String regionId; 
        private String studioName; 
        private Integer width; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveAIStudioRequest request) {
            super(request);
            this.backgroundResourceId = request.backgroundResourceId;
            this.backgroundResourceUrl = request.backgroundResourceUrl;
            this.backgroundType = request.backgroundType;
            this.description = request.description;
            this.height = request.height;
            this.mattingLayout = request.mattingLayout;
            this.mattingType = request.mattingType;
            this.mediaLayout = request.mediaLayout;
            this.mediaResourceId = request.mediaResourceId;
            this.mediaResourceUrl = request.mediaResourceUrl;
            this.mediaType = request.mediaType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.studioName = request.studioName;
            this.width = request.width;
        } 

        /**
         * <p>The ID of the background material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
         * 
         * <strong>example:</strong>
         * <p>d0eb493192c771efba644531858c0102</p>
         */
        public Builder backgroundResourceId(String backgroundResourceId) {
            this.putQueryParameter("BackgroundResourceId", backgroundResourceId);
            this.backgroundResourceId = backgroundResourceId;
            return this;
        }

        /**
         * <p>The URL of the background material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.com/2.mp4">https://xxx.com/2.mp4</a></p>
         */
        public Builder backgroundResourceUrl(String backgroundResourceUrl) {
            this.putQueryParameter("BackgroundResourceUrl", backgroundResourceUrl);
            this.backgroundResourceUrl = backgroundResourceUrl;
            return this;
        }

        /**
         * <p>The type of the background material. Valid values:</p>
         * <ul>
         * <li>VOD: a video in ApsaraVideo VOD</li>
         * <li>PIC: an image</li>
         * <li>LIVE: a live stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        public Builder backgroundType(String backgroundType) {
            this.putQueryParameter("BackgroundType", backgroundType);
            this.backgroundType = backgroundType;
            return this;
        }

        /**
         * <p>The custom description.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The preview height. Unit: pixels.</p>
         * <p>The following preview specifications (width × height) are supported:</p>
         * <ul>
         * <li>Landscape low definition 360p (640×360)</li>
         * <li>Portrait low definition 360p (360×640)</li>
         * <li>Landscape standard definition 480p (854×480)</li>
         * <li>Portrait standard definition 480p (480×854)</li>
         * <li>Landscape high definition 720p (1280×720)</li>
         * <li>Portrait high definition 720p (720×1280)</li>
         * <li>Landscape ultra-high definition 1080p (1920×1080)</li>
         * <li>Portrait ultra-high definition 1080p (1080×1920)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder height(Integer height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>The layout information of the chroma-keyed material.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mattingLayout(MattingLayout mattingLayout) {
            String mattingLayoutShrink = shrink(mattingLayout, "MattingLayout", "json");
            this.putQueryParameter("MattingLayout", mattingLayoutShrink);
            this.mattingLayout = mattingLayout;
            return this;
        }

        /**
         * <p>The type of chroma key. Valid values:</p>
         * <ul>
         * <li>green: green-screen chroma key</li>
         * <li>blue: blue-screen chroma key</li>
         * <li>complex: background replacement</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>complex</p>
         */
        public Builder mattingType(String mattingType) {
            this.putQueryParameter("MattingType", mattingType);
            this.mattingType = mattingType;
            return this;
        }

        /**
         * <p>The layout information of the multimedia material.</p>
         */
        public Builder mediaLayout(MediaLayout mediaLayout) {
            String mediaLayoutShrink = shrink(mediaLayout, "MediaLayout", "json");
            this.putQueryParameter("MediaLayout", mediaLayoutShrink);
            this.mediaLayout = mediaLayout;
            return this;
        }

        /**
         * <p>The ID of the multimedia material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
         * 
         * <strong>example:</strong>
         * <p>d0eb493192c771efba644531858c01102</p>
         */
        public Builder mediaResourceId(String mediaResourceId) {
            this.putQueryParameter("MediaResourceId", mediaResourceId);
            this.mediaResourceId = mediaResourceId;
            return this;
        }

        /**
         * <p>The URL of the multimedia material. Specify either this parameter or the MediaResourceId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.com/1.mp4">https://xxx.com/1.mp4</a></p>
         */
        public Builder mediaResourceUrl(String mediaResourceUrl) {
            this.putQueryParameter("MediaResourceUrl", mediaResourceUrl);
            this.mediaResourceUrl = mediaResourceUrl;
            return this;
        }

        /**
         * <p>The type of the multimedia material. Valid values:</p>
         * <ul>
         * <li>VOD: a video in ApsaraVideo VOD</li>
         * <li>PIC: an image</li>
         * <li>LIVE: a live stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the virtual studio template. The name is the same as the value of the StudioName parameter that was specified when you called the CreateLiveAIStudio operation to create the virtual studio template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stu02</p>
         */
        public Builder studioName(String studioName) {
            this.putQueryParameter("StudioName", studioName);
            this.studioName = studioName;
            return this;
        }

        /**
         * <p>The preview width. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder width(Integer width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public ModifyLiveAIStudioRequest build() {
            return new ModifyLiveAIStudioRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyLiveAIStudioRequest} extends {@link TeaModel}
     *
     * <p>ModifyLiveAIStudioRequest</p>
     */
    public static class MattingLayout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionX")
        private Float positionX;

        @com.aliyun.core.annotation.NameInMap("PositionY")
        private Float positionY;

        private MattingLayout(Builder builder) {
            this.heightNormalized = builder.heightNormalized;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MattingLayout create() {
            return builder().build();
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return positionX
         */
        public Float getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public Float getPositionY() {
            return this.positionY;
        }

        public static final class Builder {
            private Float heightNormalized; 
            private Float positionX; 
            private Float positionY; 

            private Builder() {
            } 

            private Builder(MattingLayout model) {
                this.heightNormalized = model.heightNormalized;
                this.positionX = model.positionX;
                this.positionY = model.positionY;
            } 

            /**
             * <p>The normalized value of the height. The value indicates the ratio of the material height to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The x-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder positionX(Float positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * <p>The y-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder positionY(Float positionY) {
                this.positionY = positionY;
                return this;
            }

            public MattingLayout build() {
                return new MattingLayout(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyLiveAIStudioRequest} extends {@link TeaModel}
     *
     * <p>ModifyLiveAIStudioRequest</p>
     */
    public static class MediaLayout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionX")
        private Float positionX;

        @com.aliyun.core.annotation.NameInMap("PositionY")
        private Float positionY;

        private MediaLayout(Builder builder) {
            this.heightNormalized = builder.heightNormalized;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaLayout create() {
            return builder().build();
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return positionX
         */
        public Float getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public Float getPositionY() {
            return this.positionY;
        }

        public static final class Builder {
            private Float heightNormalized; 
            private Float positionX; 
            private Float positionY; 

            private Builder() {
            } 

            private Builder(MediaLayout model) {
                this.heightNormalized = model.heightNormalized;
                this.positionX = model.positionX;
                this.positionY = model.positionY;
            } 

            /**
             * <p>The normalized value of the material height. The value indicates the ratio of the material height to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The x-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder positionX(Float positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * <p>The y-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder positionY(Float positionY) {
                this.positionY = positionY;
                return this;
            }

            public MediaLayout build() {
                return new MediaLayout(this);
            } 

        } 

    }
}
