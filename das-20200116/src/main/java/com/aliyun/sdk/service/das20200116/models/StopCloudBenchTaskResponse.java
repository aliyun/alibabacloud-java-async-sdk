// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCloudBenchTaskResponse} extends {@link TeaModel}
 *
 * <p>StopCloudBenchTaskResponse</p>
 */
public class StopCloudBenchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopCloudBenchTaskResponseBody body;

    private StopCloudBenchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopCloudBenchTaskResponse create() {
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
    public StopCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCloudBenchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopCloudBenchTaskResponseBody body);

        @Override
        StopCloudBenchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCloudBenchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopCloudBenchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCloudBenchTaskResponse response) {
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
        public Builder body(StopCloudBenchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCloudBenchTaskResponse build() {
            return new StopCloudBenchTaskResponse(this);
        } 

    } 

}
