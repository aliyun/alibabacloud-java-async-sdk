// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceTablesResponse} extends {@link TeaModel}
 *
 * <p>ListDataSourceTablesResponse</p>
 */
public class ListDataSourceTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataSourceTablesResponseBody body;

    private ListDataSourceTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataSourceTablesResponse create() {
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
    public ListDataSourceTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataSourceTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataSourceTablesResponseBody body);

        @Override
        ListDataSourceTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataSourceTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataSourceTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataSourceTablesResponse response) {
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
        public Builder body(ListDataSourceTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataSourceTablesResponse build() {
            return new ListDataSourceTablesResponse(this);
        } 

    } 

}
