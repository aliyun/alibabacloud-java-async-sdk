// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesByAliasResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicesByAliasResponse</p>
 */
public class QueryDevicesByAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicesByAliasResponseBody body;

    private QueryDevicesByAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicesByAliasResponse create() {
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
    public QueryDevicesByAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicesByAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicesByAliasResponseBody body);

        @Override
        QueryDevicesByAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicesByAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicesByAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicesByAliasResponse response) {
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
        public Builder body(QueryDevicesByAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicesByAliasResponse build() {
            return new QueryDevicesByAliasResponse(this);
        } 

    } 

}
