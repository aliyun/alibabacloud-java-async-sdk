// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionV2Request</p>
 */
public class DescribeAntChainTransactionV2Request extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Body
    @NameInMap("Hash")
    @Validation(required = true)
    private String hash;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainTransactionV2Request(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.hash = builder.hash;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionV2Request create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionV2Request, Builder> {
        private String antChainId; 
        private String consortiumId; 
        private String hash; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionV2Request response) {
            super(response);
            this.antChainId = response.antChainId;
            this.consortiumId = response.consortiumId;
            this.hash = response.hash;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * Hash.
         */
        public Builder hash(String hash) {
            this.putBodyParameter("Hash", hash);
            this.hash = hash;
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
        public DescribeAntChainTransactionV2Request build() {
            return new DescribeAntChainTransactionV2Request(this);
        } 

    } 

}
