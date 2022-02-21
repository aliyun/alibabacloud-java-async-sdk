// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>DetachControlPolicyResponse</p>
 */
public class DetachControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachControlPolicyResponseBody body;

    private DetachControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachControlPolicyResponse create() {
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
    public DetachControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachControlPolicyResponseBody body);

        @Override
        DetachControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachControlPolicyResponse response) {
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
        public Builder body(DetachControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachControlPolicyResponse build() {
            return new DetachControlPolicyResponse(this);
        } 

    } 

}
