// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartApmResponse} extends {@link TeaModel}
 *
 * <p>StartApmResponse</p>
 */
public class StartApmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartApmResponseBody body;

    private StartApmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartApmResponse create() {
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
    public StartApmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartApmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartApmResponseBody body);

        @Override
        StartApmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartApmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartApmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartApmResponse response) {
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
        public Builder body(StartApmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartApmResponse build() {
            return new StartApmResponse(this);
        } 

    } 

}
