// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCollectionResponse} extends {@link TeaModel}
 *
 * <p>CreateCollectionResponse</p>
 */
public class CreateCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCollectionResponseBody body;

    private CreateCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCollectionResponse create() {
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
    public CreateCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCollectionResponseBody body);

        @Override
        CreateCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCollectionResponse response) {
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
        public Builder body(CreateCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCollectionResponse build() {
            return new CreateCollectionResponse(this);
        } 

    } 

}
