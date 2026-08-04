// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindPkByHidForLoginWithLegacyRequest} extends {@link RequestModel}
 *
 * <p>FindPkByHidForLoginWithLegacyRequest</p>
 */
public class FindPkByHidForLoginWithLegacyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hid")
    private String hid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private FindPkByHidForLoginWithLegacyRequest(Builder builder) {
        super(builder);
        this.hid = builder.hid;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindPkByHidForLoginWithLegacyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hid
     */
    public String getHid() {
        return this.hid;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<FindPkByHidForLoginWithLegacyRequest, Builder> {
        private String hid; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(FindPkByHidForLoginWithLegacyRequest request) {
            super(request);
            this.hid = request.hid;
            this.securityToken = request.securityToken;
        } 

        /**
         * Hid.
         */
        public Builder hid(String hid) {
            this.putQueryParameter("Hid", hid);
            this.hid = hid;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public FindPkByHidForLoginWithLegacyRequest build() {
            return new FindPkByHidForLoginWithLegacyRequest(this);
        } 

    } 

}
