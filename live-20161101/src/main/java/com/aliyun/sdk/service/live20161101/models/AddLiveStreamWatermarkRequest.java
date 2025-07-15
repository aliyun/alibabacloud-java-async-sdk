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
 * {@link AddLiveStreamWatermarkRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamWatermarkRequest</p>
 */
public class AddLiveStreamWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OffsetCorner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String offsetCorner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefHeight")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer refHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefWidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer refWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transparency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer transparency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XOffset")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float xOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YOffset")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float yOffset;

    private AddLiveStreamWatermarkRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.domain = builder.domain;
        this.height = builder.height;
        this.name = builder.name;
        this.offsetCorner = builder.offsetCorner;
        this.ownerId = builder.ownerId;
        this.pictureUrl = builder.pictureUrl;
        this.refHeight = builder.refHeight;
        this.refWidth = builder.refWidth;
        this.regionId = builder.regionId;
        this.transparency = builder.transparency;
        this.type = builder.type;
        this.xOffset = builder.xOffset;
        this.yOffset = builder.yOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamWatermarkRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
     * @return transparency
     */
    public Integer getTransparency() {
        return this.transparency;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<AddLiveStreamWatermarkRequest, Builder> {
        private String description; 
        private String domain; 
        private Integer height; 
        private String name; 
        private String offsetCorner; 
        private Long ownerId; 
        private String pictureUrl; 
        private Integer refHeight; 
        private Integer refWidth; 
        private String regionId; 
        private Integer transparency; 
        private Integer type; 
        private Float xOffset; 
        private Float yOffset; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamWatermarkRequest request) {
            super(request);
            this.description = request.description;
            this.domain = request.domain;
            this.height = request.height;
            this.name = request.name;
            this.offsetCorner = request.offsetCorner;
            this.ownerId = request.ownerId;
            this.pictureUrl = request.pictureUrl;
            this.refHeight = request.refHeight;
            this.refWidth = request.refWidth;
            this.regionId = request.regionId;
            this.transparency = request.transparency;
            this.type = request.type;
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
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The height of the watermark. Unit: pixels. The height of the watermark is scaled in proportion to the height of the background video.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The location of the watermark. Valid values:</p>
         * <ul>
         * <li>TopLeft: the upper-left corner.</li>
         * <li>TopRight: the upper-right corner.</li>
         * <li>BottomLeft: the lower-left corner.</li>
         * <li>BottomRight: the lower-right corner.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The height of the background video. Unit: pixels.</p>
         * <p>This parameter is required.</p>
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
         * <p>The width of the background video. Unit: pixels.</p>
         * <p>This parameter is required.</p>
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
         * <p>The transparency of the watermark. A smaller value indicates a more transparent watermark. Valid values: 0 to 255.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the watermark. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: image.</li>
         * <li><strong>1</strong>: text. Only image watermarks are supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The offset of the watermark along the x-axis. Unit: pixels.</p>
         * <blockquote>
         * <p> In this case, the value of the RefWidth parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the XOffset parameter indicates the x-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the x-axis is positive toward the right.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The offset of the watermark along the y-axis. Unit: pixels.</p>
         * <blockquote>
         * <p> In this case, the value of the RefHeight parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the YOffset parameter indicates the y-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the y-axis is positive downward.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
        public AddLiveStreamWatermarkRequest build() {
            return new AddLiveStreamWatermarkRequest(this);
        } 

    } 

}
