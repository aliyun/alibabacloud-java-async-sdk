// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSignatureResponse} extends {@link TeaModel}
 *
 * <p>GetSignatureResponse</p>
 */
public class GetSignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSignatureResponseBody body;

    private GetSignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSignatureResponse create() {
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
    public GetSignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSignatureResponseBody body);

        @Override
        GetSignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSignatureResponse response) {
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
        public Builder body(GetSignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSignatureResponse build() {
            return new GetSignatureResponse(this);
        } 

    } 

}
