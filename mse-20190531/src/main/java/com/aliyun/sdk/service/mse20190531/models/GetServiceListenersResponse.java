// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListenersResponse} extends {@link TeaModel}
 *
 * <p>GetServiceListenersResponse</p>
 */
public class GetServiceListenersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceListenersResponseBody body;

    private GetServiceListenersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceListenersResponse create() {
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
    public GetServiceListenersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceListenersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceListenersResponseBody body);

        @Override
        GetServiceListenersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceListenersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceListenersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceListenersResponse response) {
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
        public Builder body(GetServiceListenersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceListenersResponse build() {
            return new GetServiceListenersResponse(this);
        } 

    } 

}
