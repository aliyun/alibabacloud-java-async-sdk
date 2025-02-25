// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricVerifyResponse} extends {@link TeaModel}
 *
 * <p>AsymmetricVerifyResponse</p>
 */
public class AsymmetricVerifyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AsymmetricVerifyResponseBody body;

    private AsymmetricVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AsymmetricVerifyResponse create() {
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
    public AsymmetricVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AsymmetricVerifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AsymmetricVerifyResponseBody body);

        @Override
        AsymmetricVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AsymmetricVerifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AsymmetricVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AsymmetricVerifyResponse response) {
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
        public Builder body(AsymmetricVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AsymmetricVerifyResponse build() {
            return new AsymmetricVerifyResponse(this);
        } 

    } 

}
