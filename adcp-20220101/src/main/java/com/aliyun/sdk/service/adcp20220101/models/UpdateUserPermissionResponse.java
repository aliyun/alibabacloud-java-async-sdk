// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserPermissionResponse</p>
 */
public class UpdateUserPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserPermissionResponseBody body;

    private UpdateUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserPermissionResponse create() {
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
    public UpdateUserPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserPermissionResponseBody body);

        @Override
        UpdateUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserPermissionResponse response) {
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
        public Builder body(UpdateUserPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserPermissionResponse build() {
            return new UpdateUserPermissionResponse(this);
        } 

    } 

}
