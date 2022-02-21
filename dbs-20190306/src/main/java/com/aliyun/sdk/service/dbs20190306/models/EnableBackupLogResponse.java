// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBackupLogResponse} extends {@link TeaModel}
 *
 * <p>EnableBackupLogResponse</p>
 */
public class EnableBackupLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableBackupLogResponseBody body;

    private EnableBackupLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableBackupLogResponse create() {
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
    public EnableBackupLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableBackupLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableBackupLogResponseBody body);

        @Override
        EnableBackupLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableBackupLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableBackupLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableBackupLogResponse response) {
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
        public Builder body(EnableBackupLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableBackupLogResponse build() {
            return new EnableBackupLogResponse(this);
        } 

    } 

}
