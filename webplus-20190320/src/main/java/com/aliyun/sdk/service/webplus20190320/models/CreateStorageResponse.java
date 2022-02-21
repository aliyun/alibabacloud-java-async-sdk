// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageResponse} extends {@link TeaModel}
 *
 * <p>CreateStorageResponse</p>
 */
public class CreateStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStorageResponseBody body;

    private CreateStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStorageResponse create() {
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
    public CreateStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStorageResponseBody body);

        @Override
        CreateStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStorageResponse response) {
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
        public Builder body(CreateStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStorageResponse build() {
            return new CreateStorageResponse(this);
        } 

    } 

}
