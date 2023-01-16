// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingFlightListResponse} extends {@link TeaModel}
 *
 * <p>TicketChangingFlightListResponse</p>
 */
public class TicketChangingFlightListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TicketChangingFlightListResponseBody body;

    private TicketChangingFlightListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TicketChangingFlightListResponse create() {
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
    public TicketChangingFlightListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TicketChangingFlightListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TicketChangingFlightListResponseBody body);

        @Override
        TicketChangingFlightListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TicketChangingFlightListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TicketChangingFlightListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TicketChangingFlightListResponse response) {
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
        public Builder body(TicketChangingFlightListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TicketChangingFlightListResponse build() {
            return new TicketChangingFlightListResponse(this);
        } 

    } 

}
