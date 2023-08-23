// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDeviceStatusWithAkResponse} extends {@link TeaModel}
 *
 * <p>SyncDeviceStatusWithAkResponse</p>
 */
public class SyncDeviceStatusWithAkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncDeviceStatusWithAkResponseBody body;

    private SyncDeviceStatusWithAkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncDeviceStatusWithAkResponse create() {
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
    public SyncDeviceStatusWithAkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncDeviceStatusWithAkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncDeviceStatusWithAkResponseBody body);

        @Override
        SyncDeviceStatusWithAkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncDeviceStatusWithAkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncDeviceStatusWithAkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncDeviceStatusWithAkResponse response) {
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
        public Builder body(SyncDeviceStatusWithAkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncDeviceStatusWithAkResponse build() {
            return new SyncDeviceStatusWithAkResponse(this);
        } 

    } 

}
