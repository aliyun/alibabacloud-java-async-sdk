// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionReceiptNewRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionReceiptNewRequest</p>
 */
public class DescribeAntChainTransactionReceiptNewRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Hash")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hash;

    private DescribeAntChainTransactionReceiptNewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.hash = builder.hash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionReceiptNewRequest create() {
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
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionReceiptNewRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String consortiumId; 
        private String hash; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionReceiptNewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.consortiumId = request.consortiumId;
            this.hash = request.hash;
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
         * Hash.
         */
        public Builder hash(String hash) {
            this.putBodyParameter("Hash", hash);
            this.hash = hash;
            return this;
        }

        @Override
        public DescribeAntChainTransactionReceiptNewRequest build() {
            return new DescribeAntChainTransactionReceiptNewRequest(this);
        } 

    } 

}
