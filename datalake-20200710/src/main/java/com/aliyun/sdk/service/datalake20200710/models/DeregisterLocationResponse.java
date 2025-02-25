// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterLocationResponse} extends {@link TeaModel}
 *
 * <p>DeregisterLocationResponse</p>
 */
public class DeregisterLocationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeregisterLocationResponseBody body;

    private DeregisterLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeregisterLocationResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public DeregisterLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeregisterLocationResponseBody body);

        @Override
        DeregisterLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeregisterLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterLocationResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(DeregisterLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterLocationResponse build() {
            return new DeregisterLocationResponse(this);
        } 

    } 

}
