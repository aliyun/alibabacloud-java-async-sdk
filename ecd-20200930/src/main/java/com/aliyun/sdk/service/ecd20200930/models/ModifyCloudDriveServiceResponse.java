// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDriveServiceResponse} extends {@link TeaModel}
 *
 * <p>ModifyCloudDriveServiceResponse</p>
 */
public class ModifyCloudDriveServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCloudDriveServiceResponseBody body;

    private ModifyCloudDriveServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCloudDriveServiceResponse create() {
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
    public ModifyCloudDriveServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCloudDriveServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCloudDriveServiceResponseBody body);

        @Override
        ModifyCloudDriveServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCloudDriveServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCloudDriveServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCloudDriveServiceResponse response) {
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
        public Builder body(ModifyCloudDriveServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCloudDriveServiceResponse build() {
            return new ModifyCloudDriveServiceResponse(this);
        } 

    } 

}
