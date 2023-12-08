// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationGroupResponse} extends {@link TeaModel}
 *
 * <p>DeployApplicationGroupResponse</p>
 */
public class DeployApplicationGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployApplicationGroupResponseBody body;

    private DeployApplicationGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployApplicationGroupResponse create() {
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
    public DeployApplicationGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployApplicationGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployApplicationGroupResponseBody body);

        @Override
        DeployApplicationGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployApplicationGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployApplicationGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployApplicationGroupResponse response) {
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
        public Builder body(DeployApplicationGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployApplicationGroupResponse build() {
            return new DeployApplicationGroupResponse(this);
        } 

    } 

}
