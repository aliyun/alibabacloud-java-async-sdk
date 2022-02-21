// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStoreResponse} extends {@link TeaModel}
 *
 * <p>UpdateStoreResponse</p>
 */
public class UpdateStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStoreResponseBody body;

    private UpdateStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStoreResponse create() {
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
    public UpdateStoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStoreResponseBody body);

        @Override
        UpdateStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStoreResponse response) {
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
        public Builder body(UpdateStoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStoreResponse build() {
            return new UpdateStoreResponse(this);
        } 

    } 

}
