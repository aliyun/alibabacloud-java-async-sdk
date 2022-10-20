// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertAssignedSessionGroupResponse} extends {@link TeaModel}
 *
 * <p>RevertAssignedSessionGroupResponse</p>
 */
public class RevertAssignedSessionGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevertAssignedSessionGroupResponseBody body;

    private RevertAssignedSessionGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevertAssignedSessionGroupResponse create() {
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
    public RevertAssignedSessionGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevertAssignedSessionGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevertAssignedSessionGroupResponseBody body);

        @Override
        RevertAssignedSessionGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevertAssignedSessionGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevertAssignedSessionGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevertAssignedSessionGroupResponse response) {
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
        public Builder body(RevertAssignedSessionGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevertAssignedSessionGroupResponse build() {
            return new RevertAssignedSessionGroupResponse(this);
        } 

    } 

}
