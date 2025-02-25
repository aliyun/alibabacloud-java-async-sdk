// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainBlockRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainBlockRequest</p>
 */
public class DescribeAntChainBlockRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long height;

    private DescribeAntChainBlockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.height = builder.height;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainBlockRequest create() {
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

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainBlockRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private Long height; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainBlockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.height = request.height;
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

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        @Override
        public DescribeAntChainBlockRequest build() {
            return new DescribeAntChainBlockRequest(this);
        } 

    } 

}
