// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSyncEcsHostTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateSyncEcsHostTaskResponse</p>
 */
public class UpdateSyncEcsHostTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSyncEcsHostTaskResponseBody body;

    private UpdateSyncEcsHostTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSyncEcsHostTaskResponse create() {
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
    public UpdateSyncEcsHostTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSyncEcsHostTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSyncEcsHostTaskResponseBody body);

        @Override
        UpdateSyncEcsHostTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSyncEcsHostTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSyncEcsHostTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSyncEcsHostTaskResponse response) {
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
        public Builder body(UpdateSyncEcsHostTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSyncEcsHostTaskResponse build() {
            return new UpdateSyncEcsHostTaskResponse(this);
        } 

    } 

}
