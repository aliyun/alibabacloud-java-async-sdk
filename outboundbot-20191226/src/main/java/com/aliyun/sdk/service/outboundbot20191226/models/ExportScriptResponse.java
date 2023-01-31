// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportScriptResponse} extends {@link TeaModel}
 *
 * <p>ExportScriptResponse</p>
 */
public class ExportScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportScriptResponseBody body;

    private ExportScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportScriptResponse create() {
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
    public ExportScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportScriptResponseBody body);

        @Override
        ExportScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportScriptResponse response) {
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
        public Builder body(ExportScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportScriptResponse build() {
            return new ExportScriptResponse(this);
        } 

    } 

}
