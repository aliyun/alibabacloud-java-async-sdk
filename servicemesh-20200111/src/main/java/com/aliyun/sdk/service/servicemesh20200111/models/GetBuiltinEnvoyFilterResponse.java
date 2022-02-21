// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBuiltinEnvoyFilterResponse} extends {@link TeaModel}
 *
 * <p>GetBuiltinEnvoyFilterResponse</p>
 */
public class GetBuiltinEnvoyFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBuiltinEnvoyFilterResponseBody body;

    private GetBuiltinEnvoyFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBuiltinEnvoyFilterResponse create() {
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
    public GetBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBuiltinEnvoyFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBuiltinEnvoyFilterResponseBody body);

        @Override
        GetBuiltinEnvoyFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBuiltinEnvoyFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBuiltinEnvoyFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBuiltinEnvoyFilterResponse response) {
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
        public Builder body(GetBuiltinEnvoyFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBuiltinEnvoyFilterResponse build() {
            return new GetBuiltinEnvoyFilterResponse(this);
        } 

    } 

}
