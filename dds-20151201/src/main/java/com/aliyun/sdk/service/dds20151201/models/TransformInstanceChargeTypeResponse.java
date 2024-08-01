// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformInstanceChargeTypeResponse} extends {@link TeaModel}
 *
 * <p>TransformInstanceChargeTypeResponse</p>
 */
public class TransformInstanceChargeTypeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TransformInstanceChargeTypeResponseBody body;

    private TransformInstanceChargeTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TransformInstanceChargeTypeResponse create() {
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
    public TransformInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransformInstanceChargeTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TransformInstanceChargeTypeResponseBody body);

        @Override
        TransformInstanceChargeTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransformInstanceChargeTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TransformInstanceChargeTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransformInstanceChargeTypeResponse response) {
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
        public Builder body(TransformInstanceChargeTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransformInstanceChargeTypeResponse build() {
            return new TransformInstanceChargeTypeResponse(this);
        } 

    } 

}
