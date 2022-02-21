// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListFlowNodeInstanceResponse</p>
 */
public class ListFlowNodeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowNodeInstanceResponseBody body;

    private ListFlowNodeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowNodeInstanceResponse create() {
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
    public ListFlowNodeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowNodeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowNodeInstanceResponseBody body);

        @Override
        ListFlowNodeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowNodeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowNodeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowNodeInstanceResponse response) {
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
        public Builder body(ListFlowNodeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowNodeInstanceResponse build() {
            return new ListFlowNodeInstanceResponse(this);
        } 

    } 

}
