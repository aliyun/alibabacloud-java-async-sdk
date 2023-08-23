// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRolePolicyResponse} extends {@link TeaModel}
 *
 * <p>GetRolePolicyResponse</p>
 */
public class GetRolePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRolePolicyResponseBody body;

    private GetRolePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRolePolicyResponse create() {
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
    public GetRolePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRolePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRolePolicyResponseBody body);

        @Override
        GetRolePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRolePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRolePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRolePolicyResponse response) {
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
        public Builder body(GetRolePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRolePolicyResponse build() {
            return new GetRolePolicyResponse(this);
        } 

    } 

}
