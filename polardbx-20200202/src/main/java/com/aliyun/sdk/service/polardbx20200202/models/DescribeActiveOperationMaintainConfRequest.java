// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationMaintainConfRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveOperationMaintainConfRequest</p>
 */
public class DescribeActiveOperationMaintainConfRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeActiveOperationMaintainConfRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationMaintainConfRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeActiveOperationMaintainConfRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveOperationMaintainConfRequest response) {
            super(response);
            this.regionId = response.regionId;
        } 

        /**
         * 区域ID
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeActiveOperationMaintainConfRequest build() {
            return new DescribeActiveOperationMaintainConfRequest(this);
        } 

    } 

}
