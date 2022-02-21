// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>BatchImportConfigurationsResponse</p>
 */
public class BatchImportConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchImportConfigurationsResponseBody body;

    private BatchImportConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchImportConfigurationsResponse create() {
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
    public BatchImportConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchImportConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchImportConfigurationsResponseBody body);

        @Override
        BatchImportConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchImportConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchImportConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchImportConfigurationsResponse response) {
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
        public Builder body(BatchImportConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchImportConfigurationsResponse build() {
            return new BatchImportConfigurationsResponse(this);
        } 

    } 

}
