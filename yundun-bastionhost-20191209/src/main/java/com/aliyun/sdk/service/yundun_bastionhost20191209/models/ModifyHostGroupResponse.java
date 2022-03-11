// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostGroupResponse</p>
 */
public class ModifyHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostGroupResponseBody body;

    private ModifyHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostGroupResponse create() {
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
    public ModifyHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostGroupResponseBody body);

        @Override
        ModifyHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostGroupResponse response) {
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
        public Builder body(ModifyHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostGroupResponse build() {
            return new ModifyHostGroupResponse(this);
        } 

    } 

}
