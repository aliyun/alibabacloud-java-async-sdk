// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockchainSchemaTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlockchainSchemaTemplatesRequest</p>
 */
public class DescribeBlockchainSchemaTemplatesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeBlockchainSchemaTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockchainSchemaTemplatesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeBlockchainSchemaTemplatesRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlockchainSchemaTemplatesRequest request) {
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
        public DescribeBlockchainSchemaTemplatesRequest build() {
            return new DescribeBlockchainSchemaTemplatesRequest(this);
        } 

    } 

}
