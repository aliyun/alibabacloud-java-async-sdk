// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserTransactionQRCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainMiniAppBrowserTransactionQRCodeRequest</p>
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("TransactionHash")
    @Validation(required = true)
    private String transactionHash;

    private DescribeAntChainMiniAppBrowserTransactionQRCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.transactionHash = builder.transactionHash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeRequest create() {
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
     * @return transactionHash
     */
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainMiniAppBrowserTransactionQRCodeRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String transactionHash; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.transactionHash = request.transactionHash;
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
         * TransactionHash.
         */
        public Builder transactionHash(String transactionHash) {
            this.putBodyParameter("TransactionHash", transactionHash);
            this.transactionHash = transactionHash;
            return this;
        }

        @Override
        public DescribeAntChainMiniAppBrowserTransactionQRCodeRequest build() {
            return new DescribeAntChainMiniAppBrowserTransactionQRCodeRequest(this);
        } 

    } 

}
