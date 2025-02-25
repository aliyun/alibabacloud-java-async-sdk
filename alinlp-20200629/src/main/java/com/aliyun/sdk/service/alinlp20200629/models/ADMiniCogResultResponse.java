// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ADMiniCogResultResponse} extends {@link TeaModel}
 *
 * <p>ADMiniCogResultResponse</p>
 */
public class ADMiniCogResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ADMiniCogResultResponseBody body;

    private ADMiniCogResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ADMiniCogResultResponse create() {
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
    public ADMiniCogResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ADMiniCogResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ADMiniCogResultResponseBody body);

        @Override
        ADMiniCogResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ADMiniCogResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ADMiniCogResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ADMiniCogResultResponse response) {
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
        public Builder body(ADMiniCogResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ADMiniCogResultResponse build() {
            return new ADMiniCogResultResponse(this);
        } 

    } 

}
