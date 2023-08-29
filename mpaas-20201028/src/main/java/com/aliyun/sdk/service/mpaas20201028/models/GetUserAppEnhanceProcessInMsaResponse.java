// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserAppEnhanceProcessInMsaResponse} extends {@link TeaModel}
 *
 * <p>GetUserAppEnhanceProcessInMsaResponse</p>
 */
public class GetUserAppEnhanceProcessInMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserAppEnhanceProcessInMsaResponseBody body;

    private GetUserAppEnhanceProcessInMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserAppEnhanceProcessInMsaResponse create() {
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
    public GetUserAppEnhanceProcessInMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserAppEnhanceProcessInMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserAppEnhanceProcessInMsaResponseBody body);

        @Override
        GetUserAppEnhanceProcessInMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserAppEnhanceProcessInMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserAppEnhanceProcessInMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserAppEnhanceProcessInMsaResponse response) {
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
        public Builder body(GetUserAppEnhanceProcessInMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserAppEnhanceProcessInMsaResponse build() {
            return new GetUserAppEnhanceProcessInMsaResponse(this);
        } 

    } 

}
