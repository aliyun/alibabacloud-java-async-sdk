// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartUserAppAsyncEnhanceInMsaResponse} extends {@link TeaModel}
 *
 * <p>StartUserAppAsyncEnhanceInMsaResponse</p>
 */
public class StartUserAppAsyncEnhanceInMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartUserAppAsyncEnhanceInMsaResponseBody body;

    private StartUserAppAsyncEnhanceInMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartUserAppAsyncEnhanceInMsaResponse create() {
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
    public StartUserAppAsyncEnhanceInMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartUserAppAsyncEnhanceInMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartUserAppAsyncEnhanceInMsaResponseBody body);

        @Override
        StartUserAppAsyncEnhanceInMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartUserAppAsyncEnhanceInMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartUserAppAsyncEnhanceInMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartUserAppAsyncEnhanceInMsaResponse response) {
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
        public Builder body(StartUserAppAsyncEnhanceInMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartUserAppAsyncEnhanceInMsaResponse build() {
            return new StartUserAppAsyncEnhanceInMsaResponse(this);
        } 

    } 

}
