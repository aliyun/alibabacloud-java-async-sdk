// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainBlockRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainBlockRequest</p>
 */
public class DescribeAntChainBlockRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("Height")
    @Validation(required = true)
    private Long height;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainBlockRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.height = builder.height;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainBlockRequest, Builder> {
        private String antChainId; 
        private Long height; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainBlockRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.height = response.height;
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
         * Height.
         */
        public Builder height(Long height) {
            this.putBodyParameter("Height", height);
            this.height = height;
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
        public DescribeAntChainBlockRequest build() {
            return new DescribeAntChainBlockRequest(this);
        } 

    } 

}
