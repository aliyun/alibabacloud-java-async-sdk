// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCycleTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateCycleTaskResponse</p>
 */
public class CreateCycleTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCycleTaskResponseBody body;

    private CreateCycleTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCycleTaskResponse create() {
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
    public CreateCycleTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCycleTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCycleTaskResponseBody body);

        @Override
        CreateCycleTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCycleTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCycleTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCycleTaskResponse response) {
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
        public Builder body(CreateCycleTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCycleTaskResponse build() {
            return new CreateCycleTaskResponse(this);
        } 

    } 

}
