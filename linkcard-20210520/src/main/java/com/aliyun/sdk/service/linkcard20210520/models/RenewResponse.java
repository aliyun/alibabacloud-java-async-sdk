// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewResponse} extends {@link TeaModel}
 *
 * <p>RenewResponse</p>
 */
public class RenewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewResponseBody body;

    private RenewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewResponse create() {
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
    public RenewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewResponseBody body);

        @Override
        RenewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewResponse response) {
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
        public Builder body(RenewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewResponse build() {
            return new RenewResponse(this);
        } 

    } 

}
