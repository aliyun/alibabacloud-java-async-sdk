// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatefulAsyncInvocationFunctionsResponse} extends {@link TeaModel}
 *
 * <p>ListStatefulAsyncInvocationFunctionsResponse</p>
 */
public class ListStatefulAsyncInvocationFunctionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStatefulAsyncInvocationFunctionsResponseBody body;

    private ListStatefulAsyncInvocationFunctionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStatefulAsyncInvocationFunctionsResponse create() {
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
    public ListStatefulAsyncInvocationFunctionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStatefulAsyncInvocationFunctionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStatefulAsyncInvocationFunctionsResponseBody body);

        @Override
        ListStatefulAsyncInvocationFunctionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStatefulAsyncInvocationFunctionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStatefulAsyncInvocationFunctionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStatefulAsyncInvocationFunctionsResponse response) {
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
        public Builder body(ListStatefulAsyncInvocationFunctionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStatefulAsyncInvocationFunctionsResponse build() {
            return new ListStatefulAsyncInvocationFunctionsResponse(this);
        } 

    } 

}
