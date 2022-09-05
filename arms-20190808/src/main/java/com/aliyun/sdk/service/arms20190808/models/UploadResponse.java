// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadResponse} extends {@link TeaModel}
 *
 * <p>UploadResponse</p>
 */
public class UploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadResponseBody body;

    private UploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadResponse create() {
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
    public UploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadResponseBody body);

        @Override
        UploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadResponse response) {
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
        public Builder body(UploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadResponse build() {
            return new UploadResponse(this);
        } 

    } 

}
