// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitQualityCheckTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitQualityCheckTaskResponse</p>
 */
public class SubmitQualityCheckTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitQualityCheckTaskResponseBody body;

    private SubmitQualityCheckTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitQualityCheckTaskResponse create() {
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
    public SubmitQualityCheckTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitQualityCheckTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitQualityCheckTaskResponseBody body);

        @Override
        SubmitQualityCheckTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitQualityCheckTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitQualityCheckTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitQualityCheckTaskResponse response) {
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
        public Builder body(SubmitQualityCheckTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitQualityCheckTaskResponse build() {
            return new SubmitQualityCheckTaskResponse(this);
        } 

    } 

}
