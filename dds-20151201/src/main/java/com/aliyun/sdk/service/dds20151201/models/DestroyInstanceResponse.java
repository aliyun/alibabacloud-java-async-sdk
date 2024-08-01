// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestroyInstanceResponse} extends {@link TeaModel}
 *
 * <p>DestroyInstanceResponse</p>
 */
public class DestroyInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DestroyInstanceResponseBody body;

    private DestroyInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DestroyInstanceResponse create() {
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
    public DestroyInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DestroyInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DestroyInstanceResponseBody body);

        @Override
        DestroyInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DestroyInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DestroyInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DestroyInstanceResponse response) {
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
        public Builder body(DestroyInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DestroyInstanceResponse build() {
            return new DestroyInstanceResponse(this);
        } 

    } 

}
