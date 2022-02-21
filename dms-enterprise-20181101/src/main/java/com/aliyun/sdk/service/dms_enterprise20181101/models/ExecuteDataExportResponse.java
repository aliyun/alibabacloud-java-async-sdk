// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteDataExportResponse} extends {@link TeaModel}
 *
 * <p>ExecuteDataExportResponse</p>
 */
public class ExecuteDataExportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteDataExportResponseBody body;

    private ExecuteDataExportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteDataExportResponse create() {
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
    public ExecuteDataExportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteDataExportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteDataExportResponseBody body);

        @Override
        ExecuteDataExportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteDataExportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteDataExportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteDataExportResponse response) {
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
        public Builder body(ExecuteDataExportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteDataExportResponse build() {
            return new ExecuteDataExportResponse(this);
        } 

    } 

}
