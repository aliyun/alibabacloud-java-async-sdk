// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiOutboundTaskBatchResponse} extends {@link TeaModel}
 *
 * <p>CreateAiOutboundTaskBatchResponse</p>
 */
public class CreateAiOutboundTaskBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAiOutboundTaskBatchResponseBody body;

    private CreateAiOutboundTaskBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAiOutboundTaskBatchResponse create() {
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
    public CreateAiOutboundTaskBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAiOutboundTaskBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAiOutboundTaskBatchResponseBody body);

        @Override
        CreateAiOutboundTaskBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAiOutboundTaskBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAiOutboundTaskBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAiOutboundTaskBatchResponse response) {
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
        public Builder body(CreateAiOutboundTaskBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAiOutboundTaskBatchResponse build() {
            return new CreateAiOutboundTaskBatchResponse(this);
        } 

    } 

}
