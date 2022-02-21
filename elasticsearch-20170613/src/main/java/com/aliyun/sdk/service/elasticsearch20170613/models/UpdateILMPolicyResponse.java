// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateILMPolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdateILMPolicyResponse</p>
 */
public class UpdateILMPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateILMPolicyResponseBody body;

    private UpdateILMPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateILMPolicyResponse create() {
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
    public UpdateILMPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateILMPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateILMPolicyResponseBody body);

        @Override
        UpdateILMPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateILMPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateILMPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateILMPolicyResponse response) {
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
        public Builder body(UpdateILMPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateILMPolicyResponse build() {
            return new UpdateILMPolicyResponse(this);
        } 

    } 

}
