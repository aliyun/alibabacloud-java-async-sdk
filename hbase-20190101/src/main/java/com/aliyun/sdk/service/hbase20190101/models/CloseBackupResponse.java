// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseBackupResponse} extends {@link TeaModel}
 *
 * <p>CloseBackupResponse</p>
 */
public class CloseBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseBackupResponseBody body;

    private CloseBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseBackupResponse create() {
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
    public CloseBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseBackupResponseBody body);

        @Override
        CloseBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseBackupResponse response) {
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
        public Builder body(CloseBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseBackupResponse build() {
            return new CloseBackupResponse(this);
        } 

    } 

}
