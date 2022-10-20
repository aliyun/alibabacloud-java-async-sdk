// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityCheckSchemeResponse} extends {@link TeaModel}
 *
 * <p>DeleteQualityCheckSchemeResponse</p>
 */
public class DeleteQualityCheckSchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQualityCheckSchemeResponseBody body;

    private DeleteQualityCheckSchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQualityCheckSchemeResponse create() {
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
    public DeleteQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQualityCheckSchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQualityCheckSchemeResponseBody body);

        @Override
        DeleteQualityCheckSchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQualityCheckSchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQualityCheckSchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQualityCheckSchemeResponse response) {
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
        public Builder body(DeleteQualityCheckSchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQualityCheckSchemeResponse build() {
            return new DeleteQualityCheckSchemeResponse(this);
        } 

    } 

}
