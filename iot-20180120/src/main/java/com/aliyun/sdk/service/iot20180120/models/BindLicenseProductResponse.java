// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindLicenseProductResponse} extends {@link TeaModel}
 *
 * <p>BindLicenseProductResponse</p>
 */
public class BindLicenseProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindLicenseProductResponseBody body;

    private BindLicenseProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindLicenseProductResponse create() {
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
    public BindLicenseProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindLicenseProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindLicenseProductResponseBody body);

        @Override
        BindLicenseProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindLicenseProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindLicenseProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindLicenseProductResponse response) {
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
        public Builder body(BindLicenseProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindLicenseProductResponse build() {
            return new BindLicenseProductResponse(this);
        } 

    } 

}
