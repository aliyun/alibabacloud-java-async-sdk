// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetPolicyResponse</p>
 */
public class GetPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPolicyResponseBody body;

    private GetPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPolicyResponse create() {
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
    public GetPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPolicyResponseBody body);

        @Override
        GetPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPolicyResponse response) {
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
        public Builder body(GetPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPolicyResponse build() {
            return new GetPolicyResponse(this);
        } 

    } 

}
