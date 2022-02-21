// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupResponse</p>
 */
public class ModifyApiGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiGroupResponseBody body;

    private ModifyApiGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiGroupResponse create() {
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
    public ModifyApiGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiGroupResponseBody body);

        @Override
        ModifyApiGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiGroupResponse response) {
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
        public Builder body(ModifyApiGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiGroupResponse build() {
            return new ModifyApiGroupResponse(this);
        } 

    } 

}
