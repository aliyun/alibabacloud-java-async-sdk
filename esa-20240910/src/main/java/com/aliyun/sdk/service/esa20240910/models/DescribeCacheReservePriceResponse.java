// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCacheReservePriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeCacheReservePriceResponse</p>
 */
public class DescribeCacheReservePriceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCacheReservePriceResponseBody body;

    private DescribeCacheReservePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCacheReservePriceResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public DescribeCacheReservePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCacheReservePriceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCacheReservePriceResponseBody body);

        @Override
        DescribeCacheReservePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCacheReservePriceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeCacheReservePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCacheReservePriceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(DescribeCacheReservePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCacheReservePriceResponse build() {
            return new DescribeCacheReservePriceResponse(this);
        } 

    } 

}
