// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightReShopDetailResponse} extends {@link TeaModel}
 *
 * <p>IntlFlightReShopDetailResponse</p>
 */
public class IntlFlightReShopDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private IntlFlightReShopDetailResponseBody body;

    private IntlFlightReShopDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static IntlFlightReShopDetailResponse create() {
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
    public IntlFlightReShopDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IntlFlightReShopDetailResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(IntlFlightReShopDetailResponseBody body);

        @Override
        IntlFlightReShopDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IntlFlightReShopDetailResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private IntlFlightReShopDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IntlFlightReShopDetailResponse response) {
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
        public Builder body(IntlFlightReShopDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IntlFlightReShopDetailResponse build() {
            return new IntlFlightReShopDetailResponse(this);
        } 

    } 

}
