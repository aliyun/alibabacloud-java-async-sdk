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
 * {@link SetShowListBackgroundRequest} extends {@link RequestModel}
 *
 * <p>SetShowListBackgroundRequest</p>
 */
public class SetShowListBackgroundRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialId")
    private String materialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUrl")
    private String resourceUrl;

    private SetShowListBackgroundRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.materialId = builder.materialId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.resourceUrl = builder.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetShowListBackgroundRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceUrl
     */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public static final class Builder extends Request.Builder<SetShowListBackgroundRequest, Builder> {
        private String casterId; 
        private String materialId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceType; 
        private String resourceUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetShowListBackgroundRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.materialId = request.materialId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.resourceUrl = request.resourceUrl;
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
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the material in ApsaraVideo VOD.</p>
         * <blockquote>
         * <p> Specify either this parameter or the ResourceUrl parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>LIVE: live stream. You can add a live stream from ApsaraVideo Live or by using a third-party URL.</li>
         * <li>VOD: on-demand video. You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL.</li>
         * <li>PIC: image. You can add an image from ApsaraVideo VOD or by using a third-party URL.</li>
         * </ul>
         * <blockquote>
         * <p> Set this parameter to one of the preceding values, or leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The URL of the third-party material.</p>
         */
        public Builder resourceUrl(String resourceUrl) {
            this.putQueryParameter("ResourceUrl", resourceUrl);
            this.resourceUrl = resourceUrl;
            return this;
        }

        @Override
        public SetShowListBackgroundRequest build() {
            return new SetShowListBackgroundRequest(this);
        } 

    } 

}
