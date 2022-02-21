// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDBInstanceSSLResponse} extends {@link TeaModel}
 *
 * <p>UpdateDBInstanceSSLResponse</p>
 */
public class UpdateDBInstanceSSLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDBInstanceSSLResponseBody body;

    private UpdateDBInstanceSSLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDBInstanceSSLResponse create() {
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
    public UpdateDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDBInstanceSSLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDBInstanceSSLResponseBody body);

        @Override
        UpdateDBInstanceSSLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDBInstanceSSLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDBInstanceSSLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDBInstanceSSLResponse response) {
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
        public Builder body(UpdateDBInstanceSSLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDBInstanceSSLResponse build() {
            return new UpdateDBInstanceSSLResponse(this);
        } 

    } 

}
