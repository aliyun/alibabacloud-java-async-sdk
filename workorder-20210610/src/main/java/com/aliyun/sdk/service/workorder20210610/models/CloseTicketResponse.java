// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseTicketResponse} extends {@link TeaModel}
 *
 * <p>CloseTicketResponse</p>
 */
public class CloseTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseTicketResponseBody body;

    private CloseTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseTicketResponse create() {
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
    public CloseTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseTicketResponseBody body);

        @Override
        CloseTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseTicketResponse response) {
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
        public Builder body(CloseTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseTicketResponse build() {
            return new CloseTicketResponse(this);
        } 

    } 

}
