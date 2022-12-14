// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadResponse} extends {@link TeaModel}
 *
 * <p>CreateDownloadResponse</p>
 */
public class CreateDownloadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDownloadResponseBody body;

    private CreateDownloadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDownloadResponse create() {
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
    public CreateDownloadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDownloadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDownloadResponseBody body);

        @Override
        CreateDownloadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDownloadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDownloadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDownloadResponse response) {
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
        public Builder body(CreateDownloadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDownloadResponse build() {
            return new CreateDownloadResponse(this);
        } 

    } 

}
