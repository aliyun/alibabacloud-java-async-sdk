// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeClouderaDataPlatformRequest} extends {@link RequestModel}
 *
 * <p>InitializeClouderaDataPlatformRequest</p>
 */
public class InitializeClouderaDataPlatformRequest extends Request {
    @Path
    @NameInMap("ClientToken")
    private String clientToken;

    private InitializeClouderaDataPlatformRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeClouderaDataPlatformRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<InitializeClouderaDataPlatformRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(InitializeClouderaDataPlatformRequest request) {
            super(request);
            this.clientToken = request.clientToken;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putPathParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public InitializeClouderaDataPlatformRequest build() {
            return new InitializeClouderaDataPlatformRequest(this);
        } 

    } 

}
