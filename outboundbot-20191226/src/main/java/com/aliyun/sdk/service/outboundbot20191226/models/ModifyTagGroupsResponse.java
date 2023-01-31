// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagGroupsResponse} extends {@link TeaModel}
 *
 * <p>ModifyTagGroupsResponse</p>
 */
public class ModifyTagGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTagGroupsResponseBody body;

    private ModifyTagGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTagGroupsResponse create() {
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
    public ModifyTagGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTagGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTagGroupsResponseBody body);

        @Override
        ModifyTagGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTagGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTagGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTagGroupsResponse response) {
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
        public Builder body(ModifyTagGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTagGroupsResponse build() {
            return new ModifyTagGroupsResponse(this);
        } 

    } 

}
