// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportUserBackupFileResponse} extends {@link TeaModel}
 *
 * <p>ImportUserBackupFileResponse</p>
 */
public class ImportUserBackupFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportUserBackupFileResponseBody body;

    private ImportUserBackupFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportUserBackupFileResponse create() {
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
    public ImportUserBackupFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportUserBackupFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportUserBackupFileResponseBody body);

        @Override
        ImportUserBackupFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportUserBackupFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportUserBackupFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportUserBackupFileResponse response) {
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
        public Builder body(ImportUserBackupFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportUserBackupFileResponse build() {
            return new ImportUserBackupFileResponse(this);
        } 

    } 

}
