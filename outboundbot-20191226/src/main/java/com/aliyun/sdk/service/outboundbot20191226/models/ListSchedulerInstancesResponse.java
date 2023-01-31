// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulerInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListSchedulerInstancesResponse</p>
 */
public class ListSchedulerInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSchedulerInstancesResponseBody body;

    private ListSchedulerInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSchedulerInstancesResponse create() {
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
    public ListSchedulerInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSchedulerInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSchedulerInstancesResponseBody body);

        @Override
        ListSchedulerInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSchedulerInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSchedulerInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSchedulerInstancesResponse response) {
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
        public Builder body(ListSchedulerInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSchedulerInstancesResponse build() {
            return new ListSchedulerInstancesResponse(this);
        } 

    } 

}
