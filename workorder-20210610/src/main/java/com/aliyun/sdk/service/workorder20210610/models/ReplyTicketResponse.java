// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplyTicketResponse} extends {@link TeaModel}
 *
 * <p>ReplyTicketResponse</p>
 */
public class ReplyTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplyTicketResponseBody body;

    private ReplyTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplyTicketResponse create() {
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
    public ReplyTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplyTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplyTicketResponseBody body);

        @Override
        ReplyTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplyTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplyTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplyTicketResponse response) {
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
        public Builder body(ReplyTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplyTicketResponse build() {
            return new ReplyTicketResponse(this);
        } 

    } 

}
