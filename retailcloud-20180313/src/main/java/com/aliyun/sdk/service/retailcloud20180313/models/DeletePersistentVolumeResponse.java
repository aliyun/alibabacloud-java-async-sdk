// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePersistentVolumeResponse} extends {@link TeaModel}
 *
 * <p>DeletePersistentVolumeResponse</p>
 */
public class DeletePersistentVolumeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePersistentVolumeResponseBody body;

    private DeletePersistentVolumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePersistentVolumeResponse create() {
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
    public DeletePersistentVolumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePersistentVolumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePersistentVolumeResponseBody body);

        @Override
        DeletePersistentVolumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePersistentVolumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePersistentVolumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePersistentVolumeResponse response) {
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
        public Builder body(DeletePersistentVolumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePersistentVolumeResponse build() {
            return new DeletePersistentVolumeResponse(this);
        } 

    } 

}
