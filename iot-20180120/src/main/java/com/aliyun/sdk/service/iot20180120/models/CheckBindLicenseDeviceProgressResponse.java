// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBindLicenseDeviceProgressResponse} extends {@link TeaModel}
 *
 * <p>CheckBindLicenseDeviceProgressResponse</p>
 */
public class CheckBindLicenseDeviceProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckBindLicenseDeviceProgressResponseBody body;

    private CheckBindLicenseDeviceProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckBindLicenseDeviceProgressResponse create() {
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
    public CheckBindLicenseDeviceProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckBindLicenseDeviceProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckBindLicenseDeviceProgressResponseBody body);

        @Override
        CheckBindLicenseDeviceProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckBindLicenseDeviceProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckBindLicenseDeviceProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckBindLicenseDeviceProgressResponse response) {
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
        public Builder body(CheckBindLicenseDeviceProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckBindLicenseDeviceProgressResponse build() {
            return new CheckBindLicenseDeviceProgressResponse(this);
        } 

    } 

}
