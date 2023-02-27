// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLegacyQueueEventLogsResponse} extends {@link TeaModel}
 *
 * <p>ListLegacyQueueEventLogsResponse</p>
 */
public class ListLegacyQueueEventLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLegacyQueueEventLogsResponseBody body;

    private ListLegacyQueueEventLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLegacyQueueEventLogsResponse create() {
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
    public ListLegacyQueueEventLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLegacyQueueEventLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLegacyQueueEventLogsResponseBody body);

        @Override
        ListLegacyQueueEventLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLegacyQueueEventLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLegacyQueueEventLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLegacyQueueEventLogsResponse response) {
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
        public Builder body(ListLegacyQueueEventLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLegacyQueueEventLogsResponse build() {
            return new ListLegacyQueueEventLogsResponse(this);
        } 

    } 

}
