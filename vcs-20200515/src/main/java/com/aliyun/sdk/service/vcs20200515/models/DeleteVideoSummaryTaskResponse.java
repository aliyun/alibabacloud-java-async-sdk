// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoSummaryTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteVideoSummaryTaskResponse</p>
 */
public class DeleteVideoSummaryTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVideoSummaryTaskResponseBody body;

    private DeleteVideoSummaryTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVideoSummaryTaskResponse create() {
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
    public DeleteVideoSummaryTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVideoSummaryTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVideoSummaryTaskResponseBody body);

        @Override
        DeleteVideoSummaryTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVideoSummaryTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVideoSummaryTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVideoSummaryTaskResponse response) {
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
        public Builder body(DeleteVideoSummaryTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVideoSummaryTaskResponse build() {
            return new DeleteVideoSummaryTaskResponse(this);
        } 

    } 

}
