// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLegacyAgentEventLogsResponse} extends {@link TeaModel}
 *
 * <p>ListLegacyAgentEventLogsResponse</p>
 */
public class ListLegacyAgentEventLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLegacyAgentEventLogsResponseBody body;

    private ListLegacyAgentEventLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLegacyAgentEventLogsResponse create() {
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
    public ListLegacyAgentEventLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLegacyAgentEventLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLegacyAgentEventLogsResponseBody body);

        @Override
        ListLegacyAgentEventLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLegacyAgentEventLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLegacyAgentEventLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLegacyAgentEventLogsResponse response) {
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
        public Builder body(ListLegacyAgentEventLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLegacyAgentEventLogsResponse build() {
            return new ListLegacyAgentEventLogsResponse(this);
        } 

    } 

}
