// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDataCollectionResponse} extends {@link TeaModel}
 *
 * <p>RemoveDataCollectionResponse</p>
 */
public class RemoveDataCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveDataCollectionResponseBody body;

    private RemoveDataCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveDataCollectionResponse create() {
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
    public RemoveDataCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveDataCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveDataCollectionResponseBody body);

        @Override
        RemoveDataCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveDataCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveDataCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveDataCollectionResponse response) {
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
        public Builder body(RemoveDataCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveDataCollectionResponse build() {
            return new RemoveDataCollectionResponse(this);
        } 

    } 

}
