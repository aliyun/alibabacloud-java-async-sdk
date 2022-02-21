// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeInstanceContainerStatusResponse} extends {@link TeaModel}
 *
 * <p>ListFlowNodeInstanceContainerStatusResponse</p>
 */
public class ListFlowNodeInstanceContainerStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowNodeInstanceContainerStatusResponseBody body;

    private ListFlowNodeInstanceContainerStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowNodeInstanceContainerStatusResponse create() {
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
    public ListFlowNodeInstanceContainerStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowNodeInstanceContainerStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowNodeInstanceContainerStatusResponseBody body);

        @Override
        ListFlowNodeInstanceContainerStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowNodeInstanceContainerStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowNodeInstanceContainerStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowNodeInstanceContainerStatusResponse response) {
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
        public Builder body(ListFlowNodeInstanceContainerStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowNodeInstanceContainerStatusResponse build() {
            return new ListFlowNodeInstanceContainerStatusResponse(this);
        } 

    } 

}
