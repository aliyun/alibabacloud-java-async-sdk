// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link AddSupplierNewItemsResponse} extends {@link TeaModel}
 *
 * <p>AddSupplierNewItemsResponse</p>
 */
public class AddSupplierNewItemsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddSupplierNewItemsResponseBody body;

    private AddSupplierNewItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddSupplierNewItemsResponse create() {
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
    public AddSupplierNewItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSupplierNewItemsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddSupplierNewItemsResponseBody body);

        @Override
        AddSupplierNewItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSupplierNewItemsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AddSupplierNewItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSupplierNewItemsResponse response) {
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
        public Builder body(AddSupplierNewItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSupplierNewItemsResponse build() {
            return new AddSupplierNewItemsResponse(this);
        } 

    } 

}
