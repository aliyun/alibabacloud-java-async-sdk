// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApiResponse} extends {@link TeaModel}
 *
 * <p>DeployApiResponse</p>
 */
public class DeployApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployApiResponseBody body;

    private DeployApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployApiResponse create() {
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
    public DeployApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployApiResponseBody body);

        @Override
        DeployApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployApiResponse response) {
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
        public Builder body(DeployApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployApiResponse build() {
            return new DeployApiResponse(this);
        } 

    } 

}
