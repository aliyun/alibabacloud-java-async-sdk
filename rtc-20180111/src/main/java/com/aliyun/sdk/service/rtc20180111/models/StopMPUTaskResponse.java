// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMPUTaskResponse} extends {@link TeaModel}
 *
 * <p>StopMPUTaskResponse</p>
 */
public class StopMPUTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMPUTaskResponseBody body;

    private StopMPUTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMPUTaskResponse create() {
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
    public StopMPUTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMPUTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMPUTaskResponseBody body);

        @Override
        StopMPUTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMPUTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMPUTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMPUTaskResponse response) {
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
        public Builder body(StopMPUTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMPUTaskResponse build() {
            return new StopMPUTaskResponse(this);
        } 

    } 

}
