// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainLatestTransactionDigestsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainLatestTransactionDigestsRequest</p>
 */
public class DescribeAntChainLatestTransactionDigestsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    private DescribeAntChainLatestTransactionDigestsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainLatestTransactionDigestsRequest create() {
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

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainLatestTransactionDigestsRequest, Builder> {
        private String regionId; 
        private String antChainId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainLatestTransactionDigestsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        @Override
        public DescribeAntChainLatestTransactionDigestsRequest build() {
            return new DescribeAntChainLatestTransactionDigestsRequest(this);
        } 

    } 

}
