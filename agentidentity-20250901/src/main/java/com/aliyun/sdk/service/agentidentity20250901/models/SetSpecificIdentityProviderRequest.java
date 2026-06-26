// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link SetSpecificIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>SetSpecificIdentityProviderRequest</p>
 */
public class SetSpecificIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IDPMetadata")
    private String IDPMetadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SSOStatus")
    private String SSOStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private SetSpecificIdentityProviderRequest(Builder builder) {
        super(builder);
        this.IDPMetadata = builder.IDPMetadata;
        this.identityProviderType = builder.identityProviderType;
        this.SSOStatus = builder.SSOStatus;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSpecificIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IDPMetadata
     */
    public String getIDPMetadata() {
        return this.IDPMetadata;
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return SSOStatus
     */
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<SetSpecificIdentityProviderRequest, Builder> {
        private String IDPMetadata; 
        private String identityProviderType; 
        private String SSOStatus; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(SetSpecificIdentityProviderRequest request) {
            super(request);
            this.IDPMetadata = request.IDPMetadata;
            this.identityProviderType = request.identityProviderType;
            this.SSOStatus = request.SSOStatus;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * IDPMetadata.
         */
        public Builder IDPMetadata(String IDPMetadata) {
            this.putBodyParameter("IDPMetadata", IDPMetadata);
            this.IDPMetadata = IDPMetadata;
            return this;
        }

        /**
         * IdentityProviderType.
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putBodyParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * SSOStatus.
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putBodyParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public SetSpecificIdentityProviderRequest build() {
            return new SetSpecificIdentityProviderRequest(this);
        } 

    } 

}
