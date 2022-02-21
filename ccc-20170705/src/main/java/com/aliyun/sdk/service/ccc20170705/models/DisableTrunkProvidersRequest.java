// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableTrunkProvidersRequest} extends {@link RequestModel}
 *
 * <p>DisableTrunkProvidersRequest</p>
 */
public class DisableTrunkProvidersRequest extends Request {
    @Query
    @NameInMap("ProviderName")
    private java.util.List < String > providerName;

    private DisableTrunkProvidersRequest(Builder builder) {
        super(builder);
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableTrunkProvidersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return providerName
     */
    public java.util.List < String > getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<DisableTrunkProvidersRequest, Builder> {
        private java.util.List < String > providerName; 

        private Builder() {
            super();
        } 

        private Builder(DisableTrunkProvidersRequest response) {
            super(response);
            this.providerName = response.providerName;
        } 

        /**
         * ProviderName.
         */
        public Builder providerName(java.util.List < String > providerName) {
            this.putQueryParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public DisableTrunkProvidersRequest build() {
            return new DisableTrunkProvidersRequest(this);
        } 

    } 

}
