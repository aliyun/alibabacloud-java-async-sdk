// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>RestartOutboundTaskResponse</p>
 */
public class RestartOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartOutboundTaskResponseBody body;

    private RestartOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartOutboundTaskResponse create() {
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
    public RestartOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartOutboundTaskResponseBody body);

        @Override
        RestartOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartOutboundTaskResponse response) {
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
        public Builder body(RestartOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartOutboundTaskResponse build() {
            return new RestartOutboundTaskResponse(this);
        } 

    } 

}
