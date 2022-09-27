// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryEventsResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryEventsResponse</p>
 */
public class ListInstanceHistoryEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceHistoryEventsResponseBody body;

    private ListInstanceHistoryEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceHistoryEventsResponse create() {
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
    public ListInstanceHistoryEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceHistoryEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceHistoryEventsResponseBody body);

        @Override
        ListInstanceHistoryEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceHistoryEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceHistoryEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceHistoryEventsResponse response) {
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
        public Builder body(ListInstanceHistoryEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceHistoryEventsResponse build() {
            return new ListInstanceHistoryEventsResponse(this);
        } 

    } 

}
