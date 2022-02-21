// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectBackupFilesResponse} extends {@link TeaModel}
 *
 * <p>GetDataCorrectBackupFilesResponse</p>
 */
public class GetDataCorrectBackupFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataCorrectBackupFilesResponseBody body;

    private GetDataCorrectBackupFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataCorrectBackupFilesResponse create() {
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
    public GetDataCorrectBackupFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataCorrectBackupFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataCorrectBackupFilesResponseBody body);

        @Override
        GetDataCorrectBackupFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataCorrectBackupFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataCorrectBackupFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataCorrectBackupFilesResponse response) {
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
        public Builder body(GetDataCorrectBackupFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataCorrectBackupFilesResponse build() {
            return new GetDataCorrectBackupFilesResponse(this);
        } 

    } 

}
