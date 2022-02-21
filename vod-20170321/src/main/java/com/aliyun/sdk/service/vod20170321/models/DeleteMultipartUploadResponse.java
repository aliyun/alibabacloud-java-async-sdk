// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultipartUploadResponse} extends {@link TeaModel}
 *
 * <p>DeleteMultipartUploadResponse</p>
 */
public class DeleteMultipartUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMultipartUploadResponseBody body;

    private DeleteMultipartUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMultipartUploadResponse create() {
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
    public DeleteMultipartUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMultipartUploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMultipartUploadResponseBody body);

        @Override
        DeleteMultipartUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMultipartUploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMultipartUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMultipartUploadResponse response) {
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
        public Builder body(DeleteMultipartUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMultipartUploadResponse build() {
            return new DeleteMultipartUploadResponse(this);
        } 

    } 

}
