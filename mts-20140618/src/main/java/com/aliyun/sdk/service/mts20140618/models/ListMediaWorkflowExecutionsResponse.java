// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaWorkflowExecutionsResponse} extends {@link TeaModel}
 *
 * <p>ListMediaWorkflowExecutionsResponse</p>
 */
public class ListMediaWorkflowExecutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMediaWorkflowExecutionsResponseBody body;

    private ListMediaWorkflowExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMediaWorkflowExecutionsResponse create() {
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
    public ListMediaWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMediaWorkflowExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMediaWorkflowExecutionsResponseBody body);

        @Override
        ListMediaWorkflowExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMediaWorkflowExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMediaWorkflowExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMediaWorkflowExecutionsResponse response) {
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
        public Builder body(ListMediaWorkflowExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMediaWorkflowExecutionsResponse build() {
            return new ListMediaWorkflowExecutionsResponse(this);
        } 

    } 

}
