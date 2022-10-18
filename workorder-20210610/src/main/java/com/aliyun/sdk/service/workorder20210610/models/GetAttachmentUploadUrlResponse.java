// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttachmentUploadUrlResponse} extends {@link TeaModel}
 *
 * <p>GetAttachmentUploadUrlResponse</p>
 */
public class GetAttachmentUploadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAttachmentUploadUrlResponseBody body;

    private GetAttachmentUploadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAttachmentUploadUrlResponse create() {
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
    public GetAttachmentUploadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAttachmentUploadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAttachmentUploadUrlResponseBody body);

        @Override
        GetAttachmentUploadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAttachmentUploadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAttachmentUploadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAttachmentUploadUrlResponse response) {
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
        public Builder body(GetAttachmentUploadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAttachmentUploadUrlResponse build() {
            return new GetAttachmentUploadUrlResponse(this);
        } 

    } 

}
