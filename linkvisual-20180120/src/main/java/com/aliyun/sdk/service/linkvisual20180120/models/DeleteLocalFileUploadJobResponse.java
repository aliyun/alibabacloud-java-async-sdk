// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLocalFileUploadJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteLocalFileUploadJobResponse</p>
 */
public class DeleteLocalFileUploadJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLocalFileUploadJobResponseBody body;

    private DeleteLocalFileUploadJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLocalFileUploadJobResponse create() {
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
    public DeleteLocalFileUploadJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLocalFileUploadJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLocalFileUploadJobResponseBody body);

        @Override
        DeleteLocalFileUploadJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLocalFileUploadJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLocalFileUploadJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLocalFileUploadJobResponse response) {
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
        public Builder body(DeleteLocalFileUploadJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLocalFileUploadJobResponse build() {
            return new DeleteLocalFileUploadJobResponse(this);
        } 

    } 

}
