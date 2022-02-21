// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopsPolicyGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyDesktopsPolicyGroupResponse</p>
 */
public class ModifyDesktopsPolicyGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDesktopsPolicyGroupResponseBody body;

    private ModifyDesktopsPolicyGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDesktopsPolicyGroupResponse create() {
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
    public ModifyDesktopsPolicyGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDesktopsPolicyGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDesktopsPolicyGroupResponseBody body);

        @Override
        ModifyDesktopsPolicyGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDesktopsPolicyGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDesktopsPolicyGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDesktopsPolicyGroupResponse response) {
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
        public Builder body(ModifyDesktopsPolicyGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDesktopsPolicyGroupResponse build() {
            return new ModifyDesktopsPolicyGroupResponse(this);
        } 

    } 

}
