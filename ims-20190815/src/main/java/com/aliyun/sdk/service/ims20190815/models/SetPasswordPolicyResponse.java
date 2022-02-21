// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordPolicyResponse} extends {@link TeaModel}
 *
 * <p>SetPasswordPolicyResponse</p>
 */
public class SetPasswordPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPasswordPolicyResponseBody body;

    private SetPasswordPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPasswordPolicyResponse create() {
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
    public SetPasswordPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPasswordPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPasswordPolicyResponseBody body);

        @Override
        SetPasswordPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPasswordPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPasswordPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPasswordPolicyResponse response) {
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
        public Builder body(SetPasswordPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPasswordPolicyResponse build() {
            return new SetPasswordPolicyResponse(this);
        } 

    } 

}
