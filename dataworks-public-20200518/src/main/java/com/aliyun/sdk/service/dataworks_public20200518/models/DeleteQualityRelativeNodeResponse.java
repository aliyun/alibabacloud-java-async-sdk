// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityRelativeNodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteQualityRelativeNodeResponse</p>
 */
public class DeleteQualityRelativeNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQualityRelativeNodeResponseBody body;

    private DeleteQualityRelativeNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQualityRelativeNodeResponse create() {
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
    public DeleteQualityRelativeNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQualityRelativeNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQualityRelativeNodeResponseBody body);

        @Override
        DeleteQualityRelativeNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQualityRelativeNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQualityRelativeNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQualityRelativeNodeResponse response) {
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
        public Builder body(DeleteQualityRelativeNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQualityRelativeNodeResponse build() {
            return new DeleteQualityRelativeNodeResponse(this);
        } 

    } 

}
