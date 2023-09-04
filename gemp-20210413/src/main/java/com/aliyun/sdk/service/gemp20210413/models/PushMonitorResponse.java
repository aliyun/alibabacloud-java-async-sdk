// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMonitorResponse} extends {@link TeaModel}
 *
 * <p>PushMonitorResponse</p>
 */
public class PushMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushMonitorResponseBody body;

    private PushMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushMonitorResponse create() {
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
    public PushMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushMonitorResponseBody body);

        @Override
        PushMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushMonitorResponse response) {
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
        public Builder body(PushMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushMonitorResponse build() {
            return new PushMonitorResponse(this);
        } 

    } 

}
