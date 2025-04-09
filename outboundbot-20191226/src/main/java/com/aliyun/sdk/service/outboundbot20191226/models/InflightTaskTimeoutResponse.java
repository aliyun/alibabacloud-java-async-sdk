// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link InflightTaskTimeoutResponse} extends {@link TeaModel}
 *
 * <p>InflightTaskTimeoutResponse</p>
 */
public class InflightTaskTimeoutResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private InflightTaskTimeoutResponseBody body;

    private InflightTaskTimeoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static InflightTaskTimeoutResponse create() {
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
    public InflightTaskTimeoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InflightTaskTimeoutResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(InflightTaskTimeoutResponseBody body);

        @Override
        InflightTaskTimeoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InflightTaskTimeoutResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private InflightTaskTimeoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InflightTaskTimeoutResponse response) {
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
        public Builder body(InflightTaskTimeoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InflightTaskTimeoutResponse build() {
            return new InflightTaskTimeoutResponse(this);
        } 

    } 

}
