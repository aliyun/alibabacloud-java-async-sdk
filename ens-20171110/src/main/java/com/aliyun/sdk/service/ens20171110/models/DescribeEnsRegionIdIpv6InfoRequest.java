// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEnsRegionIdIpv6InfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoRequest</p>
 */
public class DescribeEnsRegionIdIpv6InfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the node. You can specify only one node ID in a call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-xxxx-4</p>
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
