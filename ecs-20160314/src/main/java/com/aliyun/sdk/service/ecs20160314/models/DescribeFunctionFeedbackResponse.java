// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFunctionFeedbackResponse} extends {@link TeaModel}
 *
 * <p>DescribeFunctionFeedbackResponse</p>
 */
public class DescribeFunctionFeedbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFunctionFeedbackResponseBody body;

    private DescribeFunctionFeedbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFunctionFeedbackResponse create() {
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
    public DescribeFunctionFeedbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFunctionFeedbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFunctionFeedbackResponseBody body);

        @Override
        DescribeFunctionFeedbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFunctionFeedbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFunctionFeedbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFunctionFeedbackResponse response) {
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
        public Builder body(DescribeFunctionFeedbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFunctionFeedbackResponse build() {
            return new DescribeFunctionFeedbackResponse(this);
        } 

    } 

}
