// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyGroupResponse</p>
 */
public class ModifyGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGroupResponseBody body;

    private ModifyGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGroupResponse create() {
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
    public ModifyGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGroupResponseBody body);

        @Override
        ModifyGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGroupResponse response) {
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
        public Builder body(ModifyGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGroupResponse build() {
            return new ModifyGroupResponse(this);
        } 

    } 

}
