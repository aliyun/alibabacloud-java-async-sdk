// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainBlockNewRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainBlockNewRequest</p>
 */
public class DescribeAntChainBlockNewRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Body
    @NameInMap("Height")
    @Validation(required = true)
    private Long height;

    private DescribeAntChainBlockNewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.height = builder.height;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainBlockNewRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAntChainBlockNewRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String consortiumId; 
        private Long height; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainBlockNewRequest request) {
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
        public DescribeAntChainBlockNewRequest build() {
            return new DescribeAntChainBlockNewRequest(this);
        } 

    } 

}
