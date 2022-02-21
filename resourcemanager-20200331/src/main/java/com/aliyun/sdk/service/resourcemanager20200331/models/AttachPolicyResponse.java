// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPolicyResponse} extends {@link TeaModel}
 *
 * <p>AttachPolicyResponse</p>
 */
public class AttachPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachPolicyResponseBody body;

    private AttachPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachPolicyResponse create() {
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
    public AttachPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachPolicyResponseBody body);

        @Override
        AttachPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachPolicyResponse response) {
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
        public Builder body(AttachPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachPolicyResponse build() {
            return new AttachPolicyResponse(this);
        } 

    } 

}
