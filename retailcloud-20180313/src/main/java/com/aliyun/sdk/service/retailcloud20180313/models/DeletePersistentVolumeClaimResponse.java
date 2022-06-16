// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePersistentVolumeClaimResponse} extends {@link TeaModel}
 *
 * <p>DeletePersistentVolumeClaimResponse</p>
 */
public class DeletePersistentVolumeClaimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePersistentVolumeClaimResponseBody body;

    private DeletePersistentVolumeClaimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePersistentVolumeClaimResponse create() {
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
    public DeletePersistentVolumeClaimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePersistentVolumeClaimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePersistentVolumeClaimResponseBody body);

        @Override
        DeletePersistentVolumeClaimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePersistentVolumeClaimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePersistentVolumeClaimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePersistentVolumeClaimResponse response) {
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
        public Builder body(DeletePersistentVolumeClaimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePersistentVolumeClaimResponse build() {
            return new DeletePersistentVolumeClaimResponse(this);
        } 

    } 

}
