// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link DecommissionGovernanceRequest} extends {@link RequestModel}
 *
 * <p>DecommissionGovernanceRequest</p>
 */
public class DecommissionGovernanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DecommissionGovernanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecommissionGovernanceRequest create() {
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

    public static final class Builder extends Request.Builder<DecommissionGovernanceRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DecommissionGovernanceRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>RegionId</p>
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
        public DecommissionGovernanceRequest build() {
            return new DecommissionGovernanceRequest(this);
        } 

    } 

}
