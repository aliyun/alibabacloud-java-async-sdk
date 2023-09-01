// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelVersionResponse} extends {@link TeaModel}
 *
 * <p>DeleteModelVersionResponse</p>
 */
public class DeleteModelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteModelVersionResponseBody body;

    private DeleteModelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteModelVersionResponse create() {
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
    public DeleteModelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteModelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteModelVersionResponseBody body);

        @Override
        DeleteModelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteModelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteModelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteModelVersionResponse response) {
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
        public Builder body(DeleteModelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteModelVersionResponse build() {
            return new DeleteModelVersionResponse(this);
        } 

    } 

}
