// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterDelegatedAdministratorRequest} extends {@link RequestModel}
 *
 * <p>DeregisterDelegatedAdministratorRequest</p>
 */
public class DeregisterDelegatedAdministratorRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("ServicePrincipal")
    @Validation(required = true)
    private String servicePrincipal;

    private DeregisterDelegatedAdministratorRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.servicePrincipal = builder.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterDelegatedAdministratorRequest create() {
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
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    public static final class Builder extends Request.Builder<DeregisterDelegatedAdministratorRequest, Builder> {
        private String accountId; 
        private String servicePrincipal; 

        private Builder() {
            super();
        } 

        private Builder(DeregisterDelegatedAdministratorRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.servicePrincipal = response.servicePrincipal;
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
         * ServicePrincipal.
         */
        public Builder servicePrincipal(String servicePrincipal) {
            this.putQueryParameter("ServicePrincipal", servicePrincipal);
            this.servicePrincipal = servicePrincipal;
            return this;
        }

        @Override
        public DeregisterDelegatedAdministratorRequest build() {
            return new DeregisterDelegatedAdministratorRequest(this);
        } 

    } 

}
