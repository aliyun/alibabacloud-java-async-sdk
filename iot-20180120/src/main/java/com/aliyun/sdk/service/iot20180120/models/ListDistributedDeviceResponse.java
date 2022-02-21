// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributedDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListDistributedDeviceResponse</p>
 */
public class ListDistributedDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDistributedDeviceResponseBody body;

    private ListDistributedDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDistributedDeviceResponse create() {
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
    public ListDistributedDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDistributedDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDistributedDeviceResponseBody body);

        @Override
        ListDistributedDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDistributedDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDistributedDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDistributedDeviceResponse response) {
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
        public Builder body(ListDistributedDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDistributedDeviceResponse build() {
            return new ListDistributedDeviceResponse(this);
        } 

    } 

}
