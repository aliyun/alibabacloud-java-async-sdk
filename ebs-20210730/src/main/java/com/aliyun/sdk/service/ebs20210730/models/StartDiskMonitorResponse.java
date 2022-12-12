// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiskMonitorResponse} extends {@link TeaModel}
 *
 * <p>StartDiskMonitorResponse</p>
 */
public class StartDiskMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDiskMonitorResponseBody body;

    private StartDiskMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDiskMonitorResponse create() {
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
    public StartDiskMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDiskMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDiskMonitorResponseBody body);

        @Override
        StartDiskMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDiskMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDiskMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDiskMonitorResponse response) {
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
        public Builder body(StartDiskMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDiskMonitorResponse build() {
            return new StartDiskMonitorResponse(this);
        } 

    } 

}
