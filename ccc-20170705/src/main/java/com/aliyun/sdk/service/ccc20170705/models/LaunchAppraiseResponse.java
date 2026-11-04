// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link LaunchAppraiseResponse} extends {@link TeaModel}
 *
 * <p>LaunchAppraiseResponse</p>
 */
public class LaunchAppraiseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private LaunchAppraiseResponseBody body;

    private LaunchAppraiseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LaunchAppraiseResponse create() {
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
    public LaunchAppraiseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LaunchAppraiseResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(LaunchAppraiseResponseBody body);

        @Override
        LaunchAppraiseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LaunchAppraiseResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private LaunchAppraiseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LaunchAppraiseResponse response) {
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
        public Builder body(LaunchAppraiseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LaunchAppraiseResponse build() {
            return new LaunchAppraiseResponse(this);
        } 

    } 

}
