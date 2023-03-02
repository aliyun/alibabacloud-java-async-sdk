// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableNumbersResponse} extends {@link TeaModel}
 *
 * <p>QueryAvailableNumbersResponse</p>
 */
public class QueryAvailableNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAvailableNumbersResponseBody body;

    private QueryAvailableNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAvailableNumbersResponse create() {
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
    public QueryAvailableNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAvailableNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAvailableNumbersResponseBody body);

        @Override
        QueryAvailableNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAvailableNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAvailableNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAvailableNumbersResponse response) {
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
        public Builder body(QueryAvailableNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAvailableNumbersResponse build() {
            return new QueryAvailableNumbersResponse(this);
        } 

    } 

}
