// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBuiltinEnvoyFilterResponse} extends {@link TeaModel}
 *
 * <p>AddBuiltinEnvoyFilterResponse</p>
 */
public class AddBuiltinEnvoyFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBuiltinEnvoyFilterResponseBody body;

    private AddBuiltinEnvoyFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBuiltinEnvoyFilterResponse create() {
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
    public AddBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBuiltinEnvoyFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBuiltinEnvoyFilterResponseBody body);

        @Override
        AddBuiltinEnvoyFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBuiltinEnvoyFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBuiltinEnvoyFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBuiltinEnvoyFilterResponse response) {
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
        public Builder body(AddBuiltinEnvoyFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBuiltinEnvoyFilterResponse build() {
            return new AddBuiltinEnvoyFilterResponse(this);
        } 

    } 

}
