// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDrivePermissionResponse} extends {@link TeaModel}
 *
 * <p>ModifyCloudDrivePermissionResponse</p>
 */
public class ModifyCloudDrivePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCloudDrivePermissionResponseBody body;

    private ModifyCloudDrivePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCloudDrivePermissionResponse create() {
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
    public ModifyCloudDrivePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCloudDrivePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCloudDrivePermissionResponseBody body);

        @Override
        ModifyCloudDrivePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCloudDrivePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCloudDrivePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCloudDrivePermissionResponse response) {
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
        public Builder body(ModifyCloudDrivePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCloudDrivePermissionResponse build() {
            return new ModifyCloudDrivePermissionResponse(this);
        } 

    } 

}
