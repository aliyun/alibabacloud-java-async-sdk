// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySiteMonitorResponse} extends {@link TeaModel}
 *
 * <p>ModifySiteMonitorResponse</p>
 */
public class ModifySiteMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySiteMonitorResponseBody body;

    private ModifySiteMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySiteMonitorResponse create() {
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
    public ModifySiteMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySiteMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySiteMonitorResponseBody body);

        @Override
        ModifySiteMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySiteMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySiteMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySiteMonitorResponse response) {
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
        public Builder body(ModifySiteMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySiteMonitorResponse build() {
            return new ModifySiteMonitorResponse(this);
        } 

    } 

}
