// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppEventsResponse} extends {@link TeaModel}
 *
 * <p>ListAppEventsResponse</p>
 */
public class ListAppEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppEventsResponseBody body;

    private ListAppEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppEventsResponse create() {
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
    public ListAppEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppEventsResponseBody body);

        @Override
        ListAppEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppEventsResponse response) {
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
        public Builder body(ListAppEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppEventsResponse build() {
            return new ListAppEventsResponse(this);
        } 

    } 

}
