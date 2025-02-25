// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainBlockV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainBlockV2Request</p>
 */
public class DescribeAntChainBlockV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    private String consortiumId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long height;

    private DescribeAntChainBlockV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.height = builder.height;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainBlockV2Request create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainBlockV2Request, Builder> {
        private String regionId; 
        private String antChainId; 
        private String consortiumId; 
        private Long height; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainBlockV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.consortiumId = request.consortiumId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public DescribeAntChainBlockV2Request build() {
            return new DescribeAntChainBlockV2Request(this);
        } 

    } 

}
