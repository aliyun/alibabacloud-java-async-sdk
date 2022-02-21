// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateQualityProjectsResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateQualityProjectsResponse</p>
 */
public class BatchCreateQualityProjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateQualityProjectsResponseBody body;

    private BatchCreateQualityProjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateQualityProjectsResponse create() {
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
    public BatchCreateQualityProjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateQualityProjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateQualityProjectsResponseBody body);

        @Override
        BatchCreateQualityProjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateQualityProjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateQualityProjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateQualityProjectsResponse response) {
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
        public Builder body(BatchCreateQualityProjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateQualityProjectsResponse build() {
            return new BatchCreateQualityProjectsResponse(this);
        } 

    } 

}
