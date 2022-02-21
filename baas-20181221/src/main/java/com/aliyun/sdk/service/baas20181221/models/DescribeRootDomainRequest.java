// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRootDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeRootDomainRequest</p>
 */
public class DescribeRootDomainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeRootDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRootDomainRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRootDomainRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRootDomainRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public DescribeRootDomainRequest build() {
            return new DescribeRootDomainRequest(this);
        } 

    } 

}
