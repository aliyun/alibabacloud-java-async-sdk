// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainNodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainNodesRequest</p>
 */
public class DescribeAntChainNodesRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainNodesRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainNodesRequest, Builder> {
        private String antChainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainNodesRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.regionId = response.regionId;
        } 

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
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
        public DescribeAntChainNodesRequest build() {
            return new DescribeAntChainNodesRequest(this);
        } 

    } 

}
