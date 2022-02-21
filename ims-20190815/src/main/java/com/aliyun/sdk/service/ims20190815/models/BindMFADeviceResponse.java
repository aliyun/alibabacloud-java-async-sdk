// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindMFADeviceResponse} extends {@link TeaModel}
 *
 * <p>BindMFADeviceResponse</p>
 */
public class BindMFADeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindMFADeviceResponseBody body;

    private BindMFADeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindMFADeviceResponse create() {
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
    public BindMFADeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindMFADeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindMFADeviceResponseBody body);

        @Override
        BindMFADeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindMFADeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindMFADeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindMFADeviceResponse response) {
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
        public Builder body(BindMFADeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindMFADeviceResponse build() {
            return new BindMFADeviceResponse(this);
        } 

    } 

}
