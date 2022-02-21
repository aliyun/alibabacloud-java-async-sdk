// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelBackupJobResponse} extends {@link TeaModel}
 *
 * <p>CancelBackupJobResponse</p>
 */
public class CancelBackupJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelBackupJobResponseBody body;

    private CancelBackupJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelBackupJobResponse create() {
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
    public CancelBackupJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelBackupJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelBackupJobResponseBody body);

        @Override
        CancelBackupJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelBackupJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelBackupJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelBackupJobResponse response) {
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
        public Builder body(CancelBackupJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelBackupJobResponse build() {
            return new CancelBackupJobResponse(this);
        } 

    } 

}
