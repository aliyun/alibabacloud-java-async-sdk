// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallBackupClientResponse} extends {@link TeaModel}
 *
 * <p>InstallBackupClientResponse</p>
 */
public class InstallBackupClientResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallBackupClientResponseBody body;

    private InstallBackupClientResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallBackupClientResponse create() {
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
    public InstallBackupClientResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallBackupClientResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallBackupClientResponseBody body);

        @Override
        InstallBackupClientResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallBackupClientResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallBackupClientResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallBackupClientResponse response) {
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
        public Builder body(InstallBackupClientResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallBackupClientResponse build() {
            return new InstallBackupClientResponse(this);
        } 

    } 

}
