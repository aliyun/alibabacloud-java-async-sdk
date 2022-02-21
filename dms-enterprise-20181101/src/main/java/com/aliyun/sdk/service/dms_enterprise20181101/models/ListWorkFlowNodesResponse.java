// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkFlowNodesResponse} extends {@link TeaModel}
 *
 * <p>ListWorkFlowNodesResponse</p>
 */
public class ListWorkFlowNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkFlowNodesResponseBody body;

    private ListWorkFlowNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkFlowNodesResponse create() {
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
    public ListWorkFlowNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkFlowNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkFlowNodesResponseBody body);

        @Override
        ListWorkFlowNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkFlowNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkFlowNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkFlowNodesResponse response) {
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
        public Builder body(ListWorkFlowNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkFlowNodesResponse build() {
            return new ListWorkFlowNodesResponse(this);
        } 

    } 

}
