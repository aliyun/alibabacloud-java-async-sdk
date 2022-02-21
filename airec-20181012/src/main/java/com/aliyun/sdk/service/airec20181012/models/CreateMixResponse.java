// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMixResponse} extends {@link TeaModel}
 *
 * <p>CreateMixResponse</p>
 */
public class CreateMixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMixResponseBody body;

    private CreateMixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMixResponse create() {
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
    public CreateMixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMixResponseBody body);

        @Override
        CreateMixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMixResponse response) {
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
        public Builder body(CreateMixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMixResponse build() {
            return new CreateMixResponse(this);
        } 

    } 

}
