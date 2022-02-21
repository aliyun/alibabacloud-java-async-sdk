// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneFlowResponse} extends {@link TeaModel}
 *
 * <p>CloneFlowResponse</p>
 */
public class CloneFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloneFlowResponseBody body;

    private CloneFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloneFlowResponse create() {
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
    public CloneFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloneFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloneFlowResponseBody body);

        @Override
        CloneFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloneFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloneFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloneFlowResponse response) {
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
        public Builder body(CloneFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloneFlowResponse build() {
            return new CloneFlowResponse(this);
        } 

    } 

}
