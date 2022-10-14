// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRevokePermissionsResponse} extends {@link TeaModel}
 *
 * <p>BatchRevokePermissionsResponse</p>
 */
public class BatchRevokePermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchRevokePermissionsResponseBody body;

    private BatchRevokePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchRevokePermissionsResponse create() {
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
    public BatchRevokePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchRevokePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchRevokePermissionsResponseBody body);

        @Override
        BatchRevokePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchRevokePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchRevokePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchRevokePermissionsResponse response) {
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
        public Builder body(BatchRevokePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchRevokePermissionsResponse build() {
            return new BatchRevokePermissionsResponse(this);
        } 

    } 

}
