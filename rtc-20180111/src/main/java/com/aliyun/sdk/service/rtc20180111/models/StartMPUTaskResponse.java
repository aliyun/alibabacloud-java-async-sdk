// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMPUTaskResponse} extends {@link TeaModel}
 *
 * <p>StartMPUTaskResponse</p>
 */
public class StartMPUTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartMPUTaskResponseBody body;

    private StartMPUTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartMPUTaskResponse create() {
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
    public StartMPUTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartMPUTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartMPUTaskResponseBody body);

        @Override
        StartMPUTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartMPUTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartMPUTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartMPUTaskResponse response) {
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
        public Builder body(StartMPUTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartMPUTaskResponse build() {
            return new StartMPUTaskResponse(this);
        } 

    } 

}
