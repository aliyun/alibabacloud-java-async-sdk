// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateLicenseResponse} extends {@link TeaModel}
 *
 * <p>ActivateLicenseResponse</p>
 */
public class ActivateLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivateLicenseResponseBody body;

    private ActivateLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivateLicenseResponse create() {
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
    public ActivateLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivateLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivateLicenseResponseBody body);

        @Override
        ActivateLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivateLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivateLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivateLicenseResponse response) {
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
        public Builder body(ActivateLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivateLicenseResponse build() {
            return new ActivateLicenseResponse(this);
        } 

    } 

}
