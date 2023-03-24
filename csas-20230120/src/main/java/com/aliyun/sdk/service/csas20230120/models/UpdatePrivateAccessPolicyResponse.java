// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateAccessPolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdatePrivateAccessPolicyResponse</p>
 */
public class UpdatePrivateAccessPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePrivateAccessPolicyResponseBody body;

    private UpdatePrivateAccessPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePrivateAccessPolicyResponse create() {
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
    public UpdatePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePrivateAccessPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePrivateAccessPolicyResponseBody body);

        @Override
        UpdatePrivateAccessPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePrivateAccessPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePrivateAccessPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePrivateAccessPolicyResponse response) {
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
        public Builder body(UpdatePrivateAccessPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePrivateAccessPolicyResponse build() {
            return new UpdatePrivateAccessPolicyResponse(this);
        } 

    } 

}
