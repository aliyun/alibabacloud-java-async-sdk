// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHBaseueBackupResponse} extends {@link TeaModel}
 *
 * <p>EnableHBaseueBackupResponse</p>
 */
public class EnableHBaseueBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableHBaseueBackupResponseBody body;

    private EnableHBaseueBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableHBaseueBackupResponse create() {
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
    public EnableHBaseueBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableHBaseueBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableHBaseueBackupResponseBody body);

        @Override
        EnableHBaseueBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableHBaseueBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableHBaseueBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableHBaseueBackupResponse response) {
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
        public Builder body(EnableHBaseueBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableHBaseueBackupResponse build() {
            return new EnableHBaseueBackupResponse(this);
        } 

    } 

}
