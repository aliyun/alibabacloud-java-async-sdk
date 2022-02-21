// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopListenerResponse} extends {@link TeaModel}
 *
 * <p>StopListenerResponse</p>
 */
public class StopListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopListenerResponseBody body;

    private StopListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopListenerResponse create() {
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
    public StopListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopListenerResponseBody body);

        @Override
        StopListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopListenerResponse response) {
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
        public Builder body(StopListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopListenerResponse build() {
            return new StopListenerResponse(this);
        } 

    } 

}
