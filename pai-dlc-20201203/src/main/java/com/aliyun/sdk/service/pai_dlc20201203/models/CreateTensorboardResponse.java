// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTensorboardResponse} extends {@link TeaModel}
 *
 * <p>CreateTensorboardResponse</p>
 */
public class CreateTensorboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTensorboardResponseBody body;

    private CreateTensorboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTensorboardResponse create() {
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
    public CreateTensorboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTensorboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTensorboardResponseBody body);

        @Override
        CreateTensorboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTensorboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTensorboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTensorboardResponse response) {
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
        public Builder body(CreateTensorboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTensorboardResponse build() {
            return new CreateTensorboardResponse(this);
        } 

    } 

}
