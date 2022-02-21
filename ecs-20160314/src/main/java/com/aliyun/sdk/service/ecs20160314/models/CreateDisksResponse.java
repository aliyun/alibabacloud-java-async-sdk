// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDisksResponse} extends {@link TeaModel}
 *
 * <p>CreateDisksResponse</p>
 */
public class CreateDisksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDisksResponseBody body;

    private CreateDisksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDisksResponse create() {
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
    public CreateDisksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDisksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDisksResponseBody body);

        @Override
        CreateDisksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDisksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDisksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDisksResponse response) {
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
        public Builder body(CreateDisksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDisksResponse build() {
            return new CreateDisksResponse(this);
        } 

    } 

}
