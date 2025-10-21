// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetPolicyDefaultOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetPolicyDefaultOptionsRequest</p>
 */
public class GetPolicyDefaultOptionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetPolicyDefaultOptionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyDefaultOptionsRequest create() {
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

    public static final class Builder extends Request.Builder<GetPolicyDefaultOptionsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPolicyDefaultOptionsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetPolicyDefaultOptionsRequest build() {
            return new GetPolicyDefaultOptionsRequest(this);
        } 

    } 

}
