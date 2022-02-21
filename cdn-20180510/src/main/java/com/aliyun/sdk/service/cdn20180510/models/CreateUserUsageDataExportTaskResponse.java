// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserUsageDataExportTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateUserUsageDataExportTaskResponse</p>
 */
public class CreateUserUsageDataExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserUsageDataExportTaskResponseBody body;

    private CreateUserUsageDataExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserUsageDataExportTaskResponse create() {
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
    public CreateUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserUsageDataExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserUsageDataExportTaskResponseBody body);

        @Override
        CreateUserUsageDataExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserUsageDataExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserUsageDataExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserUsageDataExportTaskResponse response) {
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
        public Builder body(CreateUserUsageDataExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserUsageDataExportTaskResponse build() {
            return new CreateUserUsageDataExportTaskResponse(this);
        } 

    } 

}
