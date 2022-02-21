// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiStageVariableResponse} extends {@link TeaModel}
 *
 * <p>DeleteApiStageVariableResponse</p>
 */
public class DeleteApiStageVariableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApiStageVariableResponseBody body;

    private DeleteApiStageVariableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApiStageVariableResponse create() {
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
    public DeleteApiStageVariableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApiStageVariableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApiStageVariableResponseBody body);

        @Override
        DeleteApiStageVariableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApiStageVariableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApiStageVariableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApiStageVariableResponse response) {
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
        public Builder body(DeleteApiStageVariableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApiStageVariableResponse build() {
            return new DeleteApiStageVariableResponse(this);
        } 

    } 

}
