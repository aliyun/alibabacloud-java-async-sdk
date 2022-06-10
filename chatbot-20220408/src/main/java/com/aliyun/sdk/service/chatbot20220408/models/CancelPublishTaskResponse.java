// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPublishTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelPublishTaskResponse</p>
 */
public class CancelPublishTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPublishTaskResponseBody body;

    private CancelPublishTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPublishTaskResponse create() {
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
    public CancelPublishTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPublishTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPublishTaskResponseBody body);

        @Override
        CancelPublishTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPublishTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPublishTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPublishTaskResponse response) {
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
        public Builder body(CancelPublishTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPublishTaskResponse build() {
            return new CancelPublishTaskResponse(this);
        } 

    } 

}
