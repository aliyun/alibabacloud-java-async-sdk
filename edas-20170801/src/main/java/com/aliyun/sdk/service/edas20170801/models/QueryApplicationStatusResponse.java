// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryApplicationStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryApplicationStatusResponse</p>
 */
public class QueryApplicationStatusResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryApplicationStatusResponseBody body;

    private QueryApplicationStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryApplicationStatusResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public QueryApplicationStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryApplicationStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryApplicationStatusResponseBody body);

        @Override
        QueryApplicationStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryApplicationStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryApplicationStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryApplicationStatusResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryApplicationStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryApplicationStatusResponse build() {
            return new QueryApplicationStatusResponse(this);
        } 

    } 

}
