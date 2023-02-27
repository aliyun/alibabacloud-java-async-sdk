// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPredictiveCallResponse} extends {@link TeaModel}
 *
 * <p>StartPredictiveCallResponse</p>
 */
public class StartPredictiveCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartPredictiveCallResponseBody body;

    private StartPredictiveCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartPredictiveCallResponse create() {
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
    public StartPredictiveCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartPredictiveCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartPredictiveCallResponseBody body);

        @Override
        StartPredictiveCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartPredictiveCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartPredictiveCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartPredictiveCallResponse response) {
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
        public Builder body(StartPredictiveCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartPredictiveCallResponse build() {
            return new StartPredictiveCallResponse(this);
        } 

    } 

}
