// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelayTicketExpireTimeResponse} extends {@link TeaModel}
 *
 * <p>DelayTicketExpireTimeResponse</p>
 */
public class DelayTicketExpireTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelayTicketExpireTimeResponseBody body;

    private DelayTicketExpireTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelayTicketExpireTimeResponse create() {
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
    public DelayTicketExpireTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelayTicketExpireTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelayTicketExpireTimeResponseBody body);

        @Override
        DelayTicketExpireTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelayTicketExpireTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelayTicketExpireTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelayTicketExpireTimeResponse response) {
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
        public Builder body(DelayTicketExpireTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelayTicketExpireTimeResponse build() {
            return new DelayTicketExpireTimeResponse(this);
        } 

    } 

}
