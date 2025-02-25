// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableCheckProductResponse} extends {@link TeaModel}
 *
 * <p>EnableCheckProductResponse</p>
 */
public class EnableCheckProductResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnableCheckProductResponseBody body;

    private EnableCheckProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableCheckProductResponse create() {
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
    public EnableCheckProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableCheckProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableCheckProductResponseBody body);

        @Override
        EnableCheckProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableCheckProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EnableCheckProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableCheckProductResponse response) {
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
        public Builder body(EnableCheckProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableCheckProductResponse build() {
            return new EnableCheckProductResponse(this);
        } 

    } 

}
