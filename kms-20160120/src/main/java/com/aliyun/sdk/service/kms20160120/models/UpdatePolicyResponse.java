// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdatePolicyResponse</p>
 */
public class UpdatePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePolicyResponseBody body;

    private UpdatePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePolicyResponse create() {
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
    public UpdatePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePolicyResponseBody body);

        @Override
        UpdatePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePolicyResponse response) {
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
        public Builder body(UpdatePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePolicyResponse build() {
            return new UpdatePolicyResponse(this);
        } 

    } 

}
