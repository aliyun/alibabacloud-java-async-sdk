// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

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
 * {@link ListDataCacheServicesResponse} extends {@link TeaModel}
 *
 * <p>ListDataCacheServicesResponse</p>
 */
public class ListDataCacheServicesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDataCacheServicesResponseBody body;

    private ListDataCacheServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDataCacheServicesResponse create() {
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
    public ListDataCacheServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataCacheServicesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDataCacheServicesResponseBody body);

        @Override
        ListDataCacheServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataCacheServicesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDataCacheServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataCacheServicesResponse response) {
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
        public Builder body(ListDataCacheServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataCacheServicesResponse build() {
            return new ListDataCacheServicesResponse(this);
        } 

    } 

}
