// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindLicenseProductResponse} extends {@link TeaModel}
 *
 * <p>UnbindLicenseProductResponse</p>
 */
public class UnbindLicenseProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindLicenseProductResponseBody body;

    private UnbindLicenseProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindLicenseProductResponse create() {
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
    public UnbindLicenseProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindLicenseProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindLicenseProductResponseBody body);

        @Override
        UnbindLicenseProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindLicenseProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindLicenseProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindLicenseProductResponse response) {
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
        public Builder body(UnbindLicenseProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindLicenseProductResponse build() {
            return new UnbindLicenseProductResponse(this);
        } 

    } 

}
