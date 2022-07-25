// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSandboxRecoveryTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeSandboxRecoveryTimeResponse</p>
 */
public class DescribeSandboxRecoveryTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSandboxRecoveryTimeResponseBody body;

    private DescribeSandboxRecoveryTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSandboxRecoveryTimeResponse create() {
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
    public DescribeSandboxRecoveryTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSandboxRecoveryTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSandboxRecoveryTimeResponseBody body);

        @Override
        DescribeSandboxRecoveryTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSandboxRecoveryTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSandboxRecoveryTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSandboxRecoveryTimeResponse response) {
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
        public Builder body(DescribeSandboxRecoveryTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSandboxRecoveryTimeResponse build() {
            return new DescribeSandboxRecoveryTimeResponse(this);
        } 

    } 

}
