// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGrantPermissionsResponse} extends {@link TeaModel}
 *
 * <p>BatchGrantPermissionsResponse</p>
 */
public class BatchGrantPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGrantPermissionsResponseBody body;

    private BatchGrantPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGrantPermissionsResponse create() {
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
    public BatchGrantPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGrantPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGrantPermissionsResponseBody body);

        @Override
        BatchGrantPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGrantPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGrantPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGrantPermissionsResponse response) {
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
        public Builder body(BatchGrantPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGrantPermissionsResponse build() {
            return new BatchGrantPermissionsResponse(this);
        } 

    } 

}
