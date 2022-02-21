// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNVRChannelDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListNVRChannelDeviceResponse</p>
 */
public class ListNVRChannelDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNVRChannelDeviceResponseBody body;

    private ListNVRChannelDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNVRChannelDeviceResponse create() {
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
    public ListNVRChannelDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNVRChannelDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNVRChannelDeviceResponseBody body);

        @Override
        ListNVRChannelDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNVRChannelDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNVRChannelDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNVRChannelDeviceResponse response) {
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
        public Builder body(ListNVRChannelDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNVRChannelDeviceResponse build() {
            return new ListNVRChannelDeviceResponse(this);
        } 

    } 

}
