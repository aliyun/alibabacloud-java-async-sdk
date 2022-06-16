// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersistentVolumeClaimResponse} extends {@link TeaModel}
 *
 * <p>CreatePersistentVolumeClaimResponse</p>
 */
public class CreatePersistentVolumeClaimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePersistentVolumeClaimResponseBody body;

    private CreatePersistentVolumeClaimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePersistentVolumeClaimResponse create() {
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
    public CreatePersistentVolumeClaimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePersistentVolumeClaimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePersistentVolumeClaimResponseBody body);

        @Override
        CreatePersistentVolumeClaimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePersistentVolumeClaimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePersistentVolumeClaimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePersistentVolumeClaimResponse response) {
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
        public Builder body(CreatePersistentVolumeClaimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePersistentVolumeClaimResponse build() {
            return new CreatePersistentVolumeClaimResponse(this);
        } 

    } 

}
