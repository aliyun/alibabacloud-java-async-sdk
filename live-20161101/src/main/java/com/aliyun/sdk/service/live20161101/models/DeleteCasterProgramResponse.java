// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterProgramResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterProgramResponse</p>
 */
public class DeleteCasterProgramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterProgramResponseBody body;

    private DeleteCasterProgramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterProgramResponse create() {
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
    public DeleteCasterProgramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterProgramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterProgramResponseBody body);

        @Override
        DeleteCasterProgramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterProgramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterProgramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterProgramResponse response) {
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
        public Builder body(DeleteCasterProgramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterProgramResponse build() {
            return new DeleteCasterProgramResponse(this);
        } 

    } 

}
