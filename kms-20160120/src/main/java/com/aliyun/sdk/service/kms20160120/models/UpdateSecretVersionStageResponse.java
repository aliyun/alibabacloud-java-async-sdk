// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretVersionStageResponse} extends {@link TeaModel}
 *
 * <p>UpdateSecretVersionStageResponse</p>
 */
public class UpdateSecretVersionStageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSecretVersionStageResponseBody body;

    private UpdateSecretVersionStageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSecretVersionStageResponse create() {
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
    public UpdateSecretVersionStageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSecretVersionStageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSecretVersionStageResponseBody body);

        @Override
        UpdateSecretVersionStageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSecretVersionStageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSecretVersionStageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSecretVersionStageResponse response) {
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
        public Builder body(UpdateSecretVersionStageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSecretVersionStageResponse build() {
            return new UpdateSecretVersionStageResponse(this);
        } 

    } 

}
