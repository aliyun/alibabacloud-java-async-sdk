// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDriveResponse} extends {@link TeaModel}
 *
 * <p>DeleteDriveResponse</p>
 */
public class DeleteDriveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDriveResponseBody body;

    private DeleteDriveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDriveResponse create() {
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
    public DeleteDriveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDriveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDriveResponseBody body);

        @Override
        DeleteDriveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDriveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDriveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDriveResponse response) {
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
        public Builder body(DeleteDriveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDriveResponse build() {
            return new DeleteDriveResponse(this);
        } 

    } 

}
