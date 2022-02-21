// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMonitorResponse} extends {@link TeaModel}
 *
 * <p>StopMonitorResponse</p>
 */
public class StopMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMonitorResponseBody body;

    private StopMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMonitorResponse create() {
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
    public StopMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMonitorResponseBody body);

        @Override
        StopMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMonitorResponse response) {
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
        public Builder body(StopMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMonitorResponse build() {
            return new StopMonitorResponse(this);
        } 

    } 

}
