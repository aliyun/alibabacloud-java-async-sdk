// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemEffectionServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteProblemEffectionServiceResponse</p>
 */
public class DeleteProblemEffectionServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProblemEffectionServiceResponseBody body;

    private DeleteProblemEffectionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProblemEffectionServiceResponse create() {
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
    public DeleteProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProblemEffectionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProblemEffectionServiceResponseBody body);

        @Override
        DeleteProblemEffectionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProblemEffectionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProblemEffectionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProblemEffectionServiceResponse response) {
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
        public Builder body(DeleteProblemEffectionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProblemEffectionServiceResponse build() {
            return new DeleteProblemEffectionServiceResponse(this);
        } 

    } 

}
