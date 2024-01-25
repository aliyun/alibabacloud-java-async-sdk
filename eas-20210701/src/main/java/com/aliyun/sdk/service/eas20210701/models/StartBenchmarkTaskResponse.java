// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBenchmarkTaskResponse} extends {@link TeaModel}
 *
 * <p>StartBenchmarkTaskResponse</p>
 */
public class StartBenchmarkTaskResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private StartBenchmarkTaskResponseBody body;

    private StartBenchmarkTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartBenchmarkTaskResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public StartBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartBenchmarkTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartBenchmarkTaskResponseBody body);

        @Override
        StartBenchmarkTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartBenchmarkTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StartBenchmarkTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartBenchmarkTaskResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(StartBenchmarkTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartBenchmarkTaskResponse build() {
            return new StartBenchmarkTaskResponse(this);
        } 

    } 

}
