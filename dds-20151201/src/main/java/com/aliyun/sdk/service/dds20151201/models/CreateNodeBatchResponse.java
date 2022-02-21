// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeBatchResponse} extends {@link TeaModel}
 *
 * <p>CreateNodeBatchResponse</p>
 */
public class CreateNodeBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNodeBatchResponseBody body;

    private CreateNodeBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNodeBatchResponse create() {
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
    public CreateNodeBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNodeBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNodeBatchResponseBody body);

        @Override
        CreateNodeBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNodeBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNodeBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNodeBatchResponse response) {
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
        public Builder body(CreateNodeBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNodeBatchResponse build() {
            return new CreateNodeBatchResponse(this);
        } 

    } 

}
