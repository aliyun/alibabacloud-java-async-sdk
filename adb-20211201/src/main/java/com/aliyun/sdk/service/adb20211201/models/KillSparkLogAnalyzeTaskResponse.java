// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillSparkLogAnalyzeTaskResponse} extends {@link TeaModel}
 *
 * <p>KillSparkLogAnalyzeTaskResponse</p>
 */
public class KillSparkLogAnalyzeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KillSparkLogAnalyzeTaskResponseBody body;

    private KillSparkLogAnalyzeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KillSparkLogAnalyzeTaskResponse create() {
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
    public KillSparkLogAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillSparkLogAnalyzeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KillSparkLogAnalyzeTaskResponseBody body);

        @Override
        KillSparkLogAnalyzeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillSparkLogAnalyzeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KillSparkLogAnalyzeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillSparkLogAnalyzeTaskResponse response) {
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
        public Builder body(KillSparkLogAnalyzeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillSparkLogAnalyzeTaskResponse build() {
            return new KillSparkLogAnalyzeTaskResponse(this);
        } 

    } 

}
