// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOperateVulResponse} extends {@link TeaModel}
 *
 * <p>ModifyOperateVulResponse</p>
 */
public class ModifyOperateVulResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOperateVulResponseBody body;

    private ModifyOperateVulResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOperateVulResponse create() {
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
    public ModifyOperateVulResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOperateVulResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOperateVulResponseBody body);

        @Override
        ModifyOperateVulResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOperateVulResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOperateVulResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOperateVulResponse response) {
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
        public Builder body(ModifyOperateVulResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOperateVulResponse build() {
            return new ModifyOperateVulResponse(this);
        } 

    } 

}
