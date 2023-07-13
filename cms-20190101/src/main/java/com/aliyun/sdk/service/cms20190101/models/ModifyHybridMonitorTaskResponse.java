// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridMonitorTaskResponse} extends {@link TeaModel}
 *
 * <p>ModifyHybridMonitorTaskResponse</p>
 */
public class ModifyHybridMonitorTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHybridMonitorTaskResponseBody body;

    private ModifyHybridMonitorTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHybridMonitorTaskResponse create() {
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
    public ModifyHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHybridMonitorTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHybridMonitorTaskResponseBody body);

        @Override
        ModifyHybridMonitorTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHybridMonitorTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHybridMonitorTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHybridMonitorTaskResponse response) {
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
        public Builder body(ModifyHybridMonitorTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHybridMonitorTaskResponse build() {
            return new ModifyHybridMonitorTaskResponse(this);
        } 

    } 

}
