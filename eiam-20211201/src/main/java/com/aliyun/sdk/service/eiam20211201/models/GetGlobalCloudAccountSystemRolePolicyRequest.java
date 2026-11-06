// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetGlobalCloudAccountSystemRolePolicyRequest} extends {@link RequestModel}
 *
 * <p>GetGlobalCloudAccountSystemRolePolicyRequest</p>
 */
public class GetGlobalCloudAccountSystemRolePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetGlobalCloudAccountSystemRolePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalCloudAccountSystemRolePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetGlobalCloudAccountSystemRolePolicyRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetGlobalCloudAccountSystemRolePolicyRequest request) {
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
        public GetGlobalCloudAccountSystemRolePolicyRequest build() {
            return new GetGlobalCloudAccountSystemRolePolicyRequest(this);
        } 

    } 

}
