// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsageDetailDataExportTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateUsageDetailDataExportTaskResponse</p>
 */
public class CreateUsageDetailDataExportTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUsageDetailDataExportTaskResponseBody body;

    private CreateUsageDetailDataExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUsageDetailDataExportTaskResponse create() {
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
    public CreateUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUsageDetailDataExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUsageDetailDataExportTaskResponseBody body);

        @Override
        CreateUsageDetailDataExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUsageDetailDataExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUsageDetailDataExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUsageDetailDataExportTaskResponse response) {
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
        public Builder body(CreateUsageDetailDataExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUsageDetailDataExportTaskResponse build() {
            return new CreateUsageDetailDataExportTaskResponse(this);
        } 

    } 

}
