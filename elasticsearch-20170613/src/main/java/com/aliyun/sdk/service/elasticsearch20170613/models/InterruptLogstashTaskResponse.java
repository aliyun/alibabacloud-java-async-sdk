// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InterruptLogstashTaskResponse} extends {@link TeaModel}
 *
 * <p>InterruptLogstashTaskResponse</p>
 */
public class InterruptLogstashTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InterruptLogstashTaskResponseBody body;

    private InterruptLogstashTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InterruptLogstashTaskResponse create() {
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
    public InterruptLogstashTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InterruptLogstashTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InterruptLogstashTaskResponseBody body);

        @Override
        InterruptLogstashTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InterruptLogstashTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InterruptLogstashTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InterruptLogstashTaskResponse response) {
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
        public Builder body(InterruptLogstashTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InterruptLogstashTaskResponse build() {
            return new InterruptLogstashTaskResponse(this);
        } 

    } 

}
