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
 * {@link UpdateLiveStreamWatermarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveStreamWatermarkRequest</p>
 */
public class UpdateLiveStreamWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OffsetCorner")
    private String offsetCorner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureUrl")
    private String pictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefHeight")
    private Integer refHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefWidth")
    private Integer refWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transparency")
    private Integer transparency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XOffset")
    private Float xOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YOffset")
    private Float yOffset;

    private UpdateLiveStreamWatermarkRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.height = builder.height;
        this.name = builder.name;
        this.offsetCorner = builder.offsetCorner;
        this.ownerId = builder.ownerId;
        this.pictureUrl = builder.pictureUrl;
        this.refHeight = builder.refHeight;
        this.refWidth = builder.refWidth;
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.transparency = builder.transparency;
        this.xOffset = builder.xOffset;
        this.yOffset = builder.yOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveStreamWatermarkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offsetCorner
     */
    public String getOffsetCorner() {
        return this.offsetCorner;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @return refHeight
     */
    public Integer getRefHeight() {
        return this.refHeight;
    }

    /**
     * @return refWidth
     */
    public Integer getRefWidth() {
        return this.refWidth;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return transparency
     */
    public Integer getTransparency() {
        return this.transparency;
    }

    /**
     * @return xOffset
     */
    public Float getXOffset() {
        return this.xOffset;
    }

    /**
     * @return yOffset
     */
    public Float getYOffset() {
        return this.yOffset;
    }

    public static final class Builder extends Request.Builder<UpdateLiveStreamWatermarkRequest, Builder> {
        private String description; 
        private Integer height; 
        private String name; 
        private String offsetCorner; 
        private Long ownerId; 
        private String pictureUrl; 
        private Integer refHeight; 
        private Integer refWidth; 
        private String regionId; 
        private String templateId; 
        private Integer transparency; 
        private Float xOffset; 
        private Float yOffset; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveStreamWatermarkRequest request) {
            super(request);
            this.description = request.description;
            this.height = request.height;
            this.name = request.name;
            this.offsetCorner = request.offsetCorner;
            this.ownerId = request.ownerId;
            this.pictureUrl = request.pictureUrl;
            this.refHeight = request.refHeight;
            this.refWidth = request.refWidth;
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.transparency = request.transparency;
            this.xOffset = request.xOffset;
            this.yOffset = request.yOffset;
        } 

        /**
         * <p>The description of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>my watermark</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The height of the watermark. Unit: pixel. The height of the watermark is scaled in proportion to the height of the background video.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder height(Integer height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>The name of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>livewatermark****</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The position of the watermark. Valid values:</p>
         * <ul>
         * <li>TopLeft: the upper-left corner.</li>
         * <li>TopRight: the upper-right corner.</li>
         * <li>BottomLeft: the lower-left corner.</li>
         * <li>BottomRight: the lower-right corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TopRight</p>
         */
        public Builder offsetCorner(String offsetCorner) {
            this.putQueryParameter("OffsetCorner", offsetCorner);
            this.offsetCorner = offsetCorner;
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
         * <p>The URL of the watermark image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        public Builder pictureUrl(String pictureUrl) {
            this.putQueryParameter("PictureUrl", pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        /**
         * <p>The height of the background video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder refHeight(Integer refHeight) {
            this.putQueryParameter("RefHeight", refHeight);
            this.refHeight = refHeight;
            return this;
        }

        /**
         * <p>The width of the background video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder refWidth(Integer refWidth) {
            this.putQueryParameter("RefWidth", refWidth);
            this.refWidth = refWidth;
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
         * <p>The ID of the watermark template.</p>
         * <blockquote>
         * <p> You can obtain the template ID by checking the value of the TemplateId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/410759.html">AddLiveStreamWatermark</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The transparency of the watermark. A smaller value indicates a more transparent watermark. Valid values: 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        public Builder transparency(Integer transparency) {
            this.putQueryParameter("Transparency", transparency);
            this.transparency = transparency;
            return this;
        }

        /**
         * <p>The offset of the watermark along the x-axis. Unit: pixel.</p>
         * <blockquote>
         * <p> In this case, the value of the RefWidth parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the XOffset parameter indicates the x-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the x-axis is positive toward the right.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        public Builder xOffset(Float xOffset) {
            this.putQueryParameter("XOffset", xOffset);
            this.xOffset = xOffset;
            return this;
        }

        /**
         * <p>The offset of the watermark along the y-axis. Unit: pixel.</p>
         * <blockquote>
         * <p> In this case, the value of the RefHeight parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the YOffset parameter indicates the y-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the y-axis is positive downward.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        public Builder yOffset(Float yOffset) {
            this.putQueryParameter("YOffset", yOffset);
            this.yOffset = yOffset;
            return this;
        }

        @Override
        public UpdateLiveStreamWatermarkRequest build() {
            return new UpdateLiveStreamWatermarkRequest(this);
        } 

    } 

}
