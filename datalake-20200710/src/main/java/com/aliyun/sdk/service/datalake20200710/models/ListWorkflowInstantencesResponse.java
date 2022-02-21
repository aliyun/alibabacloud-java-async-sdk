// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstantencesResponse} extends {@link TeaModel}
 *
 * <p>ListWorkflowInstantencesResponse</p>
 */
public class ListWorkflowInstantencesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkflowInstantencesResponseBody body;

    private ListWorkflowInstantencesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkflowInstantencesResponse create() {
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
    public ListWorkflowInstantencesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkflowInstantencesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkflowInstantencesResponseBody body);

        @Override
        ListWorkflowInstantencesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkflowInstantencesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkflowInstantencesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkflowInstantencesResponse response) {
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
        public Builder body(ListWorkflowInstantencesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkflowInstantencesResponse build() {
            return new ListWorkflowInstantencesResponse(this);
        } 

    } 

}
