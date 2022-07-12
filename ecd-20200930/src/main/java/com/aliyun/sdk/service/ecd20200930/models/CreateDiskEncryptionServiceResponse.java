// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskEncryptionServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateDiskEncryptionServiceResponse</p>
 */
public class CreateDiskEncryptionServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiskEncryptionServiceResponseBody body;

    private CreateDiskEncryptionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiskEncryptionServiceResponse create() {
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
    public CreateDiskEncryptionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiskEncryptionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiskEncryptionServiceResponseBody body);

        @Override
        CreateDiskEncryptionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiskEncryptionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiskEncryptionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiskEncryptionServiceResponse response) {
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
        public Builder body(CreateDiskEncryptionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiskEncryptionServiceResponse build() {
            return new CreateDiskEncryptionServiceResponse(this);
        } 

    } 

}
