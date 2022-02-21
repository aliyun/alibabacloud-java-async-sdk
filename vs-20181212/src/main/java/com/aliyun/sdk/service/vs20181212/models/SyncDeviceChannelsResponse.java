// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDeviceChannelsResponse} extends {@link TeaModel}
 *
 * <p>SyncDeviceChannelsResponse</p>
 */
public class SyncDeviceChannelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncDeviceChannelsResponseBody body;

    private SyncDeviceChannelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncDeviceChannelsResponse create() {
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
    public SyncDeviceChannelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncDeviceChannelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncDeviceChannelsResponseBody body);

        @Override
        SyncDeviceChannelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncDeviceChannelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncDeviceChannelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncDeviceChannelsResponse response) {
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
        public Builder body(SyncDeviceChannelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncDeviceChannelsResponse build() {
            return new SyncDeviceChannelsResponse(this);
        } 

    } 

}
