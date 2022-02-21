// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyAppGroupResponse</p>
 */
public class ModifyAppGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAppGroupResponseBody body;

    private ModifyAppGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAppGroupResponse create() {
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
    public ModifyAppGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAppGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAppGroupResponseBody body);

        @Override
        ModifyAppGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAppGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAppGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAppGroupResponse response) {
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
        public Builder body(ModifyAppGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAppGroupResponse build() {
            return new ModifyAppGroupResponse(this);
        } 

    } 

}
