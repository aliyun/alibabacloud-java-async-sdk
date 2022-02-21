// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewLogstashResponse} extends {@link TeaModel}
 *
 * <p>RenewLogstashResponse</p>
 */
public class RenewLogstashResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewLogstashResponseBody body;

    private RenewLogstashResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewLogstashResponse create() {
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
    public RenewLogstashResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewLogstashResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewLogstashResponseBody body);

        @Override
        RenewLogstashResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewLogstashResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewLogstashResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewLogstashResponse response) {
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
        public Builder body(RenewLogstashResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewLogstashResponse build() {
            return new RenewLogstashResponse(this);
        } 

    } 

}
