// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowResponse} extends {@link TeaModel}
 *
 * <p>ListFlowResponse</p>
 */
public class ListFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowResponseBody body;

    private ListFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowResponse create() {
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
    public ListFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowResponseBody body);

        @Override
        ListFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowResponse response) {
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
        public Builder body(ListFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowResponse build() {
            return new ListFlowResponse(this);
        } 

    } 

}
