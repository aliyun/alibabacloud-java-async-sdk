// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListAllPublicMediaTagsRequest} extends {@link RequestModel}
 *
 * <p>ListAllPublicMediaTagsRequest</p>
 */
public class ListAllPublicMediaTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    private ListAllPublicMediaTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessType = builder.businessType;
        this.entityId = builder.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllPublicMediaTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    public static final class Builder extends Request.Builder<ListAllPublicMediaTagsRequest, Builder> {
        private String regionId; 
        private String businessType; 
        private String entityId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllPublicMediaTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessType = request.businessType;
            this.entityId = request.entityId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;sticker&quot;</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The entity ID, which is used to distinguish between media assets of different types in the public domain.</p>
         * <p>Set this parameter to Copyright_Music, which indicates music in the public domain.</p>
         * 
         * <strong>example:</strong>
         * <p>Copyright_Music</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        @Override
        public ListAllPublicMediaTagsRequest build() {
            return new ListAllPublicMediaTagsRequest(this);
        } 

    } 

}
