// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrepareUploadResponse} extends {@link TeaModel}
 *
 * <p>PrepareUploadResponse</p>
 */
public class PrepareUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PrepareUploadResponseBody body;

    private PrepareUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PrepareUploadResponse create() {
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
    public PrepareUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PrepareUploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PrepareUploadResponseBody body);

        @Override
        PrepareUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PrepareUploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PrepareUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PrepareUploadResponse response) {
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
        public Builder body(PrepareUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PrepareUploadResponse build() {
            return new PrepareUploadResponse(this);
        } 

    } 

}
