// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityEntityResponse} extends {@link TeaModel}
 *
 * <p>DeleteQualityEntityResponse</p>
 */
public class DeleteQualityEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQualityEntityResponseBody body;

    private DeleteQualityEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQualityEntityResponse create() {
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
    public DeleteQualityEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQualityEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQualityEntityResponseBody body);

        @Override
        DeleteQualityEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQualityEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQualityEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQualityEntityResponse response) {
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
        public Builder body(DeleteQualityEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQualityEntityResponse build() {
            return new DeleteQualityEntityResponse(this);
        } 

    } 

}
