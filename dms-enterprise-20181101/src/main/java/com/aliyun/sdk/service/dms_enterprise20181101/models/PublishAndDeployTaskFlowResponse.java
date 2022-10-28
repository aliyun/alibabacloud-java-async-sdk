// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAndDeployTaskFlowResponse} extends {@link TeaModel}
 *
 * <p>PublishAndDeployTaskFlowResponse</p>
 */
public class PublishAndDeployTaskFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishAndDeployTaskFlowResponseBody body;

    private PublishAndDeployTaskFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishAndDeployTaskFlowResponse create() {
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
    public PublishAndDeployTaskFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishAndDeployTaskFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishAndDeployTaskFlowResponseBody body);

        @Override
        PublishAndDeployTaskFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishAndDeployTaskFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishAndDeployTaskFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishAndDeployTaskFlowResponse response) {
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
        public Builder body(PublishAndDeployTaskFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishAndDeployTaskFlowResponse build() {
            return new PublishAndDeployTaskFlowResponse(this);
        } 

    } 

}
