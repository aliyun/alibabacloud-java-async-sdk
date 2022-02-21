// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageSetResponse} extends {@link TeaModel}
 *
 * <p>CreateStorageSetResponse</p>
 */
public class CreateStorageSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStorageSetResponseBody body;

    private CreateStorageSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStorageSetResponse create() {
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
    public CreateStorageSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStorageSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStorageSetResponseBody body);

        @Override
        CreateStorageSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStorageSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStorageSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStorageSetResponse response) {
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
        public Builder body(CreateStorageSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStorageSetResponse build() {
            return new CreateStorageSetResponse(this);
        } 

    } 

}
