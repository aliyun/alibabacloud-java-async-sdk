// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSAMLProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteSAMLProviderRequest</p>
 */
public class DeleteSAMLProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SAMLProviderName;

    private DeleteSAMLProviderRequest(Builder builder) {
        super(builder);
        this.SAMLProviderName = builder.SAMLProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSAMLProviderRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSAMLProviderRequest, Builder> {
        private String SAMLProviderName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSAMLProviderRequest request) {
            super(request);
            this.SAMLProviderName = request.SAMLProviderName;
        } 

        /**
         * The name of the IdP that you want to delete.
         */
        public Builder SAMLProviderName(String SAMLProviderName) {
            this.putQueryParameter("SAMLProviderName", SAMLProviderName);
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }

        @Override
        public DeleteSAMLProviderRequest build() {
            return new DeleteSAMLProviderRequest(this);
        } 

    } 

}
