// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowProjectResponse} extends {@link TeaModel}
 *
 * <p>ListFlowProjectResponse</p>
 */
public class ListFlowProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowProjectResponseBody body;

    private ListFlowProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowProjectResponse create() {
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
    public ListFlowProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowProjectResponseBody body);

        @Override
        ListFlowProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowProjectResponse response) {
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
        public Builder body(ListFlowProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowProjectResponse build() {
            return new ListFlowProjectResponse(this);
        } 

    } 

}
