// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentStateLogsResponse} extends {@link TeaModel}
 *
 * <p>ListAgentStateLogsResponse</p>
 */
public class ListAgentStateLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentStateLogsResponseBody body;

    private ListAgentStateLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentStateLogsResponse create() {
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
    public ListAgentStateLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentStateLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentStateLogsResponseBody body);

        @Override
        ListAgentStateLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentStateLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentStateLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentStateLogsResponse response) {
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
        public Builder body(ListAgentStateLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentStateLogsResponse build() {
            return new ListAgentStateLogsResponse(this);
        } 

    } 

}
