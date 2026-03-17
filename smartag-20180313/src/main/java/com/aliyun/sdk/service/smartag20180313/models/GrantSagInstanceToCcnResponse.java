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
 * {@link GrantSagInstanceToCcnResponse} extends {@link TeaModel}
 *
 * <p>GrantSagInstanceToCcnResponse</p>
 */
public class GrantSagInstanceToCcnResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GrantSagInstanceToCcnResponseBody body;

    private GrantSagInstanceToCcnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GrantSagInstanceToCcnResponse create() {
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
    public GrantSagInstanceToCcnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantSagInstanceToCcnResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GrantSagInstanceToCcnResponseBody body);

        @Override
        GrantSagInstanceToCcnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantSagInstanceToCcnResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GrantSagInstanceToCcnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantSagInstanceToCcnResponse response) {
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
        public Builder body(GrantSagInstanceToCcnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantSagInstanceToCcnResponse build() {
            return new GrantSagInstanceToCcnResponse(this);
        } 

    } 

}
