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
 * {@link CredentialGetResultIntlRequest} extends {@link RequestModel}
 *
 * <p>CredentialGetResultIntlRequest</p>
 */
public class CredentialGetResultIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransactionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transactionId;

    private CredentialGetResultIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialGetResultIntlRequest create() {
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
     * @return transactionId
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder extends Request.Builder<CredentialGetResultIntlRequest, Builder> {
        private String regionId; 
        private String transactionId; 

        private Builder() {
            super();
        } 

        private Builder(CredentialGetResultIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.transactionId = request.transactionId;
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
         * <p>Unique identifier for the authentication request</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***abde97</p>
         */
        public Builder transactionId(String transactionId) {
            this.putQueryParameter("TransactionId", transactionId);
            this.transactionId = transactionId;
            return this;
        }

        @Override
        public CredentialGetResultIntlRequest build() {
            return new CredentialGetResultIntlRequest(this);
        } 

    } 

}
