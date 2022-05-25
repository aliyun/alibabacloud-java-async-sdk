// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserPasswordPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetUserPasswordPolicyResponse</p>
 */
public class GetUserPasswordPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserPasswordPolicyResponseBody body;

    private GetUserPasswordPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserPasswordPolicyResponse create() {
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
    public GetUserPasswordPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserPasswordPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserPasswordPolicyResponseBody body);

        @Override
        GetUserPasswordPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserPasswordPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserPasswordPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserPasswordPolicyResponse response) {
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
        public Builder body(GetUserPasswordPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserPasswordPolicyResponse build() {
            return new GetUserPasswordPolicyResponse(this);
        } 

    } 

}
