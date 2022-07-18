// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBenchmarkTaskResponse} extends {@link TeaModel}
 *
 * <p>ListBenchmarkTaskResponse</p>
 */
public class ListBenchmarkTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBenchmarkTaskResponseBody body;

    private ListBenchmarkTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBenchmarkTaskResponse create() {
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
    public ListBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBenchmarkTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBenchmarkTaskResponseBody body);

        @Override
        ListBenchmarkTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBenchmarkTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBenchmarkTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBenchmarkTaskResponse response) {
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
        public Builder body(ListBenchmarkTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBenchmarkTaskResponse build() {
            return new ListBenchmarkTaskResponse(this);
        } 

    } 

}
