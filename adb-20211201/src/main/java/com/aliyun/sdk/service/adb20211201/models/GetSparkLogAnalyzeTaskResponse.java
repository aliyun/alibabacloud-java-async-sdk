// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkLogAnalyzeTaskResponse} extends {@link TeaModel}
 *
 * <p>GetSparkLogAnalyzeTaskResponse</p>
 */
public class GetSparkLogAnalyzeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkLogAnalyzeTaskResponseBody body;

    private GetSparkLogAnalyzeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkLogAnalyzeTaskResponse create() {
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
    public GetSparkLogAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkLogAnalyzeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkLogAnalyzeTaskResponseBody body);

        @Override
        GetSparkLogAnalyzeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkLogAnalyzeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkLogAnalyzeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkLogAnalyzeTaskResponse response) {
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
        public Builder body(GetSparkLogAnalyzeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkLogAnalyzeTaskResponse build() {
            return new GetSparkLogAnalyzeTaskResponse(this);
        } 

    } 

}
