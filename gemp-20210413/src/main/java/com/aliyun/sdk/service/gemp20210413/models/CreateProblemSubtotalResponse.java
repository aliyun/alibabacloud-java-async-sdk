// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemSubtotalResponse} extends {@link TeaModel}
 *
 * <p>CreateProblemSubtotalResponse</p>
 */
public class CreateProblemSubtotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProblemSubtotalResponseBody body;

    private CreateProblemSubtotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProblemSubtotalResponse create() {
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
    public CreateProblemSubtotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProblemSubtotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProblemSubtotalResponseBody body);

        @Override
        CreateProblemSubtotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProblemSubtotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProblemSubtotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProblemSubtotalResponse response) {
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
        public Builder body(CreateProblemSubtotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProblemSubtotalResponse build() {
            return new CreateProblemSubtotalResponse(this);
        } 

    } 

}
