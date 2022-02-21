// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryQueriesResponse} extends {@link TeaModel}
 *
 * <p>ListSlowQueryQueriesResponse</p>
 */
public class ListSlowQueryQueriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSlowQueryQueriesResponseBody body;

    private ListSlowQueryQueriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSlowQueryQueriesResponse create() {
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
    public ListSlowQueryQueriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSlowQueryQueriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSlowQueryQueriesResponseBody body);

        @Override
        ListSlowQueryQueriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSlowQueryQueriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSlowQueryQueriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSlowQueryQueriesResponse response) {
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
        public Builder body(ListSlowQueryQueriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSlowQueryQueriesResponse build() {
            return new ListSlowQueryQueriesResponse(this);
        } 

    } 

}
