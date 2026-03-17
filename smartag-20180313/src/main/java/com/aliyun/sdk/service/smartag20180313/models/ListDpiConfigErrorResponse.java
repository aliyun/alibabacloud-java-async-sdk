// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListDpiConfigErrorResponse} extends {@link TeaModel}
 *
 * <p>ListDpiConfigErrorResponse</p>
 */
public class ListDpiConfigErrorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDpiConfigErrorResponseBody body;

    private ListDpiConfigErrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDpiConfigErrorResponse create() {
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
    public ListDpiConfigErrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDpiConfigErrorResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDpiConfigErrorResponseBody body);

        @Override
        ListDpiConfigErrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDpiConfigErrorResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDpiConfigErrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDpiConfigErrorResponse response) {
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
        public Builder body(ListDpiConfigErrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDpiConfigErrorResponse build() {
            return new ListDpiConfigErrorResponse(this);
        } 

    } 

}
