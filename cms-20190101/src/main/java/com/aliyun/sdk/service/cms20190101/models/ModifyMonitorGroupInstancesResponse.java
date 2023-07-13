// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMonitorGroupInstancesResponse} extends {@link TeaModel}
 *
 * <p>ModifyMonitorGroupInstancesResponse</p>
 */
public class ModifyMonitorGroupInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMonitorGroupInstancesResponseBody body;

    private ModifyMonitorGroupInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMonitorGroupInstancesResponse create() {
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
    public ModifyMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMonitorGroupInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMonitorGroupInstancesResponseBody body);

        @Override
        ModifyMonitorGroupInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMonitorGroupInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMonitorGroupInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMonitorGroupInstancesResponse response) {
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
        public Builder body(ModifyMonitorGroupInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMonitorGroupInstancesResponse build() {
            return new ModifyMonitorGroupInstancesResponse(this);
        } 

    } 

}
