// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBuiltinEnvoyFilterResponse} extends {@link TeaModel}
 *
 * <p>ListBuiltinEnvoyFilterResponse</p>
 */
public class ListBuiltinEnvoyFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBuiltinEnvoyFilterResponseBody body;

    private ListBuiltinEnvoyFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBuiltinEnvoyFilterResponse create() {
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
    public ListBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBuiltinEnvoyFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBuiltinEnvoyFilterResponseBody body);

        @Override
        ListBuiltinEnvoyFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBuiltinEnvoyFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBuiltinEnvoyFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBuiltinEnvoyFilterResponse response) {
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
        public Builder body(ListBuiltinEnvoyFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBuiltinEnvoyFilterResponse build() {
            return new ListBuiltinEnvoyFilterResponse(this);
        } 

    } 

}
