// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImagesResponse} extends {@link TeaModel}
 *
 * <p>DeleteImagesResponse</p>
 */
public class DeleteImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteImagesResponseBody body;

    private DeleteImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteImagesResponse create() {
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
    public DeleteImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteImagesResponseBody body);

        @Override
        DeleteImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteImagesResponse response) {
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
        public Builder body(DeleteImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteImagesResponse build() {
            return new DeleteImagesResponse(this);
        } 

    } 

}
