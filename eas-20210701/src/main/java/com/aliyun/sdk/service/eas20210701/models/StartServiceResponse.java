// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartServiceResponse} extends {@link TeaModel}
 *
 * <p>StartServiceResponse</p>
 */
public class StartServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartServiceResponseBody body;

    private StartServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartServiceResponse create() {
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
    public StartServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartServiceResponseBody body);

        @Override
        StartServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartServiceResponse response) {
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
        public Builder body(StartServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartServiceResponse build() {
            return new StartServiceResponse(this);
        } 

    } 

}
