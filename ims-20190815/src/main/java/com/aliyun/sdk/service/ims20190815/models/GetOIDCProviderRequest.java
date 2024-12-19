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
 * {@link GetOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>GetOIDCProviderRequest</p>
 */
public class GetOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private GetOIDCProviderRequest(Builder builder) {
        super(builder);
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOIDCProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<GetOIDCProviderRequest, Builder> {
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(GetOIDCProviderRequest request) {
            super(request);
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * <p>The name of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOIDCProvider</p>
         */
        public Builder OIDCProviderName(String OIDCProviderName) {
            this.putQueryParameter("OIDCProviderName", OIDCProviderName);
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }

        @Override
        public GetOIDCProviderRequest build() {
            return new GetOIDCProviderRequest(this);
        } 

    } 

}
