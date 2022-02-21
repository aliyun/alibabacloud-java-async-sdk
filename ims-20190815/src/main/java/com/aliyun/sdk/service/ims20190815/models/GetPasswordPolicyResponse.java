// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetPasswordPolicyResponse</p>
 */
public class GetPasswordPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPasswordPolicyResponseBody body;

    private GetPasswordPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPasswordPolicyResponse create() {
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
    public GetPasswordPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPasswordPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPasswordPolicyResponseBody body);

        @Override
        GetPasswordPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPasswordPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPasswordPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPasswordPolicyResponse response) {
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
        public Builder body(GetPasswordPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPasswordPolicyResponse build() {
            return new GetPasswordPolicyResponse(this);
        } 

    } 

}
