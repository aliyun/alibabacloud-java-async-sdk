// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketNotesResponse} extends {@link TeaModel}
 *
 * <p>ListTicketNotesResponse</p>
 */
public class ListTicketNotesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTicketNotesResponseBody body;

    private ListTicketNotesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTicketNotesResponse create() {
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
    public ListTicketNotesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTicketNotesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTicketNotesResponseBody body);

        @Override
        ListTicketNotesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTicketNotesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTicketNotesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTicketNotesResponse response) {
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
        public Builder body(ListTicketNotesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTicketNotesResponse build() {
            return new ListTicketNotesResponse(this);
        } 

    } 

}
