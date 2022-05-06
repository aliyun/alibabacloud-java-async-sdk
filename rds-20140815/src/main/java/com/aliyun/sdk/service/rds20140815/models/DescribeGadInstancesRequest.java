// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGadInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGadInstancesRequest</p>
 */
public class DescribeGadInstancesRequest extends Request {
    @Query
    @NameInMap("GadInstanceName")
    private String gadInstanceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeGadInstancesRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeGadInstancesRequest, Builder> {
        private String gadInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGadInstancesRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * GadInstanceName.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeGadInstancesRequest build() {
            return new DescribeGadInstancesRequest(this);
        } 

    } 

}
