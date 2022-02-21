// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationWorkflowInstanceLogInfoResponse} extends {@link TeaModel}
 *
 * <p>GetMigrationWorkflowInstanceLogInfoResponse</p>
 */
public class GetMigrationWorkflowInstanceLogInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMigrationWorkflowInstanceLogInfoResponseBody body;

    private GetMigrationWorkflowInstanceLogInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMigrationWorkflowInstanceLogInfoResponse create() {
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
    public GetMigrationWorkflowInstanceLogInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMigrationWorkflowInstanceLogInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMigrationWorkflowInstanceLogInfoResponseBody body);

        @Override
        GetMigrationWorkflowInstanceLogInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMigrationWorkflowInstanceLogInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMigrationWorkflowInstanceLogInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMigrationWorkflowInstanceLogInfoResponse response) {
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
        public Builder body(GetMigrationWorkflowInstanceLogInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMigrationWorkflowInstanceLogInfoResponse build() {
            return new GetMigrationWorkflowInstanceLogInfoResponse(this);
        } 

    } 

}
