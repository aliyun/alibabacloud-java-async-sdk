// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateOutboundTaskResponse</p>
 */
public class CreateOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOutboundTaskResponseBody body;

    private CreateOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOutboundTaskResponse create() {
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
    public CreateOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOutboundTaskResponseBody body);

        @Override
        CreateOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOutboundTaskResponse response) {
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
        public Builder body(CreateOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOutboundTaskResponse build() {
            return new CreateOutboundTaskResponse(this);
        } 

    } 

}
