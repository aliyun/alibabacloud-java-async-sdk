// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InflightTaskTimeoutResponse} extends {@link TeaModel}
 *
 * <p>InflightTaskTimeoutResponse</p>
 */
public class InflightTaskTimeoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InflightTaskTimeoutResponseBody body;

    private InflightTaskTimeoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InflightTaskTimeoutResponse create() {
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
    public InflightTaskTimeoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InflightTaskTimeoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InflightTaskTimeoutResponseBody body);

        @Override
        InflightTaskTimeoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InflightTaskTimeoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InflightTaskTimeoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InflightTaskTimeoutResponse response) {
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
        public Builder body(InflightTaskTimeoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InflightTaskTimeoutResponse build() {
            return new InflightTaskTimeoutResponse(this);
        } 

    } 

}
