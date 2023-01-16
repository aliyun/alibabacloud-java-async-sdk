// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingPayResponse} extends {@link TeaModel}
 *
 * <p>TicketChangingPayResponse</p>
 */
public class TicketChangingPayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TicketChangingPayResponseBody body;

    private TicketChangingPayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TicketChangingPayResponse create() {
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
    public TicketChangingPayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TicketChangingPayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TicketChangingPayResponseBody body);

        @Override
        TicketChangingPayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TicketChangingPayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TicketChangingPayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TicketChangingPayResponse response) {
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
        public Builder body(TicketChangingPayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TicketChangingPayResponse build() {
            return new TicketChangingPayResponse(this);
        } 

    } 

}
