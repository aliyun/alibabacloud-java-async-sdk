// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadNumGroupTotalResponse} extends {@link TeaModel}
 *
 * <p>ReadNumGroupTotalResponse</p>
 */
public class ReadNumGroupTotalResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReadNumGroupTotalResponseBody body;

    private ReadNumGroupTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReadNumGroupTotalResponse create() {
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
    public ReadNumGroupTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReadNumGroupTotalResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReadNumGroupTotalResponseBody body);

        @Override
        ReadNumGroupTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReadNumGroupTotalResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ReadNumGroupTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReadNumGroupTotalResponse response) {
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
        public Builder body(ReadNumGroupTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReadNumGroupTotalResponse build() {
            return new ReadNumGroupTotalResponse(this);
        } 

    } 

}
