// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link QueryCrossBorderApprovalStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryCrossBorderApprovalStatusRequest</p>
 */
public class QueryCrossBorderApprovalStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
