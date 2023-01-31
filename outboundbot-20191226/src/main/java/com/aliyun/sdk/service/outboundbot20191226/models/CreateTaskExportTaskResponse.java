// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskExportTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateTaskExportTaskResponse</p>
 */
public class CreateTaskExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTaskExportTaskResponseBody body;

    private CreateTaskExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTaskExportTaskResponse create() {
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
    public CreateTaskExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTaskExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTaskExportTaskResponseBody body);

        @Override
        CreateTaskExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTaskExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTaskExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTaskExportTaskResponse response) {
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
        public Builder body(CreateTaskExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskExportTaskResponse build() {
            return new CreateTaskExportTaskResponse(this);
        } 

    } 

}
