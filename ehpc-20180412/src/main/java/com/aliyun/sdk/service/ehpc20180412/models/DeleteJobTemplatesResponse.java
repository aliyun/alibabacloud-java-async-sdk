// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DeleteJobTemplatesResponse</p>
 */
public class DeleteJobTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteJobTemplatesResponseBody body;

    private DeleteJobTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteJobTemplatesResponse create() {
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
    public DeleteJobTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteJobTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteJobTemplatesResponseBody body);

        @Override
        DeleteJobTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteJobTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteJobTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteJobTemplatesResponse response) {
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
        public Builder body(DeleteJobTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteJobTemplatesResponse build() {
            return new DeleteJobTemplatesResponse(this);
        } 

    } 

}
