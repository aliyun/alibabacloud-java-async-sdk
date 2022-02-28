// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackupStorageCountResponse} extends {@link TeaModel}
 *
 * <p>GetBackupStorageCountResponse</p>
 */
public class GetBackupStorageCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBackupStorageCountResponseBody body;

    private GetBackupStorageCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBackupStorageCountResponse create() {
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
    public GetBackupStorageCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBackupStorageCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBackupStorageCountResponseBody body);

        @Override
        GetBackupStorageCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBackupStorageCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBackupStorageCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBackupStorageCountResponse response) {
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
        public Builder body(GetBackupStorageCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBackupStorageCountResponse build() {
            return new GetBackupStorageCountResponse(this);
        } 

    } 

}
