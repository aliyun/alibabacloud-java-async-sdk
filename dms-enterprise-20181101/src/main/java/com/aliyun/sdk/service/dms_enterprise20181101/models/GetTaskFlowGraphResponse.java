// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskFlowGraphResponse} extends {@link TeaModel}
 *
 * <p>GetTaskFlowGraphResponse</p>
 */
public class GetTaskFlowGraphResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskFlowGraphResponseBody body;

    private GetTaskFlowGraphResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskFlowGraphResponse create() {
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
    public GetTaskFlowGraphResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskFlowGraphResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskFlowGraphResponseBody body);

        @Override
        GetTaskFlowGraphResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskFlowGraphResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskFlowGraphResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskFlowGraphResponse response) {
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
        public Builder body(GetTaskFlowGraphResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskFlowGraphResponse build() {
            return new GetTaskFlowGraphResponse(this);
        } 

    } 

}
