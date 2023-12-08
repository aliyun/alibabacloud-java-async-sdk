// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePatchBaselineResponse} extends {@link TeaModel}
 *
 * <p>DeletePatchBaselineResponse</p>
 */
public class DeletePatchBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePatchBaselineResponseBody body;

    private DeletePatchBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePatchBaselineResponse create() {
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
    public DeletePatchBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePatchBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePatchBaselineResponseBody body);

        @Override
        DeletePatchBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePatchBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePatchBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePatchBaselineResponse response) {
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
        public Builder body(DeletePatchBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePatchBaselineResponse build() {
            return new DeletePatchBaselineResponse(this);
        } 

    } 

}
