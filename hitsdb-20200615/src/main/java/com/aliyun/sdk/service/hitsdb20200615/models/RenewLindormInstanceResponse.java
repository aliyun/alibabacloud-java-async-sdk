// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewLindormInstanceResponse} extends {@link TeaModel}
 *
 * <p>RenewLindormInstanceResponse</p>
 */
public class RenewLindormInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewLindormInstanceResponseBody body;

    private RenewLindormInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewLindormInstanceResponse create() {
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
    public RenewLindormInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewLindormInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewLindormInstanceResponseBody body);

        @Override
        RenewLindormInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewLindormInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewLindormInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewLindormInstanceResponse response) {
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
        public Builder body(RenewLindormInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewLindormInstanceResponse build() {
            return new RenewLindormInstanceResponse(this);
        } 

    } 

}
