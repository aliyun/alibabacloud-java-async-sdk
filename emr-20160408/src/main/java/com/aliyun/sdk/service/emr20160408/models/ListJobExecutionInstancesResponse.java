// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutionInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListJobExecutionInstancesResponse</p>
 */
public class ListJobExecutionInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobExecutionInstancesResponseBody body;

    private ListJobExecutionInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobExecutionInstancesResponse create() {
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
    public ListJobExecutionInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobExecutionInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobExecutionInstancesResponseBody body);

        @Override
        ListJobExecutionInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobExecutionInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobExecutionInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobExecutionInstancesResponse response) {
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
        public Builder body(ListJobExecutionInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobExecutionInstancesResponse build() {
            return new ListJobExecutionInstancesResponse(this);
        } 

    } 

}
