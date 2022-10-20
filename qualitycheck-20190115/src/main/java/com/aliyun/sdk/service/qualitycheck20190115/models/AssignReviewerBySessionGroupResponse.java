// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignReviewerBySessionGroupResponse} extends {@link TeaModel}
 *
 * <p>AssignReviewerBySessionGroupResponse</p>
 */
public class AssignReviewerBySessionGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignReviewerBySessionGroupResponseBody body;

    private AssignReviewerBySessionGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignReviewerBySessionGroupResponse create() {
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
    public AssignReviewerBySessionGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignReviewerBySessionGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignReviewerBySessionGroupResponseBody body);

        @Override
        AssignReviewerBySessionGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignReviewerBySessionGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignReviewerBySessionGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignReviewerBySessionGroupResponse response) {
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
        public Builder body(AssignReviewerBySessionGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignReviewerBySessionGroupResponse build() {
            return new AssignReviewerBySessionGroupResponse(this);
        } 

    } 

}
