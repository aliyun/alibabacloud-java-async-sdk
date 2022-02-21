// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLocalFileUploadJobResponse} extends {@link TeaModel}
 *
 * <p>CreateLocalFileUploadJobResponse</p>
 */
public class CreateLocalFileUploadJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLocalFileUploadJobResponseBody body;

    private CreateLocalFileUploadJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLocalFileUploadJobResponse create() {
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
    public CreateLocalFileUploadJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLocalFileUploadJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLocalFileUploadJobResponseBody body);

        @Override
        CreateLocalFileUploadJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLocalFileUploadJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLocalFileUploadJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLocalFileUploadJobResponse response) {
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
        public Builder body(CreateLocalFileUploadJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLocalFileUploadJobResponse build() {
            return new CreateLocalFileUploadJobResponse(this);
        } 

    } 

}
