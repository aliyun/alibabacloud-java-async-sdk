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
 * {@link AddCasterVideoResourceRequest} extends {@link RequestModel}
 *
 * <p>AddCasterVideoResourceRequest</p>
 */
public class AddCasterVideoResourceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FixedDelayDuration")
    private Integer fixedDelayDuration;

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
    @com.aliyun.core.annotation.NameInMap("LocationId")
    private String locationId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodUrl")
    private String vodUrl;

    private AddCasterVideoResourceRequest(Builder builder) {
        super(builder);
        this.beginOffset = builder.beginOffset;
        this.casterId = builder.casterId;
        this.endOffset = builder.endOffset;
        this.fixedDelayDuration = builder.fixedDelayDuration;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.liveStreamUrl = builder.liveStreamUrl;
        this.locationId = builder.locationId;
        this.materialId = builder.materialId;
        this.ownerId = builder.ownerId;
        this.ptsCallbackInterval = builder.ptsCallbackInterval;
        this.regionId = builder.regionId;
        this.repeatNum = builder.repeatNum;
        this.resourceName = builder.resourceName;
        this.vodUrl = builder.vodUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterVideoResourceRequest create() {
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
     * @return fixedDelayDuration
     */
    public Integer getFixedDelayDuration() {
        return this.fixedDelayDuration;
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
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
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

    public static final class Builder extends Request.Builder<AddCasterVideoResourceRequest, Builder> {
        private Integer beginOffset; 
        private String casterId; 
        private Integer endOffset; 
        private Integer fixedDelayDuration; 
        private String imageId; 
        private String imageUrl; 
        private String liveStreamUrl; 
        private String locationId; 
        private String materialId; 
        private Long ownerId; 
        private Integer ptsCallbackInterval; 
        private String regionId; 
        private Integer repeatNum; 
        private String resourceName; 
        private String vodUrl; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterVideoResourceRequest request) {
            super(request);
            this.beginOffset = request.beginOffset;
            this.casterId = request.casterId;
            this.endOffset = request.endOffset;
            this.fixedDelayDuration = request.fixedDelayDuration;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.liveStreamUrl = request.liveStreamUrl;
            this.locationId = request.locationId;
            this.materialId = request.materialId;
            this.ownerId = request.ownerId;
            this.ptsCallbackInterval = request.ptsCallbackInterval;
            this.regionId = request.regionId;
            this.repeatNum = request.repeatNum;
            this.resourceName = request.resourceName;
            this.vodUrl = request.vodUrl;
        } 

        /**
         * <p>The offset of the position where the system starts to read the video source. Unit: milliseconds.</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
         * <blockquote>
         * <p>A value greater than <strong>0</strong> specifies an offset from the first frame.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder beginOffset(Integer beginOffset) {
            this.putQueryParameter("BeginOffset", beginOffset);
            this.beginOffset = beginOffset;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p>You can find the ID of the production studio in the Instance Name column.</p>
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
         * <p>The offset of the position where the system stops reading the video source. Unit: milliseconds.</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
         * <ul>
         * <li>A value greater than <strong>0</strong> specifies an offset from the first frame.</li>
         * <li>A value less than <strong>0</strong> specifies an offset from the last frame.</li>
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
         * <p>The fixed delay of the video layer. This parameter is used to synchronize the video with subtitles. Unit: milliseconds. Default value: 0. Valid values: <code>0 to 5000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fixedDelayDuration(Integer fixedDelayDuration) {
            this.putQueryParameter("FixedDelayDuration", fixedDelayDuration);
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }

        /**
         * <p>ID of the media library image material. </p>
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
         * <p>This parameter is available only when the video source type is an image and the image file has not been imported into the material library. Supports uploading images in jpg, png formats, with a maximum file size of 10MB.</p>
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
         * <p>The streaming URL.</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter is required if the video source is a live stream.</p>
         * <blockquote>
         * <p>Do not specify this parameter in the request if the video source is not a live stream.</p>
         * </blockquote>
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
         * <p>The ID that is used to identify the position of the video source.</p>
         * <p>Define the reference numbers in the layout. Each reference number is associated with only one resource. The value of this parameter must be in the RV[Number] format, where Number is <code>01 to 99</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        public Builder locationId(String locationId) {
            this.putQueryParameter("LocationId", locationId);
            this.locationId = locationId;
            return this;
        }

        /**
         * <p>The ID of the material from the media library.</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter takes effect and is required only if the video source is a material.</p>
         * <p>If you query the configurations of the production studio by calling the <a href="https://help.aliyun.com/document_detail/60259.html">DescribeCasterConfig</a> operation, obtain the value of the response parameter UrgentMaterialId.</p>
         * <blockquote>
         * <p>The value of the UrgentMaterialId parameter is the ID of the material from the media library.</p>
         * </blockquote>
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
         * <p>The interval between presentation timestamp (PTS) callbacks. Unit: milliseconds.</p>
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
         * <p>The number of playbacks after the first playback is complete. Valid values:</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
         * <ul>
         * <li><strong>0</strong>: specifies that the video source is played only once. This is the default value.</li>
         * <li><strong>-1</strong>: specifies that the video source is played in loop mode.</li>
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
         * <p>The name of the video source.</p>
         * <p>This parameter is required.</p>
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
         * <p>The URL of the VOD file.</p>
         * <p>**</p>
         * <p><strong>Important</strong> This parameter takes effect only if the video source is a file that is not from the media library.</p>
         * <blockquote>
         * <p>The VOD file must be in the MP4, FLV, or TS format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/AppName/StreamName.flv">http://learn.aliyundoc.com/AppName/StreamName.flv</a></p>
         */
        public Builder vodUrl(String vodUrl) {
            this.putQueryParameter("VodUrl", vodUrl);
            this.vodUrl = vodUrl;
            return this;
        }

        @Override
        public AddCasterVideoResourceRequest build() {
            return new AddCasterVideoResourceRequest(this);
        } 

    } 

}
