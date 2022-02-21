// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFileResponse} extends {@link TeaModel}
 *
 * <p>UploadFileResponse</p>
 */
public class UploadFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadFileResponseBody body;

    private UploadFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadFileResponse create() {
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
    public UploadFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadFileResponseBody body);

        @Override
        UploadFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadFileResponse response) {
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
        public Builder body(UploadFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadFileResponse build() {
            return new UploadFileResponse(this);
        } 

    } 

}
