// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartListenerResponse} extends {@link TeaModel}
 *
 * <p>StartListenerResponse</p>
 */
public class StartListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartListenerResponseBody body;

    private StartListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartListenerResponse create() {
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
    public StartListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartListenerResponseBody body);

        @Override
        StartListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartListenerResponse response) {
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
        public Builder body(StartListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartListenerResponse build() {
            return new StartListenerResponse(this);
        } 

    } 

}
