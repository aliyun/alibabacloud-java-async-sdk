// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsByResourceRequest} extends {@link RequestModel}
 *
 * <p>ListTagsByResourceRequest</p>
 */
public class ListTagsByResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    private ListTagsByResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsByResourceRequest create() {
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
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<ListTagsByResourceRequest, Builder> {
        private String regionId; 
        private java.util.List < String > resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsByResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
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
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public ListTagsByResourceRequest build() {
            return new ListTagsByResourceRequest(this);
        } 

    } 

}
