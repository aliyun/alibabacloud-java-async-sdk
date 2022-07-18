// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartStressResponse} extends {@link TeaModel}
 *
 * <p>StartStressResponse</p>
 */
public class StartStressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartStressResponseBody body;

    private StartStressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartStressResponse create() {
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
    public StartStressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartStressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartStressResponseBody body);

        @Override
        StartStressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartStressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartStressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartStressResponse response) {
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
        public Builder body(StartStressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartStressResponse build() {
            return new StartStressResponse(this);
        } 

    } 

}
