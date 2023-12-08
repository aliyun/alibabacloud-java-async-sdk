// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePatchBaselineResponse} extends {@link TeaModel}
 *
 * <p>CreatePatchBaselineResponse</p>
 */
public class CreatePatchBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePatchBaselineResponseBody body;

    private CreatePatchBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePatchBaselineResponse create() {
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
    public CreatePatchBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePatchBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePatchBaselineResponseBody body);

        @Override
        CreatePatchBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePatchBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePatchBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePatchBaselineResponse response) {
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
        public Builder body(CreatePatchBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePatchBaselineResponse build() {
            return new CreatePatchBaselineResponse(this);
        } 

    } 

}
