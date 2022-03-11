// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserGroupResponse</p>
 */
public class ModifyUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserGroupResponseBody body;

    private ModifyUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserGroupResponse create() {
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
    public ModifyUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserGroupResponseBody body);

        @Override
        ModifyUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserGroupResponse response) {
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
        public Builder body(ModifyUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserGroupResponse build() {
            return new ModifyUserGroupResponse(this);
        } 

    } 

}
