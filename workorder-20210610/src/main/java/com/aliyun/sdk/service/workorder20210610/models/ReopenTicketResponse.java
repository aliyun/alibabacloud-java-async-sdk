// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReopenTicketResponse} extends {@link TeaModel}
 *
 * <p>ReopenTicketResponse</p>
 */
public class ReopenTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReopenTicketResponseBody body;

    private ReopenTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReopenTicketResponse create() {
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
    public ReopenTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReopenTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReopenTicketResponseBody body);

        @Override
        ReopenTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReopenTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReopenTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReopenTicketResponse response) {
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
        public Builder body(ReopenTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReopenTicketResponse build() {
            return new ReopenTicketResponse(this);
        } 

    } 

}
