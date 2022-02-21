// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecordsResponse} extends {@link TeaModel}
 *
 * <p>DeleteRecordsResponse</p>
 */
public class DeleteRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRecordsResponseBody body;

    private DeleteRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRecordsResponse create() {
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
    public DeleteRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRecordsResponseBody body);

        @Override
        DeleteRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRecordsResponse response) {
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
        public Builder body(DeleteRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRecordsResponse build() {
            return new DeleteRecordsResponse(this);
        } 

    } 

}
