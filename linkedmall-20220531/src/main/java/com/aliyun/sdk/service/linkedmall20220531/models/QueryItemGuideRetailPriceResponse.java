// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemGuideRetailPriceResponse} extends {@link TeaModel}
 *
 * <p>QueryItemGuideRetailPriceResponse</p>
 */
public class QueryItemGuideRetailPriceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryItemGuideRetailPriceResponseBody body;

    private QueryItemGuideRetailPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryItemGuideRetailPriceResponse create() {
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
    public QueryItemGuideRetailPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryItemGuideRetailPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryItemGuideRetailPriceResponseBody body);

        @Override
        QueryItemGuideRetailPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryItemGuideRetailPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryItemGuideRetailPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryItemGuideRetailPriceResponse response) {
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
        public Builder body(QueryItemGuideRetailPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryItemGuideRetailPriceResponse build() {
            return new QueryItemGuideRetailPriceResponse(this);
        } 

    } 

}
