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
 * {@link ModifyCasterVideoResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterVideoResourceRequest</p>
 */
public class ModifyCasterVideoResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginOffset")
    private Integer beginOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndOffset")
    private Integer endOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveStreamUrl")
    private String liveStreamUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialId")
    private String materialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PtsCallbackInterval")
    private Integer ptsCallbackInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatNum")
    @com.aliyun.core.annotation.Validation(maximum = 60)
    private Integer repeatNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodUrl")
    private String vodUrl;

    private ModifyCasterVideoResourceRequest(Builder builder) {
        super(builder);
        this.beginOffset = builder.beginOffset;
        this.casterId = builder.casterId;
        this.endOffset = builder.endOffset;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.liveStreamUrl = builder.liveStreamUrl;
        this.materialId = builder.materialId;
        this.ownerId = builder.ownerId;
        this.ptsCallbackInterval = builder.ptsCallbackInterval;
        this.regionId = builder.regionId;
        this.repeatNum = builder.repeatNum;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.vodUrl = builder.vodUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterVideoResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginOffset
     */
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return endOffset
     */
    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return liveStreamUrl
     */
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ptsCallbackInterval
     */
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeatNum
     */
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return vodUrl
     */
    public String getVodUrl() {
        return this.vodUrl;
    }

    public static final class Builder extends Request.Builder<ModifyCasterVideoResourceRequest, Builder> {
        private Integer beginOffset; 
        private String casterId; 
        private Integer endOffset; 
        private String imageId; 
        private String imageUrl; 
        private String liveStreamUrl; 
        private String materialId; 
        private Long ownerId; 
        private Integer ptsCallbackInterval; 
        private String regionId; 
        private Integer repeatNum; 
        private String resourceId; 
        private String resourceName; 
        private String vodUrl; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterVideoResourceRequest request) {
            super(request);
            this.beginOffset = request.beginOffset;
            this.casterId = request.casterId;
            this.endOffset = request.endOffset;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.liveStreamUrl = request.liveStreamUrl;
            this.materialId = request.materialId;
            this.ownerId = request.ownerId;
            this.ptsCallbackInterval = request.ptsCallbackInterval;
            this.regionId = request.regionId;
            this.repeatNum = request.repeatNum;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.vodUrl = request.vodUrl;
        } 

        /**
         * <p>The offset of the position where the system starts to read the video resource.</p>
         * <p>This parameter takes effect only when the video resource is a video file. Unit: milliseconds.</p>
         * <blockquote>
         * <p> A value greater than 0 indicates an offset from the first frame.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder beginOffset(Integer beginOffset) {
            this.putQueryParameter("BeginOffset", beginOffset);
            this.beginOffset = beginOffset;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~" title="Creates a production studio.">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
         * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
         * <p>Production Studios &gt; Production Studio Management</p>
         * <blockquote>
         * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>This parameter takes effect only when the video resource is a video file. Unit: milliseconds.</p>
         * <ul>
         * <li>A value greater than <strong>0</strong> indicates an offset from the first frame.</li>
         * <li>A value smaller than <strong>0</strong> indicates an offset from the last frame.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder endOffset(Integer endOffset) {
            this.putQueryParameter("EndOffset", endOffset);
            this.endOffset = endOffset;
            return this;
        }

        /**
         * <p>ID of the media library image material.</p>
         * <blockquote>
         * <p>This parameter is only available and must be provided when the video source type is an image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a089175eb5f4427684fc0715159a****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>Image material URL. </p>
         * <blockquote>
         * <p>This parameter is only available when the video source type is an image and the image file has not been imported into the material library. Supports uploading images in jpg, png formats, with a maximum file size of 10MB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The URL of the live stream.</p>
         * <p>This parameter takes effect and is required only when the video resource is a live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
         */
        public Builder liveStreamUrl(String liveStreamUrl) {
            this.putQueryParameter("LiveStreamUrl", liveStreamUrl);
            this.liveStreamUrl = liveStreamUrl;
            return this;
        }

        /**
         * <p>The ID of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>f080575eb5f4427684fc0715159a****</p>
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
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
         * <p>The interval between presentation timestamp (PTS) callbacks. Unit: milliseconds. This parameter takes effect only when the video resource is a VOD file.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder ptsCallbackInterval(Integer ptsCallbackInterval) {
            this.putQueryParameter("PtsCallbackInterval", ptsCallbackInterval);
            this.ptsCallbackInterval = ptsCallbackInterval;
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
         * <p>The number of playback times after the first playback is complete. This parameter takes effect only when the video resource is a file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: indicates that the video is played only once. This is the default value.</li>
         * <li><strong>-1</strong>: indicates that the video is played in loop mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder repeatNum(Integer repeatNum) {
            this.putQueryParameter("RepeatNum", repeatNum);
            this.repeatNum = repeatNum;
            return this;
        }

        /**
         * <p>The ID of the video resource. It is reflected in the ResourceId parameter when you call the <a href="~~60250#doc-api-live-AddCasterVideoResource~~" title="Adds a video resource to a production studio.">AddCasterVideoResource</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the video resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The URL of the video-on-demand (VOD) file. This parameter takes effect only when the video resource is a video file that is not from the media library.</p>
         * <blockquote>
         * <p> The VOD file must be in the MP4, FLV, or TS format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com/AppName/StreamName.flv">http://developer.aliyundoc.com/AppName/StreamName.flv</a></p>
         */
        public Builder vodUrl(String vodUrl) {
            this.putQueryParameter("VodUrl", vodUrl);
            this.vodUrl = vodUrl;
            return this;
        }

        @Override
        public ModifyCasterVideoResourceRequest build() {
            return new ModifyCasterVideoResourceRequest(this);
        } 

    } 

}
