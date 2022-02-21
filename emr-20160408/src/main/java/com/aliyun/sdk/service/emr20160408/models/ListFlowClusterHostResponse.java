// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowClusterHostResponse} extends {@link TeaModel}
 *
 * <p>ListFlowClusterHostResponse</p>
 */
public class ListFlowClusterHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowClusterHostResponseBody body;

    private ListFlowClusterHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowClusterHostResponse create() {
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
    public ListFlowClusterHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowClusterHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowClusterHostResponseBody body);

        @Override
        ListFlowClusterHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowClusterHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowClusterHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowClusterHostResponse response) {
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
        public Builder body(ListFlowClusterHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowClusterHostResponse build() {
            return new ListFlowClusterHostResponse(this);
        } 

    } 

}
