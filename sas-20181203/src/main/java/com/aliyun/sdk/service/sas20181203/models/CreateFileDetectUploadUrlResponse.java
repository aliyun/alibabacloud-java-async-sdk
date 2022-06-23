// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectUploadUrlResponse} extends {@link TeaModel}
 *
 * <p>CreateFileDetectUploadUrlResponse</p>
 */
public class CreateFileDetectUploadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFileDetectUploadUrlResponseBody body;

    private CreateFileDetectUploadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFileDetectUploadUrlResponse create() {
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
    public CreateFileDetectUploadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFileDetectUploadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFileDetectUploadUrlResponseBody body);

        @Override
        CreateFileDetectUploadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFileDetectUploadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFileDetectUploadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFileDetectUploadUrlResponse response) {
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
        public Builder body(CreateFileDetectUploadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFileDetectUploadUrlResponse build() {
            return new CreateFileDetectUploadUrlResponse(this);
        } 

    } 

}
