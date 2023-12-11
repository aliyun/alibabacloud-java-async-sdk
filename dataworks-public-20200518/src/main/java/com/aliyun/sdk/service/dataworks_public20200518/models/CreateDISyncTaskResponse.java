// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDISyncTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateDISyncTaskResponse</p>
 */
public class CreateDISyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDISyncTaskResponseBody body;

    private CreateDISyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDISyncTaskResponse create() {
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
    public CreateDISyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDISyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDISyncTaskResponseBody body);

        @Override
        CreateDISyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDISyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDISyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDISyncTaskResponse response) {
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
        public Builder body(CreateDISyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDISyncTaskResponse build() {
            return new CreateDISyncTaskResponse(this);
        } 

    } 

}
