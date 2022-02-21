// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateVmResponse} extends {@link TeaModel}
 *
 * <p>MigrateVmResponse</p>
 */
public class MigrateVmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateVmResponseBody body;

    private MigrateVmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateVmResponse create() {
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
    public MigrateVmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateVmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateVmResponseBody body);

        @Override
        MigrateVmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateVmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateVmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateVmResponse response) {
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
        public Builder body(MigrateVmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateVmResponse build() {
            return new MigrateVmResponse(this);
        } 

    } 

}
