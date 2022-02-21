// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCollectorResponse} extends {@link TeaModel}
 *
 * <p>StartCollectorResponse</p>
 */
public class StartCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCollectorResponseBody body;

    private StartCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCollectorResponse create() {
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
    public StartCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCollectorResponseBody body);

        @Override
        StartCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCollectorResponse response) {
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
        public Builder body(StartCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCollectorResponse build() {
            return new StartCollectorResponse(this);
        } 

    } 

}
