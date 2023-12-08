// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEffectivePolicyResponse} extends {@link TeaModel}
 *
 * <p>GetEffectivePolicyResponse</p>
 */
public class GetEffectivePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEffectivePolicyResponseBody body;

    private GetEffectivePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEffectivePolicyResponse create() {
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
    public GetEffectivePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEffectivePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEffectivePolicyResponseBody body);

        @Override
        GetEffectivePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEffectivePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEffectivePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEffectivePolicyResponse response) {
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
        public Builder body(GetEffectivePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEffectivePolicyResponse build() {
            return new GetEffectivePolicyResponse(this);
        } 

    } 

}
