// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetPrometheusApiTokenRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusApiTokenRequest</p>
 */
public class GetPrometheusApiTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetPrometheusApiTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusApiTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetPrometheusApiTokenRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusApiTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>The region ID.</p>
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
        public GetPrometheusApiTokenRequest build() {
            return new GetPrometheusApiTokenRequest(this);
        } 

    } 

}
