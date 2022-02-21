// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCallTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateCallTaskResponse</p>
 */
public class CreateCallTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCallTaskResponseBody body;

    private CreateCallTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCallTaskResponse create() {
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
    public CreateCallTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCallTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCallTaskResponseBody body);

        @Override
        CreateCallTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCallTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCallTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCallTaskResponse response) {
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
        public Builder body(CreateCallTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCallTaskResponse build() {
            return new CreateCallTaskResponse(this);
        } 

    } 

}
