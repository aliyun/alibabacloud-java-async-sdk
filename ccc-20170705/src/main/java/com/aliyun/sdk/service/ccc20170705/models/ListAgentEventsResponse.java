// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentEventsResponse} extends {@link TeaModel}
 *
 * <p>ListAgentEventsResponse</p>
 */
public class ListAgentEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentEventsResponseBody body;

    private ListAgentEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentEventsResponse create() {
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
    public ListAgentEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentEventsResponseBody body);

        @Override
        ListAgentEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentEventsResponse response) {
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
        public Builder body(ListAgentEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentEventsResponse build() {
            return new ListAgentEventsResponse(this);
        } 

    } 

}
