// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueInstancePublishTaskResponse} extends {@link TeaModel}
 *
 * <p>ContinueInstancePublishTaskResponse</p>
 */
public class ContinueInstancePublishTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinueInstancePublishTaskResponseBody body;

    private ContinueInstancePublishTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinueInstancePublishTaskResponse create() {
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
    public ContinueInstancePublishTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinueInstancePublishTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinueInstancePublishTaskResponseBody body);

        @Override
        ContinueInstancePublishTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinueInstancePublishTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinueInstancePublishTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinueInstancePublishTaskResponse response) {
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
        public Builder body(ContinueInstancePublishTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinueInstancePublishTaskResponse build() {
            return new ContinueInstancePublishTaskResponse(this);
        } 

    } 

}
