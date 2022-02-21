// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBackupLogResponse} extends {@link TeaModel}
 *
 * <p>DisableBackupLogResponse</p>
 */
public class DisableBackupLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableBackupLogResponseBody body;

    private DisableBackupLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableBackupLogResponse create() {
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
    public DisableBackupLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableBackupLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableBackupLogResponseBody body);

        @Override
        DisableBackupLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableBackupLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableBackupLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableBackupLogResponse response) {
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
        public Builder body(DisableBackupLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableBackupLogResponse build() {
            return new DisableBackupLogResponse(this);
        } 

    } 

}
