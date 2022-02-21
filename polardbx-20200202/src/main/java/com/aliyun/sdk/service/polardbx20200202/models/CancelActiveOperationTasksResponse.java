// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelActiveOperationTasksResponse} extends {@link TeaModel}
 *
 * <p>CancelActiveOperationTasksResponse</p>
 */
public class CancelActiveOperationTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelActiveOperationTasksResponseBody body;

    private CancelActiveOperationTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelActiveOperationTasksResponse create() {
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
    public CancelActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelActiveOperationTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelActiveOperationTasksResponseBody body);

        @Override
        CancelActiveOperationTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelActiveOperationTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelActiveOperationTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelActiveOperationTasksResponse response) {
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
        public Builder body(CancelActiveOperationTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelActiveOperationTasksResponse build() {
            return new CancelActiveOperationTasksResponse(this);
        } 

    } 

}
