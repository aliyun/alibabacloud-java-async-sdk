// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachPolicyResponse} extends {@link TeaModel}
 *
 * <p>DetachPolicyResponse</p>
 */
public class DetachPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachPolicyResponseBody body;

    private DetachPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachPolicyResponse create() {
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
    public DetachPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachPolicyResponseBody body);

        @Override
        DetachPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachPolicyResponse response) {
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
        public Builder body(DetachPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachPolicyResponse build() {
            return new DetachPolicyResponse(this);
        } 

    } 

}
