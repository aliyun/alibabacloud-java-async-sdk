// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTaskFlowStatusResponse} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTaskFlowStatusResponse</p>
 */
public class ListDevopsProjectTaskFlowStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevopsProjectTaskFlowStatusResponseBody body;

    private ListDevopsProjectTaskFlowStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevopsProjectTaskFlowStatusResponse create() {
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
    public ListDevopsProjectTaskFlowStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevopsProjectTaskFlowStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevopsProjectTaskFlowStatusResponseBody body);

        @Override
        ListDevopsProjectTaskFlowStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevopsProjectTaskFlowStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevopsProjectTaskFlowStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevopsProjectTaskFlowStatusResponse response) {
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
        public Builder body(ListDevopsProjectTaskFlowStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevopsProjectTaskFlowStatusResponse build() {
            return new ListDevopsProjectTaskFlowStatusResponse(this);
        } 

    } 

}
