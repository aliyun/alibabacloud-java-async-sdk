// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSilencePolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSilencePolicyResponse</p>
 */
public class CreateOrUpdateSilencePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateSilencePolicyResponseBody body;

    private CreateOrUpdateSilencePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrUpdateSilencePolicyResponse create() {
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
    public CreateOrUpdateSilencePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateSilencePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrUpdateSilencePolicyResponseBody body);

        @Override
        CreateOrUpdateSilencePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateSilencePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateSilencePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateSilencePolicyResponse response) {
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
        public Builder body(CreateOrUpdateSilencePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateSilencePolicyResponse build() {
            return new CreateOrUpdateSilencePolicyResponse(this);
        } 

    } 

}
