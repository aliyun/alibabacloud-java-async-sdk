// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCollectionResponse} extends {@link TeaModel}
 *
 * <p>CreateDataCollectionResponse</p>
 */
public class CreateDataCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataCollectionResponseBody body;

    private CreateDataCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataCollectionResponse create() {
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
    public CreateDataCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataCollectionResponseBody body);

        @Override
        CreateDataCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataCollectionResponse response) {
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
        public Builder body(CreateDataCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataCollectionResponse build() {
            return new CreateDataCollectionResponse(this);
        } 

    } 

}
