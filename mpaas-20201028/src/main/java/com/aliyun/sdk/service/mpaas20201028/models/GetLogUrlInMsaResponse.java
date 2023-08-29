// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogUrlInMsaResponse} extends {@link TeaModel}
 *
 * <p>GetLogUrlInMsaResponse</p>
 */
public class GetLogUrlInMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLogUrlInMsaResponseBody body;

    private GetLogUrlInMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogUrlInMsaResponse create() {
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
    public GetLogUrlInMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogUrlInMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLogUrlInMsaResponseBody body);

        @Override
        GetLogUrlInMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogUrlInMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLogUrlInMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogUrlInMsaResponse response) {
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
        public Builder body(GetLogUrlInMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogUrlInMsaResponse build() {
            return new GetLogUrlInMsaResponse(this);
        } 

    } 

}
