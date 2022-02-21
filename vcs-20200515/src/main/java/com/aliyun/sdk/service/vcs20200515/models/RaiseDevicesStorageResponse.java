// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RaiseDevicesStorageResponse} extends {@link TeaModel}
 *
 * <p>RaiseDevicesStorageResponse</p>
 */
public class RaiseDevicesStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RaiseDevicesStorageResponseBody body;

    private RaiseDevicesStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RaiseDevicesStorageResponse create() {
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
    public RaiseDevicesStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RaiseDevicesStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RaiseDevicesStorageResponseBody body);

        @Override
        RaiseDevicesStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RaiseDevicesStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RaiseDevicesStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RaiseDevicesStorageResponse response) {
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
        public Builder body(RaiseDevicesStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RaiseDevicesStorageResponse build() {
            return new RaiseDevicesStorageResponse(this);
        } 

    } 

}
