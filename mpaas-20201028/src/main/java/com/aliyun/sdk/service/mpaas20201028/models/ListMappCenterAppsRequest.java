// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMappCenterAppsRequest} extends {@link RequestModel}
 *
 * <p>ListMappCenterAppsRequest</p>
 */
public class ListMappCenterAppsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListMappCenterAppsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMappCenterAppsRequest create() {
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

    public static final class Builder extends Request.Builder<ListMappCenterAppsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListMappCenterAppsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListMappCenterAppsRequest build() {
            return new ListMappCenterAppsRequest(this);
        } 

    } 

}
