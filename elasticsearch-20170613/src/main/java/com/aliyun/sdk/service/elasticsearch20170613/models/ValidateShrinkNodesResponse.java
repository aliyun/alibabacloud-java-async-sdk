// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateShrinkNodesResponse} extends {@link TeaModel}
 *
 * <p>ValidateShrinkNodesResponse</p>
 */
public class ValidateShrinkNodesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ValidateShrinkNodesResponseBody body;

    private ValidateShrinkNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ValidateShrinkNodesResponse create() {
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
    public ValidateShrinkNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateShrinkNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ValidateShrinkNodesResponseBody body);

        @Override
        ValidateShrinkNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateShrinkNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ValidateShrinkNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateShrinkNodesResponse response) {
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
        public Builder body(ValidateShrinkNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateShrinkNodesResponse build() {
            return new ValidateShrinkNodesResponse(this);
        } 

    } 

}
