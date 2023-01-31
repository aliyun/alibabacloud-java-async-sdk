// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitScriptReviewResponse} extends {@link TeaModel}
 *
 * <p>SubmitScriptReviewResponse</p>
 */
public class SubmitScriptReviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitScriptReviewResponseBody body;

    private SubmitScriptReviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitScriptReviewResponse create() {
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
    public SubmitScriptReviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitScriptReviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitScriptReviewResponseBody body);

        @Override
        SubmitScriptReviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitScriptReviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitScriptReviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitScriptReviewResponse response) {
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
        public Builder body(SubmitScriptReviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitScriptReviewResponse build() {
            return new SubmitScriptReviewResponse(this);
        } 

    } 

}
