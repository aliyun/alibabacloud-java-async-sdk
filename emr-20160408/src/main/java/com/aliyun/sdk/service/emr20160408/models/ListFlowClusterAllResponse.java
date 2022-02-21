// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowClusterAllResponse} extends {@link TeaModel}
 *
 * <p>ListFlowClusterAllResponse</p>
 */
public class ListFlowClusterAllResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowClusterAllResponseBody body;

    private ListFlowClusterAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowClusterAllResponse create() {
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
    public ListFlowClusterAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowClusterAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowClusterAllResponseBody body);

        @Override
        ListFlowClusterAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowClusterAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowClusterAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowClusterAllResponse response) {
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
        public Builder body(ListFlowClusterAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowClusterAllResponse build() {
            return new ListFlowClusterAllResponse(this);
        } 

    } 

}
