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
 * {@link UpdateServiceCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceCredentialRequest</p>
 */
public class UpdateServiceCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCredentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCredentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCredentialName")
    private String serviceCredentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private UpdateServiceCredentialRequest(Builder builder) {
        super(builder);
        this.serviceCredentialId = builder.serviceCredentialId;
        this.serviceCredentialName = builder.serviceCredentialName;
        this.status = builder.status;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceCredentialRequest create() {
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
     * @return serviceCredentialName
     */
    public String getServiceCredentialName() {
        return this.serviceCredentialName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<UpdateServiceCredentialRequest, Builder> {
        private String serviceCredentialId; 
        private String serviceCredentialName; 
        private String status; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceCredentialRequest request) {
            super(request);
            this.serviceCredentialId = request.serviceCredentialId;
            this.serviceCredentialName = request.serviceCredentialName;
            this.status = request.status;
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
         * ServiceCredentialName.
         */
        public Builder serviceCredentialName(String serviceCredentialName) {
            this.putQueryParameter("ServiceCredentialName", serviceCredentialName);
            this.serviceCredentialName = serviceCredentialName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public UpdateServiceCredentialRequest build() {
            return new UpdateServiceCredentialRequest(this);
        } 

    } 

}
