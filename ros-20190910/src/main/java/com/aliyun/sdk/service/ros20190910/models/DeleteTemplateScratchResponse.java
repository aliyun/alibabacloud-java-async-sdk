// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateScratchResponse} extends {@link TeaModel}
 *
 * <p>DeleteTemplateScratchResponse</p>
 */
public class DeleteTemplateScratchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTemplateScratchResponseBody body;

    private DeleteTemplateScratchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTemplateScratchResponse create() {
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
    public DeleteTemplateScratchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTemplateScratchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTemplateScratchResponseBody body);

        @Override
        DeleteTemplateScratchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTemplateScratchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTemplateScratchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTemplateScratchResponse response) {
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
        public Builder body(DeleteTemplateScratchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTemplateScratchResponse build() {
            return new DeleteTemplateScratchResponse(this);
        } 

    } 

}
