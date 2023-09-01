// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelVersionLabelsResponse} extends {@link TeaModel}
 *
 * <p>DeleteModelVersionLabelsResponse</p>
 */
public class DeleteModelVersionLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteModelVersionLabelsResponseBody body;

    private DeleteModelVersionLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteModelVersionLabelsResponse create() {
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
    public DeleteModelVersionLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteModelVersionLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteModelVersionLabelsResponseBody body);

        @Override
        DeleteModelVersionLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteModelVersionLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteModelVersionLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteModelVersionLabelsResponse response) {
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
        public Builder body(DeleteModelVersionLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteModelVersionLabelsResponse build() {
            return new DeleteModelVersionLabelsResponse(this);
        } 

    } 

}
