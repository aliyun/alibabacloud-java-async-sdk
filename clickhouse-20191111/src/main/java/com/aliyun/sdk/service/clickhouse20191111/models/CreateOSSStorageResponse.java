// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOSSStorageResponse} extends {@link TeaModel}
 *
 * <p>CreateOSSStorageResponse</p>
 */
public class CreateOSSStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOSSStorageResponseBody body;

    private CreateOSSStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOSSStorageResponse create() {
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
    public CreateOSSStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOSSStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOSSStorageResponseBody body);

        @Override
        CreateOSSStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOSSStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOSSStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOSSStorageResponse response) {
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
        public Builder body(CreateOSSStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOSSStorageResponse build() {
            return new CreateOSSStorageResponse(this);
        } 

    } 

}
