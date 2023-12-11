// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetaCollectionResponse} extends {@link TeaModel}
 *
 * <p>CreateMetaCollectionResponse</p>
 */
public class CreateMetaCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetaCollectionResponseBody body;

    private CreateMetaCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetaCollectionResponse create() {
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
    public CreateMetaCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetaCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetaCollectionResponseBody body);

        @Override
        CreateMetaCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetaCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetaCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetaCollectionResponse response) {
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
        public Builder body(CreateMetaCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetaCollectionResponse build() {
            return new CreateMetaCollectionResponse(this);
        } 

    } 

}
