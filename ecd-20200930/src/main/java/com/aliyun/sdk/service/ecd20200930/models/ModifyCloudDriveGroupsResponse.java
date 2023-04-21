// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDriveGroupsResponse} extends {@link TeaModel}
 *
 * <p>ModifyCloudDriveGroupsResponse</p>
 */
public class ModifyCloudDriveGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCloudDriveGroupsResponseBody body;

    private ModifyCloudDriveGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCloudDriveGroupsResponse create() {
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
    public ModifyCloudDriveGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCloudDriveGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCloudDriveGroupsResponseBody body);

        @Override
        ModifyCloudDriveGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCloudDriveGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCloudDriveGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCloudDriveGroupsResponse response) {
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
        public Builder body(ModifyCloudDriveGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCloudDriveGroupsResponse build() {
            return new ModifyCloudDriveGroupsResponse(this);
        } 

    } 

}
