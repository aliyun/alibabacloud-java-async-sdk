// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFotaTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateFotaTaskResponse</p>
 */
public class UpdateFotaTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFotaTaskResponseBody body;

    private UpdateFotaTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFotaTaskResponse create() {
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
    public UpdateFotaTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFotaTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFotaTaskResponseBody body);

        @Override
        UpdateFotaTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFotaTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFotaTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFotaTaskResponse response) {
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
        public Builder body(UpdateFotaTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFotaTaskResponse build() {
            return new UpdateFotaTaskResponse(this);
        } 

    } 

}
