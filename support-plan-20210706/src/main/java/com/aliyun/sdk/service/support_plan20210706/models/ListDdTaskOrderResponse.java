// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link ListDdTaskOrderResponse} extends {@link TeaModel}
 *
 * <p>ListDdTaskOrderResponse</p>
 */
public class ListDdTaskOrderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDdTaskOrderResponseBody body;

    private ListDdTaskOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDdTaskOrderResponse create() {
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
    public ListDdTaskOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDdTaskOrderResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDdTaskOrderResponseBody body);

        @Override
        ListDdTaskOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDdTaskOrderResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDdTaskOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDdTaskOrderResponse response) {
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
        public Builder body(ListDdTaskOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDdTaskOrderResponse build() {
            return new ListDdTaskOrderResponse(this);
        } 

    } 

}
