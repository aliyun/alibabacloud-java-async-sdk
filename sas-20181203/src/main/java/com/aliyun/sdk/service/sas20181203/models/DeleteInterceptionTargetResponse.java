// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInterceptionTargetResponse} extends {@link TeaModel}
 *
 * <p>DeleteInterceptionTargetResponse</p>
 */
public class DeleteInterceptionTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInterceptionTargetResponseBody body;

    private DeleteInterceptionTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInterceptionTargetResponse create() {
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
    public DeleteInterceptionTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInterceptionTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInterceptionTargetResponseBody body);

        @Override
        DeleteInterceptionTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInterceptionTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInterceptionTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInterceptionTargetResponse response) {
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
        public Builder body(DeleteInterceptionTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInterceptionTargetResponse build() {
            return new DeleteInterceptionTargetResponse(this);
        } 

    } 

}
