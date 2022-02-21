// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionReceiptRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionReceiptRequest</p>
 */
public class DescribeAntChainTransactionReceiptRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("Hash")
    @Validation(required = true)
    private String hash;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainTransactionReceiptRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.hash = builder.hash;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionReceiptRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionReceiptRequest, Builder> {
        private String antChainId; 
        private String hash; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionReceiptRequest response) {
            super(response);
            this.antChainId = response.antChainId;
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
        public DescribeAntChainTransactionReceiptRequest build() {
            return new DescribeAntChainTransactionReceiptRequest(this);
        } 

    } 

}
