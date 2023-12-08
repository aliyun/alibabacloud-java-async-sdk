// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDefaultPatchBaselineResponse} extends {@link TeaModel}
 *
 * <p>RegisterDefaultPatchBaselineResponse</p>
 */
public class RegisterDefaultPatchBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterDefaultPatchBaselineResponseBody body;

    private RegisterDefaultPatchBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterDefaultPatchBaselineResponse create() {
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
    public RegisterDefaultPatchBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterDefaultPatchBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterDefaultPatchBaselineResponseBody body);

        @Override
        RegisterDefaultPatchBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterDefaultPatchBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterDefaultPatchBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterDefaultPatchBaselineResponse response) {
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
        public Builder body(RegisterDefaultPatchBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterDefaultPatchBaselineResponse build() {
            return new RegisterDefaultPatchBaselineResponse(this);
        } 

    } 

}
