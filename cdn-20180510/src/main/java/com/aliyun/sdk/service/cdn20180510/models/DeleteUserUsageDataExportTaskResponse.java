// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserUsageDataExportTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserUsageDataExportTaskResponse</p>
 */
public class DeleteUserUsageDataExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserUsageDataExportTaskResponseBody body;

    private DeleteUserUsageDataExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserUsageDataExportTaskResponse create() {
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
    public DeleteUserUsageDataExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserUsageDataExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserUsageDataExportTaskResponseBody body);

        @Override
        DeleteUserUsageDataExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserUsageDataExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserUsageDataExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserUsageDataExportTaskResponse response) {
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
        public Builder body(DeleteUserUsageDataExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserUsageDataExportTaskResponse build() {
            return new DeleteUserUsageDataExportTaskResponse(this);
        } 

    } 

}
