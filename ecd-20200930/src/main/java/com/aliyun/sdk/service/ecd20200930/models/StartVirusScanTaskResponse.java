// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartVirusScanTaskResponse} extends {@link TeaModel}
 *
 * <p>StartVirusScanTaskResponse</p>
 */
public class StartVirusScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartVirusScanTaskResponseBody body;

    private StartVirusScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartVirusScanTaskResponse create() {
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
    public StartVirusScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartVirusScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartVirusScanTaskResponseBody body);

        @Override
        StartVirusScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartVirusScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartVirusScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartVirusScanTaskResponse response) {
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
        public Builder body(StartVirusScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartVirusScanTaskResponse build() {
            return new StartVirusScanTaskResponse(this);
        } 

    } 

}
