// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartApplicationsResponse} extends {@link TeaModel}
 *
 * <p>BatchStartApplicationsResponse</p>
 */
public class BatchStartApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStartApplicationsResponseBody body;

    private BatchStartApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStartApplicationsResponse create() {
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
    public BatchStartApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStartApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStartApplicationsResponseBody body);

        @Override
        BatchStartApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStartApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStartApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStartApplicationsResponse response) {
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
        public Builder body(BatchStartApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStartApplicationsResponse build() {
            return new BatchStartApplicationsResponse(this);
        } 

    } 

}
