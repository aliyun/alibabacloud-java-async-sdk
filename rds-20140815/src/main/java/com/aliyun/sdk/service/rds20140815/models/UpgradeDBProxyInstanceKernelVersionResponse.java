// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBProxyInstanceKernelVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeDBProxyInstanceKernelVersionResponse</p>
 */
public class UpgradeDBProxyInstanceKernelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeDBProxyInstanceKernelVersionResponseBody body;

    private UpgradeDBProxyInstanceKernelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeDBProxyInstanceKernelVersionResponse create() {
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
    public UpgradeDBProxyInstanceKernelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeDBProxyInstanceKernelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeDBProxyInstanceKernelVersionResponseBody body);

        @Override
        UpgradeDBProxyInstanceKernelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeDBProxyInstanceKernelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeDBProxyInstanceKernelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeDBProxyInstanceKernelVersionResponse response) {
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
        public Builder body(UpgradeDBProxyInstanceKernelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeDBProxyInstanceKernelVersionResponse build() {
            return new UpgradeDBProxyInstanceKernelVersionResponse(this);
        } 

    } 

}
