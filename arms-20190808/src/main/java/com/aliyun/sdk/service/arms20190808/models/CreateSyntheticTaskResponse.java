// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSyntheticTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateSyntheticTaskResponse</p>
 */
public class CreateSyntheticTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSyntheticTaskResponseBody body;

    private CreateSyntheticTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSyntheticTaskResponse create() {
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
    public CreateSyntheticTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSyntheticTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSyntheticTaskResponseBody body);

        @Override
        CreateSyntheticTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSyntheticTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSyntheticTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSyntheticTaskResponse response) {
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
        public Builder body(CreateSyntheticTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSyntheticTaskResponse build() {
            return new CreateSyntheticTaskResponse(this);
        } 

    } 

}
