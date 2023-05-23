// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAuthPolicyResponse} extends {@link TeaModel}
 *
 * <p>AddAuthPolicyResponse</p>
 */
public class AddAuthPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAuthPolicyResponseBody body;

    private AddAuthPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAuthPolicyResponse create() {
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
    public AddAuthPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAuthPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAuthPolicyResponseBody body);

        @Override
        AddAuthPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAuthPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAuthPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAuthPolicyResponse response) {
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
        public Builder body(AddAuthPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAuthPolicyResponse build() {
            return new AddAuthPolicyResponse(this);
        } 

    } 

}
