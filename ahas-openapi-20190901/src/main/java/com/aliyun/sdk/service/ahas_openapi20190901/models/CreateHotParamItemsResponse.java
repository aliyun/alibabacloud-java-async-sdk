// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotParamItemsResponse} extends {@link TeaModel}
 *
 * <p>CreateHotParamItemsResponse</p>
 */
public class CreateHotParamItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHotParamItemsResponseBody body;

    private CreateHotParamItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHotParamItemsResponse create() {
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
    public CreateHotParamItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHotParamItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHotParamItemsResponseBody body);

        @Override
        CreateHotParamItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHotParamItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHotParamItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHotParamItemsResponse response) {
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
        public Builder body(CreateHotParamItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHotParamItemsResponse build() {
            return new CreateHotParamItemsResponse(this);
        } 

    } 

}
