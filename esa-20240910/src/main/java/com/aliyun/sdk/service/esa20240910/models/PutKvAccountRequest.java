// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutKvAccountRequest} extends {@link RequestModel}
 *
 * <p>PutKvAccountRequest</p>
 */
public class PutKvAccountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private PutKvAccountRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutKvAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PutKvAccountRequest, Builder> {
        private String accountType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(PutKvAccountRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.status = request.status;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putBodyParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public PutKvAccountRequest build() {
            return new PutKvAccountRequest(this);
        } 

    } 

}
