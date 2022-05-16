// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrainingJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrainingJobResponse</p>
 */
public class DeleteTrainingJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrainingJobResponseBody body;

    private DeleteTrainingJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrainingJobResponse create() {
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
    public DeleteTrainingJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrainingJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrainingJobResponseBody body);

        @Override
        DeleteTrainingJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrainingJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrainingJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrainingJobResponse response) {
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
        public Builder body(DeleteTrainingJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrainingJobResponse build() {
            return new DeleteTrainingJobResponse(this);
        } 

    } 

}
