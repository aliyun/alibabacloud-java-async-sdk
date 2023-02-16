// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateControlPolicyResponse</p>
 */
public class CreateControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateControlPolicyResponseBody body;

    private CreateControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateControlPolicyResponse create() {
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
    public CreateControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateControlPolicyResponseBody body);

        @Override
        CreateControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateControlPolicyResponse response) {
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
        public Builder body(CreateControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateControlPolicyResponse build() {
            return new CreateControlPolicyResponse(this);
        } 

    } 

}
