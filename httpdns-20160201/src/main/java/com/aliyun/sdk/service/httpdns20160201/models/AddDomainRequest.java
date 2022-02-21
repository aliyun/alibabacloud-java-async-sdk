// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDomainRequest</p>
 */
public class AddDomainRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private AddDomainRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<AddDomainRequest, Builder> {
        private String accountId; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.domainName = response.domainName;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public AddDomainRequest build() {
            return new AddDomainRequest(this);
        } 

    } 

}
