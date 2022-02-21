// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserGroupsResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserGroupsResponse</p>
 */
public class ModifyUserGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserGroupsResponseBody body;

    private ModifyUserGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserGroupsResponse create() {
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
    public ModifyUserGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserGroupsResponseBody body);

        @Override
        ModifyUserGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserGroupsResponse response) {
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
        public Builder body(ModifyUserGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserGroupsResponse build() {
            return new ModifyUserGroupsResponse(this);
        } 

    } 

}
