// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>GetSAMLProviderRequest</p>
 */
public class GetSAMLProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SAMLProviderName;

    private GetSAMLProviderRequest(Builder builder) {
        super(builder);
        this.SAMLProviderName = builder.SAMLProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSAMLProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SAMLProviderName
     */
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

    public static final class Builder extends Request.Builder<GetSAMLProviderRequest, Builder> {
        private String SAMLProviderName; 

        private Builder() {
            super();
        } 

        private Builder(GetSAMLProviderRequest request) {
            super(request);
            this.SAMLProviderName = request.SAMLProviderName;
        } 

        /**
         * <p>The name of the IdP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-provider</p>
         */
        public Builder SAMLProviderName(String SAMLProviderName) {
            this.putQueryParameter("SAMLProviderName", SAMLProviderName);
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }

        @Override
        public GetSAMLProviderRequest build() {
            return new GetSAMLProviderRequest(this);
        } 

    } 

}
