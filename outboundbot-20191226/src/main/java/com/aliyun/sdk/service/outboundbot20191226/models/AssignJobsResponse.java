// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignJobsResponse} extends {@link TeaModel}
 *
 * <p>AssignJobsResponse</p>
 */
public class AssignJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignJobsResponseBody body;

    private AssignJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignJobsResponse create() {
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
    public AssignJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignJobsResponseBody body);

        @Override
        AssignJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignJobsResponse response) {
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
        public Builder body(AssignJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignJobsResponse build() {
            return new AssignJobsResponse(this);
        } 

    } 

}
