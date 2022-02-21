// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIImageJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitAIImageJobResponse</p>
 */
public class SubmitAIImageJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAIImageJobResponseBody body;

    private SubmitAIImageJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAIImageJobResponse create() {
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
    public SubmitAIImageJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAIImageJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAIImageJobResponseBody body);

        @Override
        SubmitAIImageJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAIImageJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAIImageJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAIImageJobResponse response) {
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
        public Builder body(SubmitAIImageJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAIImageJobResponse build() {
            return new SubmitAIImageJobResponse(this);
        } 

    } 

}
