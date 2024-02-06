// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdIpv6InfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoRequest</p>
 */
public class DescribeEnsRegionIdIpv6InfoRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    private DescribeEnsRegionIdIpv6InfoRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionIdIpv6InfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEnsRegionIdIpv6InfoRequest, Builder> {
        private String ensRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRegionIdIpv6InfoRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
        } 

        /**
         * The ID of the node. You can specify only one node ID in a call.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        @Override
        public DescribeEnsRegionIdIpv6InfoRequest build() {
            return new DescribeEnsRegionIdIpv6InfoRequest(this);
        } 

    } 

}
