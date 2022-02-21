// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemWorkFlowInfoResponse} extends {@link TeaModel}
 *
 * <p>GetWorkItemWorkFlowInfoResponse</p>
 */
public class GetWorkItemWorkFlowInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkItemWorkFlowInfoResponseBody body;

    private GetWorkItemWorkFlowInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkItemWorkFlowInfoResponse create() {
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
    public GetWorkItemWorkFlowInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkItemWorkFlowInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkItemWorkFlowInfoResponseBody body);

        @Override
        GetWorkItemWorkFlowInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkItemWorkFlowInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkItemWorkFlowInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkItemWorkFlowInfoResponse response) {
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
        public Builder body(GetWorkItemWorkFlowInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkItemWorkFlowInfoResponse build() {
            return new GetWorkItemWorkFlowInfoResponse(this);
        } 

    } 

}
