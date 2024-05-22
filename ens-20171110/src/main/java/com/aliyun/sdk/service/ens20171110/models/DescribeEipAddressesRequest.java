// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipAddressesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEipAddressesRequest</p>
 */
public class DescribeEipAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Eips")
    private String eips;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    private DescribeEipAddressesRequest(Builder builder) {
        super(builder);
        this.eips = builder.eips;
        this.ensRegionId = builder.ensRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eips
     */
    public String getEips() {
        return this.eips;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeEipAddressesRequest, Builder> {
        private String eips; 
        private String ensRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEipAddressesRequest request) {
            super(request);
            this.eips = request.eips;
            this.ensRegionId = request.ensRegionId;
        } 

        /**
         * The information about the EIPs.
         */
        public Builder eips(String eips) {
            this.putQueryParameter("Eips", eips);
            this.eips = eips;
            return this;
        }

        /**
         * The ID of the Edge Node Service (ENS) node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        @Override
        public DescribeEipAddressesRequest build() {
            return new DescribeEipAddressesRequest(this);
        } 

    } 

}
