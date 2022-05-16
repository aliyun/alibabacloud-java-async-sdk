// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUploadUrlResponse} extends {@link TeaModel}
 *
 * <p>UpdateUploadUrlResponse</p>
 */
public class UpdateUploadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUploadUrlResponseBody body;

    private UpdateUploadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUploadUrlResponse create() {
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
    public UpdateUploadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUploadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUploadUrlResponseBody body);

        @Override
        UpdateUploadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUploadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUploadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUploadUrlResponse response) {
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
        public Builder body(UpdateUploadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUploadUrlResponse build() {
            return new UpdateUploadUrlResponse(this);
        } 

    } 

}
