// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNVRDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListNVRDeviceResponse</p>
 */
public class ListNVRDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNVRDeviceResponseBody body;

    private ListNVRDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNVRDeviceResponse create() {
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
    public ListNVRDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNVRDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNVRDeviceResponseBody body);

        @Override
        ListNVRDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNVRDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNVRDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNVRDeviceResponse response) {
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
        public Builder body(ListNVRDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNVRDeviceResponse build() {
            return new ListNVRDeviceResponse(this);
        } 

    } 

}
