// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDtsJobsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDtsJobsResponse</p>
 */
public class DeleteDtsJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDtsJobsResponseBody body;

    private DeleteDtsJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDtsJobsResponse create() {
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
    public DeleteDtsJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDtsJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDtsJobsResponseBody body);

        @Override
        DeleteDtsJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDtsJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDtsJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDtsJobsResponse response) {
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
        public Builder body(DeleteDtsJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDtsJobsResponse build() {
            return new DeleteDtsJobsResponse(this);
        } 

    } 

}
