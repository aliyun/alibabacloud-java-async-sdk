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
 * {@link SetCasterChannelRequest} extends {@link RequestModel}
 *
 * <p>SetCasterChannelRequest</p>
 */
public class SetCasterChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceBeauty")
    private String faceBeauty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayStatus")
    private Integer playStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeekOffset")
    private Integer seekOffset;

    private SetCasterChannelRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.channelId = builder.channelId;
        this.faceBeauty = builder.faceBeauty;
        this.ownerId = builder.ownerId;
        this.playStatus = builder.playStatus;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.seekOffset = builder.seekOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return faceBeauty
     */
    public String getFaceBeauty() {
        return this.faceBeauty;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playStatus
     */
    public Integer getPlayStatus() {
        return this.playStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return seekOffset
     */
    public Integer getSeekOffset() {
        return this.seekOffset;
    }

    public static final class Builder extends Request.Builder<SetCasterChannelRequest, Builder> {
        private String casterId; 
        private String channelId; 
        private String faceBeauty; 
        private Long ownerId; 
        private Integer playStatus; 
        private String regionId; 
        private String resourceId; 
        private Integer seekOffset; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterChannelRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.channelId = request.channelId;
            this.faceBeauty = request.faceBeauty;
            this.ownerId = request.ownerId;
            this.playStatus = request.playStatus;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.seekOffset = request.seekOffset;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the channel.</p>
         * <p>When channels are enabled, the layout references the channel IDs. You can specify up to one resource for a channel. The number of resources is limited by the number of the channels of the production studio. The value must be in the RV[Number] format, such as RV01 and RV12.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The face retouching effect. Valid values: 0 (all effects), 1 (skin smoothing), 2 (skin whitening), 3 (dark circles removal), and 4 (nasolabial folds removal).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder faceBeauty(String faceBeauty) {
            this.putQueryParameter("FaceBeauty", faceBeauty);
            this.faceBeauty = faceBeauty;
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
         * <p>The playback status. This parameter take effects for video files, but not for live streams. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: specifies that the video source is playing. This is the default value.</li>
         * <li><strong>0</strong>: specifies that the playback of the video source is paused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder playStatus(Integer playStatus) {
            this.putQueryParameter("PlayStatus", playStatus);
            this.playStatus = playStatus;
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
         * <p>The ID of the video source.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The offset of the position where the production studio starts reading the video source. The value must be greater than or equal to 0, indicating an offset from the first frame. This parameter take effects for video files, but not for live streams. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder seekOffset(Integer seekOffset) {
            this.putQueryParameter("SeekOffset", seekOffset);
            this.seekOffset = seekOffset;
            return this;
        }

        @Override
        public SetCasterChannelRequest build() {
            return new SetCasterChannelRequest(this);
        } 

    } 

}
