// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridMonitorSLSGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyHybridMonitorSLSGroupResponse</p>
 */
public class ModifyHybridMonitorSLSGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHybridMonitorSLSGroupResponseBody body;

    private ModifyHybridMonitorSLSGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHybridMonitorSLSGroupResponse create() {
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
    public ModifyHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHybridMonitorSLSGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHybridMonitorSLSGroupResponseBody body);

        @Override
        ModifyHybridMonitorSLSGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHybridMonitorSLSGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHybridMonitorSLSGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHybridMonitorSLSGroupResponse response) {
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
        public Builder body(ModifyHybridMonitorSLSGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHybridMonitorSLSGroupResponse build() {
            return new ModifyHybridMonitorSLSGroupResponse(this);
        } 

    } 

}
