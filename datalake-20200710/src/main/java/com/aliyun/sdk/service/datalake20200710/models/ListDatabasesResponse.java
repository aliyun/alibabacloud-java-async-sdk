// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabasesResponse} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponse</p>
 */
public class ListDatabasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDatabasesResponseBody body;

    private ListDatabasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDatabasesResponse create() {
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
    public ListDatabasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDatabasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDatabasesResponseBody body);

        @Override
        ListDatabasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDatabasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDatabasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDatabasesResponse response) {
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
        public Builder body(ListDatabasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDatabasesResponse build() {
            return new ListDatabasesResponse(this);
        } 

    } 

}
