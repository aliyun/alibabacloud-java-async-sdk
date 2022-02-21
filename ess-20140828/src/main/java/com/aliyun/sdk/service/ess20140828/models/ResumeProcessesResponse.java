// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeProcessesResponse} extends {@link TeaModel}
 *
 * <p>ResumeProcessesResponse</p>
 */
public class ResumeProcessesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeProcessesResponseBody body;

    private ResumeProcessesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeProcessesResponse create() {
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
    public ResumeProcessesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeProcessesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeProcessesResponseBody body);

        @Override
        ResumeProcessesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeProcessesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeProcessesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeProcessesResponse response) {
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
        public Builder body(ResumeProcessesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeProcessesResponse build() {
            return new ResumeProcessesResponse(this);
        } 

    } 

}
