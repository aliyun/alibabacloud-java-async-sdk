// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportScriptResponse} extends {@link TeaModel}
 *
 * <p>ImportScriptResponse</p>
 */
public class ImportScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportScriptResponseBody body;

    private ImportScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportScriptResponse create() {
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
    public ImportScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportScriptResponseBody body);

        @Override
        ImportScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportScriptResponse response) {
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
        public Builder body(ImportScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportScriptResponse build() {
            return new ImportScriptResponse(this);
        } 

    } 

}
