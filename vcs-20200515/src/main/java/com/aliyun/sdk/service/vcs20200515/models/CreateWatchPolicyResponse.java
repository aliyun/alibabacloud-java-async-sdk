// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWatchPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateWatchPolicyResponse</p>
 */
public class CreateWatchPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWatchPolicyResponseBody body;

    private CreateWatchPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWatchPolicyResponse create() {
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
    public CreateWatchPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWatchPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWatchPolicyResponseBody body);

        @Override
        CreateWatchPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWatchPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWatchPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWatchPolicyResponse response) {
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
        public Builder body(CreateWatchPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWatchPolicyResponse build() {
            return new CreateWatchPolicyResponse(this);
        } 

    } 

}
