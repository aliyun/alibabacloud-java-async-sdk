// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionsRequest</p>
 */
public class DescribeEnsRegionsRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    private DescribeEnsRegionsRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeEnsRegionsRequest, Builder> {
        private String ensRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRegionsRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
        } 

        /**
         * The ID of the node.
         * <p>
         * 
         * By default, all available node IDs are returned.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        @Override
        public DescribeEnsRegionsRequest build() {
            return new DescribeEnsRegionsRequest(this);
        } 

    } 

}
