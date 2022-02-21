// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDeviceTimeResponse} extends {@link TeaModel}
 *
 * <p>SyncDeviceTimeResponse</p>
 */
public class SyncDeviceTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncDeviceTimeResponseBody body;

    private SyncDeviceTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncDeviceTimeResponse create() {
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
    public SyncDeviceTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncDeviceTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncDeviceTimeResponseBody body);

        @Override
        SyncDeviceTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncDeviceTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncDeviceTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncDeviceTimeResponse response) {
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
        public Builder body(SyncDeviceTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncDeviceTimeResponse build() {
            return new SyncDeviceTimeResponse(this);
        } 

    } 

}
