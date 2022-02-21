// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDtsJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteDtsJobResponse</p>
 */
public class DeleteDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDtsJobResponseBody body;

    private DeleteDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDtsJobResponse create() {
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
    public DeleteDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDtsJobResponseBody body);

        @Override
        DeleteDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDtsJobResponse response) {
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
        public Builder body(DeleteDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDtsJobResponse build() {
            return new DeleteDtsJobResponse(this);
        } 

    } 

}
