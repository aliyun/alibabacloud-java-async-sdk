// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBImportTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateDBImportTaskResponse</p>
 */
public class CreateDBImportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBImportTaskResponseBody body;

    private CreateDBImportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBImportTaskResponse create() {
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
    public CreateDBImportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBImportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBImportTaskResponseBody body);

        @Override
        CreateDBImportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBImportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBImportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBImportTaskResponse response) {
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
        public Builder body(CreateDBImportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBImportTaskResponse build() {
            return new CreateDBImportTaskResponse(this);
        } 

    } 

}
