// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSandboxBackupSetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSandboxBackupSetsResponse</p>
 */
public class DescribeSandboxBackupSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSandboxBackupSetsResponseBody body;

    private DescribeSandboxBackupSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSandboxBackupSetsResponse create() {
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
    public DescribeSandboxBackupSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSandboxBackupSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSandboxBackupSetsResponseBody body);

        @Override
        DescribeSandboxBackupSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSandboxBackupSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSandboxBackupSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSandboxBackupSetsResponse response) {
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
        public Builder body(DescribeSandboxBackupSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSandboxBackupSetsResponse build() {
            return new DescribeSandboxBackupSetsResponse(this);
        } 

    } 

}
