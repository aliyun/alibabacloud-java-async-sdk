// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstancePolicyResponse} extends {@link TeaModel}
 *
 * <p>SetInstancePolicyResponse</p>
 */
public class SetInstancePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstancePolicyResponseBody body;

    private SetInstancePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstancePolicyResponse create() {
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
    public SetInstancePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstancePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstancePolicyResponseBody body);

        @Override
        SetInstancePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstancePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstancePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstancePolicyResponse response) {
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
        public Builder body(SetInstancePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstancePolicyResponse build() {
            return new SetInstancePolicyResponse(this);
        } 

    } 

}
