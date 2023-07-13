// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMonitorGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyMonitorGroupResponse</p>
 */
public class ModifyMonitorGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMonitorGroupResponseBody body;

    private ModifyMonitorGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMonitorGroupResponse create() {
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
    public ModifyMonitorGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMonitorGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMonitorGroupResponseBody body);

        @Override
        ModifyMonitorGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMonitorGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMonitorGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMonitorGroupResponse response) {
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
        public Builder body(ModifyMonitorGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMonitorGroupResponse build() {
            return new ModifyMonitorGroupResponse(this);
        } 

    } 

}
