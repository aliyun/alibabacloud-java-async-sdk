// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogsResponse} extends {@link TeaModel}
 *
 * <p>ListLogsResponse</p>
 */
public class ListLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogsResponseBody body;

    private ListLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogsResponse create() {
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
    public ListLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogsResponseBody body);

        @Override
        ListLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogsResponse response) {
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
        public Builder body(ListLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogsResponse build() {
            return new ListLogsResponse(this);
        } 

    } 

}
