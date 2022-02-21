// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceEndpointAclPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceEndpointAclPolicyResponse</p>
 */
public class CreateInstanceEndpointAclPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceEndpointAclPolicyResponseBody body;

    private CreateInstanceEndpointAclPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceEndpointAclPolicyResponse create() {
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
    public CreateInstanceEndpointAclPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceEndpointAclPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceEndpointAclPolicyResponseBody body);

        @Override
        CreateInstanceEndpointAclPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceEndpointAclPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceEndpointAclPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceEndpointAclPolicyResponse response) {
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
        public Builder body(CreateInstanceEndpointAclPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceEndpointAclPolicyResponse build() {
            return new CreateInstanceEndpointAclPolicyResponse(this);
        } 

    } 

}
