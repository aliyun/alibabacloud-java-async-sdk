// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>AddControlPolicyResponse</p>
 */
public class AddControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddControlPolicyResponseBody body;

    private AddControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddControlPolicyResponse create() {
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
    public AddControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddControlPolicyResponseBody body);

        @Override
        AddControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddControlPolicyResponse response) {
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
        public Builder body(AddControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddControlPolicyResponse build() {
            return new AddControlPolicyResponse(this);
        } 

    } 

}
