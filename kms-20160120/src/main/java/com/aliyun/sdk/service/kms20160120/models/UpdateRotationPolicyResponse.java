// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRotationPolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdateRotationPolicyResponse</p>
 */
public class UpdateRotationPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRotationPolicyResponseBody body;

    private UpdateRotationPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRotationPolicyResponse create() {
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
    public UpdateRotationPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRotationPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRotationPolicyResponseBody body);

        @Override
        UpdateRotationPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRotationPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRotationPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRotationPolicyResponse response) {
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
        public Builder body(UpdateRotationPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRotationPolicyResponse build() {
            return new UpdateRotationPolicyResponse(this);
        } 

    } 

}
