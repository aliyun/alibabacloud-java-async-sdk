// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePermissionsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePermissionsResponse</p>
 */
public class UpdatePermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePermissionsResponseBody body;

    private UpdatePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePermissionsResponse create() {
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
    public UpdatePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePermissionsResponseBody body);

        @Override
        UpdatePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePermissionsResponse response) {
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
        public Builder body(UpdatePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePermissionsResponse build() {
            return new UpdatePermissionsResponse(this);
        } 

    } 

}
