// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetServiceTrailRequest} extends {@link RequestModel}
 *
 * <p>GetServiceTrailRequest</p>
 */
public class GetServiceTrailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetServiceTrailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTrailRequest create() {
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

    public static final class Builder extends Request.Builder<GetServiceTrailRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceTrailRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the region in which the instance resides. Valid value:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: center.</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * </ul>
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
        public GetServiceTrailRequest build() {
            return new GetServiceTrailRequest(this);
        } 

    } 

}
