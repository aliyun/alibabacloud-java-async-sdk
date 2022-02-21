// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRawDataResponse} extends {@link TeaModel}
 *
 * <p>QueryRawDataResponse</p>
 */
public class QueryRawDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRawDataResponseBody body;

    private QueryRawDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRawDataResponse create() {
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
    public QueryRawDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRawDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRawDataResponseBody body);

        @Override
        QueryRawDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRawDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRawDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRawDataResponse response) {
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
        public Builder body(QueryRawDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRawDataResponse build() {
            return new QueryRawDataResponse(this);
        } 

    } 

}
