// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckScaleOutBalancedResponse} extends {@link TeaModel}
 *
 * <p>CheckScaleOutBalancedResponse</p>
 */
public class CheckScaleOutBalancedResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CheckScaleOutBalancedResponseBody body;

    private CheckScaleOutBalancedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckScaleOutBalancedResponse create() {
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
    public CheckScaleOutBalancedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckScaleOutBalancedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckScaleOutBalancedResponseBody body);

        @Override
        CheckScaleOutBalancedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckScaleOutBalancedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CheckScaleOutBalancedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckScaleOutBalancedResponse response) {
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
        public Builder body(CheckScaleOutBalancedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckScaleOutBalancedResponse build() {
            return new CheckScaleOutBalancedResponse(this);
        } 

    } 

}
