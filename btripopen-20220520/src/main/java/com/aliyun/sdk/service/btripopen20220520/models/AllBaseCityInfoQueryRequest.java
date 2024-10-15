// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllBaseCityInfoQueryRequest} extends {@link RequestModel}
 *
 * <p>AllBaseCityInfoQueryRequest</p>
 */
public class AllBaseCityInfoQueryRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-access-token")
    private String xAcsBtripAccessToken;

    private AllBaseCityInfoQueryRequest(Builder builder) {
        super(builder);
        this.xAcsBtripAccessToken = builder.xAcsBtripAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllBaseCityInfoQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xAcsBtripAccessToken
     */
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

    public static final class Builder extends Request.Builder<AllBaseCityInfoQueryRequest, Builder> {
        private String xAcsBtripAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(AllBaseCityInfoQueryRequest request) {
            super(request);
            this.xAcsBtripAccessToken = request.xAcsBtripAccessToken;
        } 

        /**
         * x-acs-btrip-access-token.
         */
        public Builder xAcsBtripAccessToken(String xAcsBtripAccessToken) {
            this.putHeaderParameter("x-acs-btrip-access-token", xAcsBtripAccessToken);
            this.xAcsBtripAccessToken = xAcsBtripAccessToken;
            return this;
        }

        @Override
        public AllBaseCityInfoQueryRequest build() {
            return new AllBaseCityInfoQueryRequest(this);
        } 

    } 

}
