// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZonesRequest} extends {@link RequestModel}
 *
 * <p>ListZonesRequest</p>
 */
public class ListZonesRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListZonesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZonesRequest create() {
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

    public static final class Builder extends Request.Builder<ListZonesRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListZonesRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListZonesRequest build() {
            return new ListZonesRequest(this);
        } 

    } 

}
