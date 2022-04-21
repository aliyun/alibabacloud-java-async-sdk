// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebHostingFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebHostingFileResponse</p>
 */
public class DeleteWebHostingFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebHostingFileResponseBody body;

    private DeleteWebHostingFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebHostingFileResponse create() {
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
    public DeleteWebHostingFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebHostingFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebHostingFileResponseBody body);

        @Override
        DeleteWebHostingFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebHostingFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebHostingFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebHostingFileResponse response) {
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
        public Builder body(DeleteWebHostingFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebHostingFileResponse build() {
            return new DeleteWebHostingFileResponse(this);
        } 

    } 

}
