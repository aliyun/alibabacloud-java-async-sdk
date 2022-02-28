// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStackPolicyResponse} extends {@link TeaModel}
 *
 * <p>SetStackPolicyResponse</p>
 */
public class SetStackPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetStackPolicyResponseBody body;

    private SetStackPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetStackPolicyResponse create() {
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
    public SetStackPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetStackPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetStackPolicyResponseBody body);

        @Override
        SetStackPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetStackPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetStackPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetStackPolicyResponse response) {
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
        public Builder body(SetStackPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetStackPolicyResponse build() {
            return new SetStackPolicyResponse(this);
        } 

    } 

}
