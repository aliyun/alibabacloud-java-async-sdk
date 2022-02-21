// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchStartDevicesResponse</p>
 */
public class BatchStartDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStartDevicesResponseBody body;

    private BatchStartDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStartDevicesResponse create() {
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
    public BatchStartDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStartDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStartDevicesResponseBody body);

        @Override
        BatchStartDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStartDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStartDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStartDevicesResponse response) {
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
        public Builder body(BatchStartDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStartDevicesResponse build() {
            return new BatchStartDevicesResponse(this);
        } 

    } 

}
