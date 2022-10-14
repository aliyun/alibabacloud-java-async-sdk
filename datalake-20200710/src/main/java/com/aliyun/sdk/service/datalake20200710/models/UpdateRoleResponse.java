// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleResponse} extends {@link TeaModel}
 *
 * <p>UpdateRoleResponse</p>
 */
public class UpdateRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRoleResponseBody body;

    private UpdateRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRoleResponse create() {
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
    public UpdateRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRoleResponseBody body);

        @Override
        UpdateRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRoleResponse response) {
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
        public Builder body(UpdateRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRoleResponse build() {
            return new UpdateRoleResponse(this);
        } 

    } 

}
