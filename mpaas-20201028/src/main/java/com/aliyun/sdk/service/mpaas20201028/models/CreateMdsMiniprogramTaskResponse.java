// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMdsMiniprogramTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateMdsMiniprogramTaskResponse</p>
 */
public class CreateMdsMiniprogramTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMdsMiniprogramTaskResponseBody body;

    private CreateMdsMiniprogramTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMdsMiniprogramTaskResponse create() {
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
    public CreateMdsMiniprogramTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMdsMiniprogramTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMdsMiniprogramTaskResponseBody body);

        @Override
        CreateMdsMiniprogramTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMdsMiniprogramTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMdsMiniprogramTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMdsMiniprogramTaskResponse response) {
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
        public Builder body(CreateMdsMiniprogramTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMdsMiniprogramTaskResponse build() {
            return new CreateMdsMiniprogramTaskResponse(this);
        } 

    } 

}
