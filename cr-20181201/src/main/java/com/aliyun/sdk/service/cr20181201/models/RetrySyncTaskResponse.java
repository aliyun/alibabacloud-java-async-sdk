// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetrySyncTaskResponse} extends {@link TeaModel}
 *
 * <p>RetrySyncTaskResponse</p>
 */
public class RetrySyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetrySyncTaskResponseBody body;

    private RetrySyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetrySyncTaskResponse create() {
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
    public RetrySyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetrySyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetrySyncTaskResponseBody body);

        @Override
        RetrySyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetrySyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetrySyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetrySyncTaskResponse response) {
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
        public Builder body(RetrySyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetrySyncTaskResponse build() {
            return new RetrySyncTaskResponse(this);
        } 

    } 

}
