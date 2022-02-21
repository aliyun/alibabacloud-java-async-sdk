// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteQualityProjectResponse</p>
 */
public class DeleteQualityProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQualityProjectResponseBody body;

    private DeleteQualityProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQualityProjectResponse create() {
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
    public DeleteQualityProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQualityProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQualityProjectResponseBody body);

        @Override
        DeleteQualityProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQualityProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQualityProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQualityProjectResponse response) {
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
        public Builder body(DeleteQualityProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQualityProjectResponse build() {
            return new DeleteQualityProjectResponse(this);
        } 

    } 

}
