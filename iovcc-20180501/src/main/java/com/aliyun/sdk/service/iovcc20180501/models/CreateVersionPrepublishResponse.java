// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionPrepublishResponse} extends {@link TeaModel}
 *
 * <p>CreateVersionPrepublishResponse</p>
 */
public class CreateVersionPrepublishResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVersionPrepublishResponseBody body;

    private CreateVersionPrepublishResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVersionPrepublishResponse create() {
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
    public CreateVersionPrepublishResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVersionPrepublishResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVersionPrepublishResponseBody body);

        @Override
        CreateVersionPrepublishResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVersionPrepublishResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVersionPrepublishResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVersionPrepublishResponse response) {
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
        public Builder body(CreateVersionPrepublishResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVersionPrepublishResponse build() {
            return new CreateVersionPrepublishResponse(this);
        } 

    } 

}
