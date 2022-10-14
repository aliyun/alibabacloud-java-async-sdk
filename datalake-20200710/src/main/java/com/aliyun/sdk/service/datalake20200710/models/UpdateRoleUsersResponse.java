// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleUsersResponse} extends {@link TeaModel}
 *
 * <p>UpdateRoleUsersResponse</p>
 */
public class UpdateRoleUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRoleUsersResponseBody body;

    private UpdateRoleUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRoleUsersResponse create() {
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
    public UpdateRoleUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRoleUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRoleUsersResponseBody body);

        @Override
        UpdateRoleUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRoleUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRoleUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRoleUsersResponse response) {
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
        public Builder body(UpdateRoleUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRoleUsersResponse build() {
            return new UpdateRoleUsersResponse(this);
        } 

    } 

}
