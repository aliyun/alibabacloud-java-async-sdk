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
 * {@link CreateServiceCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceCredentialRequest</p>
 */
public class CreateServiceCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialAgeDays")
    private Integer credentialAgeDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCredentialName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCredentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private CreateServiceCredentialRequest(Builder builder) {
        super(builder);
        this.credentialAgeDays = builder.credentialAgeDays;
        this.serviceCredentialName = builder.serviceCredentialName;
        this.serviceName = builder.serviceName;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialAgeDays
     */
    public Integer getCredentialAgeDays() {
        return this.credentialAgeDays;
    }

    /**
     * @return serviceCredentialName
     */
    public String getServiceCredentialName() {
        return this.serviceCredentialName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<CreateServiceCredentialRequest, Builder> {
        private Integer credentialAgeDays; 
        private String serviceCredentialName; 
        private String serviceName; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceCredentialRequest request) {
            super(request);
            this.credentialAgeDays = request.credentialAgeDays;
            this.serviceCredentialName = request.serviceCredentialName;
            this.serviceName = request.serviceName;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * CredentialAgeDays.
         */
        public Builder credentialAgeDays(Integer credentialAgeDays) {
            this.putQueryParameter("CredentialAgeDays", credentialAgeDays);
            this.credentialAgeDays = credentialAgeDays;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourServiceCredentialName</p>
         */
        public Builder serviceCredentialName(String serviceCredentialName) {
            this.putQueryParameter("ServiceCredentialName", serviceCredentialName);
            this.serviceCredentialName = serviceCredentialName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.aliyuncs.com</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
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
        public CreateServiceCredentialRequest build() {
            return new CreateServiceCredentialRequest(this);
        } 

    } 

}
