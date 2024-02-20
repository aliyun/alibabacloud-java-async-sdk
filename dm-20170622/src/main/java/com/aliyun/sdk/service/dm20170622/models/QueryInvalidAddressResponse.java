// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvalidAddressResponse} extends {@link TeaModel}
 *
 * <p>QueryInvalidAddressResponse</p>
 */
public class QueryInvalidAddressResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryInvalidAddressResponseBody body;

    private QueryInvalidAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryInvalidAddressResponse create() {
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
    public QueryInvalidAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInvalidAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryInvalidAddressResponseBody body);

        @Override
        QueryInvalidAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInvalidAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryInvalidAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInvalidAddressResponse response) {
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
        public Builder body(QueryInvalidAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInvalidAddressResponse build() {
            return new QueryInvalidAddressResponse(this);
        } 

    } 

}
