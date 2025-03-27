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
 * {@link ListNetworkOptimizationsResponse} extends {@link TeaModel}
 *
 * <p>ListNetworkOptimizationsResponse</p>
 */
public class ListNetworkOptimizationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListNetworkOptimizationsResponseBody body;

    private ListNetworkOptimizationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListNetworkOptimizationsResponse create() {
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
    public ListNetworkOptimizationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNetworkOptimizationsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListNetworkOptimizationsResponseBody body);

        @Override
        ListNetworkOptimizationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNetworkOptimizationsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListNetworkOptimizationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNetworkOptimizationsResponse response) {
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
        public Builder body(ListNetworkOptimizationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNetworkOptimizationsResponse build() {
            return new ListNetworkOptimizationsResponse(this);
        } 

    } 

}
