// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetWorkflowInstanceResponse</p>
 */
public class GetWorkflowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkflowInstanceResponseBody body;

    private GetWorkflowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkflowInstanceResponse create() {
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
    public GetWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkflowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkflowInstanceResponseBody body);

        @Override
        GetWorkflowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkflowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkflowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkflowInstanceResponse response) {
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
        public Builder body(GetWorkflowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkflowInstanceResponse build() {
            return new GetWorkflowInstanceResponse(this);
        } 

    } 

}
