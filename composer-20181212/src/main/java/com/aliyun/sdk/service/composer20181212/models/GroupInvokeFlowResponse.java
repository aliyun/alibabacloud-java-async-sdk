// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupInvokeFlowResponse} extends {@link TeaModel}
 *
 * <p>GroupInvokeFlowResponse</p>
 */
public class GroupInvokeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GroupInvokeFlowResponseBody body;

    private GroupInvokeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GroupInvokeFlowResponse create() {
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
    public GroupInvokeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GroupInvokeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GroupInvokeFlowResponseBody body);

        @Override
        GroupInvokeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GroupInvokeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GroupInvokeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GroupInvokeFlowResponse response) {
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
        public Builder body(GroupInvokeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GroupInvokeFlowResponse build() {
            return new GroupInvokeFlowResponse(this);
        } 

    } 

}
