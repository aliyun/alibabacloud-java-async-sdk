// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConvertPrepayInstancePriceResponse} extends {@link TeaModel}
 *
 * <p>QueryConvertPrepayInstancePriceResponse</p>
 */
public class QueryConvertPrepayInstancePriceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryConvertPrepayInstancePriceResponseBody body;

    private QueryConvertPrepayInstancePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryConvertPrepayInstancePriceResponse create() {
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
    public QueryConvertPrepayInstancePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConvertPrepayInstancePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryConvertPrepayInstancePriceResponseBody body);

        @Override
        QueryConvertPrepayInstancePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConvertPrepayInstancePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryConvertPrepayInstancePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConvertPrepayInstancePriceResponse response) {
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
        public Builder body(QueryConvertPrepayInstancePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConvertPrepayInstancePriceResponse build() {
            return new QueryConvertPrepayInstancePriceResponse(this);
        } 

    } 

}
