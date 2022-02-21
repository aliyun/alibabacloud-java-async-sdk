// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishContactFlowVersionResponse} extends {@link TeaModel}
 *
 * <p>PublishContactFlowVersionResponse</p>
 */
public class PublishContactFlowVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishContactFlowVersionResponseBody body;

    private PublishContactFlowVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishContactFlowVersionResponse create() {
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
    public PublishContactFlowVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishContactFlowVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishContactFlowVersionResponseBody body);

        @Override
        PublishContactFlowVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishContactFlowVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishContactFlowVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishContactFlowVersionResponse response) {
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
        public Builder body(PublishContactFlowVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishContactFlowVersionResponse build() {
            return new PublishContactFlowVersionResponse(this);
        } 

    } 

}
