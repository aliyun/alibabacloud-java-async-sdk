// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReportTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyReportTaskStatusResponse</p>
 */
public class ModifyReportTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyReportTaskStatusResponseBody body;

    private ModifyReportTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyReportTaskStatusResponse create() {
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
    public ModifyReportTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyReportTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyReportTaskStatusResponseBody body);

        @Override
        ModifyReportTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyReportTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyReportTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyReportTaskStatusResponse response) {
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
        public Builder body(ModifyReportTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyReportTaskStatusResponse build() {
            return new ModifyReportTaskStatusResponse(this);
        } 

    } 

}
