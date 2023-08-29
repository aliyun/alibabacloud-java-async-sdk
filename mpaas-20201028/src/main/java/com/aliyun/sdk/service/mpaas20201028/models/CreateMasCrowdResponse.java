// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasCrowdResponse} extends {@link TeaModel}
 *
 * <p>CreateMasCrowdResponse</p>
 */
public class CreateMasCrowdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMasCrowdResponseBody body;

    private CreateMasCrowdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMasCrowdResponse create() {
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
    public CreateMasCrowdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMasCrowdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMasCrowdResponseBody body);

        @Override
        CreateMasCrowdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMasCrowdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMasCrowdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMasCrowdResponse response) {
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
        public Builder body(CreateMasCrowdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMasCrowdResponse build() {
            return new CreateMasCrowdResponse(this);
        } 

    } 

}
