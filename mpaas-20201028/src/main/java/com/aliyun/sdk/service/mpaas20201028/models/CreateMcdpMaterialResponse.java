// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcdpMaterialResponse} extends {@link TeaModel}
 *
 * <p>CreateMcdpMaterialResponse</p>
 */
public class CreateMcdpMaterialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcdpMaterialResponseBody body;

    private CreateMcdpMaterialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcdpMaterialResponse create() {
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
    public CreateMcdpMaterialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcdpMaterialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcdpMaterialResponseBody body);

        @Override
        CreateMcdpMaterialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcdpMaterialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcdpMaterialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcdpMaterialResponse response) {
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
        public Builder body(CreateMcdpMaterialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcdpMaterialResponse build() {
            return new CreateMcdpMaterialResponse(this);
        } 

    } 

}
