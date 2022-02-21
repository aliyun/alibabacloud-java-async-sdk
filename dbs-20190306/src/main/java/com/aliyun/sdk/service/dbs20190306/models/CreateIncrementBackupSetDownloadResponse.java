// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncrementBackupSetDownloadResponse} extends {@link TeaModel}
 *
 * <p>CreateIncrementBackupSetDownloadResponse</p>
 */
public class CreateIncrementBackupSetDownloadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIncrementBackupSetDownloadResponseBody body;

    private CreateIncrementBackupSetDownloadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIncrementBackupSetDownloadResponse create() {
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
    public CreateIncrementBackupSetDownloadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIncrementBackupSetDownloadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIncrementBackupSetDownloadResponseBody body);

        @Override
        CreateIncrementBackupSetDownloadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIncrementBackupSetDownloadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIncrementBackupSetDownloadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIncrementBackupSetDownloadResponse response) {
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
        public Builder body(CreateIncrementBackupSetDownloadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIncrementBackupSetDownloadResponse build() {
            return new CreateIncrementBackupSetDownloadResponse(this);
        } 

    } 

}
