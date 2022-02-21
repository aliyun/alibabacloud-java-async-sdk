// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemWorkFlowStatusResponse} extends {@link TeaModel}
 *
 * <p>ListWorkItemWorkFlowStatusResponse</p>
 */
public class ListWorkItemWorkFlowStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkItemWorkFlowStatusResponseBody body;

    private ListWorkItemWorkFlowStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkItemWorkFlowStatusResponse create() {
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
    public ListWorkItemWorkFlowStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkItemWorkFlowStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkItemWorkFlowStatusResponseBody body);

        @Override
        ListWorkItemWorkFlowStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkItemWorkFlowStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkItemWorkFlowStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkItemWorkFlowStatusResponse response) {
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
        public Builder body(ListWorkItemWorkFlowStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkItemWorkFlowStatusResponse build() {
            return new ListWorkItemWorkFlowStatusResponse(this);
        } 

    } 

}
