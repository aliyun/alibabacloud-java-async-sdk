// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeResourcePackageResponse} extends {@link TeaModel}
 *
 * <p>UpgradeResourcePackageResponse</p>
 */
public class UpgradeResourcePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeResourcePackageResponseBody body;

    private UpgradeResourcePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeResourcePackageResponse create() {
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
    public UpgradeResourcePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeResourcePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeResourcePackageResponseBody body);

        @Override
        UpgradeResourcePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeResourcePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeResourcePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeResourcePackageResponse response) {
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
        public Builder body(UpgradeResourcePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeResourcePackageResponse build() {
            return new UpgradeResourcePackageResponse(this);
        } 

    } 

}
