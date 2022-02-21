// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketsResponse} extends {@link TeaModel}
 *
 * <p>ListTicketsResponse</p>
 */
public class ListTicketsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTicketsResponseBody body;

    private ListTicketsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTicketsResponse create() {
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
    public ListTicketsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTicketsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTicketsResponseBody body);

        @Override
        ListTicketsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTicketsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTicketsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTicketsResponse response) {
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
        public Builder body(ListTicketsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTicketsResponse build() {
            return new ListTicketsResponse(this);
        } 

    } 

}
