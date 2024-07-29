// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PassReleaseStagePipelineValidateResponse} extends {@link TeaModel}
 *
 * <p>PassReleaseStagePipelineValidateResponse</p>
 */
public class PassReleaseStagePipelineValidateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PassReleaseStagePipelineValidateResponseBody body;

    private PassReleaseStagePipelineValidateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PassReleaseStagePipelineValidateResponse create() {
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
    public PassReleaseStagePipelineValidateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PassReleaseStagePipelineValidateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PassReleaseStagePipelineValidateResponseBody body);

        @Override
        PassReleaseStagePipelineValidateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PassReleaseStagePipelineValidateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PassReleaseStagePipelineValidateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PassReleaseStagePipelineValidateResponse response) {
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
        public Builder body(PassReleaseStagePipelineValidateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PassReleaseStagePipelineValidateResponse build() {
            return new PassReleaseStagePipelineValidateResponse(this);
        } 

    } 

}
