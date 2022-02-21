// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeBackupClientsResponse} extends {@link TeaModel}
 *
 * <p>UpgradeBackupClientsResponse</p>
 */
public class UpgradeBackupClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeBackupClientsResponseBody body;

    private UpgradeBackupClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeBackupClientsResponse create() {
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
    public UpgradeBackupClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeBackupClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeBackupClientsResponseBody body);

        @Override
        UpgradeBackupClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeBackupClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeBackupClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeBackupClientsResponse response) {
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
        public Builder body(UpgradeBackupClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeBackupClientsResponse build() {
            return new UpgradeBackupClientsResponse(this);
        } 

    } 

}
