// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHighDefinitionMonitorLogStatusResponse} extends {@link TeaModel}
 *
 * <p>SetHighDefinitionMonitorLogStatusResponse</p>
 */
public class SetHighDefinitionMonitorLogStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetHighDefinitionMonitorLogStatusResponseBody body;

    private SetHighDefinitionMonitorLogStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetHighDefinitionMonitorLogStatusResponse create() {
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
    public SetHighDefinitionMonitorLogStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetHighDefinitionMonitorLogStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetHighDefinitionMonitorLogStatusResponseBody body);

        @Override
        SetHighDefinitionMonitorLogStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetHighDefinitionMonitorLogStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetHighDefinitionMonitorLogStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetHighDefinitionMonitorLogStatusResponse response) {
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
        public Builder body(SetHighDefinitionMonitorLogStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetHighDefinitionMonitorLogStatusResponse build() {
            return new SetHighDefinitionMonitorLogStatusResponse(this);
        } 

    } 

}
