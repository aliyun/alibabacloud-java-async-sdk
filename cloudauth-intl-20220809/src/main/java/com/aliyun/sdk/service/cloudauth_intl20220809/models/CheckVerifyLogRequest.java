// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckVerifyLogRequest} extends {@link RequestModel}
 *
 * <p>CheckVerifyLogRequest</p>
 */
public class CheckVerifyLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransactionId")
    private String transactionId;

    private CheckVerifyLogRequest(Builder builder) {
        super(builder);
        this.merchantBizId = builder.merchantBizId;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVerifyLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<CheckVerifyLogRequest, Builder> {
        private String merchantBizId; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckVerifyLogRequest request) {
            super(request);
            this.merchantBizId = request.merchantBizId;
            this.transactionId = request.transactionId;
        } 

        /**
         * <p>A unique business identifier defined by the merchant, used for subsequent problem localization and troubleshooting. Supports a combination of letters and numbers, with a maximum length of 32 characters. Ensure uniqueness.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a***353888</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putBodyParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>The unique identifier for the entire authentication process. This value needs to be obtained by calling Initialize.</p>
         * 
         * <strong>example:</strong>
         * <p>hksb7ba1b*********015d694361bee4</p>
         */
        public Builder transactionId(String transactionId) {
            this.putBodyParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public CheckVerifyLogRequest build() {
            return new CheckVerifyLogRequest(this);
        } 

    } 

}
