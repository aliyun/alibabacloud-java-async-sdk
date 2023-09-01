// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatasetLabelsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDatasetLabelsResponse</p>
 */
public class DeleteDatasetLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDatasetLabelsResponseBody body;

    private DeleteDatasetLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDatasetLabelsResponse create() {
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
    public DeleteDatasetLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDatasetLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDatasetLabelsResponseBody body);

        @Override
        DeleteDatasetLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDatasetLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDatasetLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDatasetLabelsResponse response) {
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
        public Builder body(DeleteDatasetLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDatasetLabelsResponse build() {
            return new DeleteDatasetLabelsResponse(this);
        } 

    } 

}
