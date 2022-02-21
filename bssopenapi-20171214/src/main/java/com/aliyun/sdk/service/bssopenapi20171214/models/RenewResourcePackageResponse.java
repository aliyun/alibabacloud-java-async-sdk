// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewResourcePackageResponse} extends {@link TeaModel}
 *
 * <p>RenewResourcePackageResponse</p>
 */
public class RenewResourcePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewResourcePackageResponseBody body;

    private RenewResourcePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewResourcePackageResponse create() {
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
    public RenewResourcePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewResourcePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewResourcePackageResponseBody body);

        @Override
        RenewResourcePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewResourcePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewResourcePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewResourcePackageResponse response) {
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
        public Builder body(RenewResourcePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewResourcePackageResponse build() {
            return new RenewResourcePackageResponse(this);
        } 

    } 

}
