// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInferenceJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteInferenceJobResponse</p>
 */
public class DeleteInferenceJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInferenceJobResponseBody body;

    private DeleteInferenceJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInferenceJobResponse create() {
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
    public DeleteInferenceJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInferenceJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInferenceJobResponseBody body);

        @Override
        DeleteInferenceJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInferenceJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInferenceJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInferenceJobResponse response) {
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
        public Builder body(DeleteInferenceJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInferenceJobResponse build() {
            return new DeleteInferenceJobResponse(this);
        } 

    } 

}
