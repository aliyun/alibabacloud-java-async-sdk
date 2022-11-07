// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpsItemResponse} extends {@link TeaModel}
 *
 * <p>CreateOpsItemResponse</p>
 */
public class CreateOpsItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOpsItemResponseBody body;

    private CreateOpsItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOpsItemResponse create() {
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
    public CreateOpsItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOpsItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOpsItemResponseBody body);

        @Override
        CreateOpsItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOpsItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOpsItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOpsItemResponse response) {
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
        public Builder body(CreateOpsItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOpsItemResponse build() {
            return new CreateOpsItemResponse(this);
        } 

    } 

}
