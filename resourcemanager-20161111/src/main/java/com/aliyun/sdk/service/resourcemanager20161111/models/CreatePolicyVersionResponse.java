// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyVersionResponse} extends {@link TeaModel}
 *
 * <p>CreatePolicyVersionResponse</p>
 */
public class CreatePolicyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePolicyVersionResponseBody body;

    private CreatePolicyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePolicyVersionResponse create() {
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
    public CreatePolicyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePolicyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePolicyVersionResponseBody body);

        @Override
        CreatePolicyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePolicyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePolicyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePolicyVersionResponse response) {
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
        public Builder body(CreatePolicyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePolicyVersionResponse build() {
            return new CreatePolicyVersionResponse(this);
        } 

    } 

}
