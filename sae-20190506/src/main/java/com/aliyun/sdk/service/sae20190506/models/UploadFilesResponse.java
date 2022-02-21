// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFilesResponse} extends {@link TeaModel}
 *
 * <p>UploadFilesResponse</p>
 */
public class UploadFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadFilesResponseBody body;

    private UploadFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadFilesResponse create() {
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
    public UploadFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadFilesResponseBody body);

        @Override
        UploadFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadFilesResponse response) {
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
        public Builder body(UploadFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadFilesResponse build() {
            return new UploadFilesResponse(this);
        } 

    } 

}
