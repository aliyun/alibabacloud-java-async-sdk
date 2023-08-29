// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpenSingleDataResponse} extends {@link TeaModel}
 *
 * <p>CreateOpenSingleDataResponse</p>
 */
public class CreateOpenSingleDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOpenSingleDataResponseBody body;

    private CreateOpenSingleDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOpenSingleDataResponse create() {
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
    public CreateOpenSingleDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOpenSingleDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOpenSingleDataResponseBody body);

        @Override
        CreateOpenSingleDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOpenSingleDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOpenSingleDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOpenSingleDataResponse response) {
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
        public Builder body(CreateOpenSingleDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOpenSingleDataResponse build() {
            return new CreateOpenSingleDataResponse(this);
        } 

    } 

}
