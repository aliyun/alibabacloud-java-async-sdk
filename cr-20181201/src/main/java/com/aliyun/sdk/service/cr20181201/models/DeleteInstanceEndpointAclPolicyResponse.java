// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceEndpointAclPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceEndpointAclPolicyResponse</p>
 */
public class DeleteInstanceEndpointAclPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceEndpointAclPolicyResponseBody body;

    private DeleteInstanceEndpointAclPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstanceEndpointAclPolicyResponse create() {
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
    public DeleteInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstanceEndpointAclPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstanceEndpointAclPolicyResponseBody body);

        @Override
        DeleteInstanceEndpointAclPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstanceEndpointAclPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceEndpointAclPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstanceEndpointAclPolicyResponse response) {
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
        public Builder body(DeleteInstanceEndpointAclPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstanceEndpointAclPolicyResponse build() {
            return new DeleteInstanceEndpointAclPolicyResponse(this);
        } 

    } 

}
