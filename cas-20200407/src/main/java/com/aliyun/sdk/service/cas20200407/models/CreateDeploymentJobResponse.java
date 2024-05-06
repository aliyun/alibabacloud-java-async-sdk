// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentJobResponse} extends {@link TeaModel}
 *
 * <p>CreateDeploymentJobResponse</p>
 */
public class CreateDeploymentJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateDeploymentJobResponseBody body;

    private CreateDeploymentJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDeploymentJobResponse create() {
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
    public CreateDeploymentJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeploymentJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDeploymentJobResponseBody body);

        @Override
        CreateDeploymentJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeploymentJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateDeploymentJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeploymentJobResponse response) {
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
        public Builder body(CreateDeploymentJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeploymentJobResponse build() {
            return new CreateDeploymentJobResponse(this);
        } 

    } 

}
