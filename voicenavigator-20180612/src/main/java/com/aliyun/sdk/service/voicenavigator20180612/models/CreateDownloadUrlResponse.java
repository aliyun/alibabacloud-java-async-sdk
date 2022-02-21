// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>CreateDownloadUrlResponse</p>
 */
public class CreateDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDownloadUrlResponseBody body;

    private CreateDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDownloadUrlResponse create() {
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
    public CreateDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDownloadUrlResponseBody body);

        @Override
        CreateDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDownloadUrlResponse response) {
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
        public Builder body(CreateDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDownloadUrlResponse build() {
            return new CreateDownloadUrlResponse(this);
        } 

    } 

}
