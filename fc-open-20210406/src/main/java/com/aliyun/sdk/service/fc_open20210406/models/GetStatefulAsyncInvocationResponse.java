// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStatefulAsyncInvocationResponse} extends {@link TeaModel}
 *
 * <p>GetStatefulAsyncInvocationResponse</p>
 */
public class GetStatefulAsyncInvocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StatefulAsyncInvocation body;

    private GetStatefulAsyncInvocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStatefulAsyncInvocationResponse create() {
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
    public StatefulAsyncInvocation getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStatefulAsyncInvocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StatefulAsyncInvocation body);

        @Override
        GetStatefulAsyncInvocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStatefulAsyncInvocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StatefulAsyncInvocation body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStatefulAsyncInvocationResponse response) {
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
        public Builder body(StatefulAsyncInvocation body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStatefulAsyncInvocationResponse build() {
            return new GetStatefulAsyncInvocationResponse(this);
        } 

    } 

}
