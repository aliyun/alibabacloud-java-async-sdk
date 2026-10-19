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
         * <p>The expiration period. Default value: DAYS_7. Valid values:</p>
         * <ul>
         * <li>DAYS_7</li>
         * <li>DAYS_30</li>
         * <li>MONTHS_6</li>
         * <li>YEAR_1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAYS_7</p>
         */
        public Builder expireType(String expireType) {
            this.putQueryParameter("ExpireType", expireType);
            this.expireType = expireType;
            return this;
        }

        /**
         * <p>The SSO logon method bound to the invitation link. Valid values:</p>
         * <ul>
         * <li>SAML</li>
         * <li>DINGTALK</li>
         * </ul>
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
