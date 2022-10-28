// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowTimeVariablesResponse} extends {@link TeaModel}
 *
 * <p>ListTaskFlowTimeVariablesResponse</p>
 */
public class ListTaskFlowTimeVariablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskFlowTimeVariablesResponseBody body;

    private ListTaskFlowTimeVariablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskFlowTimeVariablesResponse create() {
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
    public ListTaskFlowTimeVariablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskFlowTimeVariablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskFlowTimeVariablesResponseBody body);

        @Override
        ListTaskFlowTimeVariablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskFlowTimeVariablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskFlowTimeVariablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskFlowTimeVariablesResponse response) {
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
        public Builder body(ListTaskFlowTimeVariablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskFlowTimeVariablesResponse build() {
            return new ListTaskFlowTimeVariablesResponse(this);
        } 

    } 

}
