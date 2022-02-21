// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowProjectUserResponse} extends {@link TeaModel}
 *
 * <p>ListFlowProjectUserResponse</p>
 */
public class ListFlowProjectUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowProjectUserResponseBody body;

    private ListFlowProjectUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowProjectUserResponse create() {
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
    public ListFlowProjectUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowProjectUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowProjectUserResponseBody body);

        @Override
        ListFlowProjectUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowProjectUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowProjectUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowProjectUserResponse response) {
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
        public Builder body(ListFlowProjectUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowProjectUserResponse build() {
            return new ListFlowProjectUserResponse(this);
        } 

    } 

}
