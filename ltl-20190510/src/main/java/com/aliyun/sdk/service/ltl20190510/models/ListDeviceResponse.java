// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceResponse</p>
 */
public class ListDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceResponseBody body;

    private ListDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceResponse create() {
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
    public ListDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceResponseBody body);

        @Override
        ListDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceResponse response) {
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
        public Builder body(ListDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceResponse build() {
            return new ListDeviceResponse(this);
        } 

    } 

}
