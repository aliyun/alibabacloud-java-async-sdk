// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceChannelsResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceChannelsResponse</p>
 */
public class ListDeviceChannelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceChannelsResponseBody body;

    private ListDeviceChannelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceChannelsResponse create() {
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
    public ListDeviceChannelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceChannelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceChannelsResponseBody body);

        @Override
        ListDeviceChannelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceChannelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceChannelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceChannelsResponse response) {
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
        public Builder body(ListDeviceChannelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceChannelsResponse build() {
            return new ListDeviceChannelsResponse(this);
        } 

    } 

}
