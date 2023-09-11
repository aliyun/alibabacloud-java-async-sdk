// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCrossBorderApprovalStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryCrossBorderApprovalStatusRequest</p>
 */
public class QueryCrossBorderApprovalStatusRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private QueryCrossBorderApprovalStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCrossBorderApprovalStatusRequest create() {
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

    public static final class Builder extends Request.Builder<QueryCrossBorderApprovalStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCrossBorderApprovalStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryCrossBorderApprovalStatusRequest build() {
            return new QueryCrossBorderApprovalStatusRequest(this);
        } 

    } 

}
