// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateUploadPolicyResponse</p>
 */
public class CreateUploadPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUploadPolicyResponseBody body;

    private CreateUploadPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUploadPolicyResponse create() {
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
    public CreateUploadPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUploadPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUploadPolicyResponseBody body);

        @Override
        CreateUploadPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUploadPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUploadPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUploadPolicyResponse response) {
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
        public Builder body(CreateUploadPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUploadPolicyResponse build() {
            return new CreateUploadPolicyResponse(this);
        } 

    } 

}
