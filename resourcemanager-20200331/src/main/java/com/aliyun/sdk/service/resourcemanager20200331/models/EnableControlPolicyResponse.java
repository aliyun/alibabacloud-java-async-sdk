// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>EnableControlPolicyResponse</p>
 */
public class EnableControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableControlPolicyResponseBody body;

    private EnableControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableControlPolicyResponse create() {
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
    public EnableControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableControlPolicyResponseBody body);

        @Override
        EnableControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableControlPolicyResponse response) {
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
        public Builder body(EnableControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableControlPolicyResponse build() {
            return new EnableControlPolicyResponse(this);
        } 

    } 

}
