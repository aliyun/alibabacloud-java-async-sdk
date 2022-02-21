// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadImageResponse} extends {@link TeaModel}
 *
 * <p>CreateUploadImageResponse</p>
 */
public class CreateUploadImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUploadImageResponseBody body;

    private CreateUploadImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUploadImageResponse create() {
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
    public CreateUploadImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUploadImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUploadImageResponseBody body);

        @Override
        CreateUploadImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUploadImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUploadImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUploadImageResponse response) {
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
        public Builder body(CreateUploadImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUploadImageResponse build() {
            return new CreateUploadImageResponse(this);
        } 

    } 

}
