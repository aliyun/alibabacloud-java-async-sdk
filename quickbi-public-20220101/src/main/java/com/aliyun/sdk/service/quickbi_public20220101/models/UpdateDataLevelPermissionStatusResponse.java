// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataLevelPermissionStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateDataLevelPermissionStatusResponse</p>
 */
public class UpdateDataLevelPermissionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDataLevelPermissionStatusResponseBody body;

    private UpdateDataLevelPermissionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDataLevelPermissionStatusResponse create() {
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
    public UpdateDataLevelPermissionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDataLevelPermissionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDataLevelPermissionStatusResponseBody body);

        @Override
        UpdateDataLevelPermissionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDataLevelPermissionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDataLevelPermissionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDataLevelPermissionStatusResponse response) {
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
        public Builder body(UpdateDataLevelPermissionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDataLevelPermissionStatusResponse build() {
            return new UpdateDataLevelPermissionStatusResponse(this);
        } 

    } 

}
