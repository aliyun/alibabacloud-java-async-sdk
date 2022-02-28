// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetStackPolicyResponse</p>
 */
public class GetStackPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStackPolicyResponseBody body;

    private GetStackPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStackPolicyResponse create() {
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
    public GetStackPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStackPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStackPolicyResponseBody body);

        @Override
        GetStackPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStackPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStackPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStackPolicyResponse response) {
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
        public Builder body(GetStackPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStackPolicyResponse build() {
            return new GetStackPolicyResponse(this);
        } 

    } 

}
