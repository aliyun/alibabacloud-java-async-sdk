// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationResponse} extends {@link TeaModel}
 *
 * <p>DeployApplicationResponse</p>
 */
public class DeployApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployApplicationResponseBody body;

    private DeployApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployApplicationResponse create() {
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
    public DeployApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployApplicationResponseBody body);

        @Override
        DeployApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployApplicationResponse response) {
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
        public Builder body(DeployApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployApplicationResponse build() {
            return new DeployApplicationResponse(this);
        } 

    } 

}
