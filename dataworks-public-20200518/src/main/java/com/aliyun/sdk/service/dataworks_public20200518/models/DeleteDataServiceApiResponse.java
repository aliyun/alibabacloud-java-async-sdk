// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataServiceApiResponse</p>
 */
public class DeleteDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataServiceApiResponseBody body;

    private DeleteDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataServiceApiResponse create() {
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
    public DeleteDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataServiceApiResponseBody body);

        @Override
        DeleteDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataServiceApiResponse response) {
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
        public Builder body(DeleteDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataServiceApiResponse build() {
            return new DeleteDataServiceApiResponse(this);
        } 

    } 

}
