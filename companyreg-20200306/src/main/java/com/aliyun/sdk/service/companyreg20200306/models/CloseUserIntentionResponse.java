// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseUserIntentionResponse} extends {@link TeaModel}
 *
 * <p>CloseUserIntentionResponse</p>
 */
public class CloseUserIntentionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseUserIntentionResponseBody body;

    private CloseUserIntentionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseUserIntentionResponse create() {
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
    public CloseUserIntentionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseUserIntentionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseUserIntentionResponseBody body);

        @Override
        CloseUserIntentionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseUserIntentionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseUserIntentionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseUserIntentionResponse response) {
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
        public Builder body(CloseUserIntentionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseUserIntentionResponse build() {
            return new CloseUserIntentionResponse(this);
        } 

    } 

}
