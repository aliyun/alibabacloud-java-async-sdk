// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusiRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListBusiRegionsRequest</p>
 */
public class ListBusiRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListBusiRegionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBusiRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListBusiRegionsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBusiRegionsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListBusiRegionsRequest build() {
            return new ListBusiRegionsRequest(this);
        } 

    } 

}
