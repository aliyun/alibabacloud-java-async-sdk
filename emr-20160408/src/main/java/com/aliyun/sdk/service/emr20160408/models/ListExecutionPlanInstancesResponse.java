// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionPlanInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListExecutionPlanInstancesResponse</p>
 */
public class ListExecutionPlanInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExecutionPlanInstancesResponseBody body;

    private ListExecutionPlanInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExecutionPlanInstancesResponse create() {
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
    public ListExecutionPlanInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExecutionPlanInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExecutionPlanInstancesResponseBody body);

        @Override
        ListExecutionPlanInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExecutionPlanInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExecutionPlanInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExecutionPlanInstancesResponse response) {
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
        public Builder body(ListExecutionPlanInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExecutionPlanInstancesResponse build() {
            return new ListExecutionPlanInstancesResponse(this);
        } 

    } 

}
