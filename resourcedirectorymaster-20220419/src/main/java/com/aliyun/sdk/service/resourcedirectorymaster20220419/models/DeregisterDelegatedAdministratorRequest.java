// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link DeregisterDelegatedAdministratorRequest} extends {@link RequestModel}
 *
 * <p>DeregisterDelegatedAdministratorRequest</p>
 */
public class DeregisterDelegatedAdministratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePrincipal")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeregisterDelegatedAdministratorRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.servicePrincipal = request.servicePrincipal;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>181761095690****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The identifier of the trusted service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfw.aliyuncs.com</p>
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
