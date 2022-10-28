// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowResponse} extends {@link TeaModel}
 *
 * <p>ListTaskFlowResponse</p>
 */
public class ListTaskFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskFlowResponseBody body;

    private ListTaskFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskFlowResponse create() {
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
    public ListTaskFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskFlowResponseBody body);

        @Override
        ListTaskFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskFlowResponse response) {
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
        public Builder body(ListTaskFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskFlowResponse build() {
            return new ListTaskFlowResponse(this);
        } 

    } 

}
