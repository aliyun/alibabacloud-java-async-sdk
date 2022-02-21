// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectLogsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectLogsResponse</p>
 */
public class ListConnectLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectLogsResponseBody body;

    private ListConnectLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectLogsResponse create() {
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
    public ListConnectLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectLogsResponseBody body);

        @Override
        ListConnectLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectLogsResponse response) {
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
        public Builder body(ListConnectLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectLogsResponse build() {
            return new ListConnectLogsResponse(this);
        } 

    } 

}
