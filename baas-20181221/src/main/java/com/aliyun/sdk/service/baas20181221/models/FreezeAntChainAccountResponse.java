// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FreezeAntChainAccountResponse} extends {@link TeaModel}
 *
 * <p>FreezeAntChainAccountResponse</p>
 */
public class FreezeAntChainAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FreezeAntChainAccountResponseBody body;

    private FreezeAntChainAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FreezeAntChainAccountResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public FreezeAntChainAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FreezeAntChainAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FreezeAntChainAccountResponseBody body);

        @Override
        FreezeAntChainAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FreezeAntChainAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FreezeAntChainAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FreezeAntChainAccountResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(FreezeAntChainAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FreezeAntChainAccountResponse build() {
            return new FreezeAntChainAccountResponse(this);
        } 

    } 

}
