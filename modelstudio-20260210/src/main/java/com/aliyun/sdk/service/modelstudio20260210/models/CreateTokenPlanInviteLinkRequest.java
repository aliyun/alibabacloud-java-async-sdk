// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link CreateTokenPlanInviteLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateTokenPlanInviteLinkRequest</p>
 */
public class CreateTokenPlanInviteLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireType")
    private String expireType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ssoSource;

    private CreateTokenPlanInviteLinkRequest(Builder builder) {
        super(builder);
        this.expireType = builder.expireType;
        this.ssoSource = builder.ssoSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenPlanInviteLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireType
     */
    public String getExpireType() {
        return this.expireType;
    }

    /**
     * @return ssoSource
     */
    public String getSsoSource() {
        return this.ssoSource;
    }

    public static final class Builder extends Request.Builder<CreateTokenPlanInviteLinkRequest, Builder> {
        private String expireType; 
        private String ssoSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateTokenPlanInviteLinkRequest request) {
            super(request);
            this.expireType = request.expireType;
            this.ssoSource = request.ssoSource;
        } 

        /**
         * ExpireType.
         */
        public Builder expireType(String expireType) {
            this.putQueryParameter("ExpireType", expireType);
            this.expireType = expireType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        public Builder ssoSource(String ssoSource) {
            this.putQueryParameter("SsoSource", ssoSource);
            this.ssoSource = ssoSource;
            return this;
        }

        @Override
        public CreateTokenPlanInviteLinkRequest build() {
            return new CreateTokenPlanInviteLinkRequest(this);
        } 

    } 

}
