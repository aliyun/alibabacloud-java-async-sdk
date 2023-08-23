// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTerminalLogResponse} extends {@link TeaModel}
 *
 * <p>SaveTerminalLogResponse</p>
 */
public class SaveTerminalLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTerminalLogResponseBody body;

    private SaveTerminalLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTerminalLogResponse create() {
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
    public SaveTerminalLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTerminalLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTerminalLogResponseBody body);

        @Override
        SaveTerminalLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTerminalLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTerminalLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTerminalLogResponse response) {
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
        public Builder body(SaveTerminalLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTerminalLogResponse build() {
            return new SaveTerminalLogResponse(this);
        } 

    } 

}
