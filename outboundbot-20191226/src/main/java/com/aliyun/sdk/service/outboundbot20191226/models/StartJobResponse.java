// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartJobResponse} extends {@link TeaModel}
 *
 * <p>StartJobResponse</p>
 */
public class StartJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartJobResponseBody body;

    private StartJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartJobResponse create() {
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
    public StartJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartJobResponseBody body);

        @Override
        StartJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartJobResponse response) {
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
        public Builder body(StartJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartJobResponse build() {
            return new StartJobResponse(this);
        } 

    } 

}
