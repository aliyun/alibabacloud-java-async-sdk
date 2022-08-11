// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFileDeploymentResponse} extends {@link TeaModel}
 *
 * <p>CheckFileDeploymentResponse</p>
 */
public class CheckFileDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckFileDeploymentResponseBody body;

    private CheckFileDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckFileDeploymentResponse create() {
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
     * @return body
     */
    public CheckFileDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckFileDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckFileDeploymentResponseBody body);

        @Override
        CheckFileDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckFileDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckFileDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckFileDeploymentResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(CheckFileDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckFileDeploymentResponse build() {
            return new CheckFileDeploymentResponse(this);
        } 

    } 

}
