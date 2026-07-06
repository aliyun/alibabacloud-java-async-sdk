// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeleteServiceCredentialRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceCredentialRequest</p>
 */
public class DeleteServiceCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCredentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCredentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private DeleteServiceCredentialRequest(Builder builder) {
        super(builder);
        this.serviceCredentialId = builder.serviceCredentialId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCredentialId
     */
    public String getServiceCredentialId() {
        return this.serviceCredentialId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<DeleteServiceCredentialRequest, Builder> {
        private String serviceCredentialId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceCredentialRequest request) {
            super(request);
            this.serviceCredentialId = request.serviceCredentialId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SC****************</p>
         */
        public Builder serviceCredentialId(String serviceCredentialId) {
            this.putQueryParameter("ServiceCredentialId", serviceCredentialId);
            this.serviceCredentialId = serviceCredentialId;
            return this;
        }

        /**
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public DeleteServiceCredentialRequest build() {
            return new DeleteServiceCredentialRequest(this);
        } 

    } 

}
