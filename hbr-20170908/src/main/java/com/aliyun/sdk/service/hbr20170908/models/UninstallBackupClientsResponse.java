// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallBackupClientsResponse} extends {@link TeaModel}
 *
 * <p>UninstallBackupClientsResponse</p>
 */
public class UninstallBackupClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallBackupClientsResponseBody body;

    private UninstallBackupClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallBackupClientsResponse create() {
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
    public UninstallBackupClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallBackupClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallBackupClientsResponseBody body);

        @Override
        UninstallBackupClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallBackupClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallBackupClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallBackupClientsResponse response) {
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
        public Builder body(UninstallBackupClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallBackupClientsResponse build() {
            return new UninstallBackupClientsResponse(this);
        } 

    } 

}
