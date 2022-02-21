// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemEffectionServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateProblemEffectionServiceResponse</p>
 */
public class CreateProblemEffectionServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProblemEffectionServiceResponseBody body;

    private CreateProblemEffectionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProblemEffectionServiceResponse create() {
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
    public CreateProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProblemEffectionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProblemEffectionServiceResponseBody body);

        @Override
        CreateProblemEffectionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProblemEffectionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProblemEffectionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProblemEffectionServiceResponse response) {
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
        public Builder body(CreateProblemEffectionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProblemEffectionServiceResponse build() {
            return new CreateProblemEffectionServiceResponse(this);
        } 

    } 

}
