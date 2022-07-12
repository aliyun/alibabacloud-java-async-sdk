// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadImageResponse} extends {@link TeaModel}
 *
 * <p>UploadImageResponse</p>
 */
public class UploadImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadImageResponseBody body;

    private UploadImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadImageResponse create() {
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
    public UploadImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadImageResponseBody body);

        @Override
        UploadImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadImageResponse response) {
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
        public Builder body(UploadImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadImageResponse build() {
            return new UploadImageResponse(this);
        } 

    } 

}
