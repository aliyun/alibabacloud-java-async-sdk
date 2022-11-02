// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyDefenseResourceGroupResponse</p>
 */
public class ModifyDefenseResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDefenseResourceGroupResponseBody body;

    private ModifyDefenseResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDefenseResourceGroupResponse create() {
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
    public ModifyDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDefenseResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDefenseResourceGroupResponseBody body);

        @Override
        ModifyDefenseResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDefenseResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDefenseResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDefenseResourceGroupResponse response) {
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
        public Builder body(ModifyDefenseResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDefenseResourceGroupResponse build() {
            return new ModifyDefenseResourceGroupResponse(this);
        } 

    } 

}
