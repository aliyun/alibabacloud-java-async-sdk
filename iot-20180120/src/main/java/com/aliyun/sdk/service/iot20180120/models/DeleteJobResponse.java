// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteJobResponse</p>
 */
public class DeleteJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteJobResponseBody body;

    private DeleteJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteJobResponse create() {
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
    public DeleteJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteJobResponseBody body);

        @Override
        DeleteJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteJobResponse response) {
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
        public Builder body(DeleteJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteJobResponse build() {
            return new DeleteJobResponse(this);
        } 

    } 

}
