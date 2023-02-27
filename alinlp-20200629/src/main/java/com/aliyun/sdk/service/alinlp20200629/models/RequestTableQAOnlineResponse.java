// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestTableQAOnlineResponse} extends {@link TeaModel}
 *
 * <p>RequestTableQAOnlineResponse</p>
 */
public class RequestTableQAOnlineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RequestTableQAOnlineResponseBody body;

    private RequestTableQAOnlineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RequestTableQAOnlineResponse create() {
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
    public RequestTableQAOnlineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestTableQAOnlineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RequestTableQAOnlineResponseBody body);

        @Override
        RequestTableQAOnlineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestTableQAOnlineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RequestTableQAOnlineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestTableQAOnlineResponse response) {
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
        public Builder body(RequestTableQAOnlineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestTableQAOnlineResponse build() {
            return new RequestTableQAOnlineResponse(this);
        } 

    } 

}
