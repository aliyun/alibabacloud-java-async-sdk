// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobsResponse} extends {@link TeaModel}
 *
 * <p>DeleteJobsResponse</p>
 */
public class DeleteJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteJobsResponseBody body;

    private DeleteJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteJobsResponse create() {
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
    public DeleteJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteJobsResponseBody body);

        @Override
        DeleteJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteJobsResponse response) {
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
        public Builder body(DeleteJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteJobsResponse build() {
            return new DeleteJobsResponse(this);
        } 

    } 

}
