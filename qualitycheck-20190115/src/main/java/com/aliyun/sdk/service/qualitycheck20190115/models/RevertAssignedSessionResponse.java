// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertAssignedSessionResponse} extends {@link TeaModel}
 *
 * <p>RevertAssignedSessionResponse</p>
 */
public class RevertAssignedSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevertAssignedSessionResponseBody body;

    private RevertAssignedSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevertAssignedSessionResponse create() {
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
    public RevertAssignedSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevertAssignedSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevertAssignedSessionResponseBody body);

        @Override
        RevertAssignedSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevertAssignedSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevertAssignedSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevertAssignedSessionResponse response) {
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
        public Builder body(RevertAssignedSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevertAssignedSessionResponse build() {
            return new RevertAssignedSessionResponse(this);
        } 

    } 

}
